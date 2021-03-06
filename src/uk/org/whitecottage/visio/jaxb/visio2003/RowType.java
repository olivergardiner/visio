//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.30 at 04:02:16 PM BST 
//


package uk.org.whitecottage.visio.jaxb.visio2003;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Row_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Row_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Del" type="{http://schemas.microsoft.com/visio/2003/core}ISOBoolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Row_Type")
@XmlSeeAlso({
    TextBlockType.class,
    TextXFormType.class,
    LayoutType.class,
    EventType.class,
    FillType.class,
    AlignType.class,
    LineType.class,
    XFormType.class,
    RulerGridType.class,
    PageLayoutType.class,
    HelpType.class,
    GroupType.class,
    PrintPropsType.class,
    LayerMemType.class,
    ProtectionType.class,
    ForeignType.class,
    StylePropType.class,
    PagePropsType.class,
    MiscType.class,
    ImageType.class,
    XForm1DType.class,
    DocPropsType.class
})
public class RowType {

    @XmlAttribute(name = "Del")
    protected BigInteger del;

    /**
     * Gets the value of the del property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDel() {
        return del;
    }

    /**
     * Sets the value of the del property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDel(BigInteger value) {
        this.del = value;
    }

}
