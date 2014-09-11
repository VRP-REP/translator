package impl;

import java.nio.file.Path;

import model.Instance;

public interface InstanceTranslator {
	
	public Instance getInstance(Path filePath);

}