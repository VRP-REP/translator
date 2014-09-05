package translator;

import model.Instance.Fleet;
import model.Instance.Info;
import model.Instance.Network;
import model.Instance.Requests;

public interface Strategy {
	
	public Info getInfo();
	
	public Network getNetwork();
	
	public Fleet getFleet();

	public Requests getRequests();
	
}
