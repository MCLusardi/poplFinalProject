# this generates a parse tree from grammar popl.g4
import sys
from antlr4 import *
from ParserLibs.poplLexer import poplLexer
from ParserLibs.poplParser import poplParser

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

