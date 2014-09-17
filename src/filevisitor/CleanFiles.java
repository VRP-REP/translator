package filevisitor;

import static java.nio.file.FileVisitResult.*;
import impl.ValueFetcher;
import io.FileLiner;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class CleanFiles extends SimpleFileVisitor<Path> {
	
	private ValueFetcher fetcher;
	
	private PathModifier modifier;
	
	public CleanFiles(ValueFetcher fetcher, PathModifier modifier) {
		super();
		this.fetcher = fetcher;
		this.modifier = modifier;
	}

	@Override
	public FileVisitResult visitFile(Path path, BasicFileAttributes attr) {
		if (attr.isRegularFile() && path.toString().endsWith(".vrp")) {
			Path modifiedPath = modifier.get(path);
			modifiedPath.getParent().toFile().mkdirs();
			
			System.out.format("Started cleaning of %s.\n", path);
			FileLiner liner = new FileLiner(path);
			fetcher.initialize(liner.getLines());
			fetcher.write(modifiedPath);
			System.out.format("%s successfully cleaned.\n", path.getFileName());
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
