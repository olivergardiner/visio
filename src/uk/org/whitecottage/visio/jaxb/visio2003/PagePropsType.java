//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.30 at 04:02:16 PM BST 
//


package uk.org.whitecottage.visio.jaxb.visio2003;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PageProps_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PageProps_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/visio/2003/core}Row_Type">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="PageWidth" type="{http://schemas.microsoft.com/visio/2003/core}PageWidth_Type" minOccurs="0"/>
 *         &lt;element name="PageHeight" type="{http://schemas.microsoft.com/visio/2003/core}PageHeight_Type" minOccurs="0"/>
 *         &lt;element name="ShdwOffsetX" type="{http://schemas.microsoft.com/visio/2003/core}ShdwOffsetX_Type" minOccurs="0"/>
 *         &lt;element name="ShdwOffsetY" type="{http://schemas.microsoft.com/visio/2003/core}ShdwOffsetY_Type" minOccurs="0"/>
 *         &lt;element name="PageScale" type="{http://schemas.microsoft.com/visio/2003/core}PageScale_Type" minOccurs="0"/>
 *         &lt;element name="DrawingScale" type="{http://schemas.microsoft.com/visio/2003/core}DrawingScale_Type" minOccurs="0"/>
 *         &lt;element name="DrawingSizeType" type="{http://schemas.microsoft.com/visio/2003/core}DrawingSizeType_Type" minOccurs="0"/>
 *         &lt;element name="DrawingScaleType" type="{http://schemas.microsoft.com/visio/2003/core}DrawingScaleType_Type" minOccurs="0"/>
 *         &lt;element name="InhibitSnap" type="{http://schemas.microsoft.com/visio/2003/core}InhibitSnap_Type" minOccurs="0"/>
 *         &lt;element name="UIVisibility" type="{http://schemas.microsoft.com/visio/2003/core}UIVisibility_Type" minOccurs="0"/>
 *         &lt;element name="ShdwType" type="{http://schemas.microsoft.com/visio/2003/core}ShdwType_Type" minOccurs="0"/>
 *         &lt;element name="ShdwObliqueAngle" type="{http://schemas.microsoft.com/visio/2003/core}ShdwObliqueAngle_Type" minOccurs="0"/>
 *         &lt;element name="ShdwScaleFactor" type="{http://schemas.microsoft.com/visio/2003/core}ShdwScaleFactor_Type" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PageProps_Type", propOrder = {
    "pageWidthOrPageHeightOrShdwOffsetX"
})
public class PagePropsType
    extends RowType
{

    @XmlElements({
        @XmlElement(name = "PageWidth", type = PageWidthType.class),
        @XmlElement(name = "PageHeight", type = PageHeightType.class),
        @XmlElement(name = "ShdwOffsetX", type = ShdwOffsetXType.class),
        @XmlElement(name = "ShdwOffsetY", type = ShdwOffsetYType.class),
        @XmlElement(name = "PageScale", type = PageScaleType.class),
        @XmlElement(name = "DrawingScale", type = DrawingScaleType.class),
        @XmlElement(name = "DrawingSizeType", type = DrawingSizeTypeType.class),
        @XmlElement(name = "DrawingScaleType", type = DrawingScaleTypeType.class),
        @XmlElement(name = "InhibitSnap", type = InhibitSnapType.class),
        @XmlElement(name = "UIVisibility", type = UIVisibilityType.class),
        @XmlElement(name = "ShdwType", type = ShdwTypeType.class),
        @XmlElement(name = "ShdwObliqueAngle", type = ShdwObliqueAngleType.class),
        @XmlElement(name = "ShdwScaleFactor", type = ShdwScaleFactorType.class)
    })
    protected List<CellType> pageWidthOrPageHeightOrShdwOffsetX;

    /**
     * Gets the value of the pageWidthOrPageHeightOrShdwOffsetX property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pageWidthOrPageHeightOrShdwOffsetX property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPageWidthOrPageHeightOrShdwOffsetX().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PageWidthType }
     * {@link PageHeightType }
     * {@link ShdwOffsetXType }
     * {@link ShdwOffsetYType }
     * {@link PageScaleType }
     * {@link DrawingScaleType }
     * {@link DrawingSizeTypeType }
     * {@link DrawingScaleTypeType }
     * {@link InhibitSnapType }
     * {@link UIVisibilityType }
     * {@link ShdwTypeType }
     * {@link ShdwObliqueAngleType }
     * {@link ShdwScaleFactorType }
     * 
     * 
     */
    public List<CellType> getPageWidthOrPageHeightOrShdwOffsetX() {
        if (pageWidthOrPageHeightOrShdwOffsetX == null) {
            pageWidthOrPageHeightOrShdwOffsetX = new ArrayList<CellType>();
        }
        return this.pageWidthOrPageHeightOrShdwOffsetX;
    }

}
