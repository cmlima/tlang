!#/usr/bin/env sh

# Traduz o código .tlang para .java
clear
rm -f ../test/*.java
rm -f ../test/*.class

cd ../src
javac -cp .:../lib/antlr-4.10.1-complete.jar *.java
java -cp .:../lib/antlr-4.10.1-complete.jar FileReader $1.tlang
cd ../scripts
