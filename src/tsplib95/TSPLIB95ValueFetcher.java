package tsplib95;

import impl.Keyword;
import impl.ValueFetcher;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;

import static tsplib95.TSPLIB95Keyword.Type.*;

public class TSPLIB95ValueFetcher implements ValueFetcher {

	private String[] lines;

	private Map<TSPLIB95Keyword, String> map;

	public TSPLIB95ValueFetcher(String[] lines) {
		this.lines = lines;
		this.map = initMap();
	}

	private Map<TSPLIB95Keyword, String> initMap() {
		map = new LinkedHashMap<TSPLIB95Keyword, String>();
		for(TSPLIB95Keyword kw : TSPLIB95Keyword.values()){
			if(kw.type().equals(SPECIFICATION)){
				String inlineValue = getInline(kw);
				if(inlineValue != null){
					map.put(kw, inlineValue);
				};
			}
			if(kw.type().equals(DATA)){
				String[] blockValue = getBlock(kw);
				if(blockValue.length > 0){
					map.put(kw, String.join("\n", blockValue));
				}
			}
		}
		return map;
	}

	private String getInline(TSPLIB95Keyword keyword) {
		for(String line : lines) {
			Matcher matcher = keyword.pattern().matcher(line);
			if (matcher.find() && matcher.group("keyword").equals(keyword.displayName())) {
				return matcher.group("value");
			}
		}
		return null;
	}

	private String[] getBlock(TSPLIB95Keyword keyword) {
		ArrayList<String> block = new ArrayList<String>();
		boolean end = false;
		for(int i = 0 ; i < lines.length && !end ; i++){
			if(lines[i].equals(keyword.displayName())){
				for(int j = i + 1 ; j < lines.length ; j++){
					for(TSPLIB95Keyword kw : TSPLIB95Keyword.values()){
						if(lines[j].startsWith(kw.displayName())){
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
	public Keyword[] getKeywords() {
		return map.keySet().toArray(new TSPLIB95Keyword[]{});
	}

	@Override
	public String getValue(Keyword keyword) {
		return map.get(keyword);
	}

}
