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
 * <p>Java class for StyleProp_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StyleProp_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/visio/2003/core}Row_Type">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="EnableLineProps" type="{http://schemas.microsoft.com/visio/2003/core}EnableLineProps_Type" minOccurs="0"/>
 *         &lt;element name="EnableFillProps" type="{http://schemas.microsoft.com/visio/2003/core}EnableFillProps_Type" minOccurs="0"/>
 *         &lt;element name="EnableTextProps" type="{http://schemas.microsoft.com/visio/2003/core}EnableTextProps_Type" minOccurs="0"/>
 *         &lt;element name="HideForApply" type="{http://schemas.microsoft.com/visio/2003/core}HideForApply_Type" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StyleProp_Type", propOrder = {
    "enableLinePropsOrEnableFillPropsOrEnableTextProps"
})
public class StylePropType
    extends RowType
{

    @XmlElements({
        @XmlElement(name = "EnableLineProps", type = EnableLinePropsType.class),
        @XmlElement(name = "EnableFillProps", type = EnableFillPropsType.class),
        @XmlElement(name = "EnableTextProps", type = EnableTextPropsType.class),
        @XmlElement(name = "HideForApply", type = HideForApplyType.class)
    })
    protected List<CellType> enableLinePropsOrEnableFillPropsOrEnableTextProps;

    /**
     * Gets the value of the enableLinePropsOrEnableFillPropsOrEnableTextProps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enableLinePropsOrEnableFillPropsOrEnableTextProps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnableLinePropsOrEnableFillPropsOrEnableTextProps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnableLinePropsType }
     * {@link EnableFillPropsType }
     * {@link EnableTextPropsType }
     * {@link HideForApplyType }
     * 
     * 
     */
    public List<CellType> getEnableLinePropsOrEnableFillPropsOrEnableTextProps() {
        if (enableLinePropsOrEnableFillPropsOrEnableTextProps == null) {
            enableLinePropsOrEnableFillPropsOrEnableTextProps = new ArrayList<CellType>();
        }
        return this.enableLinePropsOrEnableFillPropsOrEnableTextProps;
    }

}