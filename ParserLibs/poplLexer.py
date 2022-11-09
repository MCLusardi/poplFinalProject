# Generated from popl.g4 by ANTLR 4.11.1
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


def serializedATN():
    return [
        4,0,10,75,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,
        6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,1,0,
        1,0,1,1,1,1,1,1,1,2,1,2,1,2,1,3,1,3,1,3,1,4,1,4,1,4,1,5,1,5,1,6,
        1,6,1,7,1,7,1,8,4,8,49,8,8,11,8,12,8,50,1,9,1,9,1,9,3,9,56,8,9,1,
        10,1,10,1,10,5,10,61,8,10,10,10,12,10,64,9,10,1,11,4,11,67,8,11,
        11,11,12,11,68,1,12,4,12,72,8,12,11,12,12,12,73,0,0,13,1,1,3,2,5,
        3,7,4,9,5,11,0,13,0,15,0,17,6,19,7,21,8,23,9,25,10,1,0,5,1,0,97,
        122,1,0,65,90,1,0,48,57,2,0,10,10,13,13,1,0,32,32,78,0,1,1,0,0,0,
        0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,17,1,0,0,0,0,19,
        1,0,0,0,0,21,1,0,0,0,0,23,1,0,0,0,0,25,1,0,0,0,1,27,1,0,0,0,3,29,
        1,0,0,0,5,32,1,0,0,0,7,35,1,0,0,0,9,38,1,0,0,0,11,41,1,0,0,0,13,
        43,1,0,0,0,15,45,1,0,0,0,17,48,1,0,0,0,19,55,1,0,0,0,21,57,1,0,0,
        0,23,66,1,0,0,0,25,71,1,0,0,0,27,28,5,61,0,0,28,2,1,0,0,0,29,30,
        5,43,0,0,30,31,5,61,0,0,31,4,1,0,0,0,32,33,5,45,0,0,33,34,5,61,0,
        0,34,6,1,0,0,0,35,36,5,42,0,0,36,37,5,61,0,0,37,8,1,0,0,0,38,39,
        5,47,0,0,39,40,5,61,0,0,40,10,1,0,0,0,41,42,7,0,0,0,42,12,1,0,0,
        0,43,44,7,1,0,0,44,14,1,0,0,0,45,46,7,2,0,0,46,16,1,0,0,0,47,49,
        3,15,7,0,48,47,1,0,0,0,49,50,1,0,0,0,50,48,1,0,0,0,50,51,1,0,0,0,
        51,18,1,0,0,0,52,56,3,11,5,0,53,56,3,13,6,0,54,56,5,95,0,0,55,52,
        1,0,0,0,55,53,1,0,0,0,55,54,1,0,0,0,56,20,1,0,0,0,57,62,3,19,9,0,
        58,61,3,19,9,0,59,61,3,15,7,0,60,58,1,0,0,0,60,59,1,0,0,0,61,64,
        1,0,0,0,62,60,1,0,0,0,62,63,1,0,0,0,63,22,1,0,0,0,64,62,1,0,0,0,
        65,67,7,3,0,0,66,65,1,0,0,0,67,68,1,0,0,0,68,66,1,0,0,0,68,69,1,
        0,0,0,69,24,1,0,0,0,70,72,7,4,0,0,71,70,1,0,0,0,72,73,1,0,0,0,73,
        71,1,0,0,0,73,74,1,0,0,0,74,26,1,0,0,0,7,0,50,55,60,62,68,73,0
    ]

class poplLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    T__2 = 3
    T__3 = 4
    T__4 = 5
    NUMBER = 6
    LETTER = 7
    VARNAME = 8
    NEWLINE = 9
    WHITESPACE = 10

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'='", "'+='", "'-='", "'*='", "'/='" ]

    symbolicNames = [ "<INVALID>",
            "NUMBER", "LETTER", "VARNAME", "NEWLINE", "WHITESPACE" ]

    ruleNames = [ "T__0", "T__1", "T__2", "T__3", "T__4", "LOWER", "UPPER", 
                  "DIGIT", "NUMBER", "LETTER", "VARNAME", "NEWLINE", "WHITESPACE" ]

    grammarFileName = "popl.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.11.1")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None

