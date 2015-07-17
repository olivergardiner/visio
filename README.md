visio
=====

A library for creating and manipulating Visio XML (.vdx) files.

With the advent of OOXML and projects such as Apache POI, creating and manipulating standard Office documents programmatically has become relatively straightforward. For me, this is very useful for creating documented artifacts from EA models, but there are obviously many different use cases. However, while POI allows PowerPoint slide decks to be created, Visio documents do not form part of the OOXML family and POI can't help, hence this project.

The purpose of this project is to provide a library for handling Visio XML (.vdx) files. It is based on a wrapping a set of JAXB objects created from the VDX schema files available from Microsoft. At present, functionality is limited and constrained to the 2003 version of the schema but the code does support reading and modifying an existing Visio diagram, and marshaling back to XML.