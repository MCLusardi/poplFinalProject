grammar popl;

// Source: https://tomassetti.me/antlr-mega-tutorial/
// Indentation using this plugin: https://github.com/yshavit/antlr-denter

tokens { INDENT, DEDENT }

@lexer::header {
from antlr_denter.DenterHelper import DenterHelper
from ParserLibs.poplParser import poplParser
}

@lexer::members {
class poplDenter(DenterHelper):
    def __init__(self, lexer, nl_token, indent_token, dedent_token, ignore_eof):
        super().__init__(nl_token, indent_token, dedent_token, ignore_eof)
        self.lexer: poplLexer = lexer

    def pull_token(self):
        return super(poplLexer, self.lexer).nextToken()

denter = None

def nextToken(self):
    if not self.denter:
        self.denter = self.poplDenter(self, self.NL, poplParser.INDENT, poplParser.DEDENT, False)
    return self.denter.next_token()
}

/*
 *  Parser rules
 */

// program entry point
prog : (codeLine)+ ;

codeLine : (ifStatement | expression | assignment | standaloneNUM | STRING | conditional) WHITESPACE* NL*;

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
conditional : (NOT WHITESPACE)? (standaloneNUM | variable | STRING) ((WHITESPACE* CONDITION (WHITESPACE NOT)? WHITESPACE*) (standaloneNUM | variable | STRING))* ;

ifStatement : IF ifBody ;
elseIfStatement : ELSEIF ifBody ;
ifBody : WHITESPACE conditional+ WHITESPACE* COLON WHITESPACE* block (elseIfStatement | elseStatement)? ;
elseStatement : ELSE WHITESPACE* COLON WHITESPACE* block ;

block : INDENT codeLine+ DEDENT ;

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

// Rules for variable naming
VARNAME         : LETTER (LETTER | DIGIT)* ;
LETTER          : (LOWER | UPPER | '_') ;

NL              : ('\r'? '\n' ' '*) | ('\r'? '\n' '\t'*) ;
// NEWLINE         : [\r\n]+ ;
WHITESPACE      : (SPACE | TAB)+ ;
SPACE           : [ ] ;
TAB             : [\t] ;
