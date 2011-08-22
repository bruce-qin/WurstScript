package de.peeeq.wurstscript.intermediateLang;

import java.math.BigDecimal;


public class ILconstNum extends ILconst {

	private BigDecimal val;

	public ILconstNum(String numVal) {
		this.val = new BigDecimal(numVal);
	}

	public ILconstNum(double numVal) {
		this.val = new BigDecimal(numVal);
	}
	
	public float negate() {
		return val.negate().floatValue();
	}

	@Override
	public String print() {
		return val.toString();
	}

	public BigDecimal getVal() {
		return val;
	}

	
	@Override
	public void printJass(StringBuilder sb) {
		sb.append(print());
	}
}