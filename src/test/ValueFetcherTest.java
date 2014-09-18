package test;

import java.util.List;

import impl.ValueFetcher;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public abstract class ValueFetcherTest {

	protected List<String> input;
	protected ValueFetcher fetcher;

	public ValueFetcherTest(List<String> input){
		this.input = input;
	}

}
