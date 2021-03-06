//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.30 at 04:02:16 PM BST 
//


package uk.org.whitecottage.visio.jaxb.visio2003;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Java class for VisioDocument_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VisioDocument_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentProperties" type="{http://schemas.microsoft.com/visio/2003/core}DocumentProperties_Type" minOccurs="0"/>
 *         &lt;element name="DocumentSettings" type="{http://schemas.microsoft.com/visio/2003/core}DocumentSettings_Type" minOccurs="0"/>
 *         &lt;element name="Colors" type="{http://schemas.microsoft.com/visio/2003/core}Colors_Type" minOccurs="0"/>
 *         &lt;element name="PrintSetup" type="{http://schemas.microsoft.com/visio/2003/core}PrintSetup_Type" minOccurs="0"/>
 *         &lt;element name="Fonts" type="{http://schemas.microsoft.com/visio/2003/core}Fonts_Type" minOccurs="0"/>
 *         &lt;element name="FaceNames" type="{http://schemas.microsoft.com/visio/2003/core}FaceNames_Type" minOccurs="0"/>
 *         &lt;element name="StyleSheets" type="{http://schemas.microsoft.com/visio/2003/core}StyleSheets_Type" minOccurs="0"/>
 *         &lt;element name="DocumentSheet" type="{http://schemas.microsoft.com/visio/2003/core}DocumentSheet_Type" minOccurs="0"/>
 *         &lt;element name="Masters" type="{http://schemas.microsoft.com/visio/2003/core}Masters_Type" minOccurs="0"/>
 *         &lt;element name="Pages" type="{http://schemas.microsoft.com/visio/2003/core}Pages_Type" minOccurs="0"/>
 *         &lt;element name="Windows" type="{http://schemas.microsoft.com/visio/2003/core}Windows_Type" minOccurs="0"/>
 *         &lt;element name="EventList" type="{http://schemas.microsoft.com/visio/2003/core}EventList_Type" minOccurs="0"/>
 *         &lt;element name="HeaderFooter" type="{http://schemas.microsoft.com/visio/2003/core}HeaderFooter_Type" minOccurs="0"/>
 *         &lt;element name="VBProjectData" type="{http://schemas.microsoft.com/visio/2003/core}VBProjectData_Type" minOccurs="0"/>
 *         &lt;element name="EmailRoutingData" type="{http://schemas.microsoft.com/visio/2003/core}EmailRoutingData_Type" minOccurs="0"/>
 *         &lt;element name="SolutionXML" type="{http://schemas.microsoft.com/visio/2003/core}SolutionXML_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;any processContents='lax' namespace='##other'/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="start" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="metric" type="{http://schemas.microsoft.com/visio/2003/core}ISOBoolean" />
 *       &lt;attribute name="buildnum" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DocLangID" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisioDocument_Type", propOrder = {
    "documentProperties",
    "documentSettings",
    "colors",
    "printSetup",
    "fonts",
    "faceNames",
    "styleSheets",
    "documentSheet",
    "masters",
    "pages",
    "windows",
    "eventList",
    "headerFooter",
    "vbProjectData",
    "emailRoutingData",
    "solutionXML",
    "any"
})
public class VisioDocumentType {

    @XmlElement(name = "DocumentProperties")
    protected DocumentPropertiesType documentProperties;
    @XmlElement(name = "DocumentSettings")
    protected DocumentSettingsType documentSettings;
    @XmlElement(name = "Colors")
    protected ColorsType colors;
    @XmlElement(name = "PrintSetup")
    protected PrintSetupType printSetup;
    @XmlElement(name = "Fonts")
    protected FontsType fonts;
    @XmlElement(name = "FaceNames")
    protected FaceNamesType faceNames;
    @XmlElement(name = "StyleSheets")
    protected StyleSheetsType styleSheets;
    @XmlElement(name = "DocumentSheet")
    protected DocumentSheetType documentSheet;
    @XmlElement(name = "Masters")
    protected MastersType masters;
    @XmlElement(name = "Pages")
    protected PagesType pages;
    @XmlElement(name = "Windows")
    protected WindowsType windows;
    @XmlElement(name = "EventList")
    protected EventListType eventList;
    @XmlElement(name = "HeaderFooter")
    protected HeaderFooterType headerFooter;
    @XmlElement(name = "VBProjectData")
    protected VBProjectDataType vbProjectData;
    @XmlElement(name = "EmailRoutingData")
    protected EmailRoutingDataType emailRoutingData;
    @XmlElement(name = "SolutionXML")
    protected List<SolutionXMLType> solutionXML;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "start")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger start;
    @XmlAttribute(name = "key")
    protected String key;
    @XmlAttribute(name = "metric")
    protected BigInteger metric;
    @XmlAttribute(name = "buildnum")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger buildnum;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "DocLangID")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger docLangID;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the documentProperties property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentPropertiesType }
     *     
     */
    public DocumentPropertiesType getDocumentProperties() {
        return documentProperties;
    }

    /**
     * Sets the value of the documentProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentPropertiesType }
     *     
     */
    public void setDocumentProperties(DocumentPropertiesType value) {
        this.documentProperties = value;
    }

    /**
     * Gets the value of the documentSettings property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentSettingsType }
     *     
     */
    public DocumentSettingsType getDocumentSettings() {
        return documentSettings;
    }

    /**
     * Sets the value of the documentSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentSettingsType }
     *     
     */
    public void setDocumentSettings(DocumentSettingsType value) {
        this.documentSettings = value;
    }

    /**
     * Gets the value of the colors property.
     * 
     * @return
     *     possible object is
     *     {@link ColorsType }
     *     
     */
    public ColorsType getColors() {
        return colors;
    }

    /**
     * Sets the value of the colors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColorsType }
     *     
     */
    public void setColors(ColorsType value) {
        this.colors = value;
    }

    /**
     * Gets the value of the printSetup property.
     * 
     * @return
     *     possible object is
     *     {@link PrintSetupType }
     *     
     */
    public PrintSetupType getPrintSetup() {
        return printSetup;
    }

    /**
     * Sets the value of the printSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintSetupType }
     *     
     */
    public void setPrintSetup(PrintSetupType value) {
        this.printSetup = value;
    }

    /**
     * Gets the value of the fonts property.
     * 
     * @return
     *     possible object is
     *     {@link FontsType }
     *     
     */
    public FontsType getFonts() {
        return fonts;
    }

    /**
     * Sets the value of the fonts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontsType }
     *     
     */
    public void setFonts(FontsType value) {
        this.fonts = value;
    }

    /**
     * Gets the value of the faceNames property.
     * 
     * @return
     *     possible object is
     *     {@link FaceNamesType }
     *     
     */
    public FaceNamesType getFaceNames() {
        return faceNames;
    }

    /**
     * Sets the value of the faceNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaceNamesType }
     *     
     */
    public void setFaceNames(FaceNamesType value) {
        this.faceNames = value;
    }

    /**
     * Gets the value of the styleSheets property.
     * 
     * @return
     *     possible object is
     *     {@link StyleSheetsType }
     *     
     */
    public StyleSheetsType getStyleSheets() {
        return styleSheets;
    }

    /**
     * Sets the value of the styleSheets property.
     * 
     * @param value
     *     allowed object is
     *     {@link StyleSheetsType }
     *     
     */
    public void setStyleSheets(StyleSheetsType value) {
        this.styleSheets = value;
    }

    /**
     * Gets the value of the documentSheet property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentSheetType }
     *     
     */
    public DocumentSheetType getDocumentSheet() {
        return documentSheet;
    }

    /**
     * Sets the value of the documentSheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentSheetType }
     *     
     */
    public void setDocumentSheet(DocumentSheetType value) {
        this.documentSheet = value;
    }

    /**
     * Gets the value of the masters property.
     * 
     * @return
     *     possible object is
     *     {@link MastersType }
     *     
     */
    public MastersType getMasters() {
        return masters;
    }

    /**
     * Sets the value of the masters property.
     * 
     * @param value
     *     allowed object is
     *     {@link MastersType }
     *     
     */
    public void setMasters(MastersType value) {
        this.masters = value;
    }

    /**
     * Gets the value of the pages property.
     * 
     * @return
     *     possible object is
     *     {@link PagesType }
     *     
     */
    public PagesType getPages() {
        return pages;
    }

    /**
     * Sets the value of the pages property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagesType }
     *     
     */
    public void setPages(PagesType value) {
        this.pages = value;
    }

    /**
     * Gets the value of the windows property.
     * 
     * @return
     *     possible object is
     *     {@link WindowsType }
     *     
     */
    public WindowsType getWindows() {
        return windows;
    }

    /**
     * Sets the value of the windows property.
     * 
     * @param value
     *     allowed object is
     *     {@link WindowsType }
     *     
     */
    public void setWindows(WindowsType value) {
        this.windows = value;
    }

    /**
     * Gets the value of the eventList property.
     * 
     * @return
     *     possible object is
     *     {@link EventListType }
     *     
     */
    public EventListType getEventList() {
        return eventList;
    }

    /**
     * Sets the value of the eventList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventListType }
     *     
     */
    public void setEventList(EventListType value) {
        this.eventList = value;
    }

    /**
     * Gets the value of the headerFooter property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderFooterType }
     *     
     */
    public HeaderFooterType getHeaderFooter() {
        return headerFooter;
    }

    /**
     * Sets the value of the headerFooter property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderFooterType }
     *     
     */
    public void setHeaderFooter(HeaderFooterType value) {
        this.headerFooter = value;
    }

    /**
     * Gets the value of the vbProjectData property.
     * 
     * @return
     *     possible object is
     *     {@link VBProjectDataType }
     *     
     */
    public VBProjectDataType getVBProjectData() {
        return vbProjectData;
    }

    /**
     * Sets the value of the vbProjectData property.
     * 
     * @param value
     *     allowed object is
     *     {@link VBProjectDataType }
     *     
     */
    public void setVBProjectData(VBProjectDataType value) {
        this.vbProjectData = value;
    }

    /**
     * Gets the value of the emailRoutingData property.
     * 
     * @return
     *     possible object is
     *     {@link EmailRoutingDataType }
     *     
     */
    public EmailRoutingDataType getEmailRoutingData() {
        return emailRoutingData;
    }

    /**
     * Sets the value of the emailRoutingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailRoutingDataType }
     *     
     */
    public void setEmailRoutingData(EmailRoutingDataType value) {
        this.emailRoutingData = value;
    }

    /**
     * Gets the value of the solutionXML property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the solutionXML property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSolutionXML().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SolutionXMLType }
     * 
     * 
     */
    public List<SolutionXMLType> getSolutionXML() {
        if (solutionXML == null) {
            solutionXML = new ArrayList<SolutionXMLType>();
        }
        return this.solutionXML;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStart(BigInteger value) {
        this.start = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the metric property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMetric() {
        return metric;
    }

    /**
     * Sets the value of the metric property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMetric(BigInteger value) {
        this.metric = value;
    }

    /**
     * Gets the value of the buildnum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBuildnum() {
        return buildnum;
    }

    /**
     * Sets the value of the buildnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBuildnum(BigInteger value) {
        this.buildnum = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the docLangID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDocLangID() {
        return docLangID;
    }

    /**
     * Sets the value of the docLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDocLangID(BigInteger value) {
        this.docLangID = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
