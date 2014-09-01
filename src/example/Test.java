package example;

import java.io.File;

import javax.xml.bind.JAXB;

import reader.FileLiner;
import model.Instance;
import model.ObjectFactory;
import model.Instance.Info;

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
		String[] content = liner.getLines();
		for(String s : content){
			System.out.println(s);
		}
	}

}
