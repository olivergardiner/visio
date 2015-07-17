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
 * <p>Java class for PrintProps_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrintProps_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/visio/2003/core}Row_Type">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="PageLeftMargin" type="{http://schemas.microsoft.com/visio/2003/core}PageLeftMargin_Type" minOccurs="0"/>
 *         &lt;element name="PageRightMargin" type="{http://schemas.microsoft.com/visio/2003/core}PageRightMargin_Type" minOccurs="0"/>
 *         &lt;element name="PageTopMargin" type="{http://schemas.microsoft.com/visio/2003/core}PageTopMargin_Type" minOccurs="0"/>
 *         &lt;element name="PageBottomMargin" type="{http://schemas.microsoft.com/visio/2003/core}PageBottomMargin_Type" minOccurs="0"/>
 *         &lt;element name="ScaleX" type="{http://schemas.microsoft.com/visio/2003/core}ScaleX_Type" minOccurs="0"/>
 *         &lt;element name="ScaleY" type="{http://schemas.microsoft.com/visio/2003/core}ScaleY_Type" minOccurs="0"/>
 *         &lt;element name="PagesX" type="{http://schemas.microsoft.com/visio/2003/core}PagesX_Type" minOccurs="0"/>
 *         &lt;element name="PagesY" type="{http://schemas.microsoft.com/visio/2003/core}PagesY_Type" minOccurs="0"/>
 *         &lt;element name="CenterX" type="{http://schemas.microsoft.com/visio/2003/core}CenterX_Type" minOccurs="0"/>
 *         &lt;element name="CenterY" type="{http://schemas.microsoft.com/visio/2003/core}CenterY_Type" minOccurs="0"/>
 *         &lt;element name="OnPage" type="{http://schemas.microsoft.com/visio/2003/core}OnPage_Type" minOccurs="0"/>
 *         &lt;element name="PrintGrid" type="{http://schemas.microsoft.com/visio/2003/core}PrintGrid_Type" minOccurs="0"/>
 *         &lt;element name="PrintPageOrientation" type="{http://schemas.microsoft.com/visio/2003/core}PrintPageOrientation_Type" minOccurs="0"/>
 *         &lt;element name="PaperKind" type="{http://schemas.microsoft.com/visio/2003/core}PaperKind_Type" minOccurs="0"/>
 *         &lt;element name="PaperSource" type="{http://schemas.microsoft.com/visio/2003/core}PaperSource_Type" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrintProps_Type", propOrder = {
    "pageLeftMarginOrPageRightMarginOrPageTopMargin"
})
public class PrintPropsType
    extends RowType
{

    @XmlElements({
        @XmlElement(name = "PageLeftMargin", type = PageLeftMarginType.class),
        @XmlElement(name = "PageRightMargin", type = PageRightMarginType.class),
        @XmlElement(name = "PageTopMargin", type = PageTopMarginType.class),
        @XmlElement(name = "PageBottomMargin", type = PageBottomMarginType.class),
        @XmlElement(name = "ScaleX", type = ScaleXType.class),
        @XmlElement(name = "ScaleY", type = ScaleYType.class),
        @XmlElement(name = "PagesX", type = PagesXType.class),
        @XmlElement(name = "PagesY", type = PagesYType.class),
        @XmlElement(name = "CenterX", type = CenterXType.class),
        @XmlElement(name = "CenterY", type = CenterYType.class),
        @XmlElement(name = "OnPage", type = OnPageType.class),
        @XmlElement(name = "PrintGrid", type = PrintGridType.class),
        @XmlElement(name = "PrintPageOrientation", type = PrintPageOrientationType.class),
        @XmlElement(name = "PaperKind", type = PaperKindType.class),
        @XmlElement(name = "PaperSource", type = PaperSourceType.class)
    })
    protected List<CellType> pageLeftMarginOrPageRightMarginOrPageTopMargin;

    /**
     * Gets the value of the pageLeftMarginOrPageRightMarginOrPageTopMargin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pageLeftMarginOrPageRightMarginOrPageTopMargin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPageLeftMarginOrPageRightMarginOrPageTopMargin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PageLeftMarginType }
     * {@link PageRightMarginType }
     * {@link PageTopMarginType }
     * {@link PageBottomMarginType }
     * {@link ScaleXType }
     * {@link ScaleYType }
     * {@link PagesXType }
     * {@link PagesYType }
     * {@link CenterXType }
     * {@link CenterYType }
     * {@link OnPageType }
     * {@link PrintGridType }
     * {@link PrintPageOrientationType }
     * {@link PaperKindType }
     * {@link PaperSourceType }
     * 
     * 
     */
    public List<CellType> getPageLeftMarginOrPageRightMarginOrPageTopMargin() {
        if (pageLeftMarginOrPageRightMarginOrPageTopMargin == null) {
            pageLeftMarginOrPageRightMarginOrPageTopMargin = new ArrayList<CellType>();
        }
        return this.pageLeftMarginOrPageRightMarginOrPageTopMargin;
    }

}