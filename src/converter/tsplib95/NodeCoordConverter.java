package converter.tsplib95;

import impl.Keyword;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static tsplib95.TSPLIB95Keyword.*;
import converter.Converter;
import exception.UnknownValueException;
import model.ObjectFactory;
import model.Instance.Network;
import model.Instance.Network.Nodes;
import model.Instance.Network.Nodes.Node;

public class NodeCoordConverter implements Converter<Network> {

	@Override
	public Network getOutput(String input, Map<Keyword, Object> anteriorValues) throws UnknownValueException {
		ObjectFactory objectFactory = new ObjectFactory();
		Network network = objectFactory.createInstanceNetwork();
		Nodes nodes = objectFactory.createInstanceNetworkNodes();

		@SuppressWarnings("unchecked")
		List<Integer> depots = (List<Integer>) anteriorValues.get(DEPOT_SECTION);
		String nodeCoordType = (String) anteriorValues.get(NODE_COORD_TYPE);

		if(nodeCoordType.equals("TWOD_COORDS")) {
			String regex = "^(?<id>[0-9]*)\\s+(?<x>[0-9.-]*)\\s+(?<y>[0-9.-]*)$";
			Pattern pattern = Pattern.compile(regex);
			for(String line : input.split("\n")){
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
		} else {
			throw new UnknownValueException(NODE_COORD_TYPE, nodeCoordType);
		}

		network.setNodes(nodes);
		return network;
	}

}
