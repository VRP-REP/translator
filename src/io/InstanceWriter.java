package io;

import java.nio.file.Path;

import javax.xml.bind.JAXB;

import model.Instance;

public class InstanceWriter {
	
	public static void write(Instance instance, Path filePath) {
		JAXB.marshal(instance, filePath.toFile());
	}

}
