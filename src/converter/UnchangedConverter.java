package converter;


import java.util.HashMap;

import keyword.Keyword;

public class UnchangedConverter implements Converter<String> {

	@Override
	public String getOutput(String input, HashMap<Keyword, Object> anteriorValues) {
		return input;
	}

}
