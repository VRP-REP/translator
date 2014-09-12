package converter;


import impl.Keyword;

import java.util.Map;

import exception.NotImplementedException;
import exception.UnknownValueException;

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
	 * @throws UnknownValueException
	 * @throws NotImplementedException
	 */
	public T getOutput(String input, Map<Keyword, Object> anteriorValues)  throws UnknownValueException, NotImplementedException;
	
}
