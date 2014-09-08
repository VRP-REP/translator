package test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import fetcher.ValueFetcher;

@RunWith(Parameterized.class)
public abstract class ValueFetcherTest<T extends ValueFetcher<?>> {

	protected String[] input;
	protected T fetcher;

	public ValueFetcherTest(String[] input){
		this.input = input;
	}

}
