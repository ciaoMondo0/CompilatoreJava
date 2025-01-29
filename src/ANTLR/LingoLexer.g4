lexer grammar LingoLexer;

// Fragments
fragment LALPHA: [a-z];
fragment UALPHA: [A-Z];
fragment ALPHA: LALPHA | UALPHA;
fragment ALPHA_: ALPHA | '_';

fragment DIGIT: [0-9];
fragment DECIMAL: DIGIT+;

// Whitespace
NEWLINE: '\r'? '\n' | '\r';
TAB: [\t]+ -> skip;
WS: [ \u00A0]+ -> skip;

// Comments
SingleComment: '#' ~[\r\n]* -> skip;
MultiCommentStart: '/*';
MultiCommentEnd: '*/';
MULTICOMMENT: MultiCommentStart .*? MultiCommentEnd -> skip;

// Keywords
DEF: 'def';
RETURN: 'return';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
FOR: 'for';
IN: 'in';
TRUE: 'true';
FALSE: 'false';
NULL: 'null';
AND: 'and';
OR: 'or';
NOT: 'not';

// Types
INT_TYPE: 'Int';
BOOL_TYPE: 'Bool';
STRING_TYPE: 'String';

// Literals
INT: DECIMAL;
BOOL: TRUE | FALSE;
STRING: '"' (~["\\\r\n] | '\\' .)* '"';

// Identifiers
ID: LALPHA (ALPHA_ | DIGIT)*;

// Operators
PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';
MODULO: '%';
ASSIGN: '=';
EQUALS: '==';
NOT_EQUALS: '!=';
GREATER_THAN: '>';
LESS_THAN: '<';
GREATER_EQUAL: '>=';
LESS_EQUAL: '<=';

// Delimiters
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
LBRACKET: '[';
RBRACKET: ']';
COMMA: ',';
COLON: ':';
SEMICOLON: ';';
ARROW: '->';
DOT: '.';