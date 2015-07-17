package uk.org.whitecottage.visio;

import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import uk.org.whitecottage.visio.jaxb.visio2003.CellType;
import uk.org.whitecottage.visio.jaxb.visio2003.FillType;

public class Fill extends VisioElement {
	protected FillType _fill;
	
	public Fill() {
		_fill = new FillType();
		
		createDefaults();
	}

	public Fill(FillType fill) {
		_fill = fill;
		
		for (@SuppressWarnings("unused") CellType cell: _fill.getFillForegndOrFillBkgndOrFillPattern()) {
			/*if (cell instanceof LineWeightType) {
			} else if (cell instanceof LineColorType) {
			}*/
		}
	}
	
	protected void createDefaults() {
		@SuppressWarnings("unused")
		List<CellType> contents = _fill.getFillForegndOrFillBkgndOrFillPattern();

		// TODO: create default fill parameters
	}
	
	public JAXBElement<FillType> getFill() {
		return new JAXBElement<FillType>(new QName("http://schemas.microsoft.com/visio/2003/core", "Fill"), FillType.class, _fill);
	}
}
