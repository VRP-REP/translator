package keyword;

import java.util.regex.Pattern;

import converter.DoubleConverter;
import converter.IntegerConverter;
import converter.UnchangedConverter;
import converter.Converter;
import converter.daniele.ArrayListConverter;
import converter.daniele.DemandConverter;
import converter.daniele.EdgeWeightConverter;
import converter.daniele.NodeCoordConverter;

public enum DanieleKeyword implements Keyword {

	NAME					(),
	COMMENT					(),
	TYPE					(),
	EDGE_WEIGHT_TYPE		(),
	EDGE_WEIGHT_FORMAT		(),
	DISPLAY_DATA_TYPE		(),
	DIMENSION				(Type.INLINE, new IntegerConverter()),
	CAPACITY				(Type.INLINE, new DoubleConverter()),
	MAX_LENGTH				(Type.INLINE, new DoubleConverter(), "MAX. LENGTH"),
	SERV_TIME				(Type.INLINE, new DoubleConverter(), "SERV. TIME"),
	VEHICLES				(Type.INLINE, new IntegerConverter()),
	DEPOT_SECTION			(Type.BLOCK, new ArrayListConverter()),
	NODE_COORD_SECTION		(Type.BLOCK, new NodeCoordConverter()),
	EDGE_WEIGHT_SECTION		(Type.BLOCK, new EdgeWeightConverter()),
	DEMAND_SECTION			(Type.BLOCK, new DemandConverter()),
	EOF						(Type.END, null);

	public enum Type {
		INLINE,
		BLOCK,
		END
	}

	private final Type type;
	private final Converter<?> converter;
	private final String displayName;

	DanieleKeyword() {
		this.type = Type.INLINE;
		this.converter = new UnchangedConverter();
		this.displayName = this.toString();
	}

	DanieleKeyword(Type type, Converter<?> converter) {
		this.type = type;
		this.converter = converter;
		this.displayName = this.toString();
	}

	DanieleKeyword(Type type, Converter<?> converter, String displayName) {
		this.type = type;
		this.converter = converter;
		this.displayName = displayName;
	}

	@Override
	public Converter<?> converter() {
		return converter;
	}

	@Override
	public String displayName() {
		return this.displayName;
	}

	public Pattern pattern() {
		if(this.type.equals(Type.INLINE)){
			return Pattern.compile("^(?<keyword>[A-Z\\s\\.\\_]*)\\s+:\\s+(?<value>.*)$");
		}
		if(this.type.equals(Type.BLOCK)){
			return Pattern.compile("^(?<keyword>[A-Z\\s\\.\\_]*)\n+(?<value>.*)$");
		}
		return null;
	}

	public Type type() {
		return type;
	}

}