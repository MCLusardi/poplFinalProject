grammar popl;

// Source: https://tomassetti.me/antlr-mega-tutorial/

//Parser rules

variable : FIRSTLETTER LETTER* ;

equals : NUMBER '=' NUMBER ;
pluseq : NUMBER '+=' NUMBER ;
minuseq : NUMBER '-=' NUMBER ;
multeq : NUMBER '*=' NUMBER ;
diveq : NUMBER '/=' NUMBER ;

//Lexer rules

fragment LOWER : [a-z] ;
fragment UPPER : [A-Z] ;
fragment DIGIT : [0-9] ;

FIRSTLETTER : (LOWER | UPPER | '_') ;
LETTER : (FIRSTLETTER | DIGIT) ;
NUMBER     : [0-9]+ ;
