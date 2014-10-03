package org.vrprep.translator.util.io;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;
import org.vrprep.model.instance.Instance;
import org.vrprep.translator.util.file.DefaultSchemaOutputResolver;
import org.vrprep.translator.util.file.DefaultValidationEventHandler;

public class InstanceWriter {

	public static void writeXML(Instance instance, Path filePath) {
		filePath.getParent().toFile().mkdirs();
		
		try {
			Path path = Paths.get("data/schema/generated.xsd");
			JAXBContext jc = JAXBContext.newInstance(Instance.class);
			SchemaOutputResolver sor = new DefaultSchemaOutputResolver(path);
			jc.generateSchema(sor);
			
			//InputStream stream = Instance.class.getResourceAsStream("/xsd/instance.xsd");
			//Source schemaSource = new StreamSource(stream);
			
			SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI); 
			Schema schema = sf.newSchema(path.toFile());
			//Schema schema = sf.newSchema(schemaSource);
			
			Marshaller marshaller = jc.createMarshaller();
	        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	        marshaller.setSchema(schema);
	        marshaller.setEventHandler(new DefaultValidationEventHandler());
	        marshaller.marshal(instance, filePath.toFile());
		} catch (JAXBException | SAXException | IOException e) {
			e.printStackTrace();
		}
	}

}
