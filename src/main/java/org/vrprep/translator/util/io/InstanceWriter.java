package org.vrprep.translator.util.io;

import java.io.File;
import java.nio.file.Path;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;
import org.vrprep.model.instance.Instance;
import org.vrprep.translator.util.file.DefaultValidationEventHandler;

public class InstanceWriter {

	public static void writeXML(Instance instance, Path filePath) {
		filePath.getParent().toFile().mkdirs();
		
		try {
			SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI); 
	        Schema schema = sf.newSchema(new File("data/schema/vrprep-instance.xsd"));
	        
			JAXBContext jc = JAXBContext.newInstance(Instance.class);
			
			Marshaller marshaller = jc.createMarshaller();
	        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	        marshaller.setSchema(schema);
	        marshaller.setEventHandler(new DefaultValidationEventHandler());
	        marshaller.marshal(instance, filePath.toFile());
		} catch (JAXBException | SAXException e) {
			e.printStackTrace();
		}
	}

}
