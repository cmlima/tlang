:: Inicia o antlr4, que passa a estar disponível
:: para os outros scripts

cls
cd ..
SET CLASSPATH=src;%cd%\lib\antlr-4.10.1-complete.jar;%CLASSPATH%
cd scripts
:: apenas para ver ser está funcionando
java org.antlr.v4.Tool
