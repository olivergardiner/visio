package uk.org.whitecottage.visio;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import uk.org.whitecottage.visio.jaxb.visio2003.CellType;
import uk.org.whitecottage.visio.jaxb.visio2003.GeomType;
import uk.org.whitecottage.visio.jaxb.visio2003.LineToType;
import uk.org.whitecottage.visio.jaxb.visio2003.MoveToType;
import uk.org.whitecottage.visio.jaxb.visio2003.NoFillType;
import uk.org.whitecottage.visio.jaxb.visio2003.NoLineType;
import uk.org.whitecottage.visio.jaxb.visio2003.NoShowType;
import uk.org.whitecottage.visio.jaxb.visio2003.NoSnapType;

public class Geom extends VisioElement {
	protected GeomType _geom;
	protected int index;
	
	protected IntCell noFill;
	protected IntCell noLine;
	protected IntCell noShow;
	protected IntCell noSnap;
	protected List<GraphicElement> elements;
	
	public Geom() {
		_geom = new GeomType();
		elements = new ArrayList<GraphicElement>();
		
		createDefaults();
	}

	public Geom(GeomType geom) {
		_geom = geom;
		elements = new ArrayList<GraphicElement>();
		
		index = _geom.getIX().intValue();
		
		for (Object o: _geom.getNoFillOrNoLineOrNoShow()) {
			if (o instanceof NoFillType) {
				noFill = new IntCell("NoFill", (CellType) o);
			} else if (o instanceof NoLineType) {
				noLine = new IntCell("NoLine", (CellType) o);
			} else if (o instanceof NoShowType) {
				noShow = new IntCell("NoShow", (CellType) o);
			} else if (o instanceof NoSnapType) {
				noSnap = new IntCell("NoSnap", (CellType) o);
			} else if (o instanceof MoveToType) {
				MoveTo moveTo = new MoveTo(o);
				elements.add(moveTo);
			} else if (o instanceof LineToType) {
				LineTo lineTo = new LineTo(o);
				elements.add(lineTo);
			} else {
				GraphicElement element = new GraphicElement(o);
				elements.add(element);
			}
		}
	}
	
	protected void createDefaults() {
		List<Object> contents = _geom.getNoFillOrNoLineOrNoShow();

		noFill = new IntCell("NoFill", null, null, 0);
		contents.add(this.noFill.getCell());

		noLine = new IntCell("NoLine", null, null, 0);
		contents.add(this.noLine.getCell());

		noShow = new IntCell("NoShow", null, null, 0);
		contents.add(this.noShow.getCell());

		noSnap = new IntCell("NoSnap", null, null, 0);
		contents.add(this.noSnap.getCell());
		
		index = 0;
		_geom.setIX(BigInteger.valueOf(index));
	}
	
	public JAXBElement<GeomType> getGeom() {
		return new JAXBElement<GeomType>(new QName("http://schemas.microsoft.com/visio/2003/core", "Geom"), GeomType.class, _geom);
	}
	
	public void clear() {
		for (GraphicElement element: elements) {
			_geom.getNoFillOrNoLineOrNoShow().remove(element.getElement());
		}
		elements.clear();
	}
	
	public void add(GraphicElement element) {
		elements.add(element);
		_geom.getNoFillOrNoLineOrNoShow().add(element.getElement());
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
		_geom.setIX(BigInteger.valueOf(index));
	}
	
}
