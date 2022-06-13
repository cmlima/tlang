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

// se estiver no Powershell, digite também:
cmd.exe
````

A partir dessa pasta, você pode executar os comandos:

| **Comando** | **Argumentos** | **Descrição** |
|---|---|---|
| `iniciar` | nenhum | Inicia o antlr4 no projeto atual. |
| `iniciar-uam` | nenhum | Iniciar o antlr4 no projeto atual quando no ambiente da UAM. |
| `gerar` | nenhum | Gerar Lexer e Parser a partir da(s) gramática(s) na pasta `src/atlr`. Requer que o Antlr4 já esteja iniciado na sessão atual. |
| `arvore` | [nome do arquivo sem extensão] | Mostra a árvore de derivação gerada pelo Parser para um arquivo `.lang` na pasta `test`. Requer que o Antlr4 já esteja iniciado na sessão atual e que o Parser e o Lexer já tenham sido gerados por `gerar`. |
| `compilar` | [nome do arquivo sem extensão] | Traduz o arquivo `.tlang` na pasta `test` para a linguagem `Java`. |
| `compilar-tudo` | nenhum | O mesmo que `compilar`, porém para todos os arquivos `.tlang` na pasta `test`. |
| `testar` | [nome do arquivo sem extensão] | Faz o mesmo que `compilar`, mas também compila o arquivo `.java` usando o comando `javac` e executa o arquivo na `JVM`. |

A sequência típica de comandos é a seguinte:

1) Execute `ìniciar` para tornar o Antlr4 disponível no ambiente.
2) Execute `gerar` para assegurar que o Lexer e o Parser da pasta `src/antlr` estão atualizados, segundo a última versão da gramática existente na pasta `src/gram`. Lembre-se de repetir esse comando a cada vez que alterar a gramática.
3) Execute `arvore [nome do arquivo sem extensao]` para cada um dos arquivos `.tlang` na pasta `test`, se quiser verificar a árvore de derivação gerada pelo Parser para esses arquivos.
4) Execute `compilar [nome do arquivo sem extensao]` para cada um dos arquivos `.tlang` na pasta `test` para gerar o arquivo `.java` correspondente. Os erros de compilação serão exibidos no terminal.
5) Se preferir, pode executar também `testar [nome do arquivo sem extensao]`, que, além de gerar o arquivo `.java`, irá também compilá-lo com o comando `javac` e executá-lo na JVM.


## Observações

Este projeto foi criado como um projeto Java pelo VS Code. As configurações do projeto encontram-se em `.vscode/settings.json`.

Este projeto também já está configurado para funcionar com a extensão `ANTLR4 grammar syntax support`, que facilita bastante a criação e depuração da gramática pela criação de uma árvore de derivação dentro do próprio VS Code. Para experientar, depois de instalar a extensão, abra o arquivo `src/gram/TLang.g4` e pressione `F5`. 

Se quiser retornar à idade da pedra, um tutorial sobre a configuração dos comandos `antlr4` e `grun` pode ser encontrado [aqui](https://github.com/antlr/antlr4/blob/master/doc/getting-started.md#windows).
