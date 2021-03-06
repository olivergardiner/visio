//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.30 at 04:03:08 PM BST 
//


package uk.org.whitecottage.visio.jaxb.visio2010;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RuleSet_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleSet_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RuleSetFlags" type="{http://schemas.microsoft.com/office/visio/2010/extension}RuleSetFlags_Type" minOccurs="0"/>
 *         &lt;element name="Rule" type="{http://schemas.microsoft.com/office/visio/2010/extension}Rule_Type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NameU" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Enabled" type="{http://schemas.microsoft.com/office/visio/2010/extension}ISOBoolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleSet_Type", propOrder = {
    "ruleSetFlags",
    "rule"
})
public class RuleSetType {

    @XmlElement(name = "RuleSetFlags")
    protected RuleSetFlagsType ruleSetFlags;
    @XmlElement(name = "Rule")
    protected List<RuleType> rule;
    @XmlAttribute(name = "ID")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "NameU")
    protected String nameU;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "Enabled")
    protected BigInteger enabled;

    /**
     * Gets the value of the ruleSetFlags property.
     * 
     * @return
     *     possible object is
     *     {@link RuleSetFlagsType }
     *     
     */
    public RuleSetFlagsType getRuleSetFlags() {
        return ruleSetFlags;
    }

    /**
     * Sets the value of the ruleSetFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleSetFlagsType }
     *     
     */
    public void setRuleSetFlags(RuleSetFlagsType value) {
        this.ruleSetFlags = value;
    }

    /**
     * Gets the value of the rule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuleType }
     * 
     * 
     */
    public List<RuleType> getRule() {
        if (rule == null) {
            rule = new ArrayList<RuleType>();
        }
        return this.rule;
    }

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nameU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameU() {
        return nameU;
    }

    /**
     * Sets the value of the nameU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameU(String value) {
        this.nameU = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEnabled(BigInteger value) {
        this.enabled = value;
    }

}
