package converter.daniele;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

import converter.Converter;
import model.ObjectFactory;
import model.Instance.Network;
import model.Instance.Network.Links;
import model.Instance.Network.Nodes;
import model.Instance.Network.Links.Link;
import model.Instance.Network.Nodes.Node;

public class EdgeWeightConverter implements Converter<Network> {

	@Override
	public Network getOutput(String input, HashMap<String, Object> anteriorValues) {
		ObjectFactory objectFactory = new ObjectFactory();
		Network network = objectFactory.createInstanceNetwork();
		Nodes nodes = objectFactory.createInstanceNetworkNodes();

		@SuppressWarnings("unchecked")
		ArrayList<Integer> depots = (ArrayList<Integer>) anteriorValues.get("DEPOT_SECTION");
		String edgeWeightType = (String) anteriorValues.get("EDGE_WEIGHT_TYPE");
		String edgeWeightFormat = (String) anteriorValues.get("EDGE_WEIGHT_FORMAT");
		
		String[] lines = input.split("\n");
		int dimension = lines.length + 1;
		if(edgeWeightType.equals("EXPLICIT")){
			for(int i = 0 ; i < dimension ; i++){
				Node node = objectFactory.createInstanceNetworkNodesNode();
				node.setId(BigInteger.valueOf(i));
				int isClient = depots.contains(i) ? 0 : 1;
				node.setType(BigInteger.valueOf(isClient));
				nodes.getNode().add(node);
			}

			Links links = objectFactory.createInstanceNetworkLinks();
			if(edgeWeightFormat.equals("LOWER_ROW")){
				/**
				 * (0,1)
				 * (0,2) (1,2)
				 * (0,3) (1,3) (2,3)
				 * (0,4) (1,4) (2,4) (3,4)
				 */
				for(int j = 1 ; j < dimension ; j++){
					String[] tokens = lines[j - 1].trim().split("\\s+");
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
					String[] tokens = lines[i].trim().split("\\s+");
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
		return network;
	}

}
