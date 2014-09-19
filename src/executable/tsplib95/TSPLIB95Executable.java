package executable.tsplib95;

import impl.tsplib95.TSPLIB95InstanceTranslator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import util.file.NullPathSelector;
import util.file.PathTransformer;
import util.file.TranslateFiles;

public class TSPLIB95Executable {

	public static void main(String[] args) {
		
		TranslateFiles tf = new TranslateFiles(new TSPLIB95InstanceTranslator(), new NullPathSelector(), new PathTransformer() {
			@Override
			public Path get(Path path) {
				String modifiedPath = path.toString();
				modifiedPath = modifiedPath.replace("/tsplib95_instance", "/output");
				modifiedPath = modifiedPath.replace(".vrp$", ".xml$");
				return Paths.get(modifiedPath);
			}
		});
		
		try {
			Files.walkFileTree(Paths.get("data/tsplib95_instance"), tf);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

}
