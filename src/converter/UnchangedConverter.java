package converter;

import java.util.HashMap;

public class UnchangedConverter implements Converter<String> {

	@Override
	public String getOutput(String input, HashMap<String, Object> anteriorValues) {
		return input;
	}

}
