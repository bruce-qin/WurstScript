//generated by parseq
package de.peeeq.wurstscript.ast;

public interface WPackage extends AstElement, TopLevelDeclaration, PackageOrGlobal {
	AstElement getParent();
	void setSource(WPos source);
	WPos getSource();
	void setName(String name);
	String getName();
	void setImports(WImports imports);
	WImports getImports();
	void setElements(WEntities elements);
	WEntities getElements();
	WPackage copy();
	public abstract void accept(TopLevelDeclaration.Visitor v);
	public abstract void accept(WPackage.Visitor v);
	public abstract void accept(WScope.Visitor v);
	public abstract void accept(CompilationUnit.Visitor v);
	public abstract void accept(PackageOrGlobal.Visitor v);
	public interface Visitor {
		void visit(ExprFunctionCall exprFunctionCall);
		void visit(OpModInt opModInt);
		void visit(InitBlock initBlock);
		void visit(ExprMemberMethod exprMemberMethod);
		void visit(ExprNull exprNull);
		void visit(ExprStringVal exprStringVal);
		void visit(ExprVarArrayAccess exprVarArrayAccess);
		void visit(ExprThis exprThis);
		void visit(WPackage wPackage);
		void visit(ExprBoolVal exprBoolVal);
		void visit(OpMinus opMinus);
		void visit(ClassDef classDef);
		void visit(OpNot opNot);
		void visit(StmtExitwhen stmtExitwhen);
		void visit(TypeExpr typeExpr);
		void visit(ExprVarAccess exprVarAccess);
		void visit(WPos wPos);
		void visit(OpLessEq opLessEq);
		void visit(ExprBinary exprBinary);
		void visit(ClassSlots classSlots);
		void visit(OpUnequals opUnequals);
		void visit(ExprFuncRef exprFuncRef);
		void visit(OnDestroyDef onDestroyDef);
		void visit(ArraySizes arraySizes);
		void visit(Indexes indexes);
		void visit(OpAnd opAnd);
		void visit(OpDivReal opDivReal);
		void visit(WParameters wParameters);
		void visit(FuncSignature funcSignature);
		void visit(OpMult opMult);
		void visit(OpOr opOr);
		void visit(StmtErr stmtErr);
		void visit(NoTypeExpr noTypeExpr);
		void visit(OpLess opLess);
		void visit(WStatements wStatements);
		void visit(VisibilityDefault visibilityDefault);
		void visit(StmtDestroy stmtDestroy);
		void visit(GlobalVarDef globalVarDef);
		void visit(ExprUnary exprUnary);
		void visit(OpAssign opAssign);
		void visit(ExprCast exprCast);
		void visit(StmtReturn stmtReturn);
		void visit(WParameter wParameter);
		void visit(NoExpr noExpr);
		void visit(OpModReal opModReal);
		void visit(OpEquals opEquals);
		void visit(StmtIf stmtIf);
		void visit(WEntities wEntities);
		void visit(StmtLoop stmtLoop);
		void visit(NativeFunc nativeFunc);
		void visit(Arguments arguments);
		void visit(ExprIntVal exprIntVal);
		void visit(StmtWhile stmtWhile);
		void visit(LocalVarDef localVarDef);
		void visit(FuncDef funcDef);
		void visit(WImport wImport);
		void visit(VisibilityPublic visibilityPublic);
		void visit(ConstructorDef constructorDef);
		void visit(ExprMemberVar exprMemberVar);
		void visit(ExprMemberArrayVar exprMemberArrayVar);
		void visit(ExprRealVal exprRealVal);
		void visit(OpDivInt opDivInt);
		void visit(VisibilityPublicread visibilityPublicread);
		void visit(StmtSet stmtSet);
		void visit(VisibilityProtected visibilityProtected);
		void visit(OpGreaterEq opGreaterEq);
		void visit(OpGreater opGreater);
		void visit(ExprNewObject exprNewObject);
		void visit(VisibilityPrivate visibilityPrivate);
		void visit(WImports wImports);
		void visit(NativeType nativeType);
		void visit(OpPlus opPlus);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(ExprFunctionCall exprFunctionCall) {}
		@Override public void visit(OpModInt opModInt) {}
		@Override public void visit(InitBlock initBlock) {}
		@Override public void visit(ExprMemberMethod exprMemberMethod) {}
		@Override public void visit(ExprNull exprNull) {}
		@Override public void visit(ExprStringVal exprStringVal) {}
		@Override public void visit(ExprVarArrayAccess exprVarArrayAccess) {}
		@Override public void visit(ExprThis exprThis) {}
		@Override public void visit(WPackage wPackage) {}
		@Override public void visit(ExprBoolVal exprBoolVal) {}
		@Override public void visit(OpMinus opMinus) {}
		@Override public void visit(ClassDef classDef) {}
		@Override public void visit(OpNot opNot) {}
		@Override public void visit(StmtExitwhen stmtExitwhen) {}
		@Override public void visit(TypeExpr typeExpr) {}
		@Override public void visit(ExprVarAccess exprVarAccess) {}
		@Override public void visit(WPos wPos) {}
		@Override public void visit(OpLessEq opLessEq) {}
		@Override public void visit(ExprBinary exprBinary) {}
		@Override public void visit(ClassSlots classSlots) {}
		@Override public void visit(OpUnequals opUnequals) {}
		@Override public void visit(ExprFuncRef exprFuncRef) {}
		@Override public void visit(OnDestroyDef onDestroyDef) {}
		@Override public void visit(ArraySizes arraySizes) {}
		@Override public void visit(Indexes indexes) {}
		@Override public void visit(OpAnd opAnd) {}
		@Override public void visit(OpDivReal opDivReal) {}
		@Override public void visit(WParameters wParameters) {}
		@Override public void visit(FuncSignature funcSignature) {}
		@Override public void visit(OpMult opMult) {}
		@Override public void visit(OpOr opOr) {}
		@Override public void visit(StmtErr stmtErr) {}
		@Override public void visit(NoTypeExpr noTypeExpr) {}
		@Override public void visit(OpLess opLess) {}
		@Override public void visit(WStatements wStatements) {}
		@Override public void visit(VisibilityDefault visibilityDefault) {}
		@Override public void visit(StmtDestroy stmtDestroy) {}
		@Override public void visit(GlobalVarDef globalVarDef) {}
		@Override public void visit(ExprUnary exprUnary) {}
		@Override public void visit(OpAssign opAssign) {}
		@Override public void visit(ExprCast exprCast) {}
		@Override public void visit(StmtReturn stmtReturn) {}
		@Override public void visit(WParameter wParameter) {}
		@Override public void visit(NoExpr noExpr) {}
		@Override public void visit(OpModReal opModReal) {}
		@Override public void visit(OpEquals opEquals) {}
		@Override public void visit(StmtIf stmtIf) {}
		@Override public void visit(WEntities wEntities) {}
		@Override public void visit(StmtLoop stmtLoop) {}
		@Override public void visit(NativeFunc nativeFunc) {}
		@Override public void visit(Arguments arguments) {}
		@Override public void visit(ExprIntVal exprIntVal) {}
		@Override public void visit(StmtWhile stmtWhile) {}
		@Override public void visit(LocalVarDef localVarDef) {}
		@Override public void visit(FuncDef funcDef) {}
		@Override public void visit(WImport wImport) {}
		@Override public void visit(VisibilityPublic visibilityPublic) {}
		@Override public void visit(ConstructorDef constructorDef) {}
		@Override public void visit(ExprMemberVar exprMemberVar) {}
		@Override public void visit(ExprMemberArrayVar exprMemberArrayVar) {}
		@Override public void visit(ExprRealVal exprRealVal) {}
		@Override public void visit(OpDivInt opDivInt) {}
		@Override public void visit(VisibilityPublicread visibilityPublicread) {}
		@Override public void visit(StmtSet stmtSet) {}
		@Override public void visit(VisibilityProtected visibilityProtected) {}
		@Override public void visit(OpGreaterEq opGreaterEq) {}
		@Override public void visit(OpGreater opGreater) {}
		@Override public void visit(ExprNewObject exprNewObject) {}
		@Override public void visit(VisibilityPrivate visibilityPrivate) {}
		@Override public void visit(WImports wImports) {}
		@Override public void visit(NativeType nativeType) {}
		@Override public void visit(OpPlus opPlus) {}
	}
	public abstract com.google.common.collect.Multimap<String, FunctionDefinition> attrExportedFunctions();
	public abstract java.util.Map<String, VarDef> attrExportedVariables();
	public abstract java.util.Map<String, TypeDef> attrExportedTypes();
}
