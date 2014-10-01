package org.vrprep.translator.util.file;

import java.nio.file.Path;

public class NullPathTransformer implements PathTransformer {

	@Override
	public Path get(Path path) {
		return path;
	}

}
