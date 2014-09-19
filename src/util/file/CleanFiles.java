package util.file;

import impl.ValueFetcher;

import java.nio.file.Path;

import util.io.FileLiner;

public class CleanFiles extends ParametrableFileVisitor {
	
	private ValueFetcher fetcher;
	
	public CleanFiles(ValueFetcher fetcher, PathSelector selector, PathTransformer transformer) {
		super(selector, transformer);
		this.fetcher = fetcher;
	}

	@Override
	public void doSomething(Path inputPath, Path outputPath) {
		System.out.format("Started cleaning of %s.\n", inputPath);
		FileLiner liner = new FileLiner(inputPath);
		fetcher.initialize(liner.getLines());
		fetcher.write(outputPath);
		System.out.format("%s successfully cleaned.\n", inputPath.getFileName());
		
	}
}
