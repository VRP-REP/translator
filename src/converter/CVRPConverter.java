package converter;

import reader.FileLiner;
import model.Instance;
import model.Instance.Info;
import model.ObjectFactory;

public class CVRPConverter {
	
	private FileLiner fileLiner;
	
	private ObjectFactory objectFactory;
	
	private Instance instance;
	
	public CVRPConverter(FileLiner fileLiner){		
		this.fileLiner = fileLiner;
		this.objectFactory = new ObjectFactory();
		this.instance = objectFactory.createInstance();
		
		setInfo();
	}
	
	private void setInfo() {
		Info info = objectFactory.createInstanceInfo();
		info.setDataset("");
		info.setName("");
	}

	public Instance getInstance(){
		return instance;
	}
	
}
