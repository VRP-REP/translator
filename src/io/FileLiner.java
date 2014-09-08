package io;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * This class intends to read any type of text file, converting it
 * to an array containing the lines.
 * 
 * @author hubertlobit
 */
public class FileLiner {
	
	/**
	 * The path of file.
	 */
	private Path path;
	
	/**
	 * The lines of file.
	 */
	private String[] lines;
	
	public FileLiner(Path path){
		this.path = path;
		this.lines = read();
	}
	
	private String[] read() {
		Charset charset = Charset.defaultCharset();   
		
		List<String> lines = null;
		try {
			lines = Files.readAllLines(path, charset);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return lines.toArray(new String[]{});
	}
	
	public Path getPath() {
		return this.path;
	}
	
	public String[] getLines() {
		return this.lines;
	}

}
