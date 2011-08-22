package de.peeeq.wurstscript.attributes;

import java.util.HashMap;
import java.util.Map;

import katja.common.NE;

import com.google.common.base.Function;

import de.peeeq.wurstscript.ast.AST;
import de.peeeq.wurstscript.ast.AST.SortPos;
import de.peeeq.wurstscript.ast.ClassDefPos;
import de.peeeq.wurstscript.ast.ClassSlotPos;
import de.peeeq.wurstscript.ast.FuncDefPos;
import de.peeeq.wurstscript.ast.VarDefPos;
import de.peeeq.wurstscript.ast.WEntityPos;
import de.peeeq.wurstscript.ast.WPackagePos;
import de.peeeq.wurstscript.ast.WScopePos;
import de.peeeq.wurstscript.utils.Utils;


/**
 * this attribute calculates the available variables for a given VariableScope 
 */
public class AttrVarScope extends Attribute<WScopePos, Map<String, VarDefPos>> {


	public AttrVarScope(Attributes attr) {
		super(attr);
	}

	@Override
	protected Map<String, VarDefPos> calculate(WScopePos node) {
		final Map<String, VarDefPos> result = new HashMap<String, VarDefPos>();
		return node.Switch(new WScopePos.Switch<Map<String, VarDefPos>, NE>() {

			@Override
			public Map<String, VarDefPos> CaseWPackagePos(WPackagePos term)
					throws NE {
				for (WEntityPos e : term.elements()) {
					if (e instanceof VarDefPos) {
						VarDefPos v = (VarDefPos) e;
						result.put(v.name().term(), v);
					}
				}
				return result;
			}

			@Override
			public Map<String, VarDefPos> CaseClassDefPos(ClassDefPos term)
					throws NE {
				for (ClassSlotPos e : term.slots()) {
					if (e instanceof VarDefPos) {
						VarDefPos v = (VarDefPos) e;
						result.put(v.name().term(), v);
					}
				}
				return result;
			}

			@Override
			public Map<String, VarDefPos> CaseFuncDefPos(FuncDefPos term)
					throws NE {
				Utils.visitPostOrder(term, new Function<AST.SortPos, Void>() {
					
					@Override
					public Void apply(SortPos e) {
						if (e instanceof VarDefPos) {
							VarDefPos v = (VarDefPos) e;
							result.put(v.name().term(), v);
						}
						return null;
					}
				});
				return result;
			}
		});
	}


}