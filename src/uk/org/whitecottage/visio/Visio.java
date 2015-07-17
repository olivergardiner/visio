package uk.org.whitecottage.visio;

import java.io.File;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import uk.org.whitecottage.visio.jaxb.visio2003.CellType;
import uk.org.whitecottage.visio.jaxb.visio2003.FillType;
import uk.org.whitecottage.visio.jaxb.visio2003.GeomType;
import uk.org.whitecottage.visio.jaxb.visio2003.LineToType;
import uk.org.whitecottage.visio.jaxb.visio2003.LineType;
import uk.org.whitecottage.visio.jaxb.visio2003.MoveToType;
import uk.org.whitecottage.visio.jaxb.visio2003.PageType;
import uk.org.whitecottage.visio.jaxb.visio2003.ShapeType;
import uk.org.whitecottage.visio.jaxb.visio2003.ShapesType;
import uk.org.whitecottage.visio.jaxb.visio2003.TextBlockType;
import uk.org.whitecottage.visio.jaxb.visio2003.TextType;
import uk.org.whitecottage.visio.jaxb.visio2003.VisioDocumentType;
import uk.org.whitecottage.visio.jaxb.visio2003.XFormType;
import uk.org.whitecottage.visio.jaxb.visio2003.XType;
import uk.org.whitecottage.visio.jaxb.visio2003.YType;

public class Visio {
	protected JAXBElement<VisioDocumentType> visio;
	protected Unmarshaller visioUnmarshaller;
	protected Marshaller visioMarshaller;
	protected double scaleFactor = 25.4;
	
	protected List<Page> _pages;

	public Visio() {
		_pages = new ArrayList<Page>();
		
		try {
		    JAXBContext visioContext = JAXBContext.newInstance("uk.org.whitecottage.visio.jaxb.visio2003:uk.org.whitecottage.visio.jaxb.visio2007:uk.org.whitecottage.visio.jaxb.visio2010");
		    visioUnmarshaller = createUnmarshaller(visioContext);
		    visioMarshaller = visioContext.createMarshaller();
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}
	}
	
