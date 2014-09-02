package example;

import java.util.Arrays;

import keyword.AsymmetricCVRPKeyword;
import reader.FileLiner;
import reader.ValueFetcher;

public class Test {

	public static void main(String[] args) {
		/*File file = new File("data/example/small/MCVRPSD001.C50.P3.LS.T10.xml");
		Instance instance = JAXB.unmarshal(file, Instance.class);
		JAXB.marshal(instance, new File("data/example/output.xml"));*/
		
		/*ObjectFactory factory = new ObjectFactory();
		Instance instance = factory.createInstance();
		Info info = factory.createInstanceInfo();
		info.setName("HolaKSO.xml");
		instance.setInfo(info);
		JAXB.marshal(instance, new File("data/example/output/HolaKSO.xml"));*/
		
		FileLiner liner = new FileLiner("data/instance/Symmetric_CVRP/E016-03m.dat");
		ValueFetcher<AsymmetricCVRPKeyword> fetcher = new ValueFetcher<AsymmetricCVRPKeyword>(liner);
		System.out.println(fetcher.getValue(AsymmetricCVRPKeyword.NAME));
		System.out.println(fetcher.getValue(AsymmetricCVRPKeyword.COMMENT));
		System.out.println(Arrays.toString(fetcher.getBlock(AsymmetricCVRPKeyword.NODE_COORD_SECTION)));
	}

}
