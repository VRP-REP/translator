package converter.tsplib95;

import impl.Keyword;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import util.Horizon;
import static tsplib95.TSPLIB95Keyword.*;
import converter.Converter;
import exception.NotImplementedException;
import model.ObjectFactory;
import model.Instance.Network;
import model.Tw;
import model.TwType.End;
import model.TwType.Start;

public class TimeWindowConverter implements Converter<Network> {

	@Override
	public Network getOutput(String input, Map<Keyword, Object> anteriorValues) throws NotImplementedException {
		ObjectFactory objectFactory = new ObjectFactory();

		Horizon horizon = new Horizon();
		String regex = "^(?<id>[0-9]*)\\s+(?<start>[0-9:]*)\\s+(?<end>[0-9:]*)$";
		Pattern pattern = Pattern.compile(regex);
		for(String line : input.split("\n")) {
			Matcher matcher = pattern.matcher(line);
			if(matcher.find()){
				horizon.add(matcher.group("start"));
				horizon.add(matcher.group("end"));
			}
		}
		
		@SuppressWarnings("unused")
		Map<String, Map<String, Tw>> timeWindows = new HashMap<String, Map<String, Tw>>();
		
		Tw tw = objectFactory.createTw();

		Start start = objectFactory.createTwTypeStart();
		tw.setStart(start);
		start.setValue(07);

		End end = objectFactory.createTwTypeEnd();
		end.setValue(01);
		tw.setEnd(end);

		throw new NotImplementedException(TIME_WINDOW_SECTION);
	}

}
