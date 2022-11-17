# poplFinalProject
Final Project for CS 4450 - Principles of Programming Languages

University of Missouri, Section 01, Fall Semester 2022. Instructor: Dr. Ekincan Ufuktepe

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