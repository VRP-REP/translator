package converter;

import keyword.AsymmetricCVRPKeyword;
import reader.ValueFetcher;
import model.Demand;
import model.Instance;
import model.Instance.Fleet;
import model.Instance.Info;
import model.Instance.Network;
import model.Instance.Fleet.Vehicle;
import model.Instance.Network.Nodes;
import model.Instance.Network.Nodes.Node;
import model.Instance.Requests;
import model.Instance.Requests.Request;
import model.ObjectFactory;

public class AsymmetricCVRPConverter {
	
	private ValueFetcher valueFetcher;
	
	private ObjectFactory objectFactory;
	
	private Instance instance;
	
	public AsymmetricCVRPConverter(ValueFetcher valueFetcher){	
		this.valueFetcher = valueFetcher;
		this.objectFactory = new ObjectFactory();
		this.instance = objectFactory.createInstance();
		
		setInfo();
		setNodes();
		setFleet();
		setRequests();
	}
	
	private void setInfo() {
		Info info = objectFactory.createInstanceInfo();
		info.setName(valueFetcher.getValue(AsymmetricCVRPKeyword.NAME));
		info.setDataset(valueFetcher.getValue(AsymmetricCVRPKeyword.COMMENT));
		instance.setInfo(info);
	}
	
	private void setNodes() {
		Network network = objectFactory.createInstanceNetwork();
		network.setEuclidean(true);
		Nodes nodes = objectFactory.createInstanceNetworkNodes();
		Node node = objectFactory.createInstanceNetworkNodesNode();
		nodes.getNode().add(node);
		network.setNodes(nodes);
		instance.setNetwork(network);
	}
	
	private void setFleet() {
		Fleet fleet = objectFactory.createInstanceFleet();
		Vehicle vehicle = objectFactory.createInstanceFleetVehicle();
		vehicle.setCapacity(90.0);
		fleet.getVehicle().add(vehicle);
		instance.setFleet(fleet);
	}
	
	private void setRequests() {
		Requests requests = objectFactory.createInstanceRequests();
		Request request = objectFactory.createInstanceRequestsRequest();
		requests.getRequest().add(request);
		instance.setRequests(requests);
	}

	public Instance getInstance(){
		return instance;
	}
	
}
