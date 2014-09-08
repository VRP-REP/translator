package converter.daniele;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import keyword.Keyword;
import model.Demand;
import model.ObjectFactory;
import model.Instance.Requests;
import model.Instance.Requests.Request;
import converter.Converter;

public class DemandConverter implements Converter<Requests> {

	@Override
	public Requests getOutput(String input, HashMap<Keyword, Object> anteriorValues) {
		ObjectFactory objectFactory = new ObjectFactory();
		Requests requests = objectFactory.createInstanceRequests();

		String regex = "^(?<id>[0-9]*)\\s+(?<demand>[0-9]*)$";
		Pattern pattern = Pattern.compile(regex);
		for(String line : input.split("\n")){
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

		return requests;
	}

}
