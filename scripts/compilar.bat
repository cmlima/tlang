:: Traduz o código .tlang para .java
cls
IF EXIST ..\test\Codigo.java DEL /F ..\test\Codigo.java
cd ..\src
javac -cp .;..\lib\antlr-4.10.1-complete.jar *.java
::java StreamReader < ..\test\teste.tlang > ..\test\Codigo.java
java FileReader > ..\test\Codigo.java
cd ..\scripts
