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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndexedRow_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndexedRow_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="IX" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="Del" type="{http://schemas.microsoft.com/visio/2006/extension}ISOBoolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndexedRow_Type")
@XmlSeeAlso({
    FieldType.class,
    ScratchType.class,
    CharType.class,
    ParaType.class,
    LayerType.class,
    ReviewerType.class,
    AnnotationType.class,
    TabsType.class,
    PolylineToType.class,
    EllipseType.class,
    SplineKnotType.class,
    LineToType.class,
    SplineStartType.class,
    MoveToType.class,
    InfiniteLineType.class,
    ArcToType.class,
    NURBSToType.class,
    EllipticalArcToType.class
})
public class IndexedRowType {

    @XmlAttribute(name = "IX")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger ix;
    @XmlAttribute(name = "Del")
    protected BigInteger del;

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
