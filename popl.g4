grammar popl;

// Source: https://tomassetti.me/antlr-mega-tutorial/

/*
 *  Parser rules
 */

// program entry point
prog : (NEWLINE* codeLine WHITESPACE* (NEWLINE+ | NEWLINE* EOF))+ ;

codeLine : (ifStatement | expression | assignment | standaloneNUM | STRING | conditional | forLoop) ;

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

// Conditionals
conditional : (NOT WHITESPACE)? (standaloneNUM | variable | STRING | expression) ((WHITESPACE* CONDITION (WHITESPACE NOT)? WHITESPACE*) (standaloneNUM | variable | STRING | expression))* ;

ifStatement : IF ifBody ;
elseIfStatement : NEWLINE ELSEIF ifBody ;
ifBody : WHITESPACE conditional+ WHITESPACE* COLON WHITESPACE* (NEWLINE WHITESPACE codeLine)+ (elseIfStatement | elseStatement)? ;
elseStatement : NEWLINE ELSE WHITESPACE* COLON WHITESPACE* (NEWLINE WHITESPACE codeLine)+ ;

// Loops
forLoop : FOR WHITESPACE variable WHITESPACE IN WHITESPACE variable WHITESPACE* COLON WHITESPACE* forBody (elseStatement)?;
forBody : ((NEWLINE WHITESPACE codeLine)+ | NEWLINE WHITESPACE PASS) ;

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
STRING          : '"'(LETTER | WHITESPACE | NUMBER | PUNCTUATION | '\'')*'"' | '\'' (LETTER | WHITESPACE | NUMBER | PUNCTUATION)* '\''; 
BOOL            : 'True' | 'False' ;
CONDITION       : '<' | '>' | '<=' | '>=' | '==' | '!=' | 'and' | 'or' ;
NOT             : 'not' ;
IF              : 'if' ;
ELSE            : 'else' ;
ELSEIF          : 'elif' ;
FOR             : 'for' ;
IN              : 'in' ;
PASS            : 'pass' ;
COLON           : [:] ;
PUNCTUATION     : '?' | '!' | '.' | ':' | ';' | ',' | '{' | '}' | '(' | ')' | '[' | ']' | '|' | '/' | '\\' ;

// Rules for variable naming
VARNAME         : LETTER (LETTER | DIGIT)* ;
LETTER          : (LOWER | UPPER | '_') ;

NEWLINE         : [\r\n]+ ;
WHITESPACE      : (SPACE | TAB)+ ;
SPACE           : [ ] ;
TAB             : [\t] ;
