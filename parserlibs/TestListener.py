# Generated from Test.g4 by ANTLR 4.11.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .TestParser import TestParser
else:
    from TestParser import TestParser

# This class defines a complete listener for a parse tree produced by TestParser.
class TestListener(ParseTreeListener):

    # Enter a parse tree produced by TestParser#prog.
    def enterProg(self, ctx:TestParser.ProgContext):
        pass

    # Exit a parse tree produced by TestParser#prog.
    def exitProg(self, ctx:TestParser.ProgContext):
        pass


    # Enter a parse tree produced by TestParser#expr.
    def enterExpr(self, ctx:TestParser.ExprContext):
        pass

    # Exit a parse tree produced by TestParser#expr.
    def exitExpr(self, ctx:TestParser.ExprContext):
        pass



del TestParser