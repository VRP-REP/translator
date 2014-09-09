package fetcher;

import keyword.Keyword;

public interface ValueFetcher {
	
	public Keyword[] getKeywords();
	
	public String getValue(Keyword keyword);
	
}
