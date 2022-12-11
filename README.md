# poplFinalProject
Final Project for CS 4450 - Principles of Programming Languages

University of Missouri, Section 01, Fall Semester 2022. Instructor: Dr. Ekincan Ufuktepe

GitHub Repo Link: [https://github.com/MCLusardi/poplFinalProject](https://github.com/MCLusardi/poplFinalProject)

## Description
This tool and grammar can parse many basic elements of Python syntax and generate a parse tree of them. The elements it parses include:
- Arithmetic operations
- Assignment operations
- Variables
- Comments
- for and while loops
- if statements
- Function definitions and calls

This tool also provides the option to visualize the parse tree output in a GUI format.

This parser was implemented using the ANTLR framework and the Python language. The lexer and parser rules were written using Context-Free Grammars.

Using the `-gui` option when generating a parse tree will output a graphical representation of the parse tree as a png in the `doctest-output` directory.

## Suggested Usage
1. Run `chmod +x *.sh` in order to make the bash scripts executable
2. Run `./setup.sh` to make sure the necessary dependencies are installed
3. Run `./gen.sh popl.g4` to generate the lexer and parser code from ANTLR
4. Run `python3 parserpopl.py [-gui] [python file name]` to parse the given input file. Alternatively, do not specify an input file and input python code into the terminal directly

## General Usage
1. Run `chmod +x *.sh` in order to make the bash scripts executable
2. Run `./setup.sh` to make sure the necessary dependencies are installed
3. Run `./gen.sh [grammar name].g4` to generate the lexer and parser code from ANTLR
4. Run `python3 parser[grammar name].py [-gui] [language file name]` to parse the given input file. Alternatively, do not specify an input file and input the code for the language generated from the grammar into the terminal directly

## Team Members
- Stuart Aldrich
- Mason Fleck
- Tim Glavan
- Maria Lusardi
- Erika Zhou
