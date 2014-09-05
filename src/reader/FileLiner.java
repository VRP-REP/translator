package reader;

import java.io.File;
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
	 * The location (path) of file.
	 */
	private String location;
	
	/**
	 * The lines of file.
	 */
	private String[] lines;
	
	public FileLiner(String location){
		this.location = location;
		this.lines = read();
	}
	
	private String[] read() {		
		Path path = new File(location).toPath();
		Charset charset = Charset.defaultCharset();   
		
		List<String> lines = null;
		try {
			lines = Files.readAllLines(path, charset);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return lines.toArray(new String[]{});
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public String[] getLines() {
		return this.lines;
	}

}
