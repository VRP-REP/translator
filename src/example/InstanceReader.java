package example;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class InstanceReader {
	
	public static String[] read(String location) {		
		Path path = new File(location).toPath();
		Charset charset = Charset.defaultCharset();   
		
		List<String> stringList = null;
		try {
			stringList = Files.readAllLines(path, charset);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return stringList.toArray(new String[]{});
	}

}
