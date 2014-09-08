package fetcher;

import io.FileLiner;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;

import keyword.DanieleKeyword;
import keyword.DanieleKeyword.Type;

public class DanieleValueFetcher implements ValueFetcher<DanieleKeyword> {

	private FileLiner fileLiner;
	
	private LinkedHashMap<DanieleKeyword, String> map;

	public DanieleValueFetcher(Path path) {
		this.fileLiner = new FileLiner(path);
		this.map = new LinkedHashMap<DanieleKeyword, String>();
		for(DanieleKeyword kw : DanieleKeyword.values()){
			if(kw.type().equals(Type.INLINE)){
				String inlineValue = getInline(kw);
				if(inlineValue != null){
					map.put(kw, inlineValue);
				};
			}
			if(kw.type().equals(Type.BLOCK)){
				String[] blockValue = getBlock(kw);
				if(blockValue.length > 0){
					map.put(kw, String.join("\n", blockValue));
				}
			}
		}
	}

	private String getInline(DanieleKeyword keyword) {
		for(String line : fileLiner.getLines()){
			Matcher matcher = keyword.pattern().matcher(line);
			if (matcher.find() && matcher.group("keyword").equals(keyword.displayName())) {
				return matcher.group("value");
			}
		}
		return null;
	}

	private String[] getBlock(DanieleKeyword keyword) {
		String[] lines = fileLiner.getLines();
		ArrayList<String> block = new ArrayList<String>();
		boolean end = false;
		for(int i = 0 ; i < lines.length && !end ; i++){
			if(lines[i].startsWith(keyword.toString())){
				for(int j = i + 1 ; j < lines.length ; j++){
					for(DanieleKeyword kw : DanieleKeyword.values()){
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

	@Override
	public String getValue(DanieleKeyword keyword) {
		return map.get(keyword);
	}

	@Override
	public DanieleKeyword[] getKeywords() {
		return map.keySet().toArray(new DanieleKeyword[]{});
	}

}
