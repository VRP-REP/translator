package converter;


import impl.Keyword;

import java.math.BigInteger;
import java.util.Map;

public class BigIntegerConverter implements Converter<BigInteger> {

	@Override
	public BigInteger getOutput(String input, Map<Keyword, Object> anteriorValues) {
		return BigInteger.valueOf((Integer.valueOf(input)));
	}

}
