package util.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardCopyOption.*;

public class CopyFiles extends ParametrableFileVisitor {
	
	public CopyFiles(PathSelector selector, PathTransformer modifier) {
		super(selector, modifier);
	}

	@Override
	public void doSomething(Path inputPath, Path outputPath) {
		System.out.format("Started copying of %s.\n", inputPath);
		try {
			Files.copy(inputPath, outputPath, REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.format("%s successfully copied.\n", inputPath.getFileName());
	}
	
}
