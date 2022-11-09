#!/bin/bash
rm -rf parserlibs
mkdir parserlibs
cp antlr-4.9.2-complete.jar parserlibs/antlr-4.9.2-complete.jar
cp $1 parserlibs/$1
cd parserlibs
java -jar antlr-4.9.2-complete.jar -Dlanguage=Python3 $1

