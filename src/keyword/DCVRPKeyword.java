package keyword;

import java.util.regex.Pattern;

import converter.Converter;

public enum DCVRPKeyword implements DanieleKeyword {

	NAME				("NAME", Type.INLINE),
	COMMENT				("COMMENT", Type.INLINE),
	TYPE				("TYPE", Type.INLINE),
	DIMENSION			("DIMENSION", Type.INLINE),
	EDGE_WEIGHT_TYPE	("EDGE_WEIGHT_TYPE", Type.INLINE),
	CAPACITY			("CAPACITY", Type.INLINE),
	MAX_LENGTH			("MAX. LENGTH", Type.INLINE),
	SERV_TIME			("SERV. TIME", Type.INLINE),
	VEHICLES			("VEHICLES", Type.INLINE),
	NODE_COORD_SECTION	("NODE_COORD_SECTION", Type.BLOCK),
	DEMAND_SECTION		("DEMAND_SECTION", Type.BLOCK),
	DEPOT_SECTION		("DEPOT_SECTION", Type.BLOCK),
	EOF					("EOF", Type.END);
	
	private final String displayName;
	private final Type type;

	private DCVRPKeyword(String displayName, Type type) {
		this.displayName = displayName;
		this.type = type;
	}
	
	@Override
	public String displayName() {
		return displayName;
	}

	@Override
	public DanieleKeyword[] allValues() {
		return DCVRPKeyword.values();
	}

	@Override
	public Pattern pattern() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Converter<?> converter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type type() {
		return type;
	}

}