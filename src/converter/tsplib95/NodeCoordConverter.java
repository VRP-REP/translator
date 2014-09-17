package converter.tsplib95;

import impl.Keyword;

import java.math.BigInteger;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static tsplib95.TSPLIB95Keyword.*;
import converter.Converter;
import exception.ConverterException;
import exception.NotImplementedException;
import exception.UnexpectedValueException;
import exception.UnknownValueException;
import model.ObjectFactory;
import model.Instance.Network;
import model.Instance.Network.Nodes;
import model.Instance.Network.Nodes.Node;

public class NodeCoordConverter implements Converter<Network> {

	@Override
	public Network getOutput(String input, Map<Keyword, Object> anteriorValues)
			throws ConverterException {

		ObjectFactory objectFactory = new ObjectFactory();
		Network network = objectFactory.createInstanceNetwork();
		Nodes nodes = objectFactory.createInstanceNetworkNodes();

		String nodeCoordType = (String) anteriorValues.get(NODE_COORD_TYPE);
		String edgeWeightFormat = (String) anteriorValues.get(EDGE_WEIGHT_FORMAT);
		String edgeWeightType = (String) anteriorValues.get(EDGE_WEIGHT_TYPE);

		switch (nodeCoordType) {
		case "NO_COORDS":
			break;
		case "TWOD_COORDS":
			String regex = "^(?<id>[0-9]*)\\s+(?<x>[0-9.-]*)\\s+(?<y>[0-9.-]*)$";
			Pattern pattern = Pattern.compile(regex);
			for(String line : input.split("\n")){
				Matcher matcher = pattern.matcher(line);
				if (matcher.find()) {
					Node node = objectFactory.createInstanceNetworkNodesNode();
					int id = Integer.valueOf(matcher.group("id"));
					node.setId(BigInteger.valueOf(id));
					node.setType(BigInteger.valueOf(1));
					node.setCx(Double.valueOf(matcher.group("x")));
					node.setCy(Double.valueOf(matcher.group("y")));
					nodes.getNode().add(node);
				}
			}
			break;
		case "THREED_COORDS":
			throw new NotImplementedException(NODE_COORD_TYPE, nodeCoordType);
		default:
			throw new UnknownValueException(NODE_COORD_TYPE, nodeCoordType);
		}

		switch (edgeWeightFormat) {
		case "FUNCTION":
			switch (edgeWeightType) {
			case "EXPLICIT":
				throw new UnexpectedValueException(EDGE_WEIGHT_TYPE, edgeWeightType);
			case "EUC_2D":
				//FIXME EUCLIDEAN
				network.setEuclidean("");
				network.setDecimals(2);
				break;
			case "EUC_3D":
				throw new NotImplementedException(EDGE_WEIGHT_TYPE, edgeWeightType);
			case "MAX_2D":
				throw new NotImplementedException(EDGE_WEIGHT_TYPE, edgeWeightType);
			case "MAX_3D":
				throw new NotImplementedException(EDGE_WEIGHT_TYPE, edgeWeightType);
			case "MAN_2D":
				throw new NotImplementedException(EDGE_WEIGHT_TYPE, edgeWeightType);
			case "MAN_3D":
				throw new NotImplementedException(EDGE_WEIGHT_TYPE, edgeWeightType);
			case "CEIL_2D":
				throw new NotImplementedException(EDGE_WEIGHT_TYPE, edgeWeightType);
			case "GEO":
				throw new NotImplementedException(EDGE_WEIGHT_TYPE, edgeWeightType);
			case "ATT":
				throw new NotImplementedException(EDGE_WEIGHT_TYPE, edgeWeightType);
			case "XRAY1":
				throw new NotImplementedException(EDGE_WEIGHT_TYPE, edgeWeightType);
			case "XRAY2":
				throw new NotImplementedException(EDGE_WEIGHT_TYPE, edgeWeightType);
			case "SPECIAL":
				throw new NotImplementedException(EDGE_WEIGHT_TYPE, edgeWeightType);
			default:
				throw new UnknownValueException(EDGE_WEIGHT_TYPE, edgeWeightType);
			}
			break;
		case "FULL_MATRIX": case "UPPER_ROW": case "LOWER_ROW":
		case "UPPER_DIAG_ROW": case "LOWER_DIAG_ROW":
		case "UPPER_COL": case "LOWER_COL":
		case "UPPER_DIAG_COL": case "LOWER_DIAG_COL":
			throw new UnexpectedValueException(EDGE_WEIGHT_FORMAT, edgeWeightFormat);
		default:
			throw new UnknownValueException(EDGE_WEIGHT_FORMAT, edgeWeightFormat);
		}

		network.setNodes(nodes);
		return network;
	}

}
