package Node;

import ast.ASTNode;
import ast.ASTVisitor;

import java.util.List;
public class ProgramNode extends ASTNode {
    public final List<StatementNode> statements;

    public ProgramNode(List<StatementNode> statements) {
        this.statements = statements;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return (T) visitor.visitProgram(this);
    }


}