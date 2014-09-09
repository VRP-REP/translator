package converter;


import fetcher.ValueFetcher;

import java.util.HashMap;

import keyword.Keyword;

public class GlobalConverter {

	private HashMap<Keyword, Object> values;
	private ValueFetcher fetcher;

	public GlobalConverter(ValueFetcher fetcher){
		this.values = new HashMap<Keyword, Object>();
		this.fetcher = fetcher;
		startConversion();
	}

	private void startConversion(){
		for(Keyword kw : fetcher.getKeywords()){
			String input = fetcher.getValue(kw);
			Object output = kw.converter().getOutput(input, values);
			values.put(kw, output);
		}
	}

	public Object get(Keyword keyword){
		return values.get(keyword);
	}

}
