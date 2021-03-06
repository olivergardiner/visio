//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.30 at 04:02:41 PM BST 
//


package uk.org.whitecottage.visio.jaxb.visio2007;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for Cell_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cell_Type">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="F" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Err" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="V" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cell_Type", propOrder = {
    "value"
})
@XmlSeeAlso({
    FlipYType.class,
    WalkPreferenceType.class,
    LetterspaceType.class,
    XRulerDensityType.class,
    BulletFontType.class,
    XConType.class,
    AlignLeftType.class,
    ImgOffsetXType.class,
    FontPositionType.class,
    ImgWidthType.class,
    ColorTransType.class,
    PageScaleType.class,
    InconsistentType.class,
    InitialsType.class,
    StrikethruType.class,
    LeftMarginType.class,
    LineColorType.class,
    NoLiveDynamicsType.class,
    ShapeShdwOffsetYType.class,
    PaperSourceType.class,
    EType.class,
    DefaultType.class,
    IndLeftType.class,
    SizeType.class,
    EndArrowType.class,
    RightMarginType.class,
    FillPatternType.class,
    LineAdjustToType.class,
    SpLineType.class,
    ShdwForegndType.class,
    ResizeModeType.class,
    EnableFillPropsType.class,
    LineJumpFactorXType.class,
    ActiveType.class,
    TheTextType.class,
    AvenueSizeXType.class,
    XGridOriginType.class,
    ShapePlaceStyleType.class,
    CommentType.class,
    OverlineType.class,
    VerifyType.class,
    LockMoveXType.class,
    HorzAlignType.class,
    NameType.class,
    ShapeKeywordsType.class,
    IsSnapTargetType.class,
    UseVerticalType.class,
    TheDataType.class,
    LocaleType.class,
    IndFirstType.class,
    ConFixedCodeType.class,
    BeginArrowType.class,
    FillBkgndType.class,
    PlowCodeType.class,
    AlignRightType.class,
    LockThemeEffectsType.class,
    FillBkgndTransType.class,
    DefaultTabStopType.class,
    ShdwOffsetXType.class,
    VisibleType.class,
    ShdwBkgndType.class,
    CheckedType.class,
    FormatType.class,
    XGridDensityType.class,
    IsTextEditTargetType.class,
    NoBreakType.class,
    XDynType.class,
    TxtLocPinYType.class,
    LineJumpFactorYType.class,
    PageShapeSplitType.class,
    LineToLineYType.class,
    ShapePermeableYType.class,
    NewWindowType.class,
    ShdwBkgndTransType.class,
    TextBkgndType.class,
    NoShowType.class,
    ShapeSplittableType.class,
    DisplayModeType.class,
    SpBeforeType.class,
    PageLineJumpDirYType.class,
    TxtLocPinXType.class,
    EndTriggerType.class,
    LockPreviewType.class,
    DocLangIDType.class,
    LockEndType.class,
    SelectModeType.class,
    SpellingType.class,
    LeaderType.class,
    ShapeFixedCodeType.class,
    FlipXType.class,
    FontDirectionType.class,
    ContrastType.class,
    IsDropSourceType.class,
    RTLTextType.class,
    UseKerningType.class,
    XRulerOriginType.class,
    TopMarginType.class,
    BulletStrType.class,
    PosType.class,
    ScaleXType.class,
    TagNameType.class,
    StatusType.class,
    EnableTextPropsType.class,
    YDynType.class,
    XType.class,
    ColorType.class,
    DiacriticColorType.class,
    ShapePermeablePlaceType.class,
    AvenueSizeYType.class,
    CaseType.class,
    UseNationalDigitType.class,
    PageColorType.class,
    ObjectKindType.class,
    PageWidthType.class,
    YGridDensityType.class,
    LabelType.class,
    AddressType.class,
    ShapeSplitType.class,
    ButtonFaceType.class,
    ShapePlowCodeType.class,
    BottomMarginType.class,
    XGridSpacingType.class,
    BlockSizeXType.class,
    HiddenType.class,
    BeginGroupType.class,
    CenterXType.class,
    DateType.class,
    LockMoveYType.class,
    FrameType.class,
    ReadOnlyType.class,
    LineWeightType.class,
    FlagsType.class,
    TxtPinXType.class,
    PlaceStyleType.class,
    EditModeType.class,
    LineToNodeYType.class,
    NoFillType.class,
    LockFromGroupFormatType.class,
    DropOnPageScaleType.class,
    BlurType.class,
    DrawingScaleTypeType.class,
    PinYType.class,
    DynamicsOffType.class,
    DontMoveChildrenType.class,
    TxtAngleType.class,
    PageLeftMarginType.class,
    PageRightMarginType.class,
    LockGroupType.class,
    BeginXType.class,
    AngleType.class,
    DynFeedbackType.class,
    ShapeShdwObliqueAngleType.class,
    BegTriggerType.class,
    PromptType.class,
    EndXType.class,
    DoubleStrikethroughType.class,
    NoCtlHandlesType.class,
    UpdateAlignBoxType.class,
    ConLineRouteExtType.class,
    LineJumpCodeType.class,
    LockAspectType.class,
    LangIDType.class,
    PageTopMarginType.class,
    XJustifyType.class,
    ShapeShdwTypeType.class,
    OnPageType.class,
    AddMarkupType.class,
    LayerMemberType.class,
    ObjTypeType.class,
    GrammarType.class,
    LockCropType.class,
    DrawingScaleType.class,
    EnableGridType.class,
    DirXType.class,
    NoAlignBoxType.class,
    SharpenType.class,
    CopyrightType.class,
    NoHyphenateType.class,
    LockSelectType.class,
    FontScaleType.class,
    SnapType.class,
    PagesXType.class,
    LockBeginType.class,
    ShdwObliqueAngleType.class,
    NonPrintingType.class,
    LineJumpStyleType.class,
    DescriptionType.class,
    ShdwTypeType.class,
    PlaceFlipType.class,
    NoLineType.class,
    SortKeyType.class,
    LockType.class,
    ShdwScaleFactorType.class,
    UIVisibilityType.class,
    CtrlAsInputType.class,
    BeginYType.class,
    FillForegndType.class,
    InhibitSnapType.class,
    UIFmtType.class,
    StyleType.class,
    DisabledType.class,
    PrintGridType.class,
    ActionType.class,
    AlignBottomType.class,
    LocalizeMergeType.class,
    MarkerIndexType.class,
    HideForApplyType.class,
    ConLineJumpDirXType.class,
    SmartTagType.class,
    BrightnessType.class,
    PrintPageOrientationType.class,
    ShdwPatternType.class,
    PreviewScopeType.class,
    PlaceDepthType.class,
    PageHeightType.class,
    WidthType.class,
    YRulerDensityType.class,
    MenuType.class,
    AlignCenterType.class,
    NoObjHandlesType.class,
    HeightType.class,
    BlockSizeYType.class,
    LockCalcWHType.class,
    InvisibleType.class,
    TextDirectionType.class,
    ShapePermeableXType.class,
    TxtWidthType.class,
    LockCustPropType.class,
    HelpTopicType.class,
    FontType.class,
    UICatType.class,
    ShapePlaceFlipType.class,
    PreviewQualityType.class,
    LineAdjustFromType.class,
    LockThemeColorsType.class,
    ScaleYType.class,
    YType.class,
    LockTextEditType.class,
    YJustifyType.class,
    PrintType.class,
    ComplexScriptFontType.class,
    EventMultiDropType.class,
    LockFormatType.class,
    TextPosAfterBulletType.class,
    BulletType.class,
    ShdwForegndTransType.class,
    PaperKindType.class,
    VerticalAlignType.class,
    ShdwOffsetYType.class,
    PageLineJumpDirXType.class,
    LocPinXType.class,
    ImgOffsetYType.class,
    BulletFontSizeType.class,
    YGridSpacingType.class,
    GammaType.class,
    PerpendicularType.class,
    CalendarType.class,
    ExtraInfoType.class,
    EventDblClickType.class,
    AlignmentType.class,
    RouteStyleType.class,
    ResizePageType.class,
    LineCapType.class,
    SubAddressType.class,
    LineToLineXType.class,
    AlignTopType.class,
    HighlightType.class,
    LockHeightType.class,
    AutoGenType.class,
    LocPinYType.class,
    ShapeShdwScaleFactorType.class,
    ConLineJumpDirYType.class,
    NameUnivType.class,
    RoundingType.class,
    AsianFontType.class,
    TypeType.class,
    GlueTypeType.class,
    TextBkgndTransType.class,
    LineToNodeXType.class,
    LocalizeBulletFontType.class,
    EndArrowSizeType.class,
    TxtPinYType.class,
    SpAfterType.class,
    LocalizeFontType.class,
    CurrentIndexType.class,
    ShapeRouteStyleType.class,
    FillForegndTransType.class,
    TransparencyType.class,
    HideTextType.class,
    ConLineJumpStyleType.class,
    DirYType.class,
    PagesYType.class,
    TxtHeightType.class,
    LineColorTransType.class,
    IsDropTargetType.class,
    AlignMiddleType.class,
    PositionType.class,
    YRulerOriginType.class,
    LockDeleteType.class,
    ImgHeightType.class,
    EndYType.class,
    IndRightType.class,
    LineRouteExtType.class,
    EnableLinePropsType.class,
    PinXType.class,
    ConLineJumpCodeType.class,
    DblUnderlineType.class,
    ComplexScriptSizeType.class,
    BeginArrowSizeType.class,
    ShapeShdwOffsetXType.class,
    LockWidthType.class,
    LockRotateType.class,
    UICodType.class,
    EventDropType.class,
    YConType.class,
    OutlineType.class,
    TextFlagsType.class,
    CenterYType.class,
    LockVtxEditType.class,
    PageBottomMarginType.class,
    LinePatternType.class,
    DenoiseType.class,
    GlueType.class,
    ViewMarkupType.class,
    EventXFModType.class,
    OutputFormatType.class,
    CanGlueType.class,
    DrawingSizeTypeType.class,
    ReviewerIDType.class,
    YGridOriginType.class,
    NoSnapType.class
})
public class CellType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Unit")
    protected String unit;
    @XmlAttribute(name = "F")
    protected String f;
    @XmlAttribute(name = "Err")
    protected String err;
    @XmlAttribute(name = "V")
    protected String v;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the f property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getF() {
        return f;
    }

    /**
     * Sets the value of the f property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setF(String value) {
        this.f = value;
    }

    /**
     * Gets the value of the err property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErr() {
        return err;
    }

    /**
     * Sets the value of the err property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErr(String value) {
        this.err = value;
    }

    /**
     * Gets the value of the v property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV() {
        return v;
    }

    /**
     * Sets the value of the v property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV(String value) {
        this.v = value;
    }

}
