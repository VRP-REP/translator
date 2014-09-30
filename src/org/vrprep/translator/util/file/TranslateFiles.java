package org.vrprep.translator.util.file;

import java.nio.file.Path;

import org.vrprep.model.instance.Instance;
import org.vrprep.translator.impl.InstanceTranslator;
import org.vrprep.translator.util.io.InstanceWriter;

public class TranslateFiles extends ParametrableFileVisitor {
	
	private InstanceTranslator translator;
	
	public TranslateFiles(InstanceTranslator translator, PathSelector selector, PathTransformer transformer) {
		super(selector, transformer);
		this.translator = translator;
	}

	@Override
	public void doSomething(Path inputPath, Path outputPath) {
		System.out.format("Started translation of %s.\n", inputPath);
		Instance instance = translator.getInstance(inputPath);
		InstanceWriter.writeXML(instance, outputPath);
		System.out.format("%s successfully translated.\n", inputPath.getFileName());
	}
	
}
