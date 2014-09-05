package translator;

import model.Instance;
import model.ObjectFactory;

public class InstanceTranslator {
	
	private Strategy strategy;
	
	public InstanceTranslator(Strategy strategy){
		this.strategy = strategy;
	}
	
	public Instance getInstance(){
		ObjectFactory objectFactory = new ObjectFactory();
		Instance instance = objectFactory.createInstance();

		instance.setInfo(strategy.getInfo());
		instance.setNetwork(strategy.getNetwork());
		instance.setFleet(strategy.getFleet());
		instance.setRequests(strategy.getRequests());
		
		return instance;
	}

}
