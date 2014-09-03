package converter;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import keyword.SymmetricCVRPKeyword;
import reader.ValueFetcher;
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

public class SymmetricCVRPConverter implements InstanceConverter {

	private ValueFetcher<SymmetricCVRPKeyword> valueFetcher;

	private ObjectFactory objectFactory;

	private Instance instance;

	public SymmetricCVRPConverter(ValueFetcher<SymmetricCVRPKeyword> valueFetcher){	
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
		info.setName(valueFetcher.getValue(SymmetricCVRPKeyword.NAME));
		info.setDataset(valueFetcher.getValue(SymmetricCVRPKeyword.COMMENT));
		instance.setInfo(info);
	}

	private void setNodes() {
		Network network = objectFactory.createInstanceNetwork();
		Nodes nodes = objectFactory.createInstanceNetworkNodes();
		
		String[] nodesData = valueFetcher.getBlock(SymmetricCVRPKeyword.NODE_COORD_SECTION);
		String[] depotsData = valueFetcher.getBlock(SymmetricCVRPKeyword.DEPOT_SECTION);
		
		ArrayList<Integer> depots = new ArrayList<Integer>();
		for(String line : depotsData){
			depots.add(Integer.valueOf(line.trim()));
		}
		
		if(valueFetcher.getValue(SymmetricCVRPKeyword.EDGE_WEIGHT_TYPE).equals("EUC_2D")){
			String regex = "^(?<id>[0-9]*)\\s+(?<x>[0-9]*)\\s+(?<y>[0-9]*)$";
			Pattern pattern = Pattern.compile(regex);
			for(String line : nodesData){
				Matcher matcher = pattern.matcher(line.trim());
				if (matcher.find()) {
					Node node = objectFactory.createInstanceNetworkNodesNode();
					int id = Integer.valueOf(matcher.group("id"));
					int isClient = depots.contains(id) ? 0 : 1;
					node.setId(BigInteger.valueOf(id));
					node.setType(BigInteger.valueOf(isClient));
					node.setCx(Double.valueOf(matcher.group("x")));
					node.setCy(Double.valueOf(matcher.group("y")));
					nodes.getNode().add(node);
				}
			}
		}
		
		network.setNodes(nodes);
		instance.setNetwork(network);
	}

	private void setFleet() {
		Fleet fleet = objectFactory.createInstanceFleet();
		Vehicle vehicle = objectFactory.createInstanceFleetVehicle();
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
