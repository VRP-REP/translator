package util.file;

import impl.InstanceTranslator;

import java.nio.file.Path;

import util.io.InstanceWriter;
import model.Instance;

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
