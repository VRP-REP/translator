package daniele;

import keyword.Keyword;

public interface DanieleKeyword extends Keyword {
	
	public enum Type {
		INLINE,
		BLOCK,
		END
	}
	
	public Type type();

}
