package keyword;

import converter.Converter;

public interface Keyword {
	
	public String displayName();
	
	public Converter<?> converter();
	
}
