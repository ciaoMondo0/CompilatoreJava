package ast;

import ANTLR.LingoParser;
import ANTLR.LingoParserBaseVisitor;
import Node.ExpressionNode;
import Node.StatementNode;
import java.util.ArrayList;
import java.util.List;

public class ASTBuilder extends LingoParserBaseVisitor<ASTNode> {


    @Override
    public ASTNode visitExprStmt(LingoParser.ExprStmtContext ctx) {
        ExpressionNode exprNode = (ExpressionNode) visit(ctx.expr());
        return new StatementNode(StatementNode.Type.EXPRESSION_STATEMENT, exprNode, null, null);
    }

    @Override
    public ASTNode visitIfStmt(LingoParser.IfStmtContext ctx) {
        ExpressionNode condition = (ExpressionNode) visit(ctx.expr());
        List<StatementNode> ifBody = new ArrayList<>();
        List<StatementNode> elseBody = new ArrayList<>();
            ifBody.add((StatementNode) visit(ctx.statement(0)));
                elseBody.add((StatementNode) visit(ctx.statement(1)));
        return new StatementNode(StatementNode.Type.IF_STATEMENT, condition, ifBody, elseBody);
    }

    @Override
    public ASTNode visitWhileStmt(LingoParser.WhileStmtContext ctx) {
        ExpressionNode condition = (ExpressionNode) visit(ctx.expr());
        List<StatementNode> body = new ArrayList<>();
        for (LingoParser.StatementContext stmtCtx : ctx.statement()) {
            body.add((StatementNode) visit(stmtCtx));
        }
        return new StatementNode(StatementNode.Type.WHILE_STATEMENT, condition, body, null);
    }

    @Override
    public ASTNode visitForStmt(LingoParser.ForStmtContext ctx) {
        String varName = ctx.ID().getText();
        ExpressionNode collection = (ExpressionNode) visit(ctx.expr());
        List<StatementNode> body = new ArrayList<>();
        for (LingoParser.StatementContext stmtCtx : ctx.statement()) {
            body.add((StatementNode) visit(stmtCtx));
        }
        return new StatementNode(StatementNode.Type.FOR_STATEMENT, collection, body, null);
    }

    @Override
    public ASTNode visitReturnStmt(LingoParser.ReturnStmtContext ctx) {
        ExpressionNode expr = (ctx.expr() != null) ? (ExpressionNode) visit(ctx.expr()) : null;
        return new StatementNode(StatementNode.Type.RETURN_STATEMENT, expr, null, null);
    }

    @Override
    public ASTNode visitBinaryOp(LingoParser.BinaryOpContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expr(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expr(1));
        String operator = ctx.getChild(1).getText();
        return new ExpressionNode(ExpressionNode.Type.BINARY_OP, operator, List.of(left, right));
    }

    @Override
    public ASTNode visitAssignExpr(LingoParser.AssignExprContext ctx) {
        String varName = ctx.ID().getText();
        ExpressionNode value = (ExpressionNode) visit(ctx.expr());
        return new ExpressionNode(ExpressionNode.Type.ASSIGNMENT, varName, List.of(value));
    }

    @Override
    public ASTNode visitFuncCall(LingoParser.FuncCallContext ctx) {
        String funcName = ctx.ID().getText();
        List<ExpressionNode> args = new ArrayList<>();
        if (ctx.args() != null) {
            for (LingoParser.ExprContext exprCtx : ctx.args().expr()) {
                args.add((ExpressionNode) visit(exprCtx));
            }
        }
        return new ExpressionNode(ExpressionNode.Type.FUNC_CALL, funcName, args);
    }

    @Override
    public ASTNode visitIntLiteral(LingoParser.IntLiteralContext ctx) {
        int value = Integer.parseInt(ctx.getText());
        return new ExpressionNode(ExpressionNode.Type.INT_LITERAL, value, null);
    }

    @Override
    public ASTNode visitBoolLiteral(LingoParser.BoolLiteralContext ctx) {
        boolean value = Boolean.parseBoolean(ctx.getText());
        return new ExpressionNode(ExpressionNode.Type.BOOL_LITERAL, value, null);
    }

    @Override
    public ASTNode visitStringLiteral(LingoParser.StringLiteralContext ctx) {
        String value = ctx.getText().substring(1, ctx.getText().length() - 1);
        return new ExpressionNode(ExpressionNode.Type.STRING_LITERAL, value, null);
    }

    @Override
    public ASTNode visitVarExpr(LingoParser.VarExprContext ctx) {
        String varName = ctx.ID().getText();
        return new ExpressionNode(ExpressionNode.Type.VARIABLE, varName, null);
    }
}
