grammar popl;

//Parser rules

variable : FIRSTLETTER LETTER* ;

//Lexer rules

fragment LOWER : [a-z] ;
fragment UPPER : [A-Z] ;
fragment DIGIT : [0-9] ;

FIRSTLETTER : (LOWER | UPPER | '_') ;
LETTER : (FIRSTLETTER | DIGIT) ;