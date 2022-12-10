#!/bin/bash 
pip install antlr4-python3-runtime
pip install antlr4-tools
pip install antlr-denter
pip install graphviz

echo "Installing Graphviz..."
# linux (debian based)
if [[ "$OSTYPE" == "linux-gnu"* ]]; then
    sudo apt-get install graphviz
# Mac OSX
elif  [[ "$OSTYPE" == "darwin"* ]]; then
    brew install graphviz
# WSL? (debain based distro)
elif [[ "$OSTYPE" == "cygwin" ]]; then
    sudo apt-get install graphviz
else
    echo "Unknown OS type. Please install Graphviz for your OS"
    echo "https://graphviz.readthedocs.io/en/stable/manual.html"
fi