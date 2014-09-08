package converter;

import java.math.BigInteger;
import java.util.HashMap;

import keyword.Keyword;

public class BigIntegerConverter implements Converter<BigInteger> {

	@Override
	public BigInteger getOutput(String input, HashMap<Keyword, Object> anteriorValues) {
		return BigInteger.valueOf((Integer.valueOf(input)));
	}

}
