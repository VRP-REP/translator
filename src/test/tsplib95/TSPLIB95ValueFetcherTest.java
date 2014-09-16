package test.tsplib95;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runners.Parameterized;

import test.ValueFetcherTest;
import tsplib95.TSPLIB95ValueFetcher;

public class TSPLIB95ValueFetcherTest extends ValueFetcherTest<TSPLIB95ValueFetcher> {

	private int numberOfKeywords;

	public TSPLIB95ValueFetcherTest(List<String> input, int numberOfKeywords) {
		super(input);
		this.fetcher = new TSPLIB95ValueFetcher(input);
		this.numberOfKeywords = numberOfKeywords;
	}

	@Parameterized.Parameters
	public static Collection<?> data() {

		List<String> input1 = Arrays.asList(new String[]{
				"NAME : D022-04g",
				"COMMENT : Gaskell, 1967; Eilon, Watson-Gandy and Christofides, 1971",
				"TYPE : DCVRP",
				"DIMENSION : 22",
				"EDGE_WEIGHT_TYPE : EUC_2D",
				"CAPACITY : 6000",
				"DISTANCE : 210",
				"SERVICE_TIME : 0",
				"VEHICLES : 4"
		});

		return Arrays.asList(new Object[][] {
				{input1, 9}
		});
	}

	@Test
	public void testNumberOfKeywords() {
		assertEquals(fetcher.getKeywords().length, numberOfKeywords);
	}

}
