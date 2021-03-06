//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.30 at 04:02:41 PM BST 
//


package uk.org.whitecottage.visio.jaxb.visio2007;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Para_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Para_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/visio/2006/extension}IndexedRow_Type">
 *       &lt;sequence>
 *         &lt;element name="IndFirst" type="{http://schemas.microsoft.com/visio/2006/extension}IndFirst_Type" minOccurs="0"/>
 *         &lt;element name="IndLeft" type="{http://schemas.microsoft.com/visio/2006/extension}IndLeft_Type" minOccurs="0"/>
 *         &lt;element name="IndRight" type="{http://schemas.microsoft.com/visio/2006/extension}IndRight_Type" minOccurs="0"/>
 *         &lt;element name="SpLine" type="{http://schemas.microsoft.com/visio/2006/extension}SpLine_Type" minOccurs="0"/>
 *         &lt;element name="SpBefore" type="{http://schemas.microsoft.com/visio/2006/extension}SpBefore_Type" minOccurs="0"/>
 *         &lt;element name="SpAfter" type="{http://schemas.microsoft.com/visio/2006/extension}SpAfter_Type" minOccurs="0"/>
 *         &lt;element name="HorzAlign" type="{http://schemas.microsoft.com/visio/2006/extension}HorzAlign_Type" minOccurs="0"/>
 *         &lt;element name="Bullet" type="{http://schemas.microsoft.com/visio/2006/extension}Bullet_Type" minOccurs="0"/>
 *         &lt;element name="BulletStr" type="{http://schemas.microsoft.com/visio/2006/extension}BulletStr_Type" minOccurs="0"/>
 *         &lt;element name="BulletFont" type="{http://schemas.microsoft.com/visio/2006/extension}BulletFont_Type" minOccurs="0"/>
 *         &lt;element name="LocalizeBulletFont" type="{http://schemas.microsoft.com/visio/2006/extension}LocalizeBulletFont_Type" minOccurs="0"/>
 *         &lt;element name="BulletFontSize" type="{http://schemas.microsoft.com/visio/2006/extension}BulletFontSize_Type" minOccurs="0"/>
 *         &lt;element name="TextPosAfterBullet" type="{http://schemas.microsoft.com/visio/2006/extension}TextPosAfterBullet_Type" minOccurs="0"/>
 *         &lt;element name="Flags" type="{http://schemas.microsoft.com/visio/2006/extension}Flags_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Para_Type", propOrder = {
    "indFirst",
    "indLeft",
    "indRight",
    "spLine",
    "spBefore",
    "spAfter",
    "horzAlign",
    "bullet",
    "bulletStr",
    "bulletFont",
    "localizeBulletFont",
    "bulletFontSize",
    "textPosAfterBullet",
    "flags"
})
public class ParaType
    extends IndexedRowType
{

    @XmlElement(name = "IndFirst")
    protected IndFirstType indFirst;
    @XmlElement(name = "IndLeft")
    protected IndLeftType indLeft;
    @XmlElement(name = "IndRight")
    protected IndRightType indRight;
    @XmlElement(name = "SpLine")
    protected SpLineType spLine;
    @XmlElement(name = "SpBefore")
    protected SpBeforeType spBefore;
    @XmlElement(name = "SpAfter")
    protected SpAfterType spAfter;
    @XmlElement(name = "HorzAlign")
    protected HorzAlignType horzAlign;
    @XmlElement(name = "Bullet")
    protected BulletType bullet;
    @XmlElement(name = "BulletStr")
    protected BulletStrType bulletStr;
    @XmlElement(name = "BulletFont")
    protected BulletFontType bulletFont;
    @XmlElement(name = "LocalizeBulletFont")
    protected LocalizeBulletFontType localizeBulletFont;
    @XmlElement(name = "BulletFontSize")
    protected BulletFontSizeType bulletFontSize;
    @XmlElement(name = "TextPosAfterBullet")
    protected TextPosAfterBulletType textPosAfterBullet;
    @XmlElement(name = "Flags")
    protected FlagsType flags;

    /**
     * Gets the value of the indFirst property.
     * 
     * @return
     *     possible object is
     *     {@link IndFirstType }
     *     
     */
    public IndFirstType getIndFirst() {
        return indFirst;
    }

    /**
     * Sets the value of the indFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndFirstType }
     *     
     */
    public void setIndFirst(IndFirstType value) {
        this.indFirst = value;
    }

    /**
     * Gets the value of the indLeft property.
     * 
     * @return
     *     possible object is
     *     {@link IndLeftType }
     *     
     */
    public IndLeftType getIndLeft() {
        return indLeft;
    }

    /**
     * Sets the value of the indLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndLeftType }
     *     
     */
    public void setIndLeft(IndLeftType value) {
        this.indLeft = value;
    }

    /**
     * Gets the value of the indRight property.
     * 
     * @return
     *     possible object is
     *     {@link IndRightType }
     *     
     */
    public IndRightType getIndRight() {
        return indRight;
    }

    /**
     * Sets the value of the indRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndRightType }
     *     
     */
    public void setIndRight(IndRightType value) {
        this.indRight = value;
    }

    /**
     * Gets the value of the spLine property.
     * 
     * @return
     *     possible object is
     *     {@link SpLineType }
     *     
     */
    public SpLineType getSpLine() {
        return spLine;
    }

    /**
     * Sets the value of the spLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpLineType }
     *     
     */
    public void setSpLine(SpLineType value) {
        this.spLine = value;
    }

    /**
     * Gets the value of the spBefore property.
     * 
     * @return
     *     possible object is
     *     {@link SpBeforeType }
     *     
     */
    public SpBeforeType getSpBefore() {
        return spBefore;
    }

    /**
     * Sets the value of the spBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpBeforeType }
     *     
     */
    public void setSpBefore(SpBeforeType value) {
        this.spBefore = value;
    }

    /**
     * Gets the value of the spAfter property.
     * 
     * @return
     *     possible object is
     *     {@link SpAfterType }
     *     
     */
    public SpAfterType getSpAfter() {
        return spAfter;
    }

    /**
     * Sets the value of the spAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpAfterType }
     *     
     */
    public void setSpAfter(SpAfterType value) {
        this.spAfter = value;
    }

    /**
     * Gets the value of the horzAlign property.
     * 
     * @return
     *     possible object is
     *     {@link HorzAlignType }
     *     
     */
    public HorzAlignType getHorzAlign() {
        return horzAlign;
    }

    /**
     * Sets the value of the horzAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link HorzAlignType }
     *     
     */
    public void setHorzAlign(HorzAlignType value) {
        this.horzAlign = value;
    }

    /**
     * Gets the value of the bullet property.
     * 
     * @return
     *     possible object is
     *     {@link BulletType }
     *     
     */
    public BulletType getBullet() {
        return bullet;
    }

    /**
     * Sets the value of the bullet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BulletType }
     *     
     */
    public void setBullet(BulletType value) {
        this.bullet = value;
    }

    /**
     * Gets the value of the bulletStr property.
     * 
     * @return
     *     possible object is
     *     {@link BulletStrType }
     *     
     */
    public BulletStrType getBulletStr() {
        return bulletStr;
    }

    /**
     * Sets the value of the bulletStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BulletStrType }
     *     
     */
    public void setBulletStr(BulletStrType value) {
        this.bulletStr = value;
    }

    /**
     * Gets the value of the bulletFont property.
     * 
     * @return
     *     possible object is
     *     {@link BulletFontType }
     *     
     */
    public BulletFontType getBulletFont() {
        return bulletFont;
    }

    /**
     * Sets the value of the bulletFont property.
     * 
     * @param value
     *     allowed object is
     *     {@link BulletFontType }
     *     
     */
    public void setBulletFont(BulletFontType value) {
        this.bulletFont = value;
    }

    /**
     * Gets the value of the localizeBulletFont property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizeBulletFontType }
     *     
     */
    public LocalizeBulletFontType getLocalizeBulletFont() {
        return localizeBulletFont;
    }

    /**
     * Sets the value of the localizeBulletFont property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizeBulletFontType }
     *     
     */
    public void setLocalizeBulletFont(LocalizeBulletFontType value) {
        this.localizeBulletFont = value;
    }

    /**
     * Gets the value of the bulletFontSize property.
     * 
     * @return
     *     possible object is
     *     {@link BulletFontSizeType }
     *     
     */
    public BulletFontSizeType getBulletFontSize() {
        return bulletFontSize;
    }

    /**
     * Sets the value of the bulletFontSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BulletFontSizeType }
     *     
     */
    public void setBulletFontSize(BulletFontSizeType value) {
        this.bulletFontSize = value;
    }

    /**
     * Gets the value of the textPosAfterBullet property.
     * 
     * @return
     *     possible object is
     *     {@link TextPosAfterBulletType }
     *     
     */
    public TextPosAfterBulletType getTextPosAfterBullet() {
        return textPosAfterBullet;
    }

    /**
     * Sets the value of the textPosAfterBullet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextPosAfterBulletType }
     *     
     */
    public void setTextPosAfterBullet(TextPosAfterBulletType value) {
        this.textPosAfterBullet = value;
    }

    /**
     * Gets the value of the flags property.
     * 
     * @return
     *     possible object is
     *     {@link FlagsType }
     *     
     */
    public FlagsType getFlags() {
        return flags;
    }

    /**
     * Sets the value of the flags property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagsType }
     *     
     */
    public void setFlags(FlagsType value) {
        this.flags = value;
    }

}
