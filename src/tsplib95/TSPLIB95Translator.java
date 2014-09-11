package tsplib95;

import impl.GlobalConverter;
import impl.InstanceTranslatorImpl;
import io.FileLiner;

import java.nio.file.Path;

import static tsplib95.TSPLIB95Keyword.*;
import model.Instance;
import model.Instance.Fleet;
import model.Instance.Info;
import model.Instance.Network;
import model.Instance.Requests;
import model.Instance.Fleet.VehicleProfile;
import model.ObjectFactory;

public class TSPLIB95Translator extends InstanceTranslatorImpl {

	public Instance getInstance(Path filePath){
		FileLiner liner = new FileLiner(filePath);
		TSPLIB95ValueFetcher fetcher = new TSPLIB95ValueFetcher(liner.getLines());
		converter = new GlobalConverter(fetcher);

		ObjectFactory objectFactory = new ObjectFactory();
		Instance instance = objectFactory.createInstance();

		Info info = objectFactory.createInstanceInfo();
		info.setName((String) converter.get(NAME));
		info.setDataset((String) converter.get(COMMENT));
		instance.setInfo(info);

		Fleet fleet = objectFactory.createInstanceFleet();
		//int vehicles = (Integer) converter.get(VEHICLES);
		double capacity = (Double) converter.get(CAPACITY);
		VehicleProfile profile = objectFactory.createInstanceFleetVehicleProfile();
		profile.setCapacity(capacity);
		//profile.setNumber(vehicles);

		String type = (String) converter.get(TYPE);
		if(type.equals("DCVRP")){
			double maxLength = (Double) converter.get(MAX_LENGTH);
			profile.setMaxTravelDistance(maxLength);
			double servTime = (Double) converter.get(SERV_TIME);
			profile.setMaxTravelTime(servTime);
		}

		fleet.getVehicleProfile().add(profile);
		instance.setFleet(fleet);

		String edgeWeightType = (String) converter.get(EDGE_WEIGHT_TYPE);
		if(edgeWeightType.equals("EUC_2D")){
			instance.setNetwork((Network) converter.get(NODE_COORD_SECTION));
		}
		if(edgeWeightType.equals("EXPLICIT")){
			instance.setNetwork((Network) converter.get(EDGE_WEIGHT_SECTION));
		}

		instance.setRequests((Requests) converter.get(DEMAND_SECTION));

		return instance;
	}

}
