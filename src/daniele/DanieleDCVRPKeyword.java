package daniele;

import java.util.regex.Pattern;

import converter.ValueConverter;
import keyword.Keyword;

public enum DanieleDCVRPKeyword implements DanieleKeyword {

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

	private DanieleDCVRPKeyword(String displayName, Type type) {
		this.displayName = displayName;
		this.type = type;
	}
	
	@Override
	public String displayName() {
		return displayName;
	}

	@Override
	public Keyword[] allValues() {
		return DanieleDCVRPKeyword.values();
	}

	@Override
	public Pattern pattern() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ValueConverter<?> converter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type type() {
		return type;
	}

	@Override
	public Keyword[] options() {
		// TODO Auto-generated method stub
		return null;
	}

}