package org.vrprep.translator.util.file;

import java.nio.file.Path;

public class NullPathSelector implements PathSelector {

	@Override
	public boolean isSelected(Path path) {
		return true;
	}

}
