package impl;

import java.util.HashMap;
import java.util.Map;

import exception.ConverterException;

public class GlobalConverter {

	private ValueFetcher fetcher;
	private Map<Keyword, Object> values;

	public GlobalConverter(ValueFetcher fetcher) {
		this.fetcher = fetcher;
		this.values = new HashMap<Keyword, Object>();
		startConversion();
	}

	private void startConversion() {
		for(Keyword kw : fetcher.getKeywords()){
			String input = fetcher.getValue(kw);
			try {
				values.put(kw, kw.converter().getOutput(input, values));
			} catch (ConverterException e) {
				System.err.println(e.getMessage());;
			}
		}
	}

	public Object get(Keyword keyword) {
		return values.get(keyword);
	}

}
