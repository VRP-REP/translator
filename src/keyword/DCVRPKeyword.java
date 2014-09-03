package keyword;

public enum DCVRPKeyword implements Keyword {

	NAME				("NAME", KeywordType.INLINE),
	COMMENT				("COMMENT", KeywordType.INLINE),
	TYPE				("TYPE", KeywordType.INLINE),
	DIMENSION			("DIMENSION", KeywordType.INLINE),
	EDGE_WEIGHT_TYPE	("EDGE_WEIGHT_TYPE", KeywordType.INLINE),
	CAPACITY			("CAPACITY", KeywordType.INLINE),
	MAX_LENGTH			("MAX. LENGTH", KeywordType.INLINE),
	SERV_TIME			("SERV. TIME", KeywordType.INLINE),
	VEHICLES			("VEHICLES", KeywordType.INLINE),
	NODE_COORD_SECTION	("NODE_COORD_SECTION", KeywordType.BLOCK),
	DEMAND_SECTION		("DEMAND_SECTION", KeywordType.BLOCK),
	DEPOT_SECTION		("DEPOT_SECTION", KeywordType.BLOCK),
	EOF					("EOF", KeywordType.END);
	
	private final String displayName;
	private final KeywordType type;

	private DCVRPKeyword(String displayName, KeywordType type) {
		this.displayName = displayName;
		this.type = type;
	}
	
	@Override
	public String displayName() {
		return displayName;
	}
	
	@Override
	public KeywordType type() {
		return type;
	}

	@Override
	public Keyword[] allValues() {
		return DCVRPKeyword.values();
	}

}