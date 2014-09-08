package fetcher;

import keyword.Keyword;

public interface ValueFetcher<T extends Keyword> {
	
	public T[] getKeywords();
	
	public String getValue(T keyword);
	
}
