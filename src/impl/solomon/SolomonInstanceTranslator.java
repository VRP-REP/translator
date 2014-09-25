package impl.solomon;

import impl.InstanceTranslator;

import java.math.BigInteger;
import java.nio.file.Path;
import java.util.Iterator;

import util.io.FileLiner;
import model.Instance;
import model.Instance.Fleet;
import model.Instance.Network;
import model.Instance.Network.Nodes;
import model.Instance.Network.Nodes.Node;
import model.Instance.Requests;
import model.Instance.Requests.Request;
import model.ObjectFactory;
import model.Instance.Info;
import model.Instance.Fleet.VehicleProfile;
import model.Tw;
import model.TwType.End;
import model.TwType.Start;

public class SolomonInstanceTranslator implements InstanceTranslator {

	@Override
	public Instance getInstance(Path path){
		ObjectFactory objectFactory = new ObjectFactory();
		Instance instance = objectFactory.createInstance();

		FileLiner liner = new FileLiner(path);
		Iterator<String> iter = liner.getLines().iterator();
		Info info = objectFactory.createInstanceInfo();
		info.setName((String) iter.next());
		info.setDataset((String) path.getParent().getFileName().toString());
		instance.setInfo(info);

		if(!iter.next().equals("VEHICLE")) { System.err.println("Error"); }
		if(!iter.next().matches("NUMBER\\s+CAPACITY")) { System.err.println("Error"); }

		Fleet fleet = objectFactory.createInstanceFleet();
		VehicleProfile profile = objectFactory.createInstanceFleetVehicleProfile();
		String[] earlyInfo = iter.next().split("\\s+");
		profile.setNumber(Integer.valueOf(earlyInfo[0]));
		profile.setCapacity(Double.valueOf(earlyInfo[1]));
		profile.setType(BigInteger.valueOf(0));
		fleet.getVehicleProfile().add(profile);

		if(!iter.next().equals("CUSTOMER")) { System.err.println("Error"); }
		if(!iter.next().matches("CUST\\s+NO.\\s+XCOORD.\\s+YCOORD.\\s+DEMAND\\s+READY\\s+TIME\\s+DUE\\s+DATE\\s+SERVICE\\s+TIME")) { System.err.println("Error"); }

		Network network = objectFactory.createInstanceNetwork();
		Nodes nodes = objectFactory.createInstanceNetworkNodes();
		Requests requests = objectFactory.createInstanceRequests();
		while(iter.hasNext()) {
			String[] customerInfo = iter.next().split("\\s+");
			BigInteger nodeId = BigInteger.valueOf(Integer.valueOf(customerInfo[0]));
			double cx = Double.valueOf(customerInfo[1]);
			double cy = Double.valueOf(customerInfo[2]);
			double demand = Double.valueOf(customerInfo[3]);
			boolean isDepot = demand == 0;
			BigInteger type = BigInteger.valueOf(isDepot ? 0 : 1);
			int twStart = Integer.valueOf(customerInfo[4]);
			int twEnd = Integer.valueOf(customerInfo[5]);
			double serviceTime = Double.valueOf(customerInfo[6]);

			Node node = objectFactory.createInstanceNetworkNodesNode();
			node.setId(nodeId);
			node.setCx(cx);
			node.setCy(cy);
			if(isDepot) {
				profile.getDepartureNode().add(nodeId);
				profile.getArrivalNode().add(nodeId);
			}
			node.setType(type);
			nodes.getNode().add(node);

			if(demand != 0) {
				Request request = objectFactory.createInstanceRequestsRequest();
				request.setId(BigInteger.valueOf(Integer.valueOf(customerInfo[0])));
				request.setNode(nodeId);
				request.setQuantity(demand);

				Tw tw = objectFactory.createTw();
				Start start = objectFactory.createTwTypeStart();
				start.setValue(twStart);
				End end = objectFactory.createTwTypeEnd();
				end.setValue(twEnd);
				tw.setStart(start);
				tw.setEnd(end);

				request.getTw().add(tw);
				request.setServiceTime(serviceTime);
				requests.getRequest().add(request);
			} else {
				// TODO : est-ce vraiment MaxTravelTime ?
				profile.setMaxTravelTime(Double.valueOf(twEnd));
			}
		}

		network.setEuclidean("");
		network.setDecimals(2);
		network.setNodes(nodes);
		instance.setNetwork(network);
		instance.setFleet(fleet);
		instance.setRequests(requests);
		return instance;
	}

}
