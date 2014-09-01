package reader;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileLiner {
	
	private String location;
	
	private String[] lines;
	
	public FileLiner(String location){
		this.location = location;
		this.lines = read();
	}
	
	public String[] read() {		
		Path path = new File(location).toPath();
		Charset charset = Charset.defaultCharset();   
		
		List<String> stringList = null;
		try {
			stringList = Files.readAllLines(path, charset);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return stringList.toArray(new String[]{});
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public String[] getLines() {
		return this.lines;
	}

}
