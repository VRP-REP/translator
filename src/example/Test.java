package example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import javax.xml.bind.JAXB;

import converter.InstanceConverter;
import converter.SymmetricCVRPConverter;
import keyword.SymmetricCVRPKeyword;
import keyword.KeywordType;
import reader.FileLiner;
import reader.ValueFetcher;

public class Test {

	public static void main(String[] args) {
		try {
			Files.walk(Paths.get("data/instance/Symmetric_CVRP")).forEach(filePath -> {
				if (Files.isRegularFile(filePath)) {
					FileLiner liner = new FileLiner(filePath.toString());
					ValueFetcher<SymmetricCVRPKeyword> fetcher = new ValueFetcher<SymmetricCVRPKeyword>(liner);
					System.out.println("-----------------------------------------------------");
					for(SymmetricCVRPKeyword kw : SymmetricCVRPKeyword.values()){
						if(kw.type() == KeywordType.INLINE) {
							System.out.println(fetcher.getValue(kw));
						}
						else if(kw.type() == KeywordType.BLOCK) {
							System.out.println(Arrays.toString(fetcher.getBlock(kw)));
						}
					}
					InstanceConverter converter = new SymmetricCVRPConverter(fetcher);
					File file = new File("data/example/output/Symmetric_CVRP/"+ converter.getInstance().getInfo().getName() +".xml");
					JAXB.marshal(converter.getInstance(), file);
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
