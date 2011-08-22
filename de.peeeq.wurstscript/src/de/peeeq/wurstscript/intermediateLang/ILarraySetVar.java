package de.peeeq.wurstscript.intermediateLang;

public class ILarraySetVar extends ILStatementSet implements CodePrinting {

	private ILvar index;
	private ILvar var;

	public ILarraySetVar(ILvar resultVar, ILvar index, ILvar var) {
		super(resultVar);
		this.index = index;
		this.var = var;
	}

	public ILvar getIndex() {
		return index;
	}

	public ILvar getVar() {
		return var;
	}

	@Override
	public void printJass(StringBuilder sb) {
		sb.append("set ");
		sb.append(getResultVar().getName());
		sb.append("[");
		sb.append(index.getName());
		sb.append("] = ");
		sb.append(var.getName());
		sb.append("\n");
	}

	
	
}