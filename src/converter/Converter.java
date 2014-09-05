package converter;

import java.util.HashMap;

public interface Converter<T> {

	public T getOutput(String input, HashMap<String, Object> options);
	
}
