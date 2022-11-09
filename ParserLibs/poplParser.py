# Generated from popl.g4 by ANTLR 4.11.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,10,127,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,1,0,1,0,1,0,4,0,22,8,0,11,0,12,0,23,1,1,1,1,1,
        2,1,2,1,3,1,3,1,3,1,3,1,3,3,3,35,8,3,1,4,1,4,5,4,39,8,4,10,4,12,
        4,42,9,4,1,4,1,4,5,4,46,8,4,10,4,12,4,49,9,4,1,4,1,4,3,4,53,8,4,
        1,5,1,5,5,5,57,8,5,10,5,12,5,60,9,5,1,5,1,5,5,5,64,8,5,10,5,12,5,
        67,9,5,1,5,1,5,3,5,71,8,5,1,6,1,6,5,6,75,8,6,10,6,12,6,78,9,6,1,
        6,1,6,5,6,82,8,6,10,6,12,6,85,9,6,1,6,1,6,3,6,89,8,6,1,7,1,7,5,7,
        93,8,7,10,7,12,7,96,9,7,1,7,1,7,5,7,100,8,7,10,7,12,7,103,9,7,1,
        7,1,7,3,7,107,8,7,1,8,1,8,5,8,111,8,8,10,8,12,8,114,9,8,1,8,1,8,
        5,8,118,8,8,10,8,12,8,121,9,8,1,8,1,8,3,8,125,8,8,1,8,0,0,9,0,2,
        4,6,8,10,12,14,16,0,0,137,0,21,1,0,0,0,2,25,1,0,0,0,4,27,1,0,0,0,
        6,34,1,0,0,0,8,36,1,0,0,0,10,54,1,0,0,0,12,72,1,0,0,0,14,90,1,0,
        0,0,16,108,1,0,0,0,18,19,3,4,2,0,19,20,5,9,0,0,20,22,1,0,0,0,21,
        18,1,0,0,0,22,23,1,0,0,0,23,21,1,0,0,0,23,24,1,0,0,0,24,1,1,0,0,
        0,25,26,5,8,0,0,26,3,1,0,0,0,27,28,3,6,3,0,28,5,1,0,0,0,29,35,3,
        8,4,0,30,35,3,10,5,0,31,35,3,12,6,0,32,35,3,14,7,0,33,35,3,16,8,
        0,34,29,1,0,0,0,34,30,1,0,0,0,34,31,1,0,0,0,34,32,1,0,0,0,34,33,
        1,0,0,0,35,7,1,0,0,0,36,40,3,2,1,0,37,39,5,10,0,0,38,37,1,0,0,0,
        39,42,1,0,0,0,40,38,1,0,0,0,40,41,1,0,0,0,41,43,1,0,0,0,42,40,1,
        0,0,0,43,47,5,1,0,0,44,46,5,10,0,0,45,44,1,0,0,0,46,49,1,0,0,0,47,
        45,1,0,0,0,47,48,1,0,0,0,48,52,1,0,0,0,49,47,1,0,0,0,50,53,3,2,1,
        0,51,53,5,6,0,0,52,50,1,0,0,0,52,51,1,0,0,0,53,9,1,0,0,0,54,58,3,
        2,1,0,55,57,5,10,0,0,56,55,1,0,0,0,57,60,1,0,0,0,58,56,1,0,0,0,58,
        59,1,0,0,0,59,61,1,0,0,0,60,58,1,0,0,0,61,65,5,2,0,0,62,64,5,10,
        0,0,63,62,1,0,0,0,64,67,1,0,0,0,65,63,1,0,0,0,65,66,1,0,0,0,66,70,
        1,0,0,0,67,65,1,0,0,0,68,71,3,2,1,0,69,71,5,6,0,0,70,68,1,0,0,0,
        70,69,1,0,0,0,71,11,1,0,0,0,72,76,3,2,1,0,73,75,5,10,0,0,74,73,1,
        0,0,0,75,78,1,0,0,0,76,74,1,0,0,0,76,77,1,0,0,0,77,79,1,0,0,0,78,
        76,1,0,0,0,79,83,5,3,0,0,80,82,5,10,0,0,81,80,1,0,0,0,82,85,1,0,
        0,0,83,81,1,0,0,0,83,84,1,0,0,0,84,88,1,0,0,0,85,83,1,0,0,0,86,89,
        3,2,1,0,87,89,5,6,0,0,88,86,1,0,0,0,88,87,1,0,0,0,89,13,1,0,0,0,
        90,94,3,2,1,0,91,93,5,10,0,0,92,91,1,0,0,0,93,96,1,0,0,0,94,92,1,
        0,0,0,94,95,1,0,0,0,95,97,1,0,0,0,96,94,1,0,0,0,97,101,5,4,0,0,98,
        100,5,10,0,0,99,98,1,0,0,0,100,103,1,0,0,0,101,99,1,0,0,0,101,102,
        1,0,0,0,102,106,1,0,0,0,103,101,1,0,0,0,104,107,3,2,1,0,105,107,
        5,6,0,0,106,104,1,0,0,0,106,105,1,0,0,0,107,15,1,0,0,0,108,112,3,
        2,1,0,109,111,5,10,0,0,110,109,1,0,0,0,111,114,1,0,0,0,112,110,1,
        0,0,0,112,113,1,0,0,0,113,115,1,0,0,0,114,112,1,0,0,0,115,119,5,
        5,0,0,116,118,5,10,0,0,117,116,1,0,0,0,118,121,1,0,0,0,119,117,1,
        0,0,0,119,120,1,0,0,0,120,124,1,0,0,0,121,119,1,0,0,0,122,125,3,
        2,1,0,123,125,5,6,0,0,124,122,1,0,0,0,124,123,1,0,0,0,125,17,1,0,
        0,0,17,23,34,40,47,52,58,65,70,76,83,88,94,101,106,112,119,124
    ]

