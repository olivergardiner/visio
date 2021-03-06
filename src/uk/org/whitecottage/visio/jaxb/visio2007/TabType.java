//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.30 at 04:02:41 PM BST 
//


package uk.org.whitecottage.visio.jaxb.visio2007;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tab_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tab_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Position" type="{http://schemas.microsoft.com/visio/2006/extension}Position_Type" minOccurs="0"/>
 *         &lt;element name="Alignment" type="{http://schemas.microsoft.com/visio/2006/extension}Alignment_Type" minOccurs="0"/>
 *         &lt;element name="Leader" type="{http://schemas.microsoft.com/visio/2006/extension}Leader_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="IX" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tab_Type", propOrder = {
    "position",
    "alignment",
    "leader"
})
public class TabType {

    @XmlElement(name = "Position")
    protected PositionType position;
    @XmlElement(name = "Alignment")
    protected AlignmentType alignment;
    @XmlElement(name = "Leader")
    protected LeaderType leader;
    @XmlAttribute(name = "IX")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger ix;

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link PositionType }
     *     
     */
    public PositionType getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionType }
     *     
     */
    public void setPosition(PositionType value) {
        this.position = value;
    }

    /**
     * Gets the value of the alignment property.
     * 
     * @return
     *     possible object is
     *     {@link AlignmentType }
     *     
     */
    public AlignmentType getAlignment() {
        return alignment;
    }

    /**
     * Sets the value of the alignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlignmentType }
     *     
     */
    public void setAlignment(AlignmentType value) {
        this.alignment = value;
    }

    /**
     * Gets the value of the leader property.
     * 
     * @return
     *     possible object is
     *     {@link LeaderType }
     *     
     */
    public LeaderType getLeader() {
        return leader;
    }

    /**
     * Sets the value of the leader property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaderType }
     *     
     */
    public void setLeader(LeaderType value) {
        this.leader = value;
    }

    /**
     * Gets the value of the ix property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIX() {
        return ix;
    }

    /**
     * Sets the value of the ix property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIX(BigInteger value) {
        this.ix = value;
    }

}
