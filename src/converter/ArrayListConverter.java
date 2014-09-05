package converter;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListConverter implements ValueConverter<ArrayList<Integer>> {
	
	@Override
	public ArrayList<Integer> getOutput(String input, HashMap<String, Object> options) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//TODO PARMETRABLE SPLITTER
		
		for(String line : input.split("\n")){
			list.add(Integer.valueOf(line));
		}
		return list;
	}

}
