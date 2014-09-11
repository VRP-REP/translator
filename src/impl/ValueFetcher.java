package impl;

/**
 * 
 * @author hubertlobit
 *
 */
public interface ValueFetcher {
	
	public Keyword[] getKeywords();
	
	public String getValue(Keyword keyword);
	
}
