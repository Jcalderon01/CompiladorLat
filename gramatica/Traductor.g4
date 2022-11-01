grammar Traductor;

main    : cabeza abrir cuerpo cerrar   EOF   ;
cabeza  : VOID MAIN '(' ')'               ;
abrir   : '{'                             ;
cerrar  :  '}'                            ;

cuerpo  :(expr|asignar|impreciones|declarar|declararasignar2|condsi|confor)*;

asignar: ID '=' expr ';'                             #asignarr;

impreciones: PRINT '(' imprecion ')' ';'             #imprecioness;

imprecion:  STRING                                   #imprecionn
            |
            expr                                     #imprecionexpr;

declarar: INT  ID ';'                                #declararr
          |
          FLOAT ID ';'                               #declararfloats;

declararasignar2: INT ID '=' expr  ';'                       #declararasignar
                  |
                  FLOAT ID '=' expr ';'                      #declararasignarfloats;


cond:
      cond op=(OR|AND) cond                                                   #oran
      |
      expr op = (MAYORQ|MENORQ|MENORIGUAL|MAYORIGUAL|IGUAL|DIFERENTE) expr   #conditio
      |
      TRUE                                                                   #contrue
      |
      FALSE                                                                  #confalse
      |
      '('cond')'                                                              #parcon
      ;

condsi: 'if' '(' cond ')' '{' cuerpo '}'  conelseif* conelse?           #conditiosi;
conelse  : 'else' '{' cuerpo '}'                                        #condicionels;
conelseif: 'else' 'if' '(' cond ')' '{' cuerpo '}'                      #condicionelseif;
confor: FOR '(' (asignar||declararasignar2) cond ';' ID op = ('++'|'--') ')' '{' cuerpo '}' #condiconfor;


expr:
    expr POTENCIA  NUM                              #potencia
    |
    expr op=(POR|DIVISION)   expr                   #muldiv
    |
    expr op=(MAS|MENOS) expr                        #masmenos
    |
    FLOATS                                          #floats
    |
    NUM                                             #num
    |
    ID                                              #id
    ;

FOR         :   'for';
AND:    '&&';
OR:     '||';
TRUE:       'true';
FALSE:     'false';
MAYORQ:      '>';
MENORQ:     '<';
MENORIGUAL: '<=';
MAYORIGUAL: '>=';
IGUAL:      '==';
DIFERENTE: '!=';
POTENCIA: '^';
INT :     'int' ;
FLOAT :   'float';
PQ:       ';';
STRING:   '"' ( '\\"' | . )*? '"';
VOID:     'void';
MAIN:     'main';
PRINT:    'printf';
//SALTO:    [\r\n];
MAS:      '+';
MENOS:    '-';
DIVISION: '/';
POR:      '*';
ID:       [a-zA-Z]+;
FLOATS:   [0-9]+('.'[0-9]+)?;
NUM:      [0-9]+;
COMMENT:  '/*'~[\r\n]* '\r'? '\n' -> skip;
COM:    '//' ~[\r\n]*  ->skip;
AS:       [ \t\r\n]-> skip;


