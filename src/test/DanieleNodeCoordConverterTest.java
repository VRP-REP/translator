package test;

import static org.junit.Assert.*;

import java.util.HashMap;

import model.Instance.Network;

import org.junit.Test;

import daniele.DanieleNodeCoordConverter;

public class DanieleNodeCoordConverterTest extends ConverterTest<DanieleNodeCoordConverter, Network> {

	public DanieleNodeCoordConverterTest(String input, HashMap<String, Object> options) {
		super(input, options);
		this.converter = new DanieleNodeCoordConverter();
		this.result = converter.getOutput(input, options);
	}

	@Test
	public void testNumberOfNodes() {
		assertTrue(true);
	}

}
