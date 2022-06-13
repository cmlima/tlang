!#/usr/bin/env sh

# Gera os analisadores léxico e sintático a partir da gramática
clear
cd ..
# Gerando lexer e parser no diretório src/antlr
java -jar lib/antlr-4.10.1-complete.jar -package antlr -o src/antlr -Xexact-output-dir src/gram/*.g4
# Compilando lexer e parser
javac -cp .:lib/antlr-4.10.1-complete.jar src/antlr/*.java
cd scripts
