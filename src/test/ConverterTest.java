package test;

import impl.Keyword;

import java.util.HashMap;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import converter.Converter;
import exception.UnknownValueException;

@RunWith(Parameterized.class)
public abstract class ConverterTest<T extends Converter<?>, R> {

	protected String input;
	protected HashMap<Keyword, Object> anteriorValues;
	protected T converter;
	protected R result;

	public ConverterTest(String input, HashMap<Keyword, Object> options) throws UnknownValueException {
		this.input = input;
		this.anteriorValues = options;
	}

}
