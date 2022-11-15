grammar popl;

// Source: https://tomassetti.me/antlr-mega-tutorial/

/*
 *  Parser rules
 */

// program entry point
prog : ((expression | assignment | standaloneNUM | STRING) (NEWLINE+ | NEWLINE* EOF))+ ;

// Requirements for variable names
variable : VARNAME ;

// Expressions such as arithmetic, assignments, etc
expression : (unaryMinus| arithmetic | concatenation) ; 
standaloneNUM : (variable | NUMBER | DECIMAL | HEX | BOOL) ; 

// Arithmetic Operators
arithmetic : (unaryMinus | standaloneNUM) (WHITESPACE* arithmeticOp WHITESPACE* (unaryMinus | standaloneNUM))+ ;
arithmeticOp : ('+' | '-' | '*' | '/' | '%') ;
concatenation   : (STRING | variable) ((WHITESPACE* '+' WHITESPACE*) (STRING | variable))+ ;
unaryMinus : MINUS (standaloneNUM ) ;

// Assignments
assignment : variable WHITESPACE* assignmentOp WHITESPACE* (expression | standaloneNUM | STRING) ;
assignmentOp : ('=' | '+=' | '-=' | '*=' | '/=') ;



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
CONDITION       : '=' | '<' | '>' | '<=' | '>=' | '==' | '!=' | 'and' | 'or' ;
NOT             : 'not' ;

// Rules for variable naming
LETTER          : (LOWER | UPPER | '_') ;
VARNAME         : LETTER (LETTER | DIGIT)* ;

NEWLINE         : [\r\n]+ ;
WHITESPACE      : [ ]+ ;
TAB             : [\t] ;
