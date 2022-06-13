!#/usr/bin/env sh

# Executa o arquivo .java gerado a partir do código .tlang
clear
./compilar.sh $1 
cd ../test
javac -cp . $1.java
java -cp . $1
cd ../scripts
