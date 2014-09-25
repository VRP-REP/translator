package executable;

import impl.tsplib95.TSPLIB95InstanceTranslator;
import impl.tsplib95.TSPLIB95ValueFetcher;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import util.file.CleanFiles;
import util.file.NullPathSelector;
import util.file.PathSelector;
import util.file.PathTransformer;
import util.file.TranslateFiles;

public class TSPLIB95Executable {

	public static void main(String[] args) {
		clean();
		translate();
	}
	
	private static void clean() {
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
				modifiedPath = modifiedPath.replace("/original_instance", "/tsplib95/instance");
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
	
	private static void translate() {
		TranslateFiles tf = new TranslateFiles(new TSPLIB95InstanceTranslator(), new NullPathSelector(), new PathTransformer() {
			@Override
			public Path get(Path path) {
				String modifiedPath = path.toString();
				modifiedPath = modifiedPath.replace("/tsplib95/instance", "/tsplib95/output");
				modifiedPath = modifiedPath.replace(".vrp", ".xml");
				return Paths.get(modifiedPath);
			}
		});
		
		try {
			Files.walkFileTree(Paths.get("data/tsplib95/instance"), tf);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
