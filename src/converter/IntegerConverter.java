package converter;

import java.util.HashMap;

public class IntegerConverter implements Converter<Integer> {

	@Override
	public Integer getOutput(String input, HashMap<String, Object> options) {
		return Integer.valueOf(input);
	}

}
