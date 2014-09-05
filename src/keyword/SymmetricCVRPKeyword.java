package keyword;

import java.util.regex.Pattern;

import converter.IntegerConverter;
import converter.UnchangedConverter;
import converter.Converter;
import converter.daniele.ArrayListConverter;
import converter.daniele.DemandConverter;
import converter.daniele.EdgeWeightConverter;
import converter.daniele.NodeCoordConverter;

public enum SymmetricCVRPKeyword implements DanieleKeyword {

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
	NODE_COORD_SECTION	(Type.BLOCK, new NodeCoordConverter()),
	EDGE_WEIGHT_SECTION	(Type.BLOCK, new EdgeWeightConverter()),
	DEMAND_SECTION		(Type.BLOCK, new DemandConverter()),
	EOF					(Type.END, null);

	private final Type type;
	private final Converter<?> converter;
	
	SymmetricCVRPKeyword() {
		this.type = Type.INLINE;
		this.converter = new UnchangedConverter();
	}
	
	SymmetricCVRPKeyword(Type type, Converter<?> converter) {
		this.type = type;
		this.converter = converter;
	}
	
	@Override
	public DanieleKeyword[] allValues() {
		return SymmetricCVRPKeyword.values();
	}

	@Override
	public Converter<?> converter() {
		return converter;
	}

	@Override
	public String displayName() {
		return this.toString();
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
	public Type type() {
		return type;
	}

}