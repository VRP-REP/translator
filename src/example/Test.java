package example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.bind.JAXB;

import model.Instance;
import daniele.DanieleSymmetricCVRPKeyword;
import daniele.DanieleSymmetricCVRPStrategy;
import daniele.DanieleValueFetcher;
import reader.FileLiner;
import translator.InstanceTranslator;
import translator.Strategy;

public class Test {

	public static void main(String[] args) {
		try {
			Files.walk(Paths.get("data/instance/Symmetric_CVRP")).forEach(filePath -> {
				if (Files.isRegularFile(filePath)) {
					FileLiner liner = new FileLiner(filePath.toString());
					DanieleValueFetcher<DanieleSymmetricCVRPKeyword> fetcher = new DanieleValueFetcher<DanieleSymmetricCVRPKeyword>(liner);
					System.out.println("-----------------------------------------------------");
					for(DanieleSymmetricCVRPKeyword kw : DanieleSymmetricCVRPKeyword.values()){
						System.out.println(fetcher.getValue(kw));
					}
					Strategy strategy = new DanieleSymmetricCVRPStrategy(fetcher);
					InstanceTranslator translator = new InstanceTranslator(strategy);
					Instance result = translator.getInstance();
					File file = new File("data/example/output/Symmetric_CVRP/"+ result.getInfo().getName() +".xml");
					JAXB.marshal(result, file);
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
