package daniele;

import java.util.HashMap;

import converter.ValueConverter;

public class DanieleDemandConverter implements ValueConverter<String> {

	@Override
	public String getOutput(String input, HashMap<String, Object> options) {
		return input;
	}

}
