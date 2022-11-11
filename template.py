# this generates a parse tree from grammar [grammarName].g4
import sys
from antlr4 import *
from ParserLibs.[grammarName]Lexer import [grammarName]Lexer
from ParserLibs.[grammarName]Parser import [grammarName]Parser

def main(argv):
    if len(sys.argv) > 1:
        input = FileStream(sys.argv[1])
    else:
        input = InputStream(sys.stdin.readline())

    lexer = [grammarName]Lexer(input)
    tokens = CommonTokenStream(lexer)
    parser = [grammarName]Parser(tokens)
    tree = parser.prog()
    print(tree.toStringTree(recog=parser))

if __name__ == '__main__':
    main(sys.argv)
