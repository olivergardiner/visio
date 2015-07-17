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


/**
 * <p>Java class for DataConnection_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataConnection_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ConnectionString" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Command" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FriendlyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Timeout" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="AlwaysUseConnectionFile" type="{http://schemas.microsoft.com/office/visio/2010/extension}ISOBoolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataConnection_Type")
public class DataConnectionType {

    @XmlAttribute(name = "ID")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger id;
    @XmlAttribute(name = "FileName")
    protected String fileName;
    @XmlAttribute(name = "ConnectionString")
    protected String connectionString;
    @XmlAttribute(name = "Command")
    protected String command;
    @XmlAttribute(name = "FriendlyName")
    protected String friendlyName;
    @XmlAttribute(name = "Timeout")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger timeout;
    @XmlAttribute(name = "AlwaysUseConnectionFile")
    protected BigInteger alwaysUseConnectionFile;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setID(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the connectionString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionString() {
        return connectionString;
    }

    /**
     * Sets the value of the connectionString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionString(String value) {
        this.connectionString = value;
    }

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

    /**
     * Gets the value of the friendlyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFriendlyName() {
        return friendlyName;
    }

    /**
     * Sets the value of the friendlyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFriendlyName(String value) {
        this.friendlyName = value;
    }

    /**
     * Gets the value of the timeout property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeout(BigInteger value) {
        this.timeout = value;
    }

    /**
     * Gets the value of the alwaysUseConnectionFile property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAlwaysUseConnectionFile() {
        return alwaysUseConnectionFile;
    }

    /**
     * Sets the value of the alwaysUseConnectionFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAlwaysUseConnectionFile(BigInteger value) {
        this.alwaysUseConnectionFile = value;
    }

}
