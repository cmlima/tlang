:: Executa o arquivo .java gerado a partir do código .tlang
cls
DEL /F ..\test\*.java

cd ..\src
javac -cp .;..\lib\antlr-4.10.1-complete.jar *.java
java FileReader %*.tlang

cd ../test
javac -cp . %*.java
java %*
cd ../scripts
