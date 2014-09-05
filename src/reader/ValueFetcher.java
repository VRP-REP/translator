package reader;

import keyword.Keyword;

public interface ValueFetcher<T extends Keyword> {

	public String getValue(T keyword);
	
}
