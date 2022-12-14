#!/bin/bash

# exit if no grammar file provided
if [ -z "$1" ]
    then
        echo "No grammar file supplied"
        echo "Suggested usage:"
        echo "./gen.sh popl.g4"
        exit 1
fi

# keep this updated to current antlr version
ANTLR="antlr-4.11.1-complete.jar"

# delete old parser files
rm -rf ParserLibs
rm parser*.py

# generate parser program (do this before the libraries so we don't have to cd twice)
grammarName=$(basename $1 .g4)
sed "s/\[grammarName\]/$grammarName/g" template.py > parser$grammarName.py

# setup parser environment 
mkdir ParserLibs
cp $ANTLR ParserLibs/$ANTLR
cp $1 ParserLibs/$1
cd ParserLibs

# have antlr generate the parser
java -jar $ANTLR -Dlanguage=Python3 $1

# removed extra file so people don't edit it
rm $1

echo "Call \"python3 parser$grammarName.py [python file]\" to use the generated parser"
