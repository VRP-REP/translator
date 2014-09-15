package converter.tsplib95;

import impl.Keyword;

import java.util.Map;

import static tsplib95.TSPLIB95Keyword.*;
import converter.Converter;
import model.ObjectFactory;
import model.Instance.Network;
import model.Tw;
import model.TwType.End;
import model.TwType.Start;

public class TimeWindowConverter implements Converter<Network> {

	@Override
	public Network getOutput(String input, Map<Keyword, Object> anteriorValues) {
		ObjectFactory objectFactory = new ObjectFactory();
		Network network = objectFactory.createInstanceNetwork();
		
		System.out.println(input);
		Tw tw = objectFactory.createTw();
		
		Start start = objectFactory.createTwTypeStart();
		tw.setStart(start);
		start.setValue(07);
		
		End end = objectFactory.createTwTypeEnd();
		end.setValue(01);
		tw.setEnd(end);
		
		return network;
	}

}
