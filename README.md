# tlang
Uma linguagem de programação

## Estrutura do Projeto

O projeto tem as seguintes pastas:

- `src`
- `lib` (contém o arquivo `jar` do antlr4)
- `scripts`
- `bin` (pode ser ignorado)

O diretório `src` tem as seguintes subpastas:

- `antlr`: contém os arquivos gerados pelo antlr4 a partir da gramática
- `gram`: contém a gramática

## Iniciando

Para iniciar, entre na pasta `scripts`:

````
// a partir da raiz do projeto:
cd scripts

// se estiver no Powershell, digite:
cmd.exe
````

A partir dessa pasta, você pode executar os comandos:

- `iniciar` para iniciar o antlr4 no projeto atual
- `iniciar-uam` para iniciar o antlr4 no projeto atual quando no ambiente da UAM
- `gerar` para que o antlr4 gere o Lexer e Parser a partir da gramática na pasta `src/atlr`
- `arvore` para visualizar a árvore decorrente da aplicação do parser ao arquivo `test/teste.tlang`
- `compilar` para que o arquivo `teste.tlang` seja traduzido para a linguagem Java, gerando o arquivo `test/Codigo.java`
- `testar` para compilar e executar o arquivo `test/Codigo.java`

## Observações

Este projeto foi criado como um projeto Java pelo VS Code. As configurações do projeto encontram-se em `.vscode/settings.json`.

Este projeto também já está configurado para funcionar com a extensão `ANTLR4 grammar syntax support`, que facilita bastante a criação e depuração da gramática pela criação de uma árvore de derivação dentro do próprio VS Code. Para experientar, depois de instalar a extensão, abra o arquivo `src/gram/TLang.g4` e pressione `F5`. 

Se quiser retornar à idade da pedra, um tutorial sobre a configuração dos comandos `antlr4` e `grun` pode ser encontrado [aqui](https://github.com/antlr/antlr4/blob/master/doc/getting-started.md#windows).
