!#/usr/bin/env sh

# Inicia o antlr4, que passa a estar disponível
# para os outros scripts
clear
# para permitir definir aliases pelo script
# ver: https://stackoverflow.com/questions/2197461/how-to-set-an-alias-inside-a-bash-shell-script-so-that-is-it-visible-from-the-ou
shopt -s expand_aliases
cd ..
export CLASSPATH="$( pwd; )/lib/antlr-4.10.1-complete.jar:$CLASSPATH"
alias antlr4='java -Xmx500M -cp "$( pwd; )/lib/antlr-4.10.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
alias grun='java -Xmx500M -cp "$( pwd; )/lib/antlr-4.10.1-complete.jar:$CLASSPATH" org.antlr.v4.gui.TestRig'
cd scripts
# apenas para ver ser está funcionando
antlr4
grun