class poplParser ( Parser ):

    grammarFileName = "popl.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'='", "'+='", "'-='", "'*='", "'/='" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "NUMBER", "LETTER", "VARNAME", 
                      "NEWLINE", "WHITESPACE" ]

    RULE_prog = 0
    RULE_variable = 1
    RULE_expression = 2
    RULE_assignment = 3
    RULE_equals = 4
    RULE_pluseq = 5
    RULE_minuseq = 6
    RULE_multeq = 7
    RULE_diveq = 8

    ruleNames =  [ "prog", "variable", "expression", "assignment", "equals", 
                   "pluseq", "minuseq", "multeq", "diveq" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    NUMBER=6
    LETTER=7
    VARNAME=8
    NEWLINE=9
    WHITESPACE=10

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.11.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(poplParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(poplParser.ExpressionContext,i)


        def NEWLINE(self, i:int=None):
            if i is None:
                return self.getTokens(poplParser.NEWLINE)
            else:
                return self.getToken(poplParser.NEWLINE, i)

        def getRuleIndex(self):
            return poplParser.RULE_prog

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProg" ):
                listener.enterProg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProg" ):
                listener.exitProg(self)




    def prog(self):

        localctx = poplParser.ProgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_prog)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 21 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 18
                self.expression()
                self.state = 19
                self.match(poplParser.NEWLINE)
                self.state = 23 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==8):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VariableContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VARNAME(self):
            return self.getToken(poplParser.VARNAME, 0)

        def getRuleIndex(self):
            return poplParser.RULE_variable

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVariable" ):
                listener.enterVariable(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVariable" ):
                listener.exitVariable(self)




    def variable(self):

        localctx = poplParser.VariableContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_variable)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 25
            self.match(poplParser.VARNAME)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def assignment(self):
            return self.getTypedRuleContext(poplParser.AssignmentContext,0)


        def getRuleIndex(self):
            return poplParser.RULE_expression

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpression" ):
                listener.enterExpression(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpression" ):
                listener.exitExpression(self)




    def expression(self):

        localctx = poplParser.ExpressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_expression)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 27
            self.assignment()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssignmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def equals(self):
            return self.getTypedRuleContext(poplParser.EqualsContext,0)


        def pluseq(self):
            return self.getTypedRuleContext(poplParser.PluseqContext,0)


        def minuseq(self):
            return self.getTypedRuleContext(poplParser.MinuseqContext,0)


        def multeq(self):
            return self.getTypedRuleContext(poplParser.MulteqContext,0)


        def diveq(self):
            return self.getTypedRuleContext(poplParser.DiveqContext,0)


        def getRuleIndex(self):
            return poplParser.RULE_assignment

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssignment" ):
                listener.enterAssignment(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssignment" ):
                listener.exitAssignment(self)




    def assignment(self):

        localctx = poplParser.AssignmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_assignment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 34
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
            if la_ == 1:
                self.state = 29
                self.equals()
                pass

            elif la_ == 2:
                self.state = 30
                self.pluseq()
                pass

            elif la_ == 3:
                self.state = 31
                self.minuseq()
                pass

            elif la_ == 4:
                self.state = 32
                self.multeq()
                pass

            elif la_ == 5:
                self.state = 33
                self.diveq()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class EqualsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def variable(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(poplParser.VariableContext)
            else:
                return self.getTypedRuleContext(poplParser.VariableContext,i)


        def NUMBER(self):
            return self.getToken(poplParser.NUMBER, 0)

        def WHITESPACE(self, i:int=None):
            if i is None:
                return self.getTokens(poplParser.WHITESPACE)
            else:
                return self.getToken(poplParser.WHITESPACE, i)

        def getRuleIndex(self):
            return poplParser.RULE_equals

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEquals" ):
                listener.enterEquals(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEquals" ):
                listener.exitEquals(self)




    def equals(self):

        localctx = poplParser.EqualsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_equals)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 36
            self.variable()
            self.state = 40
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==10:
                self.state = 37
                self.match(poplParser.WHITESPACE)
                self.state = 42
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 43
            self.match(poplParser.T__0)
            self.state = 47
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==10:
                self.state = 44
                self.match(poplParser.WHITESPACE)
                self.state = 49
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 52
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [8]:
                self.state = 50
                self.variable()
                pass
            elif token in [6]:
                self.state = 51
                self.match(poplParser.NUMBER)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PluseqContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def variable(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(poplParser.VariableContext)
            else:
                return self.getTypedRuleContext(poplParser.VariableContext,i)


        def NUMBER(self):
            return self.getToken(poplParser.NUMBER, 0)

        def WHITESPACE(self, i:int=None):
            if i is None:
                return self.getTokens(poplParser.WHITESPACE)
            else:
                return self.getToken(poplParser.WHITESPACE, i)

        def getRuleIndex(self):
            return poplParser.RULE_pluseq

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPluseq" ):
                listener.enterPluseq(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPluseq" ):
                listener.exitPluseq(self)




    def pluseq(self):

        localctx = poplParser.PluseqContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_pluseq)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 54
            self.variable()
            self.state = 58
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==10:
                self.state = 55
                self.match(poplParser.WHITESPACE)
                self.state = 60
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 61
            self.match(poplParser.T__1)
            self.state = 65
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==10:
                self.state = 62
                self.match(poplParser.WHITESPACE)
                self.state = 67
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 70
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [8]:
                self.state = 68
                self.variable()
                pass
            elif token in [6]:
                self.state = 69
                self.match(poplParser.NUMBER)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MinuseqContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def variable(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(poplParser.VariableContext)
            else:
                return self.getTypedRuleContext(poplParser.VariableContext,i)


        def NUMBER(self):
            return self.getToken(poplParser.NUMBER, 0)

        def WHITESPACE(self, i:int=None):
            if i is None:
                return self.getTokens(poplParser.WHITESPACE)
            else:
                return self.getToken(poplParser.WHITESPACE, i)

        def getRuleIndex(self):
            return poplParser.RULE_minuseq

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMinuseq" ):
                listener.enterMinuseq(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMinuseq" ):
                listener.exitMinuseq(self)




    def minuseq(self):

        localctx = poplParser.MinuseqContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_minuseq)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 72
            self.variable()
            self.state = 76
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==10:
                self.state = 73
                self.match(poplParser.WHITESPACE)
                self.state = 78
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 79
            self.match(poplParser.T__2)
            self.state = 83
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==10:
                self.state = 80
                self.match(poplParser.WHITESPACE)
                self.state = 85
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 88
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [8]:
                self.state = 86
                self.variable()
                pass
            elif token in [6]:
                self.state = 87
                self.match(poplParser.NUMBER)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MulteqContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def variable(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(poplParser.VariableContext)
            else:
                return self.getTypedRuleContext(poplParser.VariableContext,i)


        def NUMBER(self):
            return self.getToken(poplParser.NUMBER, 0)

        def WHITESPACE(self, i:int=None):
            if i is None:
                return self.getTokens(poplParser.WHITESPACE)
            else:
                return self.getToken(poplParser.WHITESPACE, i)

        def getRuleIndex(self):
            return poplParser.RULE_multeq

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMulteq" ):
                listener.enterMulteq(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMulteq" ):
                listener.exitMulteq(self)




    def multeq(self):

        localctx = poplParser.MulteqContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_multeq)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 90
            self.variable()
            self.state = 94
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==10:
                self.state = 91
                self.match(poplParser.WHITESPACE)
                self.state = 96
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 97
            self.match(poplParser.T__3)
            self.state = 101
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==10:
                self.state = 98
                self.match(poplParser.WHITESPACE)
                self.state = 103
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 106
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [8]:
                self.state = 104
                self.variable()
                pass
            elif token in [6]:
                self.state = 105
                self.match(poplParser.NUMBER)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DiveqContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def variable(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(poplParser.VariableContext)
            else:
                return self.getTypedRuleContext(poplParser.VariableContext,i)


        def NUMBER(self):
            return self.getToken(poplParser.NUMBER, 0)

        def WHITESPACE(self, i:int=None):
            if i is None:
                return self.getTokens(poplParser.WHITESPACE)
            else:
                return self.getToken(poplParser.WHITESPACE, i)

        def getRuleIndex(self):
            return poplParser.RULE_diveq

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDiveq" ):
                listener.enterDiveq(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDiveq" ):
                listener.exitDiveq(self)




    def diveq(self):

        localctx = poplParser.DiveqContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_diveq)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 108
            self.variable()
            self.state = 112
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==10:
                self.state = 109
                self.match(poplParser.WHITESPACE)
                self.state = 114
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 115
            self.match(poplParser.T__4)
            self.state = 119
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==10:
                self.state = 116
                self.match(poplParser.WHITESPACE)
                self.state = 121
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 124
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [8]:
                self.state = 122
                self.variable()
                pass
            elif token in [6]:
                self.state = 123
                self.match(poplParser.NUMBER)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





