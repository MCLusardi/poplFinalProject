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
        4,0,15,98,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,
        6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,
        7,13,2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,1,0,1,0,1,1,1,1,1,2,
        1,2,1,3,1,3,1,4,1,4,1,5,1,5,1,6,1,6,1,6,1,7,1,7,1,7,1,8,1,8,1,8,
        1,9,1,9,1,9,1,10,1,10,1,11,1,11,1,12,1,12,1,13,3,13,69,8,13,1,13,
        4,13,72,8,13,11,13,12,13,73,1,14,1,14,1,14,3,14,79,8,14,1,15,1,15,
        1,15,5,15,84,8,15,10,15,12,15,87,9,15,1,16,4,16,90,8,16,11,16,12,
        16,91,1,17,4,17,95,8,17,11,17,12,17,96,0,0,18,1,1,3,2,5,3,7,4,9,
        5,11,6,13,7,15,8,17,9,19,10,21,0,23,0,25,0,27,11,29,12,31,13,33,
        14,35,15,1,0,6,1,0,97,122,1,0,65,90,1,0,48,57,1,0,45,45,2,0,10,10,
        13,13,1,0,32,32,102,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,
        0,0,0,9,1,0,0,0,0,11,1,0,0,0,0,13,1,0,0,0,0,15,1,0,0,0,0,17,1,0,
        0,0,0,19,1,0,0,0,0,27,1,0,0,0,0,29,1,0,0,0,0,31,1,0,0,0,0,33,1,0,
        0,0,0,35,1,0,0,0,1,37,1,0,0,0,3,39,1,0,0,0,5,41,1,0,0,0,7,43,1,0,
        0,0,9,45,1,0,0,0,11,47,1,0,0,0,13,49,1,0,0,0,15,52,1,0,0,0,17,55,
        1,0,0,0,19,58,1,0,0,0,21,61,1,0,0,0,23,63,1,0,0,0,25,65,1,0,0,0,
        27,68,1,0,0,0,29,78,1,0,0,0,31,80,1,0,0,0,33,89,1,0,0,0,35,94,1,
        0,0,0,37,38,5,43,0,0,38,2,1,0,0,0,39,40,5,45,0,0,40,4,1,0,0,0,41,
        42,5,42,0,0,42,6,1,0,0,0,43,44,5,47,0,0,44,8,1,0,0,0,45,46,5,37,
        0,0,46,10,1,0,0,0,47,48,5,61,0,0,48,12,1,0,0,0,49,50,5,43,0,0,50,
        51,5,61,0,0,51,14,1,0,0,0,52,53,5,45,0,0,53,54,5,61,0,0,54,16,1,
        0,0,0,55,56,5,42,0,0,56,57,5,61,0,0,57,18,1,0,0,0,58,59,5,47,0,0,
        59,60,5,61,0,0,60,20,1,0,0,0,61,62,7,0,0,0,62,22,1,0,0,0,63,64,7,
        1,0,0,64,24,1,0,0,0,65,66,7,2,0,0,66,26,1,0,0,0,67,69,7,3,0,0,68,
        67,1,0,0,0,68,69,1,0,0,0,69,71,1,0,0,0,70,72,3,25,12,0,71,70,1,0,
        0,0,72,73,1,0,0,0,73,71,1,0,0,0,73,74,1,0,0,0,74,28,1,0,0,0,75,79,
        3,21,10,0,76,79,3,23,11,0,77,79,5,95,0,0,78,75,1,0,0,0,78,76,1,0,
        0,0,78,77,1,0,0,0,79,30,1,0,0,0,80,85,3,29,14,0,81,84,3,29,14,0,
        82,84,3,25,12,0,83,81,1,0,0,0,83,82,1,0,0,0,84,87,1,0,0,0,85,83,
        1,0,0,0,85,86,1,0,0,0,86,32,1,0,0,0,87,85,1,0,0,0,88,90,7,4,0,0,
        89,88,1,0,0,0,90,91,1,0,0,0,91,89,1,0,0,0,91,92,1,0,0,0,92,34,1,
        0,0,0,93,95,7,5,0,0,94,93,1,0,0,0,95,96,1,0,0,0,96,94,1,0,0,0,96,
        97,1,0,0,0,97,36,1,0,0,0,8,0,68,73,78,83,85,91,96,0
    ]

class poplLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    T__2 = 3
    T__3 = 4
    T__4 = 5
    T__5 = 6
    T__6 = 7
    T__7 = 8
    T__8 = 9
    T__9 = 10
    NUMBER = 11
    LETTER = 12
    VARNAME = 13
    NEWLINE = 14
    WHITESPACE = 15

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'+='", "'-='", "'*='", 
            "'/='" ]

    symbolicNames = [ "<INVALID>",
            "NUMBER", "LETTER", "VARNAME", "NEWLINE", "WHITESPACE" ]

    ruleNames = [ "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", 
                  "T__7", "T__8", "T__9", "LOWER", "UPPER", "DIGIT", "NUMBER", 
                  "LETTER", "VARNAME", "NEWLINE", "WHITESPACE" ]

    grammarFileName = "popl.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.11.1")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


