!#/usr/bin/env sh

# Gera árvore de derivação
clear
cd ..
java -cp src:lib/antlr-4.10.1-complete.jar org.antlr.v4.gui.TestRig antlr.TLang iniciar -gui < test/$1.tlang
cd scripts
