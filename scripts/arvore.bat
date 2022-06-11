:: Gera árvore de derivação
cls
cd ..
java -cp src;lib\antlr-4.10.1-complete.jar org.antlr.v4.gui.TestRig antlr.TLang iniciar -gui < test\%*.tlang
cd scripts
