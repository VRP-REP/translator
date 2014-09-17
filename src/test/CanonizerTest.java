package test;

import impl.Canonizer;
import impl.Keyword;

import java.util.Map;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public abstract class CanonizerTest<K extends Keyword, T extends Canonizer<?>> {

	protected Map<K, String> map;
	protected T canonizer;

	public CanonizerTest(Map<K, String> map) {
		this.map = map;
	}

}
