package daniele;

import java.util.regex.Pattern;

import converter.Converter;
import keyword.Keyword;

public enum DanieleAsymmetricCVRPKeyword implements DanieleKeyword {

	NAME				(Type.INLINE),
	COMMENT				(Type.INLINE),
	TYPE				(Type.INLINE),
	DIMENSION			(Type.INLINE),
	EDGE_WEIGHT_TYPE	(Type.INLINE),
	EDGE_WEIGHT_FORMAT  (Type.INLINE),
	DISPLAY_DATA_TYPE   (Type.INLINE),
	CAPACITY			(Type.INLINE),
	VEHICLES			(Type.INLINE),
	EDGE_WEIGHT_SECTION	(Type.BLOCK),
	DEMAND_SECTION		(Type.BLOCK),
	DEPOT_SECTION		(Type.BLOCK),
	EOF					(Type.END);

	private final Type type;

	private DanieleAsymmetricCVRPKeyword(Type type) {
		this.type = type;
	}
	
	@Override
	public String displayName() {
		return this.toString();
	}
	
	@Override
	public Keyword[] allValues() {
		return DanieleAsymmetricCVRPKeyword.values();
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Keyword[] options() {
		// TODO Auto-generated method stub
		return null;
	}

}