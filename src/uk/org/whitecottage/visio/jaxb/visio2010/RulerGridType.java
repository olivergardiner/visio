//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.30 at 04:03:08 PM BST 
//


package uk.org.whitecottage.visio.jaxb.visio2010;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RulerGrid_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RulerGrid_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/office/visio/2010/extension}Row_Type">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="XRulerDensity" type="{http://schemas.microsoft.com/office/visio/2010/extension}XRulerDensity_Type" minOccurs="0"/>
 *         &lt;element name="YRulerDensity" type="{http://schemas.microsoft.com/office/visio/2010/extension}YRulerDensity_Type" minOccurs="0"/>
 *         &lt;element name="XRulerOrigin" type="{http://schemas.microsoft.com/office/visio/2010/extension}XRulerOrigin_Type" minOccurs="0"/>
 *         &lt;element name="YRulerOrigin" type="{http://schemas.microsoft.com/office/visio/2010/extension}YRulerOrigin_Type" minOccurs="0"/>
 *         &lt;element name="XGridDensity" type="{http://schemas.microsoft.com/office/visio/2010/extension}XGridDensity_Type" minOccurs="0"/>
 *         &lt;element name="YGridDensity" type="{http://schemas.microsoft.com/office/visio/2010/extension}YGridDensity_Type" minOccurs="0"/>
 *         &lt;element name="XGridSpacing" type="{http://schemas.microsoft.com/office/visio/2010/extension}XGridSpacing_Type" minOccurs="0"/>
 *         &lt;element name="YGridSpacing" type="{http://schemas.microsoft.com/office/visio/2010/extension}YGridSpacing_Type" minOccurs="0"/>
 *         &lt;element name="XGridOrigin" type="{http://schemas.microsoft.com/office/visio/2010/extension}XGridOrigin_Type" minOccurs="0"/>
 *         &lt;element name="YGridOrigin" type="{http://schemas.microsoft.com/office/visio/2010/extension}YGridOrigin_Type" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RulerGrid_Type", propOrder = {
    "xRulerDensityOrYRulerDensityOrXRulerOrigin"
})
public class RulerGridType
    extends RowType
{

    @XmlElements({
        @XmlElement(name = "XRulerDensity", type = XRulerDensityType.class),
        @XmlElement(name = "YRulerDensity", type = YRulerDensityType.class),
        @XmlElement(name = "XRulerOrigin", type = XRulerOriginType.class),
        @XmlElement(name = "YRulerOrigin", type = YRulerOriginType.class),
        @XmlElement(name = "XGridDensity", type = XGridDensityType.class),
        @XmlElement(name = "YGridDensity", type = YGridDensityType.class),
        @XmlElement(name = "XGridSpacing", type = XGridSpacingType.class),
        @XmlElement(name = "YGridSpacing", type = YGridSpacingType.class),
        @XmlElement(name = "XGridOrigin", type = XGridOriginType.class),
        @XmlElement(name = "YGridOrigin", type = YGridOriginType.class)
    })
    protected List<CellType> xRulerDensityOrYRulerDensityOrXRulerOrigin;

    /**
     * Gets the value of the xRulerDensityOrYRulerDensityOrXRulerOrigin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xRulerDensityOrYRulerDensityOrXRulerOrigin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXRulerDensityOrYRulerDensityOrXRulerOrigin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XRulerDensityType }
     * {@link YRulerDensityType }
     * {@link XRulerOriginType }
     * {@link YRulerOriginType }
     * {@link XGridDensityType }
     * {@link YGridDensityType }
     * {@link XGridSpacingType }
     * {@link YGridSpacingType }
     * {@link XGridOriginType }
     * {@link YGridOriginType }
     * 
     * 
     */
    public List<CellType> getXRulerDensityOrYRulerDensityOrXRulerOrigin() {
        if (xRulerDensityOrYRulerDensityOrXRulerOrigin == null) {
            xRulerDensityOrYRulerDensityOrXRulerOrigin = new ArrayList<CellType>();
        }
        return this.xRulerDensityOrYRulerDensityOrXRulerOrigin;
    }

}
