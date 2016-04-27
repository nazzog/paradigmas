/* 1) Defina um predicado zeroInit(L) que é verdadeiro se L for uma lista que
   inicia com o número 0 (zero). Exemplo de uso:
    ?- zeroInit([9,6,7]).
    false.
    ?- zeroInit([0,6,7]).
    true.
*/
zeroInit(L) :- L = [H|_], H is 0.


/* 2) Defina um predicado has5(L) que é verdadeiro se L for uma lista de
   5 elementos. Resolva este exercício sem usar um predicado auxiliar.
*/
has5(L) :- L = [_,_,_,_,_].


/* 3) Defina um predicado hasN(L,N) que é verdadeiro se L for uma lista de
   N elementos.
*/
hasN([],0).
hasN(L,N) :- L = [_|T], hasN(T,N1), N is 1+N1.


/* 4) Defina um predicado potN0(N,L), de forma que L seja uma lista de
   potências de 2, com expoentes de N a 0. Exemplo de uso:
    ?- potN0(7,L).
    L = [128, 64, 32, 16, 8, 4, 2, 1]
*/
potN0(0,[]).
potN0(N,L) :- L = [H|T], N >= 0, H is 2^N, N1 is N - 1, potN0(N1,T).


/* 5) Defina um predicado zipmult(L1,L2,L3), de forma que cada elemento da
   lista L3 seja o produto dos elementos de L1 e L2 na mesma posição do
   elemento de L3. Exemplo:
    ?­ zipmult([1,2,3],[2,2,2],L).
    L = [2, 4, 6].
*/
zipmult([], [], []).
zipmult([HA|TA], [HB|TB], [HC|TC]) :- HC is HA*HB, zipmult(TA, TB, TC).
