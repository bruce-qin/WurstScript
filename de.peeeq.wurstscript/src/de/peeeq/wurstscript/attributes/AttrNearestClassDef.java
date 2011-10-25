package de.peeeq.wurstscript.attributes;

import de.peeeq.wurstscript.ast.ClassDef;
import de.peeeq.wurstscript.ast.SortPos;



/**
 * this attribute gives you the nearest package for a given element
 *
 */
public class AttrNearestClassDef {
	
	public static  ClassDef calculate(SortPos node) {
		if (node == null) {
			return null;
		}
		if (node instanceof ClassDef) {
			return (ClassDef) node;
		}
		return node.getParent().attrNearestClassDef();
	}


}