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
 * <p>Java class for DocumentProperties_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentProperties_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="Title" type="{http://schemas.microsoft.com/visio/2003/core}Title_Type" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://schemas.microsoft.com/visio/2003/core}Subject_Type" minOccurs="0"/>
 *         &lt;element name="Creator" type="{http://schemas.microsoft.com/visio/2003/core}Creator_Type" minOccurs="0"/>
 *         &lt;element name="Manager" type="{http://schemas.microsoft.com/visio/2003/core}Manager_Type" minOccurs="0"/>
 *         &lt;element name="Company" type="{http://schemas.microsoft.com/visio/2003/core}Company_Type" minOccurs="0"/>
 *         &lt;element name="Category" type="{http://schemas.microsoft.com/visio/2003/core}Category_Type" minOccurs="0"/>
 *         &lt;element name="Keywords" type="{http://schemas.microsoft.com/visio/2003/core}Keywords_Type" minOccurs="0"/>
 *         &lt;element name="Desc" type="{http://schemas.microsoft.com/visio/2003/core}Desc_Type" minOccurs="0"/>
 *         &lt;element name="HyperlinkBase" type="{http://schemas.microsoft.com/visio/2003/core}HyperlinkBase_Type" minOccurs="0"/>
 *         &lt;element name="AlternateNames" type="{http://schemas.microsoft.com/visio/2003/core}AlternateNames_Type" minOccurs="0"/>
 *         &lt;element name="Template" type="{http://schemas.microsoft.com/visio/2003/core}Template_Type" minOccurs="0"/>
 *         &lt;element name="BuildNumberCreated" type="{http://schemas.microsoft.com/visio/2003/core}BuildNumberCreated_Type" minOccurs="0"/>
 *         &lt;element name="BuildNumberEdited" type="{http://schemas.microsoft.com/visio/2003/core}BuildNumberEdited_Type" minOccurs="0"/>
 *         &lt;element name="PreviewPicture" type="{http://schemas.microsoft.com/visio/2003/core}PreviewPicture_Type" minOccurs="0"/>
 *         &lt;element name="CustomProps" type="{http://schemas.microsoft.com/visio/2003/core}CustomProps_Type" minOccurs="0"/>
 *         &lt;element name="TimeCreated" type="{http://schemas.microsoft.com/visio/2003/core}TimeCreated_Type" minOccurs="0"/>
 *         &lt;element name="TimeSaved" type="{http://schemas.microsoft.com/visio/2003/core}TimeSaved_Type" minOccurs="0"/>
 *         &lt;element name="TimeEdited" type="{http://schemas.microsoft.com/visio/2003/core}TimeEdited_Type" minOccurs="0"/>
 *         &lt;element name="TimePrinted" type="{http://schemas.microsoft.com/visio/2003/core}TimePrinted_Type" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentProperties_Type", propOrder = {
    "titleOrSubjectOrCreator"
})
public class DocumentPropertiesType {

    @XmlElements({
        @XmlElement(name = "Title", type = TitleType.class),
        @XmlElement(name = "Subject", type = SubjectType.class),
        @XmlElement(name = "Creator", type = CreatorType.class),
        @XmlElement(name = "Manager", type = ManagerType.class),
        @XmlElement(name = "Company", type = CompanyType.class),
        @XmlElement(name = "Category", type = CategoryType.class),
        @XmlElement(name = "Keywords", type = KeywordsType.class),
        @XmlElement(name = "Desc", type = DescType.class),
        @XmlElement(name = "HyperlinkBase", type = HyperlinkBaseType.class),
        @XmlElement(name = "AlternateNames", type = AlternateNamesType.class),
        @XmlElement(name = "Template", type = TemplateType.class),
        @XmlElement(name = "BuildNumberCreated", type = BuildNumberCreatedType.class),
        @XmlElement(name = "BuildNumberEdited", type = BuildNumberEditedType.class),
        @XmlElement(name = "PreviewPicture", type = PreviewPictureType.class),
        @XmlElement(name = "CustomProps", type = CustomPropsType.class),
        @XmlElement(name = "TimeCreated", type = TimeCreatedType.class),
        @XmlElement(name = "TimeSaved", type = TimeSavedType.class),
        @XmlElement(name = "TimeEdited", type = TimeEditedType.class),
        @XmlElement(name = "TimePrinted", type = TimePrintedType.class)
    })
    protected List<Object> titleOrSubjectOrCreator;

    /**
     * Gets the value of the titleOrSubjectOrCreator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titleOrSubjectOrCreator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitleOrSubjectOrCreator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TitleType }
     * {@link SubjectType }
     * {@link CreatorType }
     * {@link ManagerType }
     * {@link CompanyType }
     * {@link CategoryType }
     * {@link KeywordsType }
     * {@link DescType }
     * {@link HyperlinkBaseType }
     * {@link AlternateNamesType }
     * {@link TemplateType }
     * {@link BuildNumberCreatedType }
     * {@link BuildNumberEditedType }
     * {@link PreviewPictureType }
     * {@link CustomPropsType }
     * {@link TimeCreatedType }
     * {@link TimeSavedType }
     * {@link TimeEditedType }
     * {@link TimePrintedType }
     * 
     * 
     */
    public List<Object> getTitleOrSubjectOrCreator() {
        if (titleOrSubjectOrCreator == null) {
            titleOrSubjectOrCreator = new ArrayList<Object>();
        }
        return this.titleOrSubjectOrCreator;
    }

}
