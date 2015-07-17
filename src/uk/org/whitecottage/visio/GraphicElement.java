package uk.org.whitecottage.visio;

import java.math.BigInteger;

import uk.org.whitecottage.visio.jaxb.visio2003.IndexedRowType;

public class GraphicElement {
	protected IndexedRowType _element;
	protected int index;
	
	public GraphicElement() {
	}
	
	public GraphicElement(Object element) {
		_element = (IndexedRowType) element;
		index = _element.getIX().intValue();
	}

	public Object getElement() {
		return _element;
	}
	
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
		_element.setIX(BigInteger.valueOf(index));
	}
}
