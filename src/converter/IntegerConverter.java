package converter;


import impl.Keyword;

import java.util.Map;

public class IntegerConverter implements Converter<Integer> {

	@Override
	public Integer getOutput(String input, Map<Keyword, Object> anteriorValues) {
		return Integer.valueOf(input);
	}

}
