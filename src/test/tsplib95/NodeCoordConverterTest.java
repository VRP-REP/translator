package test.tsplib95;

import static org.junit.Assert.*;
import static tsplib95.TSPLIB95Keyword.*;
import impl.Keyword;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

import model.Instance.Network;

import org.junit.Test;
import org.junit.runners.Parameterized;

import converter.tsplib95.NodeCoordConverter;
import test.ConverterTest;

public class NodeCoordConverterTest extends ConverterTest<NodeCoordConverter, Network> {

	private int numberOfNodes;

	public NodeCoordConverterTest(String input, HashMap<Keyword, Object> anteriorValues, int numberOfNodes) {
		super(input, anteriorValues);
		this.converter = new NodeCoordConverter();
		this.result = converter.getOutput(input, anteriorValues);
		this.numberOfNodes = numberOfNodes;
	}

	@Parameterized.Parameters
	public static Collection<?> data() {

		String input1 = String.join("\n", new String[]{
				"1 30 40",
				"2 37 52",
				"3 49 49",
				"4 52 64",
				"5 20 26",
				"6 40 30",
				"7 21 47",
				"8 17 63",
				"9 31 62",
				"10 52 33",
				"11 51 21",
				"12 42 41",
				"13 31 32",
				"14 5 25",
				"15 12 42",
				"16 36 16"
		});

		HashMap<Keyword, Object> anteriorValues1 = new HashMap<Keyword, Object>();
		anteriorValues1.put(EDGE_WEIGHT_TYPE, "EUC_2D");
		anteriorValues1.put(DEPOT_SECTION, new ArrayList<Integer>(Arrays.asList(new Integer[]{1})));

		return Arrays.asList(new Object[][] {
				{input1, anteriorValues1, 16}
		});

	}

	@Test
	public void testNumberOfNodes() {
		assertEquals(result.getNodes().getNode().size(), numberOfNodes);
	}

}
