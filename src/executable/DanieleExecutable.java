package executable;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import translator.DanieleTranslator;
import translator.TranslateFiles;

public class DanieleExecutable {

	public static void main(String[] args) {
		TranslateFiles tf = new TranslateFiles(new DanieleTranslator());
		try {
			Files.walkFileTree(Paths.get("data/instance/daniele"), tf);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
