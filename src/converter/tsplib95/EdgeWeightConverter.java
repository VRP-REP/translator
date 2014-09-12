package converter.tsplib95;

import impl.Keyword;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Map;

import static tsplib95.TSPLIB95Keyword.*;
import converter.Converter;
import exception.NotImplementedException;
import exception.UnknownValueException;
import model.ObjectFactory;
import model.Instance.Network;
import model.Instance.Network.Links;
import model.Instance.Network.Nodes;
import model.Instance.Network.Links.Link;
import model.Instance.Network.Nodes.Node;

public class EdgeWeightConverter implements Converter<Network> {

	@Override
	public Network getOutput(String input, Map<Keyword, Object> anteriorValues)
			throws UnknownValueException, NotImplementedException {
		
		ObjectFactory objectFactory = new ObjectFactory();
		Network network = objectFactory.createInstanceNetwork();
		Nodes nodes = objectFactory.createInstanceNetworkNodes();

		@SuppressWarnings("unchecked")
		ArrayList<Integer> depots = (ArrayList<Integer>) anteriorValues.get(DEPOT_SECTION);
		int dimension = (Integer) anteriorValues.get(DIMENSION);
		String edgeWeightType = (String) anteriorValues.get(EDGE_WEIGHT_TYPE);
		String edgeWeightFormat = (String) anteriorValues.get(EDGE_WEIGHT_FORMAT);

		String[] lines = input.split("\n");
		switch (edgeWeightType) {
		case "EXPLICIT":
			for(int i = 1 ; i <= dimension ; i++){
				Node node = objectFactory.createInstanceNetworkNodesNode();
				node.setId(BigInteger.valueOf(i));
				int isClient = depots.contains(i) ? 0 : 1;
				node.setType(BigInteger.valueOf(isClient));
				nodes.getNode().add(node);
			}

			Links links = objectFactory.createInstanceNetworkLinks();
			switch (edgeWeightFormat) {
			case "FULL_MATRIX":
				/**
				 * 0     (1,2) (1,3) (1,4) (1,5)
				 * (2,1) 0     (2,3) (2,4) (2,5)
				 * (3,1) (3,2) 0     (3,4) (3,5)
				 * (4,1) (4,2) (4,3) 0     (4,5)
				 * (5,1) (5,2) (5,3) (5,4) 0    
				 */
				for(int i = 1 ; i <= dimension ; i++){
					String[] tokens = lines[i - 1].split("\\s+");
					for(int j = 1 ; j <= dimension ; j++){
						if(i != j){
							Link link = objectFactory.createInstanceNetworkLinksLink();
							link.setTail(BigInteger.valueOf(i));
							link.setHead(BigInteger.valueOf(j));
							link.setLength(Double.valueOf(tokens[j - 1]));
							links.getLink().add(link);
						}
					}
				}
				break;
			case "UPPER_ROW":
				throw new NotImplementedException(EDGE_WEIGHT_FORMAT, edgeWeightFormat);
			case "LOWER_ROW":
				links.setSymmetric(true);
				/**
				 * (1,2)
				 * (1,3) (2,3)
				 * (1,4) (2,4) (3,4)
				 * (1,5) (2,5) (3,5) (4,5)
				 */
				for(int j = 2 ; j <= dimension ; j++){
					String[] tokens = lines[j - 2].split("\\s+");
					for(int i = 1 ; i < j ; i++){
						Link link = objectFactory.createInstanceNetworkLinksLink();
						link.setTail(BigInteger.valueOf(i));
						link.setHead(BigInteger.valueOf(j));
						link.setLength(Double.valueOf(tokens[i - 1]));
						links.getLink().add(link);
					}
				}
				break;
			case "UPPER_DIAG_ROW":
				throw new NotImplementedException(EDGE_WEIGHT_FORMAT, edgeWeightFormat);
			case "LOWER_DIAG_ROW":
				throw new NotImplementedException(EDGE_WEIGHT_FORMAT, edgeWeightFormat);
			case "UPPER_COL":
				throw new NotImplementedException(EDGE_WEIGHT_FORMAT, edgeWeightFormat);
			case "LOWER_COL":
				links.setSymmetric(true);
				/**
				 * (1,5) (1,4) (1,3) (1,2)
				 * (2,5) (2,4) (2,3)
				 * (3,5) (3,4)
				 * (4,5)
				 */
				for(int i = 1 ; i < dimension ; i++){
					String[] tokens = lines[i - 1].split("\\s+");
					for(int j = dimension ; j > i ; j--){
						Link link = objectFactory.createInstanceNetworkLinksLink();
						link.setTail(BigInteger.valueOf(i));
						link.setHead(BigInteger.valueOf(j));
						link.setLength(Double.valueOf(tokens[dimension - j]));
						links.getLink().add(link);
					}
				}
				break;
			case "UPPER_DIAG_COL":
				throw new NotImplementedException(EDGE_WEIGHT_FORMAT, edgeWeightFormat);
			case "LOWER_DIAG_COL":
				throw new NotImplementedException(EDGE_WEIGHT_FORMAT, edgeWeightFormat);
			default:
				throw new UnknownValueException(EDGE_WEIGHT_FORMAT, edgeWeightFormat);
			}
			network.setLinks(links);
			break;
		default:
			throw new UnknownValueException(EDGE_WEIGHT_TYPE, edgeWeightType);
		}
		network.setNodes(nodes);
		return network;
		
	}

}
