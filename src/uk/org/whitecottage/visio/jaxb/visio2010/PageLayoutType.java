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
 * <p>Java class for PageLayout_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PageLayout_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/office/visio/2010/extension}Row_Type">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="ResizePage" type="{http://schemas.microsoft.com/office/visio/2010/extension}ResizePage_Type" minOccurs="0"/>
 *         &lt;element name="EnableGrid" type="{http://schemas.microsoft.com/office/visio/2010/extension}EnableGrid_Type" minOccurs="0"/>
 *         &lt;element name="DynamicsOff" type="{http://schemas.microsoft.com/office/visio/2010/extension}DynamicsOff_Type" minOccurs="0"/>
 *         &lt;element name="CtrlAsInput" type="{http://schemas.microsoft.com/office/visio/2010/extension}CtrlAsInput_Type" minOccurs="0"/>
 *         &lt;element name="AvoidPageBreaks" type="{http://schemas.microsoft.com/office/visio/2010/extension}AvoidPageBreaks_Type" minOccurs="0"/>
 *         &lt;element name="PlaceStyle" type="{http://schemas.microsoft.com/office/visio/2010/extension}PlaceStyle_Type" minOccurs="0"/>
 *         &lt;element name="RouteStyle" type="{http://schemas.microsoft.com/office/visio/2010/extension}RouteStyle_Type" minOccurs="0"/>
 *         &lt;element name="PlaceDepth" type="{http://schemas.microsoft.com/office/visio/2010/extension}PlaceDepth_Type" minOccurs="0"/>
 *         &lt;element name="PlowCode" type="{http://schemas.microsoft.com/office/visio/2010/extension}PlowCode_Type" minOccurs="0"/>
 *         &lt;element name="LineJumpCode" type="{http://schemas.microsoft.com/office/visio/2010/extension}LineJumpCode_Type" minOccurs="0"/>
 *         &lt;element name="LineJumpStyle" type="{http://schemas.microsoft.com/office/visio/2010/extension}LineJumpStyle_Type" minOccurs="0"/>
 *         &lt;element name="PageLineJumpDirX" type="{http://schemas.microsoft.com/office/visio/2010/extension}PageLineJumpDirX_Type" minOccurs="0"/>
 *         &lt;element name="PageLineJumpDirY" type="{http://schemas.microsoft.com/office/visio/2010/extension}PageLineJumpDirY_Type" minOccurs="0"/>
 *         &lt;element name="LineToNodeX" type="{http://schemas.microsoft.com/office/visio/2010/extension}LineToNodeX_Type" minOccurs="0"/>
 *         &lt;element name="LineToNodeY" type="{http://schemas.microsoft.com/office/visio/2010/extension}LineToNodeY_Type" minOccurs="0"/>
 *         &lt;element name="BlockSizeX" type="{http://schemas.microsoft.com/office/visio/2010/extension}BlockSizeX_Type" minOccurs="0"/>
 *         &lt;element name="BlockSizeY" type="{http://schemas.microsoft.com/office/visio/2010/extension}BlockSizeY_Type" minOccurs="0"/>
 *         &lt;element name="AvenueSizeX" type="{http://schemas.microsoft.com/office/visio/2010/extension}AvenueSizeX_Type" minOccurs="0"/>
 *         &lt;element name="AvenueSizeY" type="{http://schemas.microsoft.com/office/visio/2010/extension}AvenueSizeY_Type" minOccurs="0"/>
 *         &lt;element name="LineToLineX" type="{http://schemas.microsoft.com/office/visio/2010/extension}LineToLineX_Type" minOccurs="0"/>
 *         &lt;element name="LineToLineY" type="{http://schemas.microsoft.com/office/visio/2010/extension}LineToLineY_Type" minOccurs="0"/>
 *         &lt;element name="LineJumpFactorX" type="{http://schemas.microsoft.com/office/visio/2010/extension}LineJumpFactorX_Type" minOccurs="0"/>
 *         &lt;element name="LineJumpFactorY" type="{http://schemas.microsoft.com/office/visio/2010/extension}LineJumpFactorY_Type" minOccurs="0"/>
 *         &lt;element name="LineAdjustFrom" type="{http://schemas.microsoft.com/office/visio/2010/extension}LineAdjustFrom_Type" minOccurs="0"/>
 *         &lt;element name="LineAdjustTo" type="{http://schemas.microsoft.com/office/visio/2010/extension}LineAdjustTo_Type" minOccurs="0"/>
 *         &lt;element name="PlaceFlip" type="{http://schemas.microsoft.com/office/visio/2010/extension}PlaceFlip_Type" minOccurs="0"/>
 *         &lt;element name="LineRouteExt" type="{http://schemas.microsoft.com/office/visio/2010/extension}LineRouteExt_Type" minOccurs="0"/>
 *         &lt;element name="PageShapeSplit" type="{http://schemas.microsoft.com/office/visio/2010/extension}PageShapeSplit_Type" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PageLayout_Type", propOrder = {
    "resizePageOrEnableGridOrDynamicsOff"
})
public class PageLayoutType
    extends RowType
{

    @XmlElements({
        @XmlElement(name = "ResizePage", type = ResizePageType.class),
        @XmlElement(name = "EnableGrid", type = EnableGridType.class),
        @XmlElement(name = "DynamicsOff", type = DynamicsOffType.class),
        @XmlElement(name = "CtrlAsInput", type = CtrlAsInputType.class),
        @XmlElement(name = "AvoidPageBreaks", type = AvoidPageBreaksType.class),
        @XmlElement(name = "PlaceStyle", type = PlaceStyleType.class),
        @XmlElement(name = "RouteStyle", type = RouteStyleType.class),
        @XmlElement(name = "PlaceDepth", type = PlaceDepthType.class),
        @XmlElement(name = "PlowCode", type = PlowCodeType.class),
        @XmlElement(name = "LineJumpCode", type = LineJumpCodeType.class),
        @XmlElement(name = "LineJumpStyle", type = LineJumpStyleType.class),
        @XmlElement(name = "PageLineJumpDirX", type = PageLineJumpDirXType.class),
        @XmlElement(name = "PageLineJumpDirY", type = PageLineJumpDirYType.class),
        @XmlElement(name = "LineToNodeX", type = LineToNodeXType.class),
        @XmlElement(name = "LineToNodeY", type = LineToNodeYType.class),
        @XmlElement(name = "BlockSizeX", type = BlockSizeXType.class),
        @XmlElement(name = "BlockSizeY", type = BlockSizeYType.class),
        @XmlElement(name = "AvenueSizeX", type = AvenueSizeXType.class),
        @XmlElement(name = "AvenueSizeY", type = AvenueSizeYType.class),
        @XmlElement(name = "LineToLineX", type = LineToLineXType.class),
        @XmlElement(name = "LineToLineY", type = LineToLineYType.class),
        @XmlElement(name = "LineJumpFactorX", type = LineJumpFactorXType.class),
        @XmlElement(name = "LineJumpFactorY", type = LineJumpFactorYType.class),
        @XmlElement(name = "LineAdjustFrom", type = LineAdjustFromType.class),
        @XmlElement(name = "LineAdjustTo", type = LineAdjustToType.class),
        @XmlElement(name = "PlaceFlip", type = PlaceFlipType.class),
        @XmlElement(name = "LineRouteExt", type = LineRouteExtType.class),
        @XmlElement(name = "PageShapeSplit", type = PageShapeSplitType.class)
    })
    protected List<CellType> resizePageOrEnableGridOrDynamicsOff;

    /**
     * Gets the value of the resizePageOrEnableGridOrDynamicsOff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resizePageOrEnableGridOrDynamicsOff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResizePageOrEnableGridOrDynamicsOff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResizePageType }
     * {@link EnableGridType }
     * {@link DynamicsOffType }
     * {@link CtrlAsInputType }
     * {@link AvoidPageBreaksType }
     * {@link PlaceStyleType }
     * {@link RouteStyleType }
     * {@link PlaceDepthType }
     * {@link PlowCodeType }
     * {@link LineJumpCodeType }
     * {@link LineJumpStyleType }
     * {@link PageLineJumpDirXType }
     * {@link PageLineJumpDirYType }
     * {@link LineToNodeXType }
     * {@link LineToNodeYType }
     * {@link BlockSizeXType }
     * {@link BlockSizeYType }
     * {@link AvenueSizeXType }
     * {@link AvenueSizeYType }
     * {@link LineToLineXType }
     * {@link LineToLineYType }
     * {@link LineJumpFactorXType }
     * {@link LineJumpFactorYType }
     * {@link LineAdjustFromType }
     * {@link LineAdjustToType }
     * {@link PlaceFlipType }
     * {@link LineRouteExtType }
     * {@link PageShapeSplitType }
     * 
     * 
     */
    public List<CellType> getResizePageOrEnableGridOrDynamicsOff() {
        if (resizePageOrEnableGridOrDynamicsOff == null) {
            resizePageOrEnableGridOrDynamicsOff = new ArrayList<CellType>();
        }
        return this.resizePageOrEnableGridOrDynamicsOff;
    }

}
