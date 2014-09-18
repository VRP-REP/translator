package test.tsplib95;

import static org.junit.Assert.*;
import static tsplib95.TSPLIB95Keyword.*;
import impl.Keyword;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runners.Parameterized;

import test.CanonizerTest;
import tsplib95.TSPLIB95Canonizer;
import tsplib95.TSPLIB95Keyword;

public class TSPLIB95CanonizerTest extends CanonizerTest {

	private String depotSection;
	
	public TSPLIB95CanonizerTest(Map<Keyword, String> map, String depotSection) {
		super(map);
		this.canonizer = new TSPLIB95Canonizer();
		this.depotSection = depotSection;
	}

	@Parameterized.Parameters
	public static Collection<?> data() {

		HashMap<TSPLIB95Keyword, Object> map1 = new HashMap<TSPLIB95Keyword, Object>();
		map1.put(DEPOT_SECTION, "1\n-1");
		
		HashMap<TSPLIB95Keyword, Object> map2 = new HashMap<TSPLIB95Keyword, Object>();
		map2.put(DEPOT_SECTION, "1\n2\n-1");

		return Arrays.asList(new Object[][] {
				{map1, "1"},
				{map2, "1\n2"}
		});

	}

	@Test
	public void testCompleteAndClean() {
		String initial = map.get(DEPOT_SECTION);
		canonizer.completeData(map);
		assertEquals(map.get(DEPOT_SECTION), depotSection);
		canonizer.cleanData(map);
		assertEquals(map.get(DEPOT_SECTION), initial);
	}

}
