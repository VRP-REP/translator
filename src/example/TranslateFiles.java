package example;
import static java.nio.file.FileVisitResult.*;
import io.InstanceWriter;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

import translator.InstanceTranslator;
import model.Instance;

public class TranslateFiles extends SimpleFileVisitor<Path> {
	
	private InstanceTranslator<?> translator;
	
	public TranslateFiles(InstanceTranslator<?> translator) {
		super();
		this.translator = translator;
	}

	// Print information about
	// each type of file.
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attr) {
		if (attr.isRegularFile()) {
			String path = file.getParent().toString().replace("data/instance", "data/output");
			Path outputDirectory = Paths.get(path);
			outputDirectory.toFile().mkdirs();
			Instance instance = translator.getInstance(file);
			Path outputPath = Paths.get(outputDirectory + "/" + instance.getInfo().getName() +".xml");
			InstanceWriter.write(instance, outputPath);
		}
		//System.out.println("(" + attr.size() + "bytes)");
		return CONTINUE;
	}

	// Print each directory visited.
	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
		//System.out.format("Directory: %s%n", dir);
		return CONTINUE;
	}

	// If there is some error accessing
	// the file, let the user know.
	// If you don't override this method
	// and an error occurs, an IOException 
	// is thrown.
	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) {
		System.err.println(exc);
		return CONTINUE;
	}
}
