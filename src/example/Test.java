package example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.bind.JAXB;

import keyword.SymmetricCVRPKeyword;
import model.Instance;
import reader.DanieleValueFetcher;
import reader.FileLiner;
import translator.GlobalConverter;
import translator.InstanceTranslator;

public class Test {

	public static void main(String[] args) {
		try {
			Files.walk(Paths.get("data/instance/Symmetric_CVRP")).forEach(filePath -> {
				if (Files.isRegularFile(filePath)) {
					FileLiner liner = new FileLiner(filePath.toString());
					DanieleValueFetcher<SymmetricCVRPKeyword> fetcher = new DanieleValueFetcher<SymmetricCVRPKeyword>(liner);
					System.out.println("-----------------------------------------------------");
					for(SymmetricCVRPKeyword kw : SymmetricCVRPKeyword.values()){
						System.out.println(fetcher.getValue(kw));
					}
					GlobalConverter<DanieleValueFetcher<SymmetricCVRPKeyword>, SymmetricCVRPKeyword> converter = new GlobalConverter<DanieleValueFetcher<SymmetricCVRPKeyword>, SymmetricCVRPKeyword>(fetcher, SymmetricCVRPKeyword.values());
					System.out.println(converter);
					//Strategy strategy = new DanieleSymmetricCVRPStrategy(fetcher);
					//InstanceTranslator translator = new InstanceTranslator(strategy);
					//Instance result = translator.getInstance();
					//File file = new File("data/example/output/Symmetric_CVRP/"+ result.getInfo().getName() +".xml");
					//JAXB.marshal(result, file);
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
