package test.daniele;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import fetcher.DanieleValueFetcher;
import test.ValueFetcherTest;

public class DanieleValueFetcherTest extends ValueFetcherTest<DanieleValueFetcher> {

	private int numberOfKeywords;

	public DanieleValueFetcherTest(String[] input, int numberOfKeywords) {
		super(input);
		this.fetcher = new DanieleValueFetcher(input);
		this.numberOfKeywords = numberOfKeywords;
	}

	@Parameterized.Parameters
	public static Collection<?> data() {

		String[] input1 = new String[]{
				"NAME : D022-04g",
				"COMMENT : Gaskell, 1967; Eilon, Watson-Gandy and Christofides, 1971",
				"TYPE : DCVRP",
				"DIMENSION : 22",
				"EDGE_WEIGHT_TYPE : EUC_2D",
				"CAPACITY : 6000",
				"MAX. LENGTH : 210",
				"SERV. TIME : 0",
				"VEHICLES : 4"
		};

		return Arrays.asList(new Object[][] {
				{input1, 9}
		});
	}

	@Test
	public void testNumberOfKeywords() {
		assertEquals(fetcher.getKeywords().length, numberOfKeywords);
	}

}
