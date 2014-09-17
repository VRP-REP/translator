package executable;

import filevisitor.TranslateFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import tsplib95.TSPLIB95Translator;

public class TSPLIB95Executable {

	public static void main(String[] args) {
		TranslateFiles tf = new TranslateFiles(new TSPLIB95Translator());
		try {
			Files.walkFileTree(Paths.get("data/tsplib95_instance"), tf);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
