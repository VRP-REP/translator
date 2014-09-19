package impl.solomon;

import impl.InstanceTranslator;

import java.nio.file.Path;

import util.io.FileLiner;
import model.Instance;
import model.Instance.Fleet;
import model.Instance.Info;
import model.Instance.Network;
import model.Instance.Requests;
import model.Instance.Fleet.VehicleProfile;
import model.ObjectFactory;

public class SolomonTranslator implements InstanceTranslator {

	public Instance getInstance(Path path){
		FileLiner liner = new FileLiner(path);

		System.out.println(liner.getLines());

		ObjectFactory objectFactory = new ObjectFactory();
		Instance instance = objectFactory.createInstance();

		return instance;
	}

}
