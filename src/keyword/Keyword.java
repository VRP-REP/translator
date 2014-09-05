package keyword;

import java.util.regex.Pattern;

import converter.ValueConverter;

public interface Keyword {
	
	public String displayName();
	
	public Pattern pattern();
	
	public ValueConverter<?> converter();

	public Keyword[] options();
	
	public Keyword[] allValues();
	
}
