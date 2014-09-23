package converter.tsplib95;

import impl.Keyword;

import java.math.BigInteger;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import model.ObjectFactory;
import model.Instance.Requests;
import model.Instance.Requests.Request;
import converter.Converter;

public class DemandConverter implements Converter<Requests> {

	@Override
	public Requests getOutput(String input, Map<Keyword, Object> anteriorValues) {
		ObjectFactory objectFactory = new ObjectFactory();
		Requests requests = objectFactory.createInstanceRequests();

		String regex = "^(?<id>[0-9]*)\\s+(?<demand>[0-9]*)$";
		Pattern pattern = Pattern.compile(regex);
		int i = 0;
		for(String line : input.split("\n")){
			Matcher matcher = pattern.matcher(line);
			if (matcher.find()) {
				Request request = objectFactory.createInstanceRequestsRequest();
				request.setId(BigInteger.valueOf(i));
				request.setNode(BigInteger.valueOf(Integer.valueOf(matcher.group("id"))));
				request.setQuantity(Double.valueOf(matcher.group("demand")));
				if(request.getQuantity() > 0) {
					requests.getRequest().add(request);
				}
			}
			i++;
		}

		return requests;
	}

}
