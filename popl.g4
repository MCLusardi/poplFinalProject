grammar popl;

// Source: https://tomassetti.me/antlr-mega-tutorial/

/*
 *  Parser rules
 */

// program entry point
prog : (expression (NEWLINE+ | EOF))+ EOF ;

// Requirements for variable names
variable : VARNAME ;

// Expressions such as arithmetic, assignments, etc
expression : (assignment | unaryMinus | arithmetic) ;

// Arithmetic Operators
arithmetic : (unaryMinus | variable | NUMBER | DECIMAL | HEX | BOOL) (WHITESPACE* arithmeticOp WHITESPACE* (unaryMinus | variable | NUMBER | DECIMAL | HEX | BOOL))+ ;
arithmeticOp : ('+' | '-' | '*' | '/' | '%') ;

// Assignments
assignment : variable WHITESPACE* assignmentOp WHITESPACE* (unaryMinus | variable | NUMBER | arithmetic | DECIMAL | STRING | HEX | BOOL) ;
assignmentOp : ('=' | '+=' | '-=' | '*=' | '/=') ;

unaryMinus : MINUS (NUMBER | variable ) ;

/*
 *  Lexer rules
 */

fragment LOWER  : [a-z] ;
fragment UPPER  : [A-Z] ;
fragment DIGIT  : [0-9] ;
fragment LOWERHEX : [a-f] ;
fragment UPPERHEX : [A-F] ;


NUMBER          : DIGIT+ ;
MINUS           : '-' ;
DECIMAL         : NUMBER '.' NUMBER ;
HEX             : '0' 'x' (LOWERHEX | UPPERHEX | DIGIT)+ ;
STRING          : '"'(LETTER | WHITESPACE | NUMBER)*'"' | '\'' (LETTER | WHITESPACE | NUMBER)* '\''; 
BOOL            : 'True' | 'False' ;

// Rules for variable naming
LETTER          : (LOWER | UPPER | '_') ;
VARNAME         : LETTER (LETTER | DIGIT)* ;

NEWLINE         : [\r\n]+ ;
WHITESPACE      : [ ]+ ;
