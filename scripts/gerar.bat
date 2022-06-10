cls
chcp 65001
cd ..
java -jar lib\antlr-4.10.1-complete.jar -package antlr -o src\antlr -Xexact-output-dir src\gram\*.g4
javac -cp .;lib\antlr-4.10.1-complete.jar src\antlr\*.java
cd scripts
