# this generates a parse tree from grammar [grammarName].g4
import sys
from antlr4 import *
from antlr4._pygrun import beautify_lisp_string
from antlr4_tool_runner import *
from ParserLibs.[grammarName]Lexer import [grammarName]Lexer
from ParserLibs.[grammarName]Parser import [grammarName]Parser

def main(argv):
    gui = False
    if len(sys.argv) > 1:
        if sys.argv[1] == '-gui':
            gui = True
            if len(sys.argv) == 2:
                raise Exception('Input file is required with -gui option')
            elif len(sys.argv) == 3:
                input = FileStream(sys.argv[2])
            else:
                raise Exception("Unexpected number of input parameters")
        else:
            input = FileStream(sys.argv[1])
    else:
        input = InputStream(sys.stdin.readline())

    lexer = [grammarName]Lexer(input)
    tokens = CommonTokenStream(lexer)
    parser = [grammarName]Parser(tokens)
    tree = parser.prog()
    print(beautify_lisp_string(tree.toStringTree(recog=parser)))

    if gui:
        # I hate this method with a passion but antlr-tools is bases everything off sys.argv
        sys.argv = ['antlr4-parse', '[grammarName].g4', 'prog', '-gui', sys.argv[2]]
        interp()

if __name__ == '__main__':
    main(sys.argv)
