grammar popl;

// Source: https://tomassetti.me/antlr-mega-tutorial/

//Parser rules

variable : FIRSTLETTER LETTER* ;

equals  : variable '='  (variable | NUMBER) ;
pluseq  : variable '+=' (variable | NUMBER) ;
minuseq : variable '-=' (variable | NUMBER) ;
multeq  : variable '*=' (variable | NUMBER) ;
diveq   : variable '/=' (variable | NUMBER) ;

//Lexer rules

fragment LOWER  : [a-z] ;
fragment UPPER  : [A-Z] ;
fragment DIGIT  : [0-9] ;

FIRSTLETTER     : (LOWER | UPPER | '_') ;
LETTER          : (FIRSTLETTER | DIGIT) ;
NUMBER          : DIGIT+ ;
