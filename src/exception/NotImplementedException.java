package exception;

import impl.Keyword;

public class NotImplementedException extends ConverterException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4707105774750431538L;

	public NotImplementedException(Keyword keyword) {
		super("Converter for keyword " + keyword.displayName() + " is not implemented.");
	}

	public NotImplementedException(Keyword keyword, String value) {
		super("Value " + value + " for keyword " + keyword.displayName() + " is not implemented.");
	}

}
