package example;

import io.InstanceWriter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import model.Instance;
import translator.DanieleTranslator;

public class Test {

	public static void main(String[] args) {
		DanieleTranslator translator = new DanieleTranslator();
		try {
			Files.walk(Paths.get("data/instance/Symmetric_CVRP")).forEach(inputPath -> {
				if (Files.isRegularFile(inputPath)) {
					Instance instance = translator.getInstance(inputPath);
					Path outputPath = Paths.get("data/example/output/Symmetric_CVRP/"+ instance.getInfo().getName() +".xml");
					InstanceWriter.write(instance, outputPath);
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
