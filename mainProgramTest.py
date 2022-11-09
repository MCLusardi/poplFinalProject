import sys
from antlr4 import *
from parserlibs.TestLexer import TestLexer
from parserlibs.TestParser import TestParser

def main(argv):
    if len(sys.argv) > 1:
        input = FileStream(sys.argv[1])
    else:
        input = InputStream(sys.stdin.readline())

    lexer = TestLexer(input)
    tokens = CommonTokenStream(lexer)
    parser = TestParser(tokens)
    tree = parser.prog()
    print(tree.toStringTree(recog=parser))

if __name__ == '__main__':
    main(sys.argv)

