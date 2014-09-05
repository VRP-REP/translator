package converter;

import java.util.HashMap;

public class UnchangedConverter implements ValueConverter<String> {

	@Override
	public String getOutput(String input, HashMap<String, Object> options) {
		return input;
	}

}
