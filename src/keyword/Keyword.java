package keyword;

import java.util.regex.Pattern;

import converter.Converter;

public interface Keyword {
	
	public String displayName();
	
	public Pattern pattern();
	
	public Converter<?> converter();

	public Keyword[] options();
	
	public Keyword[] allValues();
	
}
