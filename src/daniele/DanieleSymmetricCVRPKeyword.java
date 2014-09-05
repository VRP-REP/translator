package daniele;

import java.util.regex.Pattern;

import keyword.Keyword;
import converter.ArrayListConverter;
import converter.IntegerConverter;
import converter.UnchangedConverter;
import converter.Converter;

public enum DanieleSymmetricCVRPKeyword implements DanieleKeyword {

	NAME				(),
	COMMENT				(),
	TYPE				(),
	EDGE_WEIGHT_TYPE	(),
	EDGE_WEIGHT_FORMAT	(),
	DISPLAY_DATA_TYPE	(),
	DIMENSION			(Type.INLINE, new IntegerConverter()),
	CAPACITY			(Type.INLINE, new IntegerConverter()),
	VEHICLES			(Type.INLINE, new IntegerConverter()),
	DEPOT_SECTION		(Type.BLOCK, new ArrayListConverter()),
	NODE_COORD_SECTION	(Type.BLOCK, new DanieleNodeCoordConverter(), new Keyword[]{EDGE_WEIGHT_TYPE, DEPOT_SECTION}),
	EDGE_WEIGHT_SECTION	(Type.BLOCK, new DanieleEdgeWeightConverter(), new Keyword[]{EDGE_WEIGHT_TYPE, EDGE_WEIGHT_FORMAT, DEPOT_SECTION}),
	DEMAND_SECTION		(Type.BLOCK, new DanieleDemandConverter(), new Keyword[]{}),
	EOF					(Type.END, null, new Keyword[]{});

	private final Type type;
	private final Converter<?> converter;
	private final Keyword[] options;
	
	DanieleSymmetricCVRPKeyword() {
		this.type = Type.INLINE;
		this.converter = new UnchangedConverter();
		this.options = new Keyword[]{};
	}
	
	DanieleSymmetricCVRPKeyword(Type type, Converter<?> converter) {
		this.type = type;
		this.converter = converter;
		this.options = new Keyword[]{};
	}
	
	DanieleSymmetricCVRPKeyword(Type type, Converter<?> converter, Keyword[] options) {
		this.type = type;
		this.converter = converter;
		this.options = options;
	}
	
	@Override
	public Pattern pattern() {
		if(this.type.equals(Type.INLINE)){
			return Pattern.compile("^(?<keyword>[A-Z_]*)\\s+:\\s+(?<value>.*)$");
		}
		if(this.type.equals(Type.BLOCK)){
			return Pattern.compile("^(?<keyword>[A-Z_]*)\n+(?<value>.*)$");
		}
		return null;
	}

	@Override
	public String displayName() {
		return this.toString();
	}

	@Override
	public Converter<?> converter() {
		return converter;
	}

	@Override
	public Type type() {
		return type;
	}
	
	@Override
	public Keyword[] options() {
		return options;
	}
	
	@Override
	public Keyword[] allValues() {
		return DanieleSymmetricCVRPKeyword.values();
	}

}