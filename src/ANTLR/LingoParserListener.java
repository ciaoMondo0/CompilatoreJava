// Generated from D:/LingoCompiler/src/ANTLR/LingoParser.g4 by ANTLR 4.13.2
package ANTLR;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LingoParser}.
 */
public interface LingoParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LingoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LingoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LingoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStmt}
	 * labeled alternative in {@link LingoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(LingoParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStmt}
	 * labeled alternative in {@link LingoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(LingoParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link LingoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(LingoParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link LingoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(LingoParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link LingoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(LingoParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link LingoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(LingoParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link LingoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(LingoParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link LingoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(LingoParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStmt}
	 * labeled alternative in {@link LingoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(LingoParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStmt}
	 * labeled alternative in {@link LingoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(LingoParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingoParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(LingoParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingoParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(LingoParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingoParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(LingoParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingoParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(LingoParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingoParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LingoParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingoParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LingoParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link LingoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(LingoParser.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link LingoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(LingoParser.VarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOp}
	 * labeled alternative in {@link LingoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOp(LingoParser.BinaryOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOp}
	 * labeled alternative in {@link LingoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOp(LingoParser.BinaryOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link LingoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(LingoParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link LingoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(LingoParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link LingoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(LingoParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link LingoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(LingoParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notOp}
	 * labeled alternative in {@link LingoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotOp(LingoParser.NotOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notOp}
	 * labeled alternative in {@link LingoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotOp(LingoParser.NotOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link LingoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(LingoParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link LingoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(LingoParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalOp}
	 * labeled alternative in {@link LingoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOp(LingoParser.LogicalOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalOp}
	 * labeled alternative in {@link LingoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOp(LingoParser.LogicalOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link LingoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(LingoParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link LingoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(LingoParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link LingoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(LingoParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link LingoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(LingoParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolLiteral}
	 * labeled alternative in {@link LingoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteral(LingoParser.BoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolLiteral}
	 * labeled alternative in {@link LingoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteral(LingoParser.BoolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link LingoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(LingoParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link LingoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(LingoParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingoParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(LingoParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingoParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(LingoParser.ArgsContext ctx);
}