// Generated from C:/Users/yung/IdeaProjects/untitled3\lloo.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link llooParser}.
 */
public interface llooListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link llooParser#compUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompUnit(llooParser.CompUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#compUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompUnit(llooParser.CompUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(llooParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(llooParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(llooParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(llooParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(llooParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(llooParser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#constDef}.
	 * @param ctx the parse tree
	 */
	void enterConstDef(llooParser.ConstDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#constDef}.
	 * @param ctx the parse tree
	 */
	void exitConstDef(llooParser.ConstDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#constInitVal}.
	 * @param ctx the parse tree
	 */
	void enterConstInitVal(llooParser.ConstInitValContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#constInitVal}.
	 * @param ctx the parse tree
	 */
	void exitConstInitVal(llooParser.ConstInitValContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#constExp}.
	 * @param ctx the parse tree
	 */
	void enterConstExp(llooParser.ConstExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#constExp}.
	 * @param ctx the parse tree
	 */
	void exitConstExp(llooParser.ConstExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(llooParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(llooParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#bType}.
	 * @param ctx the parse tree
	 */
	void enterBType(llooParser.BTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#bType}.
	 * @param ctx the parse tree
	 */
	void exitBType(llooParser.BTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(llooParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(llooParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#initVal}.
	 * @param ctx the parse tree
	 */
	void enterInitVal(llooParser.InitValContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#initVal}.
	 * @param ctx the parse tree
	 */
	void exitInitVal(llooParser.InitValContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#funcType}.
	 * @param ctx the parse tree
	 */
	void enterFuncType(llooParser.FuncTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#funcType}.
	 * @param ctx the parse tree
	 */
	void exitFuncType(llooParser.FuncTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#main_ident}.
	 * @param ctx the parse tree
	 */
	void enterMain_ident(llooParser.Main_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#main_ident}.
	 * @param ctx the parse tree
	 */
	void exitMain_ident(llooParser.Main_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(llooParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(llooParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(llooParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(llooParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(llooParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(llooParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(llooParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(llooParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#relExp}.
	 * @param ctx the parse tree
	 */
	void enterRelExp(llooParser.RelExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#relExp}.
	 * @param ctx the parse tree
	 */
	void exitRelExp(llooParser.RelExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#eqExp}.
	 * @param ctx the parse tree
	 */
	void enterEqExp(llooParser.EqExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#eqExp}.
	 * @param ctx the parse tree
	 */
	void exitEqExp(llooParser.EqExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#lAndExp}.
	 * @param ctx the parse tree
	 */
	void enterLAndExp(llooParser.LAndExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#lAndExp}.
	 * @param ctx the parse tree
	 */
	void exitLAndExp(llooParser.LAndExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#lOrExp}.
	 * @param ctx the parse tree
	 */
	void enterLOrExp(llooParser.LOrExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#lOrExp}.
	 * @param ctx the parse tree
	 */
	void exitLOrExp(llooParser.LOrExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#lVal}.
	 * @param ctx the parse tree
	 */
	void enterLVal(llooParser.LValContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#lVal}.
	 * @param ctx the parse tree
	 */
	void exitLVal(llooParser.LValContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(llooParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(llooParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#addExp}.
	 * @param ctx the parse tree
	 */
	void enterAddExp(llooParser.AddExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#addExp}.
	 * @param ctx the parse tree
	 */
	void exitAddExp(llooParser.AddExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#mulExp}.
	 * @param ctx the parse tree
	 */
	void enterMulExp(llooParser.MulExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#mulExp}.
	 * @param ctx the parse tree
	 */
	void exitMulExp(llooParser.MulExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExp(llooParser.UnaryExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExp(llooParser.UnaryExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#funcRParams}.
	 * @param ctx the parse tree
	 */
	void enterFuncRParams(llooParser.FuncRParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#funcRParams}.
	 * @param ctx the parse tree
	 */
	void exitFuncRParams(llooParser.FuncRParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExp(llooParser.PrimaryExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExp(llooParser.PrimaryExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOp(llooParser.UnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOp(llooParser.UnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(llooParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(llooParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link llooParser#ident1}.
	 * @param ctx the parse tree
	 */
	void enterIdent1(llooParser.Ident1Context ctx);
	/**
	 * Exit a parse tree produced by {@link llooParser#ident1}.
	 * @param ctx the parse tree
	 */
	void exitIdent1(llooParser.Ident1Context ctx);
}