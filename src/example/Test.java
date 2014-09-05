package example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.bind.JAXB;

import daniele.DanieleSymmetricCVRPKeyword;
import daniele.DanieleValueFetcher;
import daniele.SymmetricCVRPTranslator;
import reader.FileLiner;
import translator.InstanceTranslator;

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
					InstanceTranslator converter = new SymmetricCVRPTranslator(fetcher);
					File file = new File("data/example/output/Symmetric_CVRP/"+ converter.getInstance().getInfo().getName() +".xml");
					JAXB.marshal(converter.getInstance(), file);
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
