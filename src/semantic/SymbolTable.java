package semantic;

import Node.ExpressionNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class SymbolTable {

    private final Stack<Map<String, ExpressionNode.Type>> scopeStack = new Stack<>();

    public SymbolTable() {
        scopeStack.push(new HashMap<>()); // Scope globale
    }

    public void declare(String name, ExpressionNode.Type type) {
        scopeStack.peek().put(name, type);
    }

    // Cercare una variabile partendo dallo scope più interno
    public ExpressionNode.Type lookup(String name) {
        for (int i = scopeStack.size() - 1; i >= 0; i--) {
            if (scopeStack.get(i).containsKey(name)) {
                return scopeStack.get(i).get(name);
            }
        }
        return ExpressionNode.Type.ERROR; // Se non trovato, restituisce un errore
    }

    public void enterScope() {
        scopeStack.push(new HashMap<>());
    }

    public void exitScope() {
        if (scopeStack.size() > 1) {
            scopeStack.pop();
        } else {
            throw new IllegalStateException("Tentativo di uscire dallo scope globale!");
        }
    }

}

