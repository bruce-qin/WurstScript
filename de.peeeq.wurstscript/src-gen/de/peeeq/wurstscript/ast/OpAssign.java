//generated by parseq
package de.peeeq.wurstscript.ast;

public interface OpAssign extends AstElement, OpAssignment {
	AstElement getParent();
	OpAssign copy();
	public abstract void accept(InitBlock.Visitor v);
	public abstract void accept(WStatement.Visitor v);
	public abstract void accept(OpAssignment.Visitor v);
	public abstract void accept(OnDestroyDef.Visitor v);
	public abstract void accept(WStatements.Visitor v);
	public abstract void accept(TopLevelDeclaration.Visitor v);
	public abstract void accept(OpAssign.Visitor v);
	public abstract void accept(StmtIf.Visitor v);
	public abstract void accept(ConstructorDef.Visitor v);
	public abstract void accept(StmtSet.Visitor v);
	public abstract void accept(FunctionDefinition.Visitor v);
	public abstract void accept(JassToplevelDeclaration.Visitor v);
	public abstract void accept(ClassSlot.Visitor v);
	public abstract void accept(ClassMember.Visitor v);
	public abstract void accept(WPackage.Visitor v);
	public abstract void accept(ClassDef.Visitor v);
	public abstract void accept(WEntity.Visitor v);
	public abstract void accept(ClassSlots.Visitor v);
	public abstract void accept(WEntities.Visitor v);
	public abstract void accept(TypeDef.Visitor v);
	public abstract void accept(WScope.Visitor v);
	public abstract void accept(StmtLoop.Visitor v);
	public abstract void accept(StmtWhile.Visitor v);
	public abstract void accept(FuncDef.Visitor v);
	public abstract void accept(CompilationUnit.Visitor v);
	public abstract void accept(PackageOrGlobal.Visitor v);
	public interface Visitor {
		void visit(OpAssign opAssign);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(OpAssign opAssign) {}
	}
}
