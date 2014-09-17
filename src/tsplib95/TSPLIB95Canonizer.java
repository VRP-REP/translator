package tsplib95;

import static tsplib95.TSPLIB95Keyword.*;

import java.util.Arrays;
import java.util.Map;

import impl.Canonizer;

public class TSPLIB95Canonizer implements Canonizer<TSPLIB95Keyword> {

	@Override
	public void completeData(Map<TSPLIB95Keyword, String> map) {

		/**
		 * Default value for NODE_COORD_TYPE as specified in documentation.
		 */
		if(!map.containsKey(NODE_COORD_TYPE)){
			map.put(NODE_COORD_TYPE, "NO_COORDS");
		}

		/**
		 * Default value for DISPLAY_DATA_TYPE as specified in documentation.
		 */
		if(map.containsKey(NODE_COORD_SECTION) && !map.containsKey(DISPLAY_DATA_TYPE)){
			map.put(DISPLAY_DATA_TYPE, "COORD_DISPLAY");
		}

		/**
		 * Removal of unused information.
		 */
		if(map.containsKey(DEPOT_SECTION)) {
			String[] depots = map.get(DEPOT_SECTION).split("\n");
			if(depots[depots.length - 1].startsWith("-1")){
				map.put(DEPOT_SECTION, String.join("\n", Arrays.copyOfRange(depots, 0, depots.length - 1)));
			}
		}
		
		if(!map.get(EDGE_WEIGHT_TYPE).equals("EXPLICIT")){
			map.put(EDGE_WEIGHT_FORMAT, "FUNCTION");
		}

	}

	@Override
	public void cleanData(Map<TSPLIB95Keyword, String> map) {

		if(map.get(NODE_COORD_TYPE).equals("NO_COORDS")){
			map.remove(NODE_COORD_TYPE);
		}

		if(map.containsKey(NODE_COORD_SECTION) && map.get(DISPLAY_DATA_TYPE).equals("COORD_DISPLAY")){
			map.remove(DISPLAY_DATA_TYPE);
		}
		
		if(map.containsKey(DEPOT_SECTION)) {
			map.put(DEPOT_SECTION, map.get(DEPOT_SECTION).concat("\n-1"));
		}

	}

}
