package test;

import impl.ValueFetcher;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public abstract class ValueFetcherTest<T extends ValueFetcher> {

	protected String[] input;
	protected T fetcher;

	public ValueFetcherTest(String[] input){
		this.input = input;
	}

}
