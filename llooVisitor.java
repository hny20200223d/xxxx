// Generated from C:/Users/yung/IdeaProjects/untitled3\lloo.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link llooParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface llooVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link llooParser#compUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompUnit(llooParser.CompUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(llooParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(llooParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(llooParser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#constDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDef(llooParser.ConstDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#constInitVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstInitVal(llooParser.ConstInitValContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#constExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExp(llooParser.ConstExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(llooParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#bType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBType(llooParser.BTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(llooParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#initVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitVal(llooParser.InitValContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#funcType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncType(llooParser.FuncTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#main_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_ident(llooParser.Main_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(llooParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(llooParser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(llooParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(llooParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#relExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExp(llooParser.RelExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#eqExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExp(llooParser.EqExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#lAndExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLAndExp(llooParser.LAndExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#lOrExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLOrExp(llooParser.LOrExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#lVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLVal(llooParser.LValContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(llooParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#addExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExp(llooParser.AddExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#mulExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExp(llooParser.MulExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#unaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExp(llooParser.UnaryExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#funcRParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncRParams(llooParser.FuncRParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#primaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExp(llooParser.PrimaryExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(llooParser.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(llooParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link llooParser#ident1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent1(llooParser.Ident1Context ctx);
}