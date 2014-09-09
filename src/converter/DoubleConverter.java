package converter;


import java.util.HashMap;

import keyword.Keyword;

public class DoubleConverter implements Converter<Double> {

	@Override
	public Double getOutput(String input, HashMap<Keyword, Object> anteriorValues) {
		return Double.valueOf(input);
	}

}
