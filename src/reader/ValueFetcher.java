package reader;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValueFetcher<T extends Enum<?>> {
	
	private FileLiner fileLiner;
	
	public ValueFetcher(FileLiner fileLiner) {
		this.fileLiner = fileLiner;
	}
	
	public String getValue(T keyword) {
		for(String line : fileLiner.getLines()){
			if(line.startsWith(keyword.toString())){
				Pattern pattern = Pattern.compile("^" + keyword + " : (.*)$");
				Matcher matcher = pattern.matcher(line);
				if (matcher.find()) {
				    return matcher.group(1);
				}
			}
		}
		return null;
	}
	
	public String[] getBlock(T keyword) {
		String[] lines = fileLiner.getLines();
		ArrayList<String> block = new ArrayList<String>();
		boolean end = false;
		for(int i = 0 ; i < lines.length && !end ; i++){
			if(lines[i].startsWith(keyword.toString())){
				for(int j = i + 1 ; j < lines.length ; j++){
					for(Enum<?> kw : keyword.getClass().getEnumConstants()){
						if(lines[j].startsWith(kw.toString())){
							end = true;
						}
					}
					if(!end){
						block.add(lines[j]);
					}
				}
			}	
		}
		return block.toArray(new String[]{});
	}
	
}
