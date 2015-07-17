//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.30 at 04:02:41 PM BST 
//


package uk.org.whitecottage.visio.jaxb.visio2007;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TextCell_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextCell_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="cp" type="{http://schemas.microsoft.com/visio/2006/extension}cp_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pp" type="{http://schemas.microsoft.com/visio/2006/extension}pp_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tp" type="{http://schemas.microsoft.com/visio/2006/extension}tp_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fld" type="{http://schemas.microsoft.com/visio/2006/extension}fld_Type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextCell_Type", propOrder = {
    "content"
})
@XmlSeeAlso({
    TextType.class
})
public class TextCellType {

    @XmlElementRefs({
        @XmlElementRef(name = "pp", namespace = "http://schemas.microsoft.com/visio/2006/extension", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cp", namespace = "http://schemas.microsoft.com/visio/2006/extension", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tp", namespace = "http://schemas.microsoft.com/visio/2006/extension", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fld", namespace = "http://schemas.microsoft.com/visio/2006/extension", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CpType }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link PpType }{@code >}
     * {@link JAXBElement }{@code <}{@link TpType }{@code >}
     * {@link JAXBElement }{@code <}{@link FldType }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

}
