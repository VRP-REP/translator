package executable;

import impl.solomon.SolomonInstanceTranslator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import util.file.CopyFiles;
import util.file.NullPathSelector;
import util.file.PathSelector;
import util.file.PathTransformer;
import util.file.TranslateFiles;

public class SolomonExecutable {

	public static void main(String[] args) {
		copy();
		translate();
	}

	private static void copy() {
		PathSelector selector = new PathSelector() {
			@Override
			public boolean isSelected(Path path) {
				boolean homberger = path.toString().matches("^.*/VRPWEB/.*/Gehring and Homberger 1999/.*\\.TXT$");
				boolean solomon = path.toString().matches("^.*/VRPWEB/.*/Solomon.*/.*\\.txt$");
				return homberger || solomon ;
			}
		};
		
		PathTransformer transformer = new PathTransformer() {
			@Override
			public Path get(Path path) {
				String modifiedPath = path.toString();
				modifiedPath = modifiedPath.replace("/original_instance", "/solomon/instance");
				return Paths.get(modifiedPath);
			}
		};
		
		CopyFiles cf = new CopyFiles(selector, transformer);
		
		try {
			Files.walkFileTree(Paths.get("data/original_instance"), cf);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	private static void translate() {
		TranslateFiles tf = new TranslateFiles(new SolomonInstanceTranslator(), new NullPathSelector(), new PathTransformer() {
			@Override
			public Path get(Path path) {
				String modifiedPath = path.toString();
				modifiedPath = modifiedPath.replace("/solomon/instance", "/solomon/output");
				modifiedPath = modifiedPath.replace(".txt", ".xml").replace(".TXT", ".xml");
				return Paths.get(modifiedPath);
			}
		});
		
		try {
			Files.walkFileTree(Paths.get("data/solomon/instance"), tf);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
