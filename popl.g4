grammar popl;

// Source: https://tomassetti.me/antlr-mega-tutorial/

/*
 *  Parser rules
 */

// program entry point
prog : (expression NEWLINE)+;

// Requirements for variable names
variable : VARNAME ;

// Expressions such as arithmatic, assignments, etc
expression : (assignment);

// Assignments
assignment : (equals | pluseq | minuseq | multeq | diveq);
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

NUMBER          : DIGIT+ ;

// Rules for variable naming
LETTER          : (LOWER | UPPER | '_') ;
VARNAME         : LETTER (LETTER | DIGIT)* ;

NEWLINE         : [\r\n]+ ;
WHITESPACE      : [ ]+ ;