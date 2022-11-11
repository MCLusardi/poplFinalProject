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
arithmetic : (unaryMinus | variable | NUMBER) (WHITESPACE* arithmeticOp WHITESPACE* (unaryMinus | variable | NUMBER))+ ;
arithmeticOp : ('+' | '-' | '*' | '/' | '%') ;

// Assignments
assignment : variable WHITESPACE* assignmentOp WHITESPACE* (unaryMinus | variable | NUMBER | arithmetic | STRING) ;
assignmentOp : ('=' | '+=' | '-=' | '*=' | '/=') ;

unaryMinus : MINUS (NUMBER | variable ) ;

/*
 *  Lexer rules
 */

fragment LOWER  : [a-z] ;
fragment UPPER  : [A-Z] ;
fragment DIGIT  : [0-9] ;

NUMBER          : DIGIT+ ;
MINUS           : '-' ;
STRING          : '"'(LETTER | WHITESPACE | NUMBER)*'"' ;

// Rules for variable naming
LETTER          : (LOWER | UPPER | '_') ;
VARNAME         : LETTER (LETTER | DIGIT)* ;

NEWLINE         : [\r\n]+ ;
WHITESPACE      : [ ]+ ;
