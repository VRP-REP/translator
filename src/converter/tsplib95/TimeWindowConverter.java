package converter.tsplib95;

import impl.Keyword;

import java.util.Map;

import static tsplib95.TSPLIB95Keyword.*;
import converter.Converter;
import model.ObjectFactory;
import model.Instance.Network;

public class TimeWindowConverter implements Converter<Network> {

	@Override
	public Network getOutput(String input, Map<Keyword, Object> anteriorValues) {
		ObjectFactory objectFactory = new ObjectFactory();
		Network network = objectFactory.createInstanceNetwork();
		return network;
	}

}
