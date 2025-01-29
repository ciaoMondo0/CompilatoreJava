package Node;

import ast.ASTNode;
import ast.ASTVisitor;

import java.util.List;

public class StatementNode extends ASTNode {


    public enum Type {
        EXPRESSION_STATEMENT, IF_STATEMENT, WHILE_STATEMENT, FOR_STATEMENT, RETURN_STATEMENT
    }

    public final Type type;
    public final ExpressionNode expr;  // Espressione nel nodo
    public final List<StatementNode> body;  // Corpo di una dichiarazione condizionale o ciclo
    public final List<StatementNode> elseBody;  // Corpo dell'else per if

    public StatementNode(Type type, ExpressionNode expr, List<StatementNode> body, List<StatementNode> elseBody) {
        this.type = type;
        this.expr = expr;
        this.body = body;
        this.elseBody = elseBody;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitStatement(this);
    }
}
