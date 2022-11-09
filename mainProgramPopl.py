import sys
from antlr4 import *
from parserlibs.poplLexer import poplLexer
from parserlibs.poplParser import poplParser

def main(argv):
    if len(sys.argv) > 1:
        input = FileStream(sys.argv[1])
    else:
        input = InputStream(sys.stdin.readline())

    lexer = poplLexer(input)
    tokens = CommonTokenStream(lexer)
    parser = poplParser(tokens)
    tree = parser.prog()
    print(tree.toStringTree(recog=parser))

if __name__ == '__main__':
    main(sys.argv)

