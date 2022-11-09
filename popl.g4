grammar popl;

// Source: https://tomassetti.me/antlr-mega-tutorial/

/*
 *  Parser rules
 */

// program entry point
prog : (expression NEWLINE)+ ;

// Requirements for variable names
variable : VARNAME ;

// Expressions such as arithmetic, assignments, etc
expression : (assignment | arithmetic) ;

// Arithmetic Operators
arithmetic : (plus | minus | mult | div | mod) ;
plus : (variable | NUMBER) WHITESPACE* '+' WHITESPACE* (variable | NUMBER) ;
minus : (variable | NUMBER) WHITESPACE* '-' WHITESPACE* (variable | NUMBER) ;
mult : (variable | NUMBER) WHITESPACE* '*' WHITESPACE* (variable | NUMBER) ;
div : (variable | NUMBER) WHITESPACE* '/' WHITESPACE* (variable | NUMBER) ;
mod : (variable | NUMBER) WHITESPACE* '%' WHITESPACE* (variable | NUMBER) ;

// Assignments
assignment : (equals | pluseq | minuseq | multeq | diveq) ;
equals  : variable WHITESPACE* '=' WHITESPACE* (variable | NUMBER) ;
pluseq  : variable WHITESPACE* '+=' WHITESPACE* (variable | NUMBER) ;
minuseq : variable WHITESPACE* '-=' WHITESPACE* (variable | NUMBER) ;
multeq  : variable WHITESPACE* '*=' WHITESPACE* (variable | NUMBER) ;
diveq   : variable WHITESPACE* '/=' WHITESPACE* (variable | NUMBER) ;

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