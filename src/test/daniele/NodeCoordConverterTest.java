package test.daniele;

import static org.junit.Assert.*;

import java.util.HashMap;

import model.Instance.Network;

import org.junit.Test;

import converter.daniele.NodeCoordConverter;
import test.ConverterTest;

public class NodeCoordConverterTest extends ConverterTest<NodeCoordConverter, Network> {

	public NodeCoordConverterTest(String input, HashMap<String, Object> anteriorValues) {
		super(input, anteriorValues);
		this.converter = new NodeCoordConverter();
		this.result = converter.getOutput(input, anteriorValues);
	}

	@Test
	public void testNumberOfNodes() {
		assertTrue(true);
	}

}
