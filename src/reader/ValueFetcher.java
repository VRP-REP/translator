package reader;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import keyword.AsymmetricCVRPKeyword;

public class ValueFetcher {
	
	private FileLiner fileLiner;
	
	public ValueFetcher(FileLiner fileLiner) {
		this.fileLiner = fileLiner;
	}
	
	public String getValue(Enum<?> value) {
		return getValue(value.toString());
	}
	
	public String getValue(String keyword) {
		for(String line : fileLiner.getLines()){
			if(line.startsWith(keyword)){
				Pattern pattern = Pattern.compile("^" + keyword + " : (.*)$");
				Matcher matcher = pattern.matcher(line);
				if (matcher.find()) {
				    return matcher.group(1);
				}
			}
		}
		return null;
	}
	
	public String[] getBlock(Enum<?> value) {
		return getBlock(value.toString());
	}
	
	public String[] getBlock(String keyword) {
		String[] lines = fileLiner.getLines();
		ArrayList<String> block = new ArrayList<String>();
		boolean end = false;
		for(int i = 0 ; i < lines.length && !end ; i++){
			if(lines[i].startsWith(keyword)){
				for(int j = i + 1 ; j < lines.length ; j++){
					for(AsymmetricCVRPKeyword kw : AsymmetricCVRPKeyword.values()){
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
