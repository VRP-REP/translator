package executable.tsplib95;

import impl.tsplib95.TSPLIB95ValueFetcher;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import util.file.CleanFiles;
import util.file.PathSelector;
import util.file.PathTransformer;

public class CleanerExecutable {

	public static void main(String[] args) {
		
		PathSelector selector = new PathSelector() {
			@Override
			public boolean isSelected(Path path) {
				return path.toString().endsWith(".vrp");
			}
		};
		
		PathTransformer transformer = new PathTransformer() {
			@Override
			public Path get(Path path) {
				String modifiedPath = path.toString();
				modifiedPath = modifiedPath.replace("/original_instance", "/tsplib95_instance");
				return Paths.get(modifiedPath);
			}
		};
		
		CleanFiles cf = new CleanFiles(new TSPLIB95ValueFetcher(), selector, transformer);
		
		try {
			Files.walkFileTree(Paths.get("data/original_instance"), cf);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

}
