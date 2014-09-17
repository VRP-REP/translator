package tsplib95;

import impl.Keyword;
import impl.ValueFetcher;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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
	
	private TSPLIB95Canonizer canonizer;

	public TSPLIB95ValueFetcher() {
		this.map = new LinkedHashMap<TSPLIB95Keyword, String>();
		this.canonizer = new TSPLIB95Canonizer();
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
	public void initialize(List<String> lines) {
		this.lines = new ArrayList<String>(lines);
		map.clear();
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
		this.lines.remove("EOF");
		
		if(!this.lines.isEmpty()) {
			System.err.println("The following lines were not read…");
			System.out.println(this.lines);
		}
		
		canonizer.completeData(map);
	}

	@Override
	public Keyword[] getKeywords() {
		return map.keySet().toArray(new TSPLIB95Keyword[]{});
	}

	@Override
	public String getValue(Keyword keyword) {
		return map.get(keyword);
	}
	
	@Override
	public void write(Path path) {
		canonizer.cleanData(map);
		
		path.getParent().toFile().mkdirs();
		try (BufferedWriter writer = Files.newBufferedWriter(path)) {
			for(TSPLIB95Keyword kw : TSPLIB95Keyword.values()){
				String value = getValue(kw);
				if(value != null){
					if(kw.type().equals(SPECIFICATION)) {
						writer.write(String.format("%s : %s%n", kw, value));
					}
					if(kw.type().equals(DATA)) {
						writer.write(String.format("%s%n%s%n", kw, value));
					}
				}
			}
			writer.write("EOF");
		} catch (IOException x) {
			System.err.format("IOException: %s%n", x);
		}
		
		canonizer.completeData(map);
	}

}
