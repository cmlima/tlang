:: Mesmo que o arquivo iniciar.bat, só que incluindo 
:: o path do java (na faculdade) 
cls
SET PATH=.;%ProgramFiles%\Java\jdk-13.0.1\bin;%PATH%
SET CLASSPATH=.;%cd%\antlr-4.10.1-complete.jar;%CLASSPATH%
java org.antlr.v4.Tool
