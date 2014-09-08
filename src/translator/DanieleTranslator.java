package translator;

import fetcher.DanieleValueFetcher;
import io.FileLiner;

import java.nio.file.Path;

import converter.GlobalConverter;
import keyword.DanieleKeyword;
import model.Instance;
import model.Instance.Fleet;
import model.Instance.Info;
import model.Instance.Network;
import model.Instance.Fleet.Vehicle;
import model.Instance.Requests;
import model.ObjectFactory;

public class DanieleTranslator implements InstanceTranslator<DanieleKeyword> {

	private GlobalConverter<DanieleValueFetcher, DanieleKeyword> converter;

	public Instance getInstance(Path filePath){
		FileLiner liner = new FileLiner(filePath);
		DanieleValueFetcher fetcher = new DanieleValueFetcher(liner.getLines());
		converter = new GlobalConverter<DanieleValueFetcher, DanieleKeyword>(fetcher);

		ObjectFactory objectFactory = new ObjectFactory();
		Instance instance = objectFactory.createInstance();

		Info info = objectFactory.createInstanceInfo();
		info.setName((String) converter.get(DanieleKeyword.NAME));
		info.setDataset((String) converter.get(DanieleKeyword.COMMENT));
		instance.setInfo(info);

		Fleet fleet = objectFactory.createInstanceFleet();
		int vehicles = (Integer) converter.get(DanieleKeyword.VEHICLES);
		double capacity = (Double) converter.get(DanieleKeyword.CAPACITY);
		for(int i = 0 ; i < vehicles ; i++) {
			Vehicle vehicle = objectFactory.createInstanceFleetVehicle();
			vehicle.setId(i);
			vehicle.setCapacity(capacity);
			
			String type = (String) converter.get(DanieleKeyword.TYPE);
			if(type.equals("DCVRP")){
				double maxLength = (Double) converter.get(DanieleKeyword.MAX_LENGTH);
				vehicle.setMaxTravelDistance(maxLength);
				double servTime = (Double) converter.get(DanieleKeyword.SERV_TIME);
				vehicle.setMaxTravelTime(servTime);
			}
			
			fleet.getVehicle().add(vehicle);
		}
		instance.setFleet(fleet);

		String edgeWeightType = (String) converter.get(DanieleKeyword.EDGE_WEIGHT_TYPE);
		if(edgeWeightType.equals("EUC_2D")){
			instance.setNetwork((Network) converter.get(DanieleKeyword.NODE_COORD_SECTION));
		}
		if(edgeWeightType.equals("EXPLICIT")){
			instance.setNetwork((Network) converter.get(DanieleKeyword.EDGE_WEIGHT_SECTION));
		}
		
		instance.setRequests((Requests) converter.get(DanieleKeyword.DEMAND_SECTION));

		return instance;
	}

}
