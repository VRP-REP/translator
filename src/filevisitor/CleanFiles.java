package filevisitor;

import static java.nio.file.FileVisitResult.*;
import impl.ValueFetcher;
import io.FileLiner;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class CleanFiles extends SimpleFileVisitor<Path> {
	
	private ValueFetcher fetcher;
	
	public CleanFiles(ValueFetcher fetcher) {
		super();
		this.fetcher = fetcher;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attr) {
		if (attr.isRegularFile() && file.toString().endsWith(".vrp")) {
			String path = file.getParent().toString().replace("data/original_instance", "data/tsplib95_instance");
			Path outputDirectory = Paths.get(path);
			outputDirectory.toFile().mkdirs();
			
			System.out.format("Started cleaning of %s.\n", file);
			String instanceName = file.getFileName().toString();
			
			path = String.format(outputDirectory + "/%s", instanceName);
			Path outputPath = Paths.get(path);
			FileLiner liner = new FileLiner(file);
			fetcher.initialize(liner.getLines());
			fetcher.write(outputPath);
			System.out.format("%s successfully cleaned.\n", file.getFileName());
		}
		return CONTINUE;
	}

	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
		return CONTINUE;
	}

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) {
		System.err.println(exc);
		return CONTINUE;
	}
}
