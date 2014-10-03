package org.vrprep.translator.util.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

public class DefaultSchemaOutputResolver extends SchemaOutputResolver {

    private Path path;

	public DefaultSchemaOutputResolver(Path path) {
		this.path = path;
	}

	public Result createOutput(String namespaceURI, String suggestedFileName) throws IOException {
		path.getParent().toFile().mkdirs();
		File file = path.toFile();
        StreamResult result = new StreamResult(file);
        result.setSystemId(file.toURI().toURL().toString());
        return result;
    }

}