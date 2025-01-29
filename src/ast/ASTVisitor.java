package ast;


import Node.ExpressionNode;
import Node.StatementNode;

public abstract class ASTVisitor<T> {
    // Metodi per le espressioni
    public abstract T visitIntLiteral(ExpressionNode node);
    public abstract T visitBoolLiteral(ExpressionNode node);
    public abstract T visitStringLiteral(ExpressionNode node);
    public abstract T visitVariable(ExpressionNode node);
    public abstract T visitBinaryOp(ExpressionNode node);
    public abstract T visitAssignment(ExpressionNode node);
    public abstract T visitFunctionCall(ExpressionNode node);
    public abstract T visitParenthesizedExpr(ExpressionNode node);

    public abstract T visitStatement(StatementNode node);


    public  T visit(ASTNode node) {
        return node.accept(this);
    }


    }


