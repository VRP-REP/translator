package test;

import java.util.HashMap;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import converter.Converter;

@RunWith(Parameterized.class)
public abstract class ConverterTest<T extends Converter<?>, R> {

	protected String input;
	protected HashMap<String, Object> anteriorValues;
	protected T converter;
	protected R result;

	public ConverterTest(String input, HashMap<String, Object> options){
		this.input = input;
		this.anteriorValues = options;
	}

}
