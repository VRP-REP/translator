package converter;


import java.util.HashMap;

import keyword.Keyword;

public class IntegerConverter implements Converter<Integer> {

	@Override
	public Integer getOutput(String input, HashMap<Keyword, Object> anteriorValues) {
		return Integer.valueOf(input);
	}

}