	public Visio(File file) {
		this();
		
		try {
		    read(file);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	protected VisioDocumentType getRoot() {
		return (VisioDocumentType) visio.getValue();
	}
	
	@SuppressWarnings("unchecked")
	public void read(File file) throws JAXBException {
		visio = (JAXBElement<VisioDocumentType>) visioUnmarshaller.unmarshal(file);
		
		VisioDocumentType visioDocument = visio.getValue();
		visioDocument.setKey(null);
		visioDocument.setStart(null);
		
		for (PageType page: visio.getValue().getPages().getPage()) {
			_pages.add(new Page(page));
		}
	}

	public void write(OutputStream output) {
		try {
		    visioMarshaller.marshal(visio, output);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public void write(File file) {
		try {
		    visioMarshaller.marshal(visio, file);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	protected double scale(double value) {
		return value / scaleFactor;
	}
	
	public CellType createCell(String type, int value) {
		return createCell(type, null, null, String.valueOf(value));
	}

	public CellType createCell(String type, String f, int value) {
		return createCell(type, f, null, String.valueOf(value));
	}
	
	public CellType createCell(String type, String f, String unit, int value) {
		return createCell(type, f, unit, String.valueOf(value));		
	}
	
	public CellType createCell(String type, double value) {
		return createCell(type, null, null, String.valueOf(value));
	}

	public CellType createCell(String type, String f, double value) {
		return createCell(type, f, null, String.valueOf(value));
	}
	
	public CellType createCell(String type, String f, String unit, double value) {
		return createCell(type, f, unit, String.valueOf(value));		
	}
	
	public CellType createCell(String type, String value) {
		return createCell(type, null, null, value);
	}

	public CellType createCell(String type, String f, String value) {
		return createCell(type, f, null, value);
	}
	
	public CellType createCell(String type, String f, String unit, String value) {
		String className = "uk.org.whitecottage.visio.jaxb.visio2003." + type + "Type";
		CellType cell = null;
		
		try {
			cell = (CellType) Class.forName(className).newInstance();
			cell.setF(f);
			cell.setUnit(unit);
			cell.setValue(value);
		} catch (Exception e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
		
		return cell;
	}
	
	public void setCell(List<CellType> cells, String type, int value) {
		setCell(cells, type, null, null, String.valueOf(value));
	}

	public void setCell(List<CellType> cells, String type, String f, int value) {
		setCell(cells, type, f, null, String.valueOf(value));
	}
	
	public void setCell(List<CellType> cells, String type, String f, String unit, int value) {
		setCell(cells, type, f, unit, String.valueOf(value));		
	}
	
	public void setCell(List<CellType> cells, String type, double value) {
		setCell(cells, type, null, null, String.valueOf(value));
	}

	public void setCell(List<CellType> cells, String type, String f, double value) {
		setCell(cells, type, f, null, String.valueOf(value));
	}
	
	public void setCell(List<CellType> cells, String type, String f, String unit, double value) {
		setCell(cells, type, f, unit, String.valueOf(value));		
	}
	
	public void setCell(List<CellType> cells, String type, String value) {
		setCell(cells, type, null, null, value);
	}

	public void setCell(List<CellType> cells, String type, String f, String value) {
		setCell(cells, type, f, null, value);
	}
	
	public void setCell(List<CellType> cells, String type, String f, String unit, String value) {
		String className = "uk.org.whitecottage.visio.jaxb.visio2003." + type + "Type";

		CellType cell = null;
		
		try {
			Class<?> clazz = Class.forName(className);
			for (CellType c: cells) {
				if (clazz.isInstance(c)) {
					cell = c;
					break;
				}
			}
			
			if (cell == null) {
				cell = (CellType) clazz.newInstance();
			}
			
			cell.setF(f);
			cell.setUnit(unit);
			cell.setValue(value);
		} catch (Exception e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
		
		return;
	}
	
	public ShapeType createBox(double x, double y, double width, double height) {
		ShapeType shape = createShape(x, y, width, height);
		
		shape.getTextOrXFormOrLine().add(createLine(2.0));
		
		GeomType geom = null;
		
		for (Object o: shape.getTextOrXFormOrLine()) {
			Object value = ((JAXBElement<?>) o).getValue();
			if (value instanceof GeomType) {
				geom = (GeomType) value;
				break;
			}
		}
		
		if (geom != null) {			
			List<Object> contents = geom.getNoFillOrNoLineOrNoShow();
			contents.add(createMoveTo(1, "Width*0", 0, "Height*0", 0));
			contents.add(createLineTo(2, "Width*1", width, "Height*0", 0));
			contents.add(createLineTo(3, "Width*1", width, "Height*1", height));
			contents.add(createLineTo(4, "Width*0", 0, "Height*1", height));
			contents.add(createLineTo(5, "Geometry1.X1", 0, "Geometry1.Y1", 0));
		}
			
		return shape;
	}
	
	public MoveToType createMoveTo(int index, String fx, double x, String fy, double y) {
		MoveToType moveTo = new MoveToType();
		
		moveTo.setIX(BigInteger.valueOf(index));
		moveTo.setX((XType) createCell("X", fx, x));
		moveTo.setY((YType) createCell("Y", fy, y));
		
		return moveTo;
	}
	
	public LineToType createLineTo(int index, String fx, double x, String fy, double y) {
		LineToType lineTo = new LineToType();
		
		lineTo.setIX(BigInteger.valueOf(index));
		lineTo.setX((XType) createCell("X", fx, x));
		lineTo.setY((YType) createCell("Y", fy, y));
		
		return lineTo;
	}
		
	public ShapeType createShape(double x, double y, double width, double height) {
		ShapeType shape = new ShapeType();

		shape.setType("Shape");				
		shape.setLineStyle(BigInteger.valueOf(3));
		shape.setFillStyle(BigInteger.valueOf(3));
		shape.setTextStyle(BigInteger.valueOf(3));
		
		List<Object> contents = shape.getTextOrXFormOrLine();
		contents.add(createXForm(x, y, width, height));
		
		JAXBElement<GeomType> geom = createGeom();
		contents.add(geom);
		
		return shape;
	}
	
	public JAXBElement<XFormType> createXForm(double x, double y, double width, double height) {		
		XFormType xform = new XFormType();
		List<CellType> contents = xform.getPinXOrPinYOrWidth();
		
		contents.add(createCell("PinX", scale(x)));
		contents.add(createCell("PinY", scale(y)));
		
		contents.add(createCell("Width", scale(width)));
		contents.add(createCell("Height", scale(height)));
		
		contents.add(createCell("LocPinX", "Width*0.5", scale(x * 0.5)));
		contents.add(createCell("LocPinY", "Height*0.5", scale(y * 0.5)));
		
		contents.add(createCell("Angle", 0.0));
		contents.add(createCell("FlipX", 0));
		contents.add(createCell("FlipY", 0));
		contents.add(createCell("ResizeMode", 0));
		
		return new JAXBElement<XFormType>(new QName("http://schemas.microsoft.com/visio/2003/core", "XForm"), XFormType.class, xform);
	}
	
	public JAXBElement<LineType> createLine(Double rounding) {		
		LineType line = new LineType();
		List<CellType> contents = line.getLineWeightOrLineColorOrLinePattern();

		contents.add(createCell("LineWeight", "Inh", 0.01));
		contents.add(createCell("LineColor", "Inh", 0));
		contents.add(createCell("LinePattern", "Inh", 1));
		if (rounding != null) {
			contents.add(createCell("Rounding", null, "MM", scale(rounding)));
		}
		contents.add(createCell("BeginArrow", "Inh", 0));
		contents.add(createCell("BeginArrowSize", "Inh", 2));
		contents.add(createCell("EndArrow", "Inh", 0));
		contents.add(createCell("EndArrowSize", "Inh", 2));
		contents.add(createCell("LineCap", "Inh", 0));
		contents.add(createCell("LineColorTrans", "Inh", 0));
		
		return new JAXBElement<LineType>(new QName("http://schemas.microsoft.com/visio/2003/core", "Line"), LineType.class, line);
	}
	
	public JAXBElement<FillType> createFill() {
		FillType fill = new FillType();
		
		return new JAXBElement<FillType>(new QName("http://schemas.microsoft.com/visio/2003/core", "Fill"), FillType.class, fill);
	}
	
	public JAXBElement<TextType> createText(String text) {
		TextType textElement = new TextType();
		
		textElement.getContent().add(text);
		
		return new JAXBElement<TextType>(new QName("http://schemas.microsoft.com/visio/2003/core", "Text"), TextType.class, textElement);
	}
	
	public JAXBElement<TextBlockType> createTextBlock(int vAlign) {
		TextBlockType textBlock = new TextBlockType();
		List<CellType> contents = textBlock.getLeftMarginOrRightMarginOrTopMargin();

		contents.add(createCell("LeftMargin", "Inh", "PT", 0.05555555555555));
		contents.add(createCell("RightMargin", "Inh", "PT", 0.05555555555555));
		contents.add(createCell("TopMargin", "Inh", "PT", 0.05555555555555));
		contents.add(createCell("BottomMargin", "Inh", "PT", 0.05555555555555));
		contents.add(createCell("VerticalAlign", "Inh", vAlign));
		contents.add(createCell("TextBkgnd", "Inh", 0));
		contents.add(createCell("DefaultTabStop", "Inh", scale(15)));
		contents.add(createCell("TextDirection", "Inh", 0));
		contents.add(createCell("TextBkgndTrans", "Inh", 0));

		return new JAXBElement<TextBlockType>(new QName("http://schemas.microsoft.com/visio/2003/core", "TextBlock"), TextBlockType.class, textBlock);
	}
	
	public JAXBElement<GeomType> createGeom() {
		GeomType geom = new GeomType();
		List<Object> contents = geom.getNoFillOrNoLineOrNoShow();
		
		contents.add(createCell("NoFill", 0));
		contents.add(createCell("NoLine", 0));
		contents.add(createCell("NoShow", 0));
		contents.add(createCell("NoSnap", 0));

		geom.setIX(BigInteger.valueOf(0));

		return new JAXBElement<GeomType>(new QName("http://schemas.microsoft.com/visio/2003/core", "Geom"), GeomType.class, geom);
	}
	
	public void setShapeID(ShapeType shape, int id) {
		shape.setID(BigInteger.valueOf(id));
	}
	
	public void setShapeText(ShapeType shape, String text) {
		shape.getTextOrXFormOrLine().add(createText(text));
	}
	
	public ShapesType getShapes(ShapeType shape) {
		for (Object o: shape.getTextOrXFormOrLine()) {
			if (o instanceof ShapesType) {
				return (ShapesType) o;
			}
		}
		
		ShapesType shapes = new ShapesType();
		shape.getTextOrXFormOrLine().add(shapes);

		return shapes;
	}
	
	public ShapesType getShapes(PageType page) {
		for (Object o: page.getPageSheetOrShapesOrConnects()) {
			if (o instanceof ShapesType) {
				return (ShapesType) o;
			}
		}
		
		ShapesType shapes = new ShapesType();
		page.getPageSheetOrShapesOrConnects().add(shapes);

		return shapes;
	}
	
	public Page getPage(int index) {
		return _pages.get(index);
	}
	
	public ShapeType addBox(List<ShapeType> shapeList, double x, double y, double width, double height) {
		ShapeType shape = createBox(x, y, width, height);

		shapeList.add(shape);
		
		setShapeID(shape, shapeList.size());
		
		return shape;
	}
	
	public ShapeType addBox(ShapeType shape, double x, double y, double width, double height) {
		return addBox(getShapes(shape).getShape(), x, y, width, height);
	}
	
	public ShapeType addBox(PageType page, double x, double y, double width, double height) {
		return addBox(getShapes(page).getShape(), x, y, width, height);
	}
	
	protected Unmarshaller createUnmarshaller(JAXBContext context) throws SAXException, JAXBException {
		Unmarshaller unmarshaller = context.createUnmarshaller();

		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

	    Source schemas[] = {
		    	new StreamSource(this.getClass().getResourceAsStream("visio.xsd")),
		    	new StreamSource(this.getClass().getResourceAsStream("visio12.xsd")),
		    	new StreamSource(this.getClass().getResourceAsStream("visio14.xsd"))
	    };
	    
	    Schema schema = schemaFactory.newSchema(schemas);

		unmarshaller.setSchema(schema);
		
		return unmarshaller;
	}	
}
