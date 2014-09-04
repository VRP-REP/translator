package converter;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import keyword.SymmetricCVRPKeyword;
import reader.ValueFetcher;
import model.Demand;
import model.Instance;
import model.Instance.Fleet;
import model.Instance.Info;
import model.Instance.Network;
import model.Instance.Fleet.Vehicle;
import model.Instance.Network.Links;
import model.Instance.Network.Links.Link;
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

		String depotsData = valueFetcher.getValue(SymmetricCVRPKeyword.DEPOT_SECTION);
		ArrayList<Integer> depots = new ArrayList<Integer>();
		for(String line : depotsData.split("\n")){
			depots.add(Integer.valueOf(line));
		}

		String edgeWeightType = valueFetcher.getValue(SymmetricCVRPKeyword.EDGE_WEIGHT_TYPE);
		if(edgeWeightType.equals("EUC_2D")){
			String nodesData = valueFetcher.getValue(SymmetricCVRPKeyword.NODE_COORD_SECTION);
			String regex = "^(?<id>[0-9]*)\\s+(?<x>[0-9.-]*)\\s+(?<y>[0-9.-]*)$";
			Pattern pattern = Pattern.compile(regex);
			for(String line : nodesData.split("\n")){
				Matcher matcher = pattern.matcher(line);
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
			//FIXME EUCLIDEAN
			network.setEuclidean("");
			network.setDecimals(2);
		}

		if(edgeWeightType.equals("EXPLICIT")){
			int dimension = Integer.valueOf(valueFetcher.getValue(SymmetricCVRPKeyword.DIMENSION));
			for(int i = 0 ; i < dimension ; i++){
				Node node = objectFactory.createInstanceNetworkNodesNode();
				node.setId(BigInteger.valueOf(i));
				int isClient = depots.contains(i) ? 0 : 1;
				node.setType(BigInteger.valueOf(isClient));
				nodes.getNode().add(node);
			}

			Links links = objectFactory.createInstanceNetworkLinks();
			String linksData = valueFetcher.getValue(SymmetricCVRPKeyword.EDGE_WEIGHT_SECTION);
			String edgeWeightFormat = valueFetcher.getValue(SymmetricCVRPKeyword.EDGE_WEIGHT_FORMAT);
			if(edgeWeightFormat.equals("LOWER_ROW")){
				/**
				 * (0,1)
				 * (0,2) (1,2)
				 * (0,3) (1,3) (2,3)
				 * (0,4) (1,4) (2,4) (3,4)
				 */
				for(int j = 1 ; j < dimension ; j++){
					String[] tokens = linksData.split("\n")[j - 1].split("\\s+");
					for(int i = 0 ; i < j ; i++){
						Link link = objectFactory.createInstanceNetworkLinksLink();
						link.setTail(BigInteger.valueOf(i));
						link.setHead(BigInteger.valueOf(j));
						link.setLength(Double.valueOf(tokens[i]));
						links.getLink().add(link);
					}
				}
			}
			if(edgeWeightFormat.equals("LOWER_COL")){
				/**
				 * (0,4) (0,3) (0,2) (0,1)
				 * (1,4) (1,3) (1,2)
				 * (2,4) (2,3)
				 * (3,4)
				 */
				for(int i = 0 ; i < dimension - 1 ; i++){
					String[] tokens = linksData.split("\n")[i].split("\\s+");
					for(int j = dimension - 1 ; j > i ; j--){
						Link link = objectFactory.createInstanceNetworkLinksLink();
						link.setTail(BigInteger.valueOf(i));
						link.setHead(BigInteger.valueOf(j));
						link.setLength(Double.valueOf(tokens[dimension - 1 - j]));
						links.getLink().add(link);
					}
				}
			}
			network.setLinks(links);
		}

		network.setNodes(nodes);
		instance.setNetwork(network);
	}

	private void setFleet() {
		Fleet fleet = objectFactory.createInstanceFleet();

		String fleetSize = valueFetcher.getValue(SymmetricCVRPKeyword.VEHICLES);
		String capacity = valueFetcher.getValue(SymmetricCVRPKeyword.CAPACITY);

		for(int i = 0 ; i < Integer.valueOf(fleetSize) ; i++){
			Vehicle vehicle = objectFactory.createInstanceFleetVehicle();
			vehicle.setId(i);
			vehicle.setCapacity(Double.valueOf(capacity));
			fleet.getVehicle().add(vehicle);
		}

		instance.setFleet(fleet);
	}

	private void setRequests() {
		Requests requests = objectFactory.createInstanceRequests();

		String requestsData = valueFetcher.getValue(SymmetricCVRPKeyword.DEMAND_SECTION);
		String regex = "^(?<id>[0-9]*)\\s+(?<demand>[0-9]*)$";
		Pattern pattern = Pattern.compile(regex);
		for(String line : requestsData.split("\n")){
			Matcher matcher = pattern.matcher(line);
			if (matcher.find()) {
				Request request = objectFactory.createInstanceRequestsRequest();
				request.setNode(BigInteger.valueOf(Integer.valueOf(matcher.group("id"))));
				Demand demand = objectFactory.createDemand();
				//FIXME DEMANDS
				request.getDemand().add(demand);
				requests.getRequest().add(request);
			}
		}

		instance.setRequests(requests);
	}

	public Instance getInstance(){
		return instance;
	}

}
