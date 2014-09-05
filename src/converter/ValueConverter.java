package converter;

import java.util.HashMap;

public interface ValueConverter<T> {

	public T getOutput(String input, HashMap<String, Object> options);
	
}
