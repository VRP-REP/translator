package converter.tsplib95;

import impl.Keyword;

import java.util.Map;

import static impl.tsplib95.TSPLIB95Keyword.*;
import converter.Converter;
import exception.NotImplementedException;

public class EdgeDataConverter implements Converter<Object> {

	@Override
	public Object getOutput(String input, Map<Keyword, Object> anteriorValues)
			throws NotImplementedException {
		
		throw new NotImplementedException(EDGE_DATA_SECTION);
	}

}
