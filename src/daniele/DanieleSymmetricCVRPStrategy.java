package daniele;

import translator.Strategy;
import model.Instance.Fleet;
import model.Instance.Info;
import model.Instance.Network;
import model.Instance.Requests;

public class DanieleSymmetricCVRPStrategy implements Strategy {

	private DanieleValueFetcher<DanieleSymmetricCVRPKeyword> valueFetcher;
	
	public DanieleSymmetricCVRPStrategy(DanieleValueFetcher<DanieleSymmetricCVRPKeyword> valueFetcher){
		this.valueFetcher = valueFetcher;
	}

	@Override
	public Info getInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Network getNetwork() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fleet getFleet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Requests getRequests() {
		// TODO Auto-generated method stub
		return null;
	}

}
