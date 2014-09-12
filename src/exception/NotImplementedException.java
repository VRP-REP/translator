package exception;

import impl.Keyword;

public class NotImplementedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1005216244078165311L;

	public NotImplementedException(Keyword keyword, String value) {
		super("Value " + value + " for keyword " + keyword.displayName() + " is not implemented.");
	}

}
