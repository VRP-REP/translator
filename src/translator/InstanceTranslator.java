package translator;

import java.nio.file.Path;

import keyword.Keyword;
import model.Instance;

public interface InstanceTranslator<T extends Keyword> {
	
	public Instance getInstance(Path filePath, T[] values);

}