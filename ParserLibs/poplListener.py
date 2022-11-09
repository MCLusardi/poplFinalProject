# Generated from popl.g4 by ANTLR 4.11.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .poplParser import poplParser
else:
    from poplParser import poplParser

# This class defines a complete listener for a parse tree produced by poplParser.
class poplListener(ParseTreeListener):

    # Enter a parse tree produced by poplParser#prog.
    def enterProg(self, ctx:poplParser.ProgContext):
        pass

    # Exit a parse tree produced by poplParser#prog.
    def exitProg(self, ctx:poplParser.ProgContext):
        pass


    # Enter a parse tree produced by poplParser#variable.
    def enterVariable(self, ctx:poplParser.VariableContext):
        pass

    # Exit a parse tree produced by poplParser#variable.
    def exitVariable(self, ctx:poplParser.VariableContext):
        pass


    # Enter a parse tree produced by poplParser#expression.
    def enterExpression(self, ctx:poplParser.ExpressionContext):
        pass

    # Exit a parse tree produced by poplParser#expression.
    def exitExpression(self, ctx:poplParser.ExpressionContext):
        pass


    # Enter a parse tree produced by poplParser#arithmetic.
    def enterArithmetic(self, ctx:poplParser.ArithmeticContext):
        pass

    # Exit a parse tree produced by poplParser#arithmetic.
    def exitArithmetic(self, ctx:poplParser.ArithmeticContext):
        pass


    # Enter a parse tree produced by poplParser#plus.
    def enterPlus(self, ctx:poplParser.PlusContext):
        pass

    # Exit a parse tree produced by poplParser#plus.
    def exitPlus(self, ctx:poplParser.PlusContext):
        pass


    # Enter a parse tree produced by poplParser#minus.
    def enterMinus(self, ctx:poplParser.MinusContext):
        pass

    # Exit a parse tree produced by poplParser#minus.
    def exitMinus(self, ctx:poplParser.MinusContext):
        pass


    # Enter a parse tree produced by poplParser#mult.
    def enterMult(self, ctx:poplParser.MultContext):
        pass

    # Exit a parse tree produced by poplParser#mult.
    def exitMult(self, ctx:poplParser.MultContext):
        pass


    # Enter a parse tree produced by poplParser#div.
    def enterDiv(self, ctx:poplParser.DivContext):
        pass

    # Exit a parse tree produced by poplParser#div.
    def exitDiv(self, ctx:poplParser.DivContext):
        pass


    # Enter a parse tree produced by poplParser#mod.
    def enterMod(self, ctx:poplParser.ModContext):
        pass

    # Exit a parse tree produced by poplParser#mod.
    def exitMod(self, ctx:poplParser.ModContext):
        pass


    # Enter a parse tree produced by poplParser#assignment.
    def enterAssignment(self, ctx:poplParser.AssignmentContext):
        pass

    # Exit a parse tree produced by poplParser#assignment.
    def exitAssignment(self, ctx:poplParser.AssignmentContext):
        pass


    # Enter a parse tree produced by poplParser#equals.
    def enterEquals(self, ctx:poplParser.EqualsContext):
        pass

    # Exit a parse tree produced by poplParser#equals.
    def exitEquals(self, ctx:poplParser.EqualsContext):
        pass


    # Enter a parse tree produced by poplParser#pluseq.
    def enterPluseq(self, ctx:poplParser.PluseqContext):
        pass

    # Exit a parse tree produced by poplParser#pluseq.
    def exitPluseq(self, ctx:poplParser.PluseqContext):
        pass


    # Enter a parse tree produced by poplParser#minuseq.
    def enterMinuseq(self, ctx:poplParser.MinuseqContext):
        pass

    # Exit a parse tree produced by poplParser#minuseq.
    def exitMinuseq(self, ctx:poplParser.MinuseqContext):
        pass


    # Enter a parse tree produced by poplParser#multeq.
    def enterMulteq(self, ctx:poplParser.MulteqContext):
        pass

    # Exit a parse tree produced by poplParser#multeq.
    def exitMulteq(self, ctx:poplParser.MulteqContext):
        pass


    # Enter a parse tree produced by poplParser#diveq.
    def enterDiveq(self, ctx:poplParser.DiveqContext):
        pass

    # Exit a parse tree produced by poplParser#diveq.
    def exitDiveq(self, ctx:poplParser.DiveqContext):
        pass



del poplParser