# this generates a parse tree from grammar [grammarName].g4
import sys
import pathlib
from antlr4 import *
from antlr4._pygrun import beautify_lisp_string
from antlr4_tool_runner import *
from ParserLibs.[grammarName]Lexer import [grammarName]Lexer
from ParserLibs.[grammarName]Parser import [grammarName]Parser
import graphviz
from antlr4.tree.Tree import *
from antlr4.Utils import escapeWhitespace
from antlr4.tree.Trees import *

def traverse(tree, parser, g, pid):
    # from antlr4/antlr/tree/Trees.py
    txt = escapeWhitespace(Trees.getNodeText(t=tree, recog=parser), False)

    tid = str(id(tree))
    g.node(tid, txt)
    if pid != None:
        g.edge(pid, tid)

    if isinstance(tree, TerminalNodeImpl):
        return

    children = tree.getChildren()
    for c in children:
        traverse(c, parser, g, tid)
    
def createGraph(tree, parser):
    # following graphviz python docs tutorial
    g = graphviz.Graph('parse tree')
    traverse(tree, parser, g, None)
    g.render(format='png', directory='doctest-output').replace('\\', '/')

def main(argv):
    gui = False
    fileIndex = 0
    tmpFilePath = Path("tmpFile.py")

    if len(sys.argv) == 1:
        print("Type your python code here:\n")
        input = InputStream(sys.stdin.readline())
    
    elif len(sys.argv) == 2:
        if sys.argv[1] == '-gui':
            gui = True
            f = open(str(tmpFilePath), "w+")
            print("Type your python code here:\n")
            input = InputStream(sys.stdin.readline())
            f.write(str(input))
            f.close()
            fileIndex = -1
        else:
            input = FileStream(sys.argv[1])
        
    elif len(sys.argv) == 3:
        if '-gui' in sys.argv:
            gui = True
            if sys.argv[1] == '-gui':
                fileIndex = 2
            else:
                fileIndex = 1
            input = FileStream(sys.argv[fileIndex])

        else:
            raise Exception("Unexpected number of input parameters")

    else:
        raise Exception("Unexpected number of input parameters")


    lexer = [grammarName]Lexer(input)
    tokens = CommonTokenStream(lexer)
    parser = [grammarName]Parser(tokens)
    tree = parser.prog()
    print(beautify_lisp_string(tree.toStringTree(recog=parser)))

    if gui:
        createGraph(tree, parser)
    
    if tmpFilePath.exists():
        tmpFilePath.unlink()

if __name__ == '__main__':
    main(sys.argv)
