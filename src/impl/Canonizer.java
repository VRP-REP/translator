package impl;

import java.util.Map;

public interface Canonizer<T extends Keyword> {
	
	public void completeData(Map<T, String> map);
	
	public void cleanData(Map<T, String> map);

}
