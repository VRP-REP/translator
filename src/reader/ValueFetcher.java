package reader;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import keyword.Keyword;
import keyword.KeywordType;

public class ValueFetcher<T extends Keyword> {

	private FileLiner fileLiner;

	private Pattern pattern;

	public ValueFetcher(FileLiner fileLiner) {
		this.fileLiner = fileLiner;
		this.pattern = Pattern.compile("^(?<keyword>[A-Z_]*) : (?<value>.*)$");
	}

	public String getValue(T keyword) {
		if(keyword.type() != KeywordType.INLINE) {
			return null;
		}
		for(String line : fileLiner.getLines()){
			Matcher matcher = pattern.matcher(line);
			if (matcher.find() && matcher.group("keyword").equals(keyword.displayName())) {
				return matcher.group("value");
			}
		}
		return null;
	}

	public String[] getBlock(T keyword) {
		if(keyword.type() != KeywordType.BLOCK) {
			return null;
		}
		String[] lines = fileLiner.getLines();
		ArrayList<String> block = new ArrayList<String>();
		boolean end = false;
		for(int i = 0 ; i < lines.length && !end ; i++){
			if(lines[i].startsWith(keyword.toString())){
				for(int j = i + 1 ; j < lines.length ; j++){
					for(Keyword kw : keyword.allValues()){
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

	public Pattern getPattern() {
		return pattern;
	}

	public void setPattern(Pattern pattern) {
		this.pattern = pattern;
	}

}
