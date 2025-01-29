parser grammar LingoParser;

options { tokenVocab = LingoLexer; }

// Program structure
program: (statement | functionDef)* EOF;

// Statements
statement
    : expr SEMICOLON                                   # exprStmt
    | IF expr LBRACE statement* RBRACE (ELSE LBRACE statement* RBRACE)? # ifStmt
    | WHILE expr LBRACE statement* RBRACE              # whileStmt
    | FOR ID IN expr LBRACE statement* RBRACE          # forStmt
    | RETURN expr? SEMICOLON                           # returnStmt
    ;

// Function definition
functionDef: DEF ID LPAREN params? RPAREN (ARROW type)? LBRACE statement* RBRACE;

params: ID (COMMA ID)*;

// Types
type: INT_TYPE | BOOL_TYPE | STRING_TYPE;

// Expressions
expr
    : expr op=(MULTIPLY | DIVIDE | MODULO) expr        # binaryOp
    | expr op=(PLUS | MINUS) expr                      # binaryOp
    | expr op=(EQUALS | NOT_EQUALS | GREATER_THAN | LESS_THAN | GREATER_EQUAL | LESS_EQUAL) expr # binaryOp
    | expr AND expr                                    # logicalOp
    | expr OR expr                                     # logicalOp
    | NOT expr                                         # notOp
    | ID ASSIGN expr                                   # assignExpr
    | ID LPAREN args? RPAREN                           # funcCall
    | LPAREN expr RPAREN                               # parenExpr
    | INT                                              # intLiteral
    | BOOL                                             # boolLiteral
    | STRING                                           # stringLiteral
    | NULL                                             # nullLiteral
    | ID                                               # varExpr
    ;

args: expr (COMMA expr)*;