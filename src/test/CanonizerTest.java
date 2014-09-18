package test;

import impl.Canonizer;
import impl.Keyword;

import java.util.Map;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public abstract class CanonizerTest {

	protected Map<Keyword, String> map;
	protected Canonizer canonizer;

	public CanonizerTest(Map<Keyword, String> map) {
		this.map = map;
	}

}
