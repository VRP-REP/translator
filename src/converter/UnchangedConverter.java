package converter;


import impl.Keyword;

import java.util.Map;

public class UnchangedConverter implements Converter<String> {

	@Override
	public String getOutput(String input, Map<Keyword, Object> anteriorValues) {
		return input;
	}

}
