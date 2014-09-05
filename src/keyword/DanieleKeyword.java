package keyword;


public interface DanieleKeyword extends Keyword {
	
	public enum Type {
		INLINE,
		BLOCK,
		END
	}
	
	public Type type();

}
