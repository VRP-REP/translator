package converter.tsplib95;

import impl.Keyword;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import converter.Converter;

public class ListConverter implements Converter<List<Integer>> {
	
	@Override
	public List<Integer> getOutput(String input, Map<Keyword, Object> anteriorValues) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(String line : input.split("\n")){
			list.add(Integer.valueOf(line.trim()));
		}
		return list;
	}

}
