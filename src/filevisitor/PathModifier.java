package filevisitor;

import java.nio.file.Path;

public interface PathModifier {

	public Path get(Path path);
	
}
