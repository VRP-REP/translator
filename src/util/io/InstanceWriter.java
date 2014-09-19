package util.io;

import java.nio.file.Path;

import javax.xml.bind.JAXB;

import model.Instance;

public class InstanceWriter {

	public static void writeXML(Instance instance, Path filePath) {
		filePath.getParent().toFile().mkdirs();
		JAXB.marshal(instance, filePath.toFile());
	}

}
