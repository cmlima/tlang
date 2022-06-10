grammar TLang;

/**
Requisitos mínimos:
OK • Deve ter 3 tipos de variáveis
OK • Deve ter a estrutura de controle if . . . else;
OK • Deve ter duas estruturas de repetição (while, do . . . while, for);
OK • O compilador tem que aceitar números decimais.
OK • Os comandos de leitura do teclado (Scanner) e de impressão na tela (println) devem ser
disponibilizados.
OK • A parte de expressões envolvendo os operadores matemáticos deve ser realizada de maneira
correta, respeitando a precedência. Não é necessário gerar a resposta da expressão, basta
cuidar da precedência entre os operadores matemáticos através da gramática;
• A cada utilização de uma variável, é necessário verificar se ela já foi declarada.
• As atribuições também devem ser realizadas;
– É necessário verificar se é possível realizar as operações, devido aos tipos das variáveis e ao seu
escopo.
*/

iniciar: bloco;

bloco: (decl | atr | leitura | escrita | estr_cond | estr_repet)+;

// Operadores

op_atr: ATR;

op_atr_num
  : op_atr 
  | SOMA_ATR 
  | SUB_ATR 
  | MULT_ATR 
  | DIV_ATR
  ;

op_atr_txt
  : op_atr 
  | SOMA_ATR 
  ;

op_bool
  : E 
  | OU
  | NAO
  ;

op_rel
  : MAIORQ 
  | MENORQ
  | MAIORIG
  | MENORIG 
  | IGUAL 
  | DIF 
  ;

op_maiorq: MAIORQ;
op_menorq: MENORQ;
op_maiorig: MAIORIG;
op_menorig: MENORIG;
op_igual: IGUAL;
op_dif: DIF;
op_e: E;
op_ou: OU;
op_nao: NAO;
op_soma: SOMA;
op_sub: SUB;
op_mult: MULT;
op_div: DIV;
op_inc: INC;
op_dec: DEC;
op_soma_atr: SOMA_ATR;
op_sub_atr: SUB_ATR;
op_mult_atr: MULT_ATR;
op_div_atr: DIV_ATR;

// Atribuição

atr
  : atr_num
  | atr_txt
  | atr_bool
  ; 

atr_num
  : id op_atr_num (id|num|expr_aritm|leitura_num) 
  | id op_inc 
  | op_inc id 
  | id op_dec 
  | op_dec id
  ;

atr_txt: id op_atr_txt (id|expr_txt|leitura_txt);
atr_bool: id op_atr (id|expr_bool|leitura_bool);

// Declaração

decl
  : tipo id 
  | t_numero atr_num
  | t_texto atr_txt
  | t_booleano atr_bool
  ;

// Comandos

leitura
  : leitura_num
  | leitura_txt
  | leia_bool
  ;

leitura_num: leia_num paren_e paren_d;
leitura_txt: leia_txt paren_e paren_d;
leitura_bool: leia_bool paren_e paren_d;
escrita: escreva paren_e expr paren_d;

// Expressões

expr
	: expr_bool
  | expr_rel
  | expr_aritm 
	| expr_txt
	;

expr_bool: termo_bool (op_e termo_bool | op_ou termo_bool | op_igual termo_bool | op_dif termo_bool)*;
termo_bool
  : op_nao termo_bool
  | bool
  | id
  | expr_rel
  | expr_ig
  | paren_e expr_bool paren_d
  ;

expr_rel: termo_rel (op_maiorq termo_rel | op_menorq termo_rel | op_maiorig termo_rel | op_menorig termo_rel ); 
termo_rel
  : id
  | expr_aritm
  | paren_e expr_rel paren_d
  ;

expr_ig: termo_ig (op_igual termo_ig | op_dif termo_ig);
termo_ig
  : id
  | expr_aritm
  | paren_e expr_ig paren_d
  ;

expr_aritm: fator (op_soma fator | op_sub fator)*;
fator: termo (op_mult termo | op_div termo)*;
termo
  : num 
  | id 
  | paren_e expr_aritm paren_d
  ;

expr_txt: (txt|id) (op_soma txt)*;

// Estruturas de controle

estr_cond: se paren_e expr_bool paren_d chave_e bloco chave_d estr_cond_sec* estr_cond_alt?;
estr_cond_sec: senaose paren_e expr_bool paren_d chave_e bloco chave_d;
estr_cond_alt: senao chave_e bloco chave_d;

estr_repet: estr_enquanto | estr_de_ate;
estr_enquanto: enquanto paren_e expr_bool paren_d chave_e bloco chave_d;
estr_de_ate: de controle_de_ate chave_e bloco chave_d;
controle_de_ate: contr_id contr_atr contr_num ate contr_num;
contr_id: ID;
contr_atr: ATR;
contr_num: NUM;

// Termos

val: num | txt | bool;
num: NUM;
txt: TXT;
bool: BOOL;
id: ID;

// Palavras e símbolos reservados

tipo: t_numero | t_texto | t_booleano;
t_numero: T_NUM;
t_texto: T_TXT;
t_booleano: T_BOOL;
leia_num: LEIA_NUM;
leia_txt: LEIA_TXT;
leia_bool: LEIA_BOOL;
escreva: ESCREVA;
se: SE;
senaose: SENAOSE;
senao: SENAO;
enquanto: ENQUANTO;
de: DE;
ate: ATE;

paren_e: PAREN_E;
paren_d: PAREN_D;
chave_e: CHAVE_E;
chave_d: CHAVE_D;


// ************ LEXICO ************

// Separadores
PAREN_E: '(';
PAREN_D: ')';
CHAVE_E: '{';
CHAVE_D: '}';

// Operadores
ATR: '=';
MAIORQ: '>';
MENORQ: '<';
MAIORIG: '>=';
MENORIG: '<=';
IGUAL: '==';
DIF: '!=';
E: '&&';
OU: '||';
NAO: '!';
SOMA: '+';
SUB: '-';
MULT: '*';
DIV: '/';
INC: '++';
DEC: '--';
SOMA_ATR: '+=';
SUB_ATR: '-=';
MULT_ATR: '*=';
DIV_ATR: '/=';

// Palavras reservadas
LEIA_NUM: 'leiaNumero';
LEIA_TXT: 'leiaTexto';
LEIA_BOOL: 'leiaBooleano';
ESCREVA: 'escreva';
SE: 'se';
SENAOSE: 'senaose';
SENAO: 'senao';
ENQUANTO: 'enquanto';
DE: 'de';
ATE: 'ate';
T_NUM: 'numero';
T_TXT: 'texto';
T_BOOL: 'booleano';

// TERMOS
NUM: '-'?[0-9]+('.'[0-9]+)*;
TXT: ASPAS ( ~["\\] | ESC )* ASPAS;
BOOL: 'verdadeiro' | 'falso';
ID: [a-zA-Z_][_a-zA-Z0-9]*;

// fragmentos
fragment HEX: [0-9a-fA-F];
fragment UNICODE: 'u' HEX HEX HEX HEX;
fragment ESC: '\\' (["\\/bfnrt] | UNICODE);
fragment ASPAS: '"';

// DESCARTAR
ESP: [ \t\r\n]+ -> skip;
COM: '/*' .*? '*/' -> channel(HIDDEN);
COM_LIN: '//' ~[\r\n]* -> channel(HIDDEN);
