grammar popl;

// Source: https://tomassetti.me/antlr-mega-tutorial/

/*
 *  Parser rules
 */

// program entry point
prog : (NEWLINE* codeLine WHITESPACE* (NEWLINE+ | NEWLINE* EOF))+ ;

codeLine : (ifStatement | expression | assignment | standaloneNUM | STRING | conditional | commentline ) ;

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
assignment : variable WHITESPACE* assignmentOp WHITESPACE* (expression | standaloneNUM | STRING | LIST) ;
assignmentOp : ('=' | '+=' | '-=' | '*=' | '/=') ;

// Conditionals
conditional : (NOT WHITESPACE)? (standaloneNUM | variable | STRING) ((WHITESPACE* CONDITION (WHITESPACE NOT)? WHITESPACE*) (standaloneNUM | variable | STRING))* ;

ifStatement : IF ifBody ;
elseIfStatement : NEWLINE ELSEIF ifBody ;
ifBody : WHITESPACE conditional+ WHITESPACE* COLON WHITESPACE* (NEWLINE WHITESPACE codeLine)+ (elseIfStatement | elseStatement)? ;
elseStatement : NEWLINE ELSE WHITESPACE* COLON WHITESPACE* (NEWLINE WHITESPACE codeLine)+ ;

commentline : COMMENT | BLOCKCOMMENT ;



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
CONDITION       : '<' | '>' | '<=' | '>=' | '==' | '!=' | 'and' | 'or' ;
NOT             : 'not' ;
IF              : 'if' ;
ELSE            : 'else' ;
ELSEIF          : 'elif' ;
COLON           : [:] ;
COMMENT         : '#' ~[\f\n\r]*;
BLOCKCOMMENT    : '"""' ~[\\]* '"""' | '\'\'\'' ~[\\]* '\'\'\'';
LIST            : EMPTYLIST | NONEMPTYLIST ;
EMPTYLIST       : '[' WHITESPACE* ']' ;
NONEMPTYLIST      : '[' (WHITESPACE* ((MINUS*(NUMBER | DECIMAL | HEX | BOOL)) | (STRING)) WHITESPACE*) (',' WHITESPACE* ((MINUS*(NUMBER | DECIMAL | HEX | BOOL)) | (STRING)) WHITESPACE*)* ']' ;


// Rules for variable naming
VARNAME         : LETTER (LETTER | DIGIT)* ;
LETTER          : (LOWER | UPPER | '_') ;

NEWLINE         : [\r\n]+ ;
WHITESPACE      : (SPACE | TAB)+ ;
SPACE           : [ ] ;
TAB             : [\t] ;
