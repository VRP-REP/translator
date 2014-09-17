package executable;

import filevisitor.PathModifier;
import filevisitor.TranslateFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import tsplib95.TSPLIB95Translator;

public class TSPLIB95Executable {

	public static void main(String[] args) {
		
		TranslateFiles tf = new TranslateFiles(new TSPLIB95Translator(), new PathModifier() {
			@Override
			public Path get(Path path) {
				return Paths.get(path.toString().replace("data/tsplib95_instance", "data/output"));
			}
		});
		
		try {
			Files.walkFileTree(Paths.get("data/tsplib95_instance"), tf);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

}
