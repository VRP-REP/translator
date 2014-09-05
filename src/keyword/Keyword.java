package keyword;

import java.util.regex.Pattern;

import converter.Converter;

public interface Keyword {
	
	public enum Section {
		INFO,
		NETWORK,
		FLEET,
		REQUESTS
	}
	
	public String displayName();
	
	public Pattern pattern();
	
	public Converter<?> converter();
	
	public Keyword[] allValues();
	
}
