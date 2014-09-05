package daniele;

import java.util.ArrayList;
import java.util.regex.Matcher;

import daniele.DanieleKeyword.Type;
import reader.FileLiner;
import reader.ValueFetcher;
import keyword.Keyword;

public class DanieleValueFetcher<T extends DanieleKeyword> implements ValueFetcher<T> {

	private FileLiner fileLiner;

	public DanieleValueFetcher(FileLiner fileLiner) {
		this.fileLiner = fileLiner;
	}
	
	public String getValue(T keyword) {
		if(keyword.type().equals(Type.INLINE)){
			return getInline(keyword);
		}
		if(keyword.type().equals(Type.BLOCK)){
			return String.join("\n", getBlock(keyword));
		}
		return null;
	}

	private String getInline(T keyword) {
		if(keyword.type() != Type.INLINE) {
			return null;
		}
		for(String line : fileLiner.getLines()){
			Matcher matcher = keyword.pattern().matcher(line);
			if (matcher.find() && matcher.group("keyword").equals(keyword.displayName())) {
				return matcher.group("value");
			}
		}
		return null;
	}

	private String[] getBlock(T keyword) {
		if(keyword.type() != Type.BLOCK) {
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

}
