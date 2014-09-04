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
		
		List<String> lines = null;
		try {
			lines = Files.readAllLines(path, charset);
		} catch (IOException e) {
			e.printStackTrace();
		}

		//FOR CONVENIENCE, TRIM LINES
		for(int i = 0 ; i < lines.size() ; i++){
			lines.set(i, lines.get(i).trim());
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
