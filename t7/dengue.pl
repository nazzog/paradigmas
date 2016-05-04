/*
  COMBATE A DENGUE
    Uma força-tarefa para combater a dengue precisa visi-tar sete casas em busca de focos do mosquito.
		As casa são denominadas F, G, H, L, M, P e T.
		Deve ser feito um  plano  de  ação  determinando  a  ordem  em  que  as casas são visitadas.
		Para isso considera-se as seguintes condições:

      1. A casa F deve ser uma das três primeiras a serem visitadas.
		  2. A casa H deve ser visitada imediatamente antes da casa G.
		  3. A casa L não pode ser a primeira nem a sétima casa a ser visitada.
		  4. A casa M deve ser a primeira ou a sétima a ser visitada.
		  5. A casa P deve ser uma das três ultimas a serem visitadas.
*/

% Condições:
% 1. A casa F deve ser uma das três primeiras a serem visitadas.
primeira(X) :- X=[f,_,_,_,_,_,_].
primeira(X) :- X=[_,f,_,_,_,_,_].
primeira(X) :- X=[_,_,f,_,_,_,_].

% 2. A casa H deve ser visitada imediatamente antes da casa G.
segunda(X) :- X=[h,g,_,_,_,_,_].
segunda(X) :- X=[_,h,g,_,_,_,_].
segunda(X) :- X=[_,_,h,g,_,_,_].
segunda(X) :- X=[_,_,_,h,g,_,_].
segunda(X) :- X=[_,_,_,_,h,g,_].
segunda(X) :- X=[_,_,_,_,_,h,g].

% 3. A casa L não pode ser a primeira nem a sétima casa a ser visitada.
terceira(X) :- X=[_,l,_,_,_,_,_].
terceira(X) :- X=[_,_,l,_,_,_,_].
terceira(X) :- X=[_,_,_,l,_,_,_].
terceira(X) :- X=[_,_,_,_,l,_,_].
terceira(X) :- X=[_,_,_,_,_,l,_].

% 4. A casa M deve ser a primeira ou a sétima a ser visitada.
quarta(X) :- X=[m,_,_,_,_,_,_].
quarta(X) :- X=[_,_,_,_,_,_,m].

% 5. A casa P deve ser uma das três ultimas a serem visitadas.
quinta(X) :- X=[_,_,_,_,p,_,_].
quinta(X) :- X=[_,_,_,_,_,p,_].
quinta(X) :- X=[_,_,_,_,_,_,p].

% permutacoes:
perm(List, [H|Perm]) :- delete(H, List, Rest), perm(Rest, Perm).
perm([],[]).

delete(X, [X|T], T).
delete(X, [H|T], [H|NT]) :- delete(X, T, NT).

% Regras combinadas:
visitar(X) :-
    X = [_,_,_,_,_,_,_],
    Casas = [f,g,h,l,m,p,t],
    perm(Casas, X),
    primeira(X),
    segunda(X),
    terceira(X),
    quarta(X),
    quinta(X).

% RESPOSTAS:
/*
Questão 1. Qual das seguintes opções é uma lista
completa e correta da ordem que as sete casas devem
ser visitadas?
(A) F, T, H, L, P, G e M.
(B) H, G, F, L, T, P e M.
(C) L, T, F, H G, M e P.
(D) M, F, D, H, L, G e T.
(E) M, L, H, G, F, P e T.
Resposta: (B)
Consultas:
?- visitar([f,t,h,l,p,g,m]). false.
?- visitar([h,g,f,l,t,p,m]). True.
*/


/*
Questão 2. Se em um trecho do percurso visitarmos
as casas T, L e F, exatamente nesta ordem, qual a
posição que G foi visitada?
(A) Segunda.
(B) Terceira.
(C) Quarta.
(D) Quinta.
(E) Sexta.
Resposta: (D)
Consultas:
?- visitar([_,g,t,l,f,_,_]). false.
?- visitar([_,g,_,t,l,f,_]). false.
?- visitar([_,g,_,_,t,l,f]). false.
?- visitar([_,_,g,t,l,f,_]). false.
?- visitar([_,_,g,_,t,l,f]). false.
?- visitar([t,l,f,g,_,_,_]). false.
?- visitar([_,_,_,g,t,l,f]). false.
?- visitar([t,l,f,_,g,_,_]). true.
*/


/*
Questão 3. Se a casa H é a primeira a ser visitada,
qual a quarta casa a ser visitada?
(A) F.
(B) G.
(C) L.
(D) M.
(E) P.
Resposta: (C)
Consultas:
?- visitar([h,_,_,X,_,_,_]).
X = l .
*/
