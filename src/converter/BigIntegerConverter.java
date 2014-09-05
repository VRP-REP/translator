package converter;

import java.math.BigInteger;
import java.util.HashMap;

public class BigIntegerConverter implements Converter<BigInteger> {

	@Override
	public BigInteger getOutput(String input, HashMap<String, Object> options) {
		return BigInteger.valueOf((Integer.valueOf(input)));
	}

}
