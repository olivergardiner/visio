package uk.org.whitecottage.visio;

import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import uk.org.whitecottage.visio.jaxb.visio2003.PageType;
import uk.org.whitecottage.visio.jaxb.visio2003.VisioDocumentType;

public class Visio {
	protected JAXBElement<VisioDocumentType> visio;
	protected Unmarshaller visioUnmarshaller;
	protected Marshaller visioMarshaller;
	
	protected List<Page> _pages;

	public Visio() {
		_pages = new ArrayList<Page>();
		
		try {
		    JAXBContext visioContext = JAXBContext.newInstance("uk.org.whitecottage.visio.jaxb.visio2003:uk.org.whitecottage.visio.jaxb.visio2007:uk.org.whitecottage.visio.jaxb.visio2010");
		    visioUnmarshaller = createUnmarshaller(visioContext);
		    visioMarshaller = visioContext.createMarshaller();
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}
	}
	
	public Visio(File file) {
		this();
		
		try {
		    read(file);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public void read(File file) throws JAXBException {
		visio = (JAXBElement<VisioDocumentType>) visioUnmarshaller.unmarshal(file);
		
		VisioDocumentType visioDocument = visio.getValue();
		visioDocument.setKey(null);
		visioDocument.setStart(null);
		
		for (PageType page: visio.getValue().getPages().getPage()) {
			_pages.add(new Page(page));
		}
	}

	public void write(OutputStream output) {
		try {
		    visioMarshaller.marshal(visio, output);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public void write(File file) {
		try {
		    visioMarshaller.marshal(visio, file);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public Page getPage(int index) {
		return _pages.get(index);
	}
	
	protected Unmarshaller createUnmarshaller(JAXBContext context) throws SAXException, JAXBException {
		Unmarshaller unmarshaller = context.createUnmarshaller();

		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

	    Source schemas[] = {
		    	new StreamSource(this.getClass().getResourceAsStream("visio.xsd")),
		    	new StreamSource(this.getClass().getResourceAsStream("visio12.xsd")),
		    	new StreamSource(this.getClass().getResourceAsStream("visio14.xsd"))
	    };
	    
	    Schema schema = schemaFactory.newSchema(schemas);

		unmarshaller.setSchema(schema);
		
		return unmarshaller;
	}	
}
