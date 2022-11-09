#!/bin/bash
ANTLR="antlr-4.11.1-complete.jar"
rm -rf parserlibs
mkdir parserlibs
cp $ANTLR parserlibs/$ANTLR
cp $1 parserlibs/$1
cd parserlibs
java -jar $ANTLR -Dlanguage=Python3 $1
