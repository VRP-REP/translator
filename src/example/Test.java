package example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import translator.DanieleTranslator;

public class Test {

	public static void main(String[] args) {
		DanieleTranslator translator = new DanieleTranslator();
		Path startingDir = Paths.get("data/instance");
		TranslateFiles pf = new TranslateFiles(translator);
		try {
			Files.walkFileTree(startingDir, pf);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
