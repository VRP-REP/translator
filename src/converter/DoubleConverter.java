package converter;


import impl.Keyword;

import java.util.Map;

public class DoubleConverter implements Converter<Double> {

	@Override
	public Double getOutput(String input, Map<Keyword, Object> anteriorValues) {
		return Double.valueOf(input);
	}

}
