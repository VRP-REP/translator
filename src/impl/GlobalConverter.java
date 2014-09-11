package impl;

import java.util.HashMap;
import java.util.Map;

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
			values.put(kw, kw.converter().getOutput(input, values));
		}
	}

	public Object get(Keyword keyword) {
		return values.get(keyword);
	}

}
