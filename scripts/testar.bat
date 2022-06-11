:: Executa o arquivo .java gerado a partir do código .tlang
cls
cd ../test
javac -cp . %*.java
java %*
cd ../scripts
