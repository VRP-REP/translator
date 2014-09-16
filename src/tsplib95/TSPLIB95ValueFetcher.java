package tsplib95;

import impl.Keyword;
import impl.ValueFetcher;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

import static tsplib95.TSPLIB95Keyword.Type.*;

public class TSPLIB95ValueFetcher implements ValueFetcher {

	private List<String> lines;

	private Map<TSPLIB95Keyword, String> map;

	public TSPLIB95ValueFetcher(List<String> lines) {
		this.lines = new ArrayList<String>(lines);
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
				List<String> blockValue = getBlock(kw);
				if(blockValue.size() > 0){
					map.put(kw, String.join("\n", blockValue));
				}
			}
		}
		lines.remove("EOF");
		
		if(!lines.isEmpty()) {
			System.err.println("The following lines were not read…");
			System.out.println(lines);
		}
		
		return map;
	}

	private String getInline(TSPLIB95Keyword keyword) {
		Iterator<String> iter = lines.iterator();
		while (iter.hasNext()) {
			Matcher matcher = keyword.pattern().matcher(iter.next());
			if (matcher.find() && matcher.group("keyword").equals(keyword.displayName())) {
				iter.remove();
				return matcher.group("value");
			}
		}
		return null;
	}

	private List<String> getBlock(TSPLIB95Keyword keyword) {
		ArrayList<String> block = new ArrayList<String>();
		Iterator<String> iter = lines.iterator();
		boolean begin = false;
		boolean end = false;
		while (iter.hasNext() && !end) {
			if(!begin && iter.next().equals(keyword.displayName())){
				iter.remove();
				begin = true;
			}
			if(begin) {
				String value = iter.next();
				for(TSPLIB95Keyword kw : TSPLIB95Keyword.values()){
					if(value.startsWith(kw.displayName())){
						end = true;
					}
				}
				if(!end){
					iter.remove();
					block.add(value);
				}
			}
		}
		return block;
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
