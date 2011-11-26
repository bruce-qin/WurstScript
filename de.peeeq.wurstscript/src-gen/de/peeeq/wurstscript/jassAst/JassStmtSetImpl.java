//generated by parseq
package de.peeeq.wurstscript.jassAst;

class JassStmtSetImpl implements JassStmtSet, JassAstElementIntern {
	JassStmtSetImpl(String left, JassExpr right) {
		if (left == null) throw new IllegalArgumentException();
		this.left = left;
		if (right == null) throw new IllegalArgumentException();
		((JassAstElementIntern)right).setParent(this);
		this.right = right;
	}

	private JassAstElement parent;
	public JassAstElement getParent() { return parent; }
	public void setParent(JassAstElement parent) {
		if (parent != null && this.parent != null) { 			throw new Error("Parent of " + this + " already set: " + this.parent + "\ntried to change to " + parent); 		}
		this.parent = parent;
	}

	private String left;
	public void setLeft(String left) {
		if (left == null) throw new IllegalArgumentException();
		this.left = left;
	} 
	public String getLeft() { return left; }

	private JassExpr right;
	public void setRight(JassExpr right) {
		if (right == null) throw new IllegalArgumentException();
		((JassAstElementIntern)this.right).setParent(null);
		((JassAstElementIntern)right).setParent(this);
		this.right = right;
	} 
	public JassExpr getRight() { return right; }

	public JassAstElement get(int i) {
		switch (i) {
			case 0: return right;
			default: throw new IllegalArgumentException("Index out of range: " + i);
		}
	}
	public int size() {
		return 1;
	}
	public JassStmtSet copy() {
		return new JassStmtSetImpl(left, right.copy());
	}
	@Override public void accept(JassStatement.Visitor v) {
		right.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassFunction.Visitor v) {
		right.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassStmtIf.Visitor v) {
		right.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassStatements.Visitor v) {
		right.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassStmtLoop.Visitor v) {
		right.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassProg.Visitor v) {
		right.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassStmtSet.Visitor v) {
		right.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassFunctions.Visitor v) {
		right.accept(v);
		v.visit(this);
	}
	@Override public <T> T match(JassStatement.Matcher<T> matcher) {
		return matcher.case_JassStmtSet(this);
	}
	@Override public void match(JassStatement.MatcherVoid matcher) {
		matcher.case_JassStmtSet(this);
	}

	@Override public String toString() {
		return "JassStmtSet(" + left + ", " +right+")";
	}
}