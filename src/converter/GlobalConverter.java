package converter;

import fetcher.ValueFetcher;

import java.util.HashMap;

import keyword.Keyword;

public class GlobalConverter<T extends ValueFetcher<K>, K extends Keyword> {

	private HashMap<Keyword, Object> values;
	private T fetcher;

	public GlobalConverter(T fetcher){
		this.values = new HashMap<Keyword, Object>();
		this.fetcher = fetcher;
		startConversion();
	}

	private void startConversion(){
		for(K kw : fetcher.getKeywords()){
			String input = fetcher.getValue(kw);
			Object output = kw.converter().getOutput(input, values);
			values.put(kw, output);
		}
	}

	public Object get(Keyword keyword){
		return values.get(keyword);
	}

}
