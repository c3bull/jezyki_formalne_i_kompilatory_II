grammar Prover9;

OPEN_PAREN : '(';
CLOSE_PAREN : ')';
AND: '&';
OR: '|';
NOT : '-';
FORALL : 'all';
RIGHT_IMPLIES: '->';
LEFT_IMPLIES: '<-';
IFF: '<->';
EQ: '=';
NOT_EQ: '!=';
EXISTS : 'exists';
FALSE : '$F';
TRUE : '$T';
COMMA : ',';
DOT : '.';
INTEGER : [0-9]+;
IDENT : [A-Za-z_][A-Za-z_0-9]*;
WS : [ \t\r\n]+ -> skip ;

top_level_formula : formula'.';

integer: INTEGER;
string: IDENT;

formula: problem problem EOF;
problem: 'formulas' '(' string ')' '.' logical_part 'end_of_list' '.' ;

logical_part: (quantifier term '(' cnf_clause_body binary_operation cnf_clause_body ')' '.')? cnf_clause_body? '.';

term : quant_sym '(' term_list ',' term ')' | symbol | symbol '(' term ( ',' term )* ')' ;

term_list : '[' term ( ',' term )* ']' ;

quant_sym : 'forall' | 'exists' | identifier ;

symbol : 'equal' | 'true' | 'false' | 'or' | 'and' | 'not' | 'implies' | 'implied' | 'equiv' | identifier | string ;

cnf_clause_body : 'or' '(' term ( ',' term )* ')' | term '(' term ')';

binary_operation : '|' |
                   '&' |
                   '->' |
                   '<-' |
                   '<->';

quantifier :  'all' |
              'exists';

BINARY_TERM_OPERATION : '==' |
                        '<' |
                        '<=' |
                        '>' |
                        '>=' |
                        '+' |
                        '*' |
                        '@' |
                        '/' |
                        '\\' |
                        '^' |
                        'v' ;


identifier : Identifier ;
