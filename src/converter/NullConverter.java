package converter;


import impl.Keyword;

import java.util.Map;

public class NullConverter implements Converter<String> {

	@Override
	public String getOutput(String input, Map<Keyword, Object> anteriorValues) {
		return input;
	}

}
