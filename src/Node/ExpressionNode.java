package Node;

import ast.ASTNode;
import ast.ASTVisitor;

import java.util.List;

public class ExpressionNode extends ASTNode {
    public enum Type {
        INT_LITERAL, BOOL_LITERAL, STRING_LITERAL, VARIABLE, BINARY_OP, ASSIGNMENT, FUNC_CALL, PARENTHESIZED_EXPR
    }

    public final Type type;
    public final Object value;  // Per esempio, il valore della variabile o il nome della funzione
    public final List<ExpressionNode> operands; // Operandi per operazioni binarie o chiamate a funzioni

    // Costruttori per i vari tipi di espressione
    public ExpressionNode(Type type, Object value, List<ExpressionNode> operands) {
        this.type = type;
        this.value = value;
        this.operands = operands;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        switch (type) {
            case INT_LITERAL: return visitor.visitIntLiteral(this);
            case BOOL_LITERAL: return visitor.visitBoolLiteral(this);
            case STRING_LITERAL: return visitor.visitStringLiteral(this);
            case VARIABLE: return visitor.visitVariable(this);
            case BINARY_OP: return visitor.visitBinaryOp(this);
            case ASSIGNMENT: return visitor.visitAssignment(this);
            case FUNC_CALL: return visitor.visitFunctionCall(this);
            case PARENTHESIZED_EXPR: return visitor.visitParenthesizedExpr(this);
            default: throw new UnsupportedOperationException("Unsupported type: " + type);
        }
    }
}