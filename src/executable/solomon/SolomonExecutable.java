package executable.solomon;

import impl.solomon.SolomonTranslator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import util.file.NullPathSelector;
import util.file.PathTransformer;
import util.file.TranslateFiles;

public class SolomonExecutable {

	public static void main(String[] args) {
		
		TranslateFiles tf = new TranslateFiles(new SolomonTranslator(), new NullPathSelector(), new PathTransformer() {
			@Override
			public Path get(Path path) {
				String modifiedPath = path.toString();
				modifiedPath = modifiedPath.replace("/solomon_instance", "/output");
				modifiedPath = modifiedPath.replace(".vrp$", ".xml$");
				return Paths.get(modifiedPath);
			}
		});
		
		try {
			Files.walkFileTree(Paths.get("data/solomon_instance"), tf);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

}
