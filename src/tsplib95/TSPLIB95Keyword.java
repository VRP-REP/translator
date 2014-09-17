package tsplib95;

import impl.Keyword;

import java.util.regex.Pattern;

import static tsplib95.TSPLIB95Keyword.Type.*;
import converter.DoubleConverter;
import converter.IntegerConverter;
import converter.UnchangedConverter;
import converter.Converter;
import converter.tsplib95.DepotConverter;
import converter.tsplib95.DemandConverter;
import converter.tsplib95.DisplayDataConverter;
import converter.tsplib95.EdgeDataConverter;
import converter.tsplib95.EdgeWeightConverter;
import converter.tsplib95.FixedEdgesConverter;
import converter.tsplib95.NodeCoordConverter;
import converter.tsplib95.PickupConverter;
import converter.tsplib95.StandtimeConverter;
import converter.tsplib95.TimeWindowConverter;
import converter.tsplib95.TourConverter;

public enum TSPLIB95Keyword implements Keyword {

	/** OFFICIAL SPECIFICATION KEYWORDS **/
	NAME					(),											/* 1.1.1 */
	TYPE					(),											/* 1.1.2 */
	COMMENT					(),											/* 1.1.3 */
	DIMENSION				(SPECIFICATION, new IntegerConverter()),	/* 1.1.4 */
	CAPACITY				(SPECIFICATION, new DoubleConverter()),		/* 1.1.5 */
	EDGE_WEIGHT_TYPE		(),											/* 1.1.6 */
	EDGE_WEIGHT_FORMAT		(),											/* 1.1.7 */
	EDGE_DATA_FORMAT		(),											/* 1.1.8 */
	NODE_COORD_TYPE			(),											/* 1.1.9 */
	DISPLAY_DATA_TYPE		(),											/* 1.1.10 */
	EOF						(NONE, null),								/* 1.1.11 */
	
	/** NON-OFFICIAL SPECIFICATION KEYWORDS **/
	DISTANCE				(SPECIFICATION, new DoubleConverter()),
	SERVICE_TIME			(SPECIFICATION, new DoubleConverter()),
	VEHICLES				(SPECIFICATION, new IntegerConverter()),
	CAPACITY_VOL			(SPECIFICATION, new DoubleConverter()),
	
	/** OFFICIAL DATA KEYWORDS **/
	NODE_COORD_SECTION		(DATA, new NodeCoordConverter()),			/* 1.2.1 */
	DEPOT_SECTION			(DATA, new DepotConverter()),				/* 1.2.2 */
	DEMAND_SECTION			(DATA, new DemandConverter()),				/* 1.2.3 */
	EDGE_DATA_SECTION		(DATA, new EdgeDataConverter()),			/* 1.2.4 */
	FIXED_EDGES_SECTION		(DATA, new FixedEdgesConverter()),			/* 1.2.5 */
	DISPLAY_DATA_SECTION	(DATA, new DisplayDataConverter()),			/* 1.2.6 */
	TOUR_SECTION			(DATA, new TourConverter()),				/* 1.2.7 */
	EDGE_WEIGHT_SECTION		(DATA, new EdgeWeightConverter()),			/* 1.2.8 */
	
	/** NON-OFFICIAL DATA KEYWORDS **/
	PICKUP_SECTION			(DATA, new PickupConverter()),
	TIME_WINDOW_SECTION		(DATA, new TimeWindowConverter()),
	STANDTIME_SECTION		(DATA, new StandtimeConverter());

	public enum Type {
		SPECIFICATION,
		DATA,
		NONE
	}

	private final Type type;
	private final Converter<?> converter;
	private final String displayName;

	TSPLIB95Keyword() {
		this.type = SPECIFICATION;
		this.converter = new UnchangedConverter();
		this.displayName = this.toString();
	}

	TSPLIB95Keyword(Type type, Converter<?> converter) {
		this.type = type;
		this.converter = converter;
		this.displayName = this.toString();
	}

	TSPLIB95Keyword(Type type, Converter<?> converter, String displayName) {
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
		if(this.type.equals(SPECIFICATION)){
			return Pattern.compile("^(?<keyword>[A-Z\\_]*)\\s*:\\s*(?<value>.*)$");
		}
		if(this.type.equals(DATA)){
			return Pattern.compile("^(?<keyword>[A-Z\\_]*)\n+(?<value>.*)$");
		}
		return null;
	}

	public Type type() {
		return type;
	}

}