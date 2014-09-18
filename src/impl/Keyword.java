package impl;

import converter.Converter;

public interface Keyword {
	
	public int priority();
	
	public String displayName();
	
	public Converter<?> converter();

}
