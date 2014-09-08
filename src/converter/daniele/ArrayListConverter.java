package converter.daniele;

import java.util.ArrayList;
import java.util.HashMap;

import keyword.Keyword;
import converter.Converter;

public class ArrayListConverter implements Converter<ArrayList<Integer>> {
	
	@Override
	public ArrayList<Integer> getOutput(String input, HashMap<Keyword, Object> anteriorValues) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(String line : input.split("\n")){
			list.add(Integer.valueOf(line.trim()));
		}
		return list;
	}

}
