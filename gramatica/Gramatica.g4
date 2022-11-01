grammar Gramatica;

major   : caput aperta corpus claudure  EOF  ;
caput   : INANIS MAJOR '(' ')'            ;
aperta  : '{'                             ;
claudure: '}'                             ;

corpus  :( expr |assignment|imprimeres|declarare|delarareasignare|condsi|confor)*;

assignment: ID '=' expr ';'                          #assignmentt;  //asignar

imprimeres: IMPRIMERE '(' imprimere ')' ';'          #imprimeress;  //impreciones

imprimere:  FILUM                                    #imprimeree    //imprecionString
            |
            expr                                     #imprimerexpr; //imprecionexpr

declarare: TOTUM  ID ';'                             #declararee   //declarar
           |
           TRISTEQUE ID ';'                          #declararetrist //declarar floats
           ;

delarareasignare: TRISTEQUE ID '=' expr ';'                 #declarassignaretrist //declarar asignar floats
                  |
                  TOTUM ID '=' expr ';'                     #declarassignare      //declarar asignar
                  ;

cond:
      cond op=(OR|AND) cond                                                   #oran
      |
      expr op = (MAYORQ|MENORQ|MENORIGUAL|MAYORIGUAL|IGUAL|DIFERENTE) expr    #conditio
      |
      TRUE                                                                    #conreal
      |
      FALSE                                                                   #confictus
      |
      '('cond')'                                                              #parcon
      ;

condsi: 'if' '(' cond ')' '{' corpus '}' conelseif* conelse?                  #conditiosi;
conelse  : 'else' '{' corpus '}'                                              #condicionels;
conelseif: 'else' 'if' '(' cond ')' '{' corpus '}'                            #condicionelseif;
confor: FOR'(' (delarareasignare||assignment) cond ';' ID op = ('++'|'--') ')' '{' corpus '}'  #condiconfor;

expr:
    expr POTENTIA  NUM                               #potentia      //potencia
    |
    expr op=(BY|DIVISIO)   expr                      #bydivisio     // multi y div
    |
    expr op=(PLUS|MINUS) expr                        #plusminus     // mas y menos
    |
    TRSITE                                           #triste        // floats
    |
    NUM                                              #numerus       //numeros
    |
    ID                                               #nomen         //ids
    ;

FOR         :   'for';
AND         :    '&&';
OR          :     '||';
TRUE        :   'true';
FALSE       :  'false';
MAYORQ      :      '>';
MENORQ      :     '<';
MENORIGUAL  : '<=';
MAYORIGUAL  : '>=';
IGUAL       :      '==';
DIFERENTE   : '!=';
POTENTIA    : '^'                               ;                   //
TOTUM       : 'totum'                           ;                   //int
TRISTEQUE   : 'tristeque'                       ;                   //float
SIGNO       : ';'                               ;                   //
FILUM       : '"' ( '\\"' | . )*? '"'           ;                   //string
INANIS      : 'inanis'                          ;                   //vois
MAJOR       :  'major'                          ;                   //main
IMPRIMERE   : 'imprimere'                       ;                   //print
//JUMP      : [\r\n]                            ;                   //saltp
PLUS        : '+'                               ;                   //
MINUS       : '-'                               ;                   //
DIVISIO     : '/'                               ;                   //
BY          : '*'                               ;                   //
IDEM        : '='                               ;                   //
TRSITE      : [0-9]+('.'[0-9]+)?                ;                   // floats
ID          : [a-zA-Z]+                         ;                   //ids
NUM         : [0-9]+                            ;                   //numeros
COMMENT     : '/*'~[\r\n]* '\r'? '\n' -> skip   ;                   //comentarios
COM         : '//' ~[\r\n]*  ->skip;
AS          : [ \t\r\n]-> skip                      ;               //

/*
FILUM   string
PRINT   imprimere
SALTO   jump
MAS     plus
MENOS   minus
DIV     divisio
POR     by
IGUAL   idem
ID      ID
NUM     numerus
COMMENT comment
WS:     AS
*/
