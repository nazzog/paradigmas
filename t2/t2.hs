-- Carregar arquivo:
-- :load prog.hs

-- 1) Crie uma função somaQuad :: Int -> Int -> Int que calcule a soma dos quadrados de dois números x e y.
somaQuad :: Int -> Int -> Int
somaQuad x y = (x^2) + (y^2)


-- 2) Crie uma função hasEqHeads :: [Int] -> [Int] -> Bool que verifique se 2 listas possuem o mesmo primeiro elemento.
-- Use o operador lógico '==' para verificar igualdade.
hasEqHeads :: [Int] -> [Int] -> Bool
hasEqHeads lis1 lis2 = if (head lis1) == (head lis2) then True else False

hasEqHeads2 :: [Int] -> [Int] -> Bool
hasEqHeads2 (hx:tx) (hy:ty)
	| hx == hy = True
	| otherwise = False


-- 3) Escreva uma função que receba uma lista de nomes e
-- adicione a string "Sr. " no início de cada nome.
add :: String -> String
add str = "Sr. "++str
addSr :: [String] -> [String]
addSr nomes = map(add) nomes

addSr2 :: [String] -> [String]
addSr2 lis = map("Sr. "++) lis

addSr3 :: [String] -> [String]
addSr3 [] = []
addSr3 (hx:tx) = ("Sr. " ++ hx) : addSr3 tx


-- 4) Crie uma função que receba uma string e retorne o número de espaços nela contidos.
-- Dica: aplique 2 funções consecutivamente.
numSpaco :: String -> Int
numSpaco str = length(filter(== ' ') str)

numSpaco2 :: String -> Int
numSpaco2 [] = 0
numSpaco2 (hx:tx)
	| hx == ' ' = 1 + numSpaco2 tx
	| otherwise = numSpaco2 tx


-- 5) Escreva uma função que, dada uma lista de números,
-- calcule 3*n^2 + 2/n + 1 para cada número n da lista.
-- Dica: defina uma função anônima.
calcula :: [Float] -> [Float]
calcula lis = map(\n -> (3*n^2) + (2/n) + 1) lis

calcula2 :: [Float] -> [Float]
calcula2 [] = []
calcula2 (h:t) = (3*h^2) + (2/h) + 1 : calcula2 t

-- 6) Escreva uma função que, dada uma lista de números,
-- selecione somente os que forem negativos.
selNegativos :: [Float] -> [Float]
selNegativos lis = filter(< 0) lis

selNegativos2 :: [Float] -> [Float]
selNegativos2 [] = []
selNegativos2 (h:t)
	| h < 0 = h : selNegativos2 t
	| otherwise = selNegativos2 t

-- 7) Escreva uma função que receba uma lista de números
-- e retorne somente os que estiverem entre 1 e 100, inclusive.
-- Dica 1: use uma função anônima.
-- Dica 2: use o operador '&&' para expressar um 'E' lógico.
retornaIntervalo :: [Float] -> [Float]
retornaIntervalo lis = filter(\n -> n >= 1 && n <= 100) lis


-- 8) Escreva uma função que, dada uma lista de idades de pessoas no ano atual,
-- retorne uma lista somente com as idades de quem nasceu depois de 1970.
-- Para testar a condição, sua função deverá subtrair a idade do ano atual.
verificaIdade :: [Int] -> [Int]
verificaIdade lis = filter(\x -> 2016-x > 1970) lis


-- 9) Escreva uma função que receba uma lista de números e retorne somente aqueles
-- que forem pares.
retornaPar :: [Int] -> [Int]
retornaPar lis = filter(\x -> mod x 2 == 0) lis


-- 10) Crie uma função charFound :: Char -> String -> Bool que verifique se o
-- caracter (primeiro argumento) está contido na string (segundo argumento).
-- Exemplos de uso da função:
--		> charFound 'a' ""
--		False
--		> charFound 'a' "uau"
--		True
charFound :: Char -> String -> Bool
charFound char str
	|str == [] = False
	|char == head str = True
	|char /= head str = charFound char (tail str)


-- 11) A função takeWhile :: (a -> Bool) -> [a] -> [a] é uma função de alta ordem.
--  Ela recebe uma função condicional e uma lista, retornando o "menor prefixo"
-- (isto é, porção inicial) da lista que satisfaça a condição dada.
-- Teste os exemplos abaixo no GHCi e depois crie um novo exemplo:
-- 		> takeWhile (< 5) [1,2,3,4,5]
--		> takeWhile (/=' ') "Fulana de Tal"
-- Obs.: Este exercício deve ser entregue em forma de comentário.
--		Prelude> takeWhile (/= 'b') "asdaebdfer"
--		"asdae"


-- 12) Crie uma função que receba uma lista de nomes e retorne outra lista com
-- somente aqueles nomes que terminarem com a letra 'a'.
