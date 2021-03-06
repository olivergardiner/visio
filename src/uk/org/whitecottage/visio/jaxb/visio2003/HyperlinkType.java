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
 * <p>Java class for Hyperlink_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Hyperlink_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/visio/2003/core}NamedRow_Type">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="Description" type="{http://schemas.microsoft.com/visio/2003/core}Description_Type" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://schemas.microsoft.com/visio/2003/core}Address_Type" minOccurs="0"/>
 *         &lt;element name="SubAddress" type="{http://schemas.microsoft.com/visio/2003/core}SubAddress_Type" minOccurs="0"/>
 *         &lt;element name="ExtraInfo" type="{http://schemas.microsoft.com/visio/2003/core}ExtraInfo_Type" minOccurs="0"/>
 *         &lt;element name="Frame" type="{http://schemas.microsoft.com/visio/2003/core}Frame_Type" minOccurs="0"/>
 *         &lt;element name="NewWindow" type="{http://schemas.microsoft.com/visio/2003/core}NewWindow_Type" minOccurs="0"/>
 *         &lt;element name="Default" type="{http://schemas.microsoft.com/visio/2003/core}Default_Type" minOccurs="0"/>
 *         &lt;element name="Invisible" type="{http://schemas.microsoft.com/visio/2003/core}Invisible_Type" minOccurs="0"/>
 *         &lt;element name="SortKey" type="{http://schemas.microsoft.com/visio/2003/core}SortKey_Type" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hyperlink_Type", propOrder = {
    "descriptionOrAddressOrSubAddress"
})
public class HyperlinkType
    extends NamedRowType
{

    @XmlElements({
        @XmlElement(name = "Description", type = DescriptionType.class),
        @XmlElement(name = "Address", type = AddressType.class),
        @XmlElement(name = "SubAddress", type = SubAddressType.class),
        @XmlElement(name = "ExtraInfo", type = ExtraInfoType.class),
        @XmlElement(name = "Frame", type = FrameType.class),
        @XmlElement(name = "NewWindow", type = NewWindowType.class),
        @XmlElement(name = "Default", type = DefaultType.class),
        @XmlElement(name = "Invisible", type = InvisibleType.class),
        @XmlElement(name = "SortKey", type = SortKeyType.class)
    })
    protected List<CellType> descriptionOrAddressOrSubAddress;

    /**
     * Gets the value of the descriptionOrAddressOrSubAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionOrAddressOrSubAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptionOrAddressOrSubAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * {@link AddressType }
     * {@link SubAddressType }
     * {@link ExtraInfoType }
     * {@link FrameType }
     * {@link NewWindowType }
     * {@link DefaultType }
     * {@link InvisibleType }
     * {@link SortKeyType }
     * 
     * 
     */
    public List<CellType> getDescriptionOrAddressOrSubAddress() {
        if (descriptionOrAddressOrSubAddress == null) {
            descriptionOrAddressOrSubAddress = new ArrayList<CellType>();
        }
        return this.descriptionOrAddressOrSubAddress;
    }

}
