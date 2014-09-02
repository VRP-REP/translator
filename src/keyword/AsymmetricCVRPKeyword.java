package keyword;

public enum AsymmetricCVRPKeyword {

	NAME				(KeywordType.INLINE),
	COMMENT				(KeywordType.INLINE),
	TYPE				(KeywordType.INLINE),
	DIMENSION			(KeywordType.INLINE),
	EDGE_WEIGHT_TYPE	(KeywordType.INLINE),
	CAPACITY			(KeywordType.INLINE),
	VEHICLES			(KeywordType.BLOCK),
	NODE_COORD_SECTION	(KeywordType.BLOCK),
	DEMAND_SECTION		(KeywordType.BLOCK),
	DEPOT_SECTION		(KeywordType.BLOCK),
	EOF					(KeywordType.END);

	private final KeywordType type;

	AsymmetricCVRPKeyword(KeywordType type) {
		this.type = type;
	}
	
	public KeywordType type() {
		return type;
	}

}