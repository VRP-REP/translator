package translator;

import fetcher.DanieleValueFetcher;

import java.nio.file.Path;

import converter.GlobalConverter;
import keyword.DanieleKeyword;
import model.Instance;
import model.Instance.Fleet;
import model.Instance.Info;
import model.Instance.Network;
import model.ObjectFactory;

public class DanieleTranslator implements InstanceTranslator<DanieleKeyword> {

	private GlobalConverter<DanieleValueFetcher, DanieleKeyword> converter;

	public Instance getInstance(Path filePath){
		DanieleValueFetcher fetcher = new DanieleValueFetcher(filePath);
		converter = new GlobalConverter<DanieleValueFetcher, DanieleKeyword>(fetcher);

		ObjectFactory objectFactory = new ObjectFactory();
		Instance instance = objectFactory.createInstance();

		Info info = objectFactory.createInstanceInfo();
		info.setName((String) converter.get(DanieleKeyword.NAME));
		info.setDataset((String) converter.get(DanieleKeyword.COMMENT));
		instance.setInfo(info);

		Fleet fleet = objectFactory.createInstanceFleet();

		String edgeWeightType = (String) converter.get(DanieleKeyword.EDGE_WEIGHT_TYPE);
		if(edgeWeightType.equals("EUC_2D")){
			instance.setNetwork((Network) converter.get(DanieleKeyword.NODE_COORD_SECTION));
		}

		return instance;
	}

}
