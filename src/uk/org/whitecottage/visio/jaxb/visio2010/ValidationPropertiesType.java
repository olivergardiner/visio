//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.30 at 04:03:08 PM BST 
//


package uk.org.whitecottage.visio.jaxb.visio2010;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ValidationProperties_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidationProperties_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="LastValidated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ShowIgnored" type="{http://schemas.microsoft.com/office/visio/2010/extension}ISOBoolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationProperties_Type")
public class ValidationPropertiesType {

    @XmlAttribute(name = "LastValidated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastValidated;
    @XmlAttribute(name = "ShowIgnored")
    protected BigInteger showIgnored;

    /**
     * Gets the value of the lastValidated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastValidated() {
        return lastValidated;
    }

    /**
     * Sets the value of the lastValidated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastValidated(XMLGregorianCalendar value) {
        this.lastValidated = value;
    }

    /**
     * Gets the value of the showIgnored property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getShowIgnored() {
        return showIgnored;
    }

    /**
     * Sets the value of the showIgnored property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setShowIgnored(BigInteger value) {
        this.showIgnored = value;
    }

}
