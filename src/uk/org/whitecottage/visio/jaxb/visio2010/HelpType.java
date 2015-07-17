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
 * <p>Java class for Help_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Help_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/office/visio/2010/extension}Row_Type">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="HelpTopic" type="{http://schemas.microsoft.com/office/visio/2010/extension}HelpTopic_Type" minOccurs="0"/>
 *         &lt;element name="Copyright" type="{http://schemas.microsoft.com/office/visio/2010/extension}Copyright_Type" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Help_Type", propOrder = {
    "helpTopicOrCopyright"
})
public class HelpType
    extends RowType
{

    @XmlElements({
        @XmlElement(name = "HelpTopic", type = HelpTopicType.class),
        @XmlElement(name = "Copyright", type = CopyrightType.class)
    })
    protected List<CellType> helpTopicOrCopyright;

    /**
     * Gets the value of the helpTopicOrCopyright property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the helpTopicOrCopyright property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHelpTopicOrCopyright().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HelpTopicType }
     * {@link CopyrightType }
     * 
     * 
     */
    public List<CellType> getHelpTopicOrCopyright() {
        if (helpTopicOrCopyright == null) {
            helpTopicOrCopyright = new ArrayList<CellType>();
        }
        return this.helpTopicOrCopyright;
    }

}
