package converter.tsplib95;

import impl.Keyword;

import java.util.Map;

import static tsplib95.TSPLIB95Keyword.*;
import converter.Converter;
import exception.NotImplementedException;

public class DisplayDataConverter implements Converter<Object> {

	@Override
	public Object getOutput(String input, Map<Keyword, Object> anteriorValues)
			throws NotImplementedException {
		
		throw new NotImplementedException(DISPLAY_DATA_SECTION);
	}

}
