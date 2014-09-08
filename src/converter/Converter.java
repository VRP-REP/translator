package converter;

import java.util.HashMap;

import keyword.Keyword;

/**
 * This interface intends to convert a string value read from a text file
 * to an output of type T.
 * @author hubertlobit
 *
 * @param <T>
 */
public interface Converter<T> {

	/**
	 * 
	 * @param input
	 * @param anteriorValues
	 * @return
	 */
	public T getOutput(String input, HashMap<Keyword, Object> anteriorValues);
	
}
