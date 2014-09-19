package executable.solomon;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import util.file.CopyFiles;
import util.file.PathSelector;
import util.file.PathTransformer;

public class CopierExecutable {

	public static void main(String[] args) {
		
		PathSelector selector = new PathSelector() {
			@Override
			public boolean isSelected(Path path) {
				boolean homberger = path.toString().matches("^.*/VRPWEB/.*/Homberger/.*\\.TXT$");
				boolean solomon = path.toString().matches("^.*/VRPWEB/.*/Solomon_[0-9]*/.*\\.txt$");
				return homberger || solomon ;
			}
		};
		
		PathTransformer transformer = new PathTransformer() {
			@Override
			public Path get(Path path) {
				String modifiedPath = path.toString();
				modifiedPath = modifiedPath.replace("/original_instance", "/solomon_instance");
				return Paths.get(modifiedPath);
			}
		};
		
		CopyFiles tf = new CopyFiles(selector, transformer);
		
		try {
			Files.walkFileTree(Paths.get("data/original_instance"), tf);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

}
