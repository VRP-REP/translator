package translator;

import java.util.LinkedHashMap;

import keyword.Keyword;
import reader.ValueFetcher;

public class GlobalConverter<T extends ValueFetcher<K>, K extends Keyword> {

	private LinkedHashMap<String, Object> values;
	private T fetcher;
	private K[] keywordValues;

	public GlobalConverter(T fetcher, K[] keywordValues){
		this.values = new LinkedHashMap<String, Object>();
		this.fetcher = fetcher;
		this.keywordValues = keywordValues;
		startConversion();
	}

	private void startConversion(){
		for(K kw : keywordValues){
			String input = fetcher.getValue(kw);
			if(input != null){
				System.out.println(kw.displayName());
				values.put(kw.displayName(), kw.converter().getOutput(input, values));
			}
		}
	}
	
	public Object get(String string){
		return values.get(string);
	}

}
