package de.peeeq.wurstscript.translation.imtranslation;

import java.util.List;

import com.google.common.collect.Lists;

import de.peeeq.wurstscript.ast.Ast;
import de.peeeq.wurstscript.ast.OpAssign;
import de.peeeq.wurstscript.ast.OpBinary;
import de.peeeq.wurstscript.ast.OpDivAssign;
import de.peeeq.wurstscript.ast.OpMinusAssign;
import de.peeeq.wurstscript.ast.OpMultAssign;
import de.peeeq.wurstscript.ast.OpPlusAssign;
import de.peeeq.wurstscript.ast.WParameter;
import de.peeeq.wurstscript.ast.WParameters;
import de.peeeq.wurstscript.jassIm.ImArrayType;
import de.peeeq.wurstscript.jassIm.ImSimpleType;
import de.peeeq.wurstscript.jassIm.ImTupleType;
import de.peeeq.wurstscript.jassIm.ImType;
import de.peeeq.wurstscript.jassIm.ImVar;
import de.peeeq.wurstscript.jassIm.ImVars;
import de.peeeq.wurstscript.jassIm.JassIm;

public class ImHelper {

	static void translateParameters(WParameters params, ImVars result, ImTranslator t) {
		for (WParameter p : params) {
			result.add(t.getVarFor(p));
		}
	}

//	static ImVar translateParam(WParameter p) {
//		return tra
//		return JassIm.ImVar(p.attrTyp().imTranslateType(), p.getName());
//	}

	public static ImType toArray(ImType t) {
		if (t instanceof ImSimpleType) {
			ImSimpleType imSimpleType = (ImSimpleType) t;
			return JassIm.ImArrayType(imSimpleType.getTypename());
		} else if (t instanceof ImTupleType) {
			ImTupleType imTupleType = (ImTupleType) t;
			ImType result = JassIm.ImTupleArrayType(imTupleType.getTypes());
			return result;
		}
		throw new Error("Can't make array type from " + t);
	}

	public static OpBinary getBinaryOp(OpAssign opAssign) {
		return null;
	}

	public static OpBinary getBinaryOp(OpDivAssign opDivAssign) {
		return Ast.OpDivReal();
	}

	public static OpBinary getBinaryOp(OpMinusAssign opMinusAssign) {
		return Ast.OpMinus();
	}

	public static OpBinary getBinaryOp(OpMultAssign opMultAssign) {
		return Ast.OpMult();
	}

	public static OpBinary getBinaryOp(OpPlusAssign opPlusAssign) {
		return Ast.OpPlus();
	}

}