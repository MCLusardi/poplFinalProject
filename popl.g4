grammar popl;

// Source: https://tomassetti.me/antlr-mega-tutorial/

/*
 *  Parser rules
 */

// program entry point
prog : (expression NEWLINE)+;

// Requirements for variable names
variable : VARNAME ;

// Expressions such as arithmetic, assignments, etc
expression : (assignment | arithmetic) ;

// Arithmetic Operators
arithmetic : (variable | NUMBER) (WHITESPACE* arithmeticOp WHITESPACE* (variable | NUMBER))+ ;
arithmeticOp : ('+' | '-' | '*' | '/' | '%') ;

// Assignments
assignment : variable WHITESPACE* assignmentOp WHITESPACE* (variable | NUMBER | arithmetic) ;
assignmentOp : ('=' | '+=' | '-=' | '*=' | '/=') ;

/*
 *  Lexer rules
 */

fragment LOWER  : [a-z] ;
fragment UPPER  : [A-Z] ;
fragment DIGIT  : [0-9] ;

NUMBER          : [-]?DIGIT+ ;

// Rules for variable naming
LETTER          : (LOWER | UPPER | '_') ;
VARNAME         : LETTER (LETTER | DIGIT)* ;

NEWLINE         : [\r\n]+ ;
WHITESPACE      : [ ]+ ;