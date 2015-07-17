package uk.org.whitecottage.visio;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import uk.org.whitecottage.visio.jaxb.visio2003.TextType;

public class Text extends VisioElement {
	protected TextType _text;
	
	protected String simpleText;
	
	public Text() {
		_text = new TextType();
	}
	
	public Text(String text) {
		this();
		_text.getContent().add(text);
	}
	
	public Text(TextType text) {
		_text = text;
	}
	
	public JAXBElement<TextType> getText() {
		return new JAXBElement<TextType>(new QName("http://schemas.microsoft.com/visio/2003/core", "Text"), TextType.class, _text);
	}

	public String getSimpleText() {
		return simpleText;
	}

	public void setSimpleText(String text) {
		this.simpleText = text;

		_text.getContent().clear();
		_text.getContent().add(text);
	}
}
