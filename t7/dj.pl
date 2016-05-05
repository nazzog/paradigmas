/*            OBI 2014 - Modalidade Iniciação • Nível 2, Fase 1
  DJ
    Seis estilos de música diferentes serão executados pelo DJ Sombra Negra.
    Cada estilo vai ser executado uma única vez, e as seguintes condições devem
    ser obedecidas:

      1. Hip-hop é o primeiro, o terceiro ou o quinto estilo a ser executado.
      2. Pelo menos dois estilos são executados após samba ser executado, mas
      antes de pop ser executado (ou seja, pelo menos dois estilos são
      executados entre a execução de samba e a execução de pop).
      3. Exatamente um estilo é executado após funk, mas antes de rock ser
      executado (ou seja, exatamente um estilo é executado entre a execução de
      funk e a execução de rock).
*/


% Condições:
% 1. Hip-hop é o primeiro, o terceiro ou o quinto estilo a ser executado.
primeira(M) :- M = [hip_hop,_,_,_,_,_].
primeira(M) :- M = [_,_,hip_hop,_,_,_].
primeira(M) :- M = [_,_,_,_,hip_hop,_].

% 2. Pelo menos dois estilos são executados após samba ser executado, mas
% antes de pop ser executado (ou seja, pelo menos dois estilos são
% executados entre a execução de samba e a execução de pop).
segunda(M) :- M = [samba,_,_,pop,_,_].
segunda(M) :- M = [samba,_,_,_,pop,_].
segunda(M) :- M = [samba,_,_,_,_,pop].
segunda(M) :- M = [_,samba,_,_,pop,_].
segunda(M) :- M = [_,samba,_,_,_,pop].
segunda(M) :- M = [_,_,samba,_,_,pop].

% 3. Exatamente um estilo é executado após funk, mas antes de rock ser
% executado (ou seja, exatamente um estilo é executado entre a execução de
% funk e a execução de rock).
terceira(M) :- M = [funk,_,rock,_,_,_].
terceira(M) :- M = [_,funk,_,rock,_,_].
terceira(M) :- M = [_,_,funk,_,rock,_].
terceira(M) :- M = [_,_,_,funk,_,rock].

% permutacoes:
perm(List, [H|Perm]) :- delete(H, List, Rest), perm(Rest, Perm).
perm([],[]).

delete(X, [X|T], T).
delete(X, [H|T], [H|NT]) :- delete(X, T, NT).

% Regras combinadas:
tocarSet(M) :-
    M = [_,_,_,_,_,_],
    Musicas = [hip_hop,samba,funk,rock,pop,jazz],
    perm(Musicas, M),
    primeira(M),
    segunda(M),
    terceira(M).

% RESPOSTAS:
/*
Questão 11. Qual das seguintes alternativas é
uma possível lista completa e correta dos estilos
executados, do primeiro para o último?
(A) funk, samba, rock, pop, hip-hop, jazz
(B) hip-hop, samba, jazz, pop, funk, rock
(C) rock, samba, funk, hip-hop, jazz, pop
(D) pop, rock, jazz, funk, hip-hop, samba
(E) jazz, samba, hip-hop, funk, pop, rock
Resposta: (E)
Consultas:
?- tocarSet(M).
M = [hip_hop, samba, funk, jazz, rock, pop] ;
M = [hip_hop, samba, jazz, funk, pop, rock] ;
M = [hip_hop, funk, samba, rock, jazz, pop] ;
M = [samba, funk, hip_hop, rock, pop, jazz] ;
M = [samba, funk, hip_hop, rock, jazz, pop] ;
M = [samba, funk, jazz, rock, hip_hop, pop] ;
M = [samba, jazz, hip_hop, funk, pop, rock] ;
M = [funk, samba, rock, jazz, hip_hop, pop] ;
M = [jazz, samba, hip_hop, funk, pop, rock] ;
M = [jazz, funk, samba, rock, hip_hop, pop] ;
false.
*/

/*
Questão 12. Se o DJ tocar jazz em quinto lugar,
qual das seguintes alternativas é necessariamente
verdadeira?
(A) O sexto estilo a ser tocado é pop.
(B) O terceiro estilo a ser tocado é hip-hop.
(C) O segundo estilo a ser tocado é rock.
(D) O primeiro estilo a ser tocado é funk.
(E) O primeiro estilo a ser tocado é samba.
Resposta: (A) -- Pois só existe um estilo para ser tocado na posição estipulada.
Consultas:
?- tocarSet([_,_,_,_,jazz,X]).
X = pop ;
X = pop ;
false.

?- tocarSet([_,_,X,_,jazz,_]).
X = samba ;
X = hip_hop ;
false.

?- tocarSet([_,X,_,_,jazz,_]).
X = funk ;
X = funk ;
false.

?- tocarSet([X,_,_,_,jazz,_]).
X = hip_hop ;
X = samba ;
false.
*/

/*
Questão 14. Se samba é o segundo estilo a ser
tocado, qual das seguintes afirmativas é necessariamente
falsa?
(A) Jazz é o primeiro a ser tocado.
(B) Jazz é o quinto a ser tocado.
(C) Hip-Hop é o terceiro a ser tocado.
(D) Rock é o quinto a ser tocado.
(E) Pop é o sexto a ser tocado.
Resposta: (B)
Consultas:
?- tocarSet([_,samba,_,_,X,_]).
X = rock ;
X = pop ;
X = hip_hop ;
X = pop ;
false.
*/
