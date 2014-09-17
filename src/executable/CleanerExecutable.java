package executable;

import filevisitor.CleanFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import tsplib95.TSPLIB95ValueFetcher;

public class CleanerExecutable {

	public static void main(String[] args) {
		CleanFiles tf = new CleanFiles(new TSPLIB95ValueFetcher());
		try {
			Files.walkFileTree(Paths.get("data/original_instance"), tf);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
