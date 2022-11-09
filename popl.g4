grammar popl;

// Source: https://tomassetti.me/antlr-mega-tutorial/

/*
 *  Parser rules
 */

// program entry point
prog : (expression NEWLINE)+;

// Requirements for variable names
variable : FIRSTLETTER LETTER* ;

// Expressions such as arithmatic, assignments, etc
expression : (assignment);

// Assignments
assignment : (equals | pluseq | minuseq | multeq | diveq);
equals  : variable '='  (variable | NUMBER) ;
pluseq  : variable '+=' (variable | NUMBER) ;
minuseq : variable '-=' (variable | NUMBER) ;
multeq  : variable '*=' (variable | NUMBER) ;
diveq   : variable '/=' (variable | NUMBER) ;

/*
 *  Lexer rules
 */

fragment LOWER  : [a-z] ;
fragment UPPER  : [A-Z] ;
fragment DIGIT  : [0-9] ;

// Rules for variable naming
FIRSTLETTER     : (LOWER | UPPER | '_') ;
LETTER          : (FIRSTLETTER | DIGIT) ;

NUMBER          : DIGIT+ ;

NEWLINE         : [\r\n]+ ;
WHITESPACE      : [ ]+ ;