-- 1) Defina uma função recursiva que receba uma lista de números inteiros e
-- produza uma nova lista com cada número elevado ao quadrado.
elevaQuadrado :: [Int] -> [Int]
elevaQuadrado [] = []
elevaQuadrado lis = (head lis)^2 : elevaQuadrado (tail lis)

elevaQuadrado2 :: [Int] -> [Int]
elevaQuadrado2 lis = map(^2) lis


-- 2) Escreva uma função recursiva que receba uma lista de nomes e adicione
-- a string "Sr. " no início de cada nome.
addSr :: [String] -> [String]
addSr [] = []
addSr (h:t) = ("Sr. "++)h : addSr t

addSr2 :: [String] -> [String]
addSr2 lis = map("Sr. "++) lis


-- 3) Crie uma função recursiva que receba uma string e retorne o número de
-- espaços nela contidos.
numSpaco :: String -> Int
numSpaco [] = 0
numSpaco (h:t)
	| h == ' ' = 1 + numSpaco t
	| otherwise = numSpaco t

numSpaco2 :: String -> Int
numSpaco2 lis = length(filter (== ' ') lis)


-- 4) Escreva uma função recursiva que, dada uma lista de números, calcule
-- 3*n^2 + 2/n + 1 para cada número n da lista.
calculaN :: [Float] -> [Float]
calculaN [] = []
calculaN (h:t) = (\n -> (3*n^2) + (2/n) + 1) h : calculaN t

calculaN2 :: [Float] -> [Float]
calculaN2 lis = map(\n -> (3*n^2) + (2/n) + 1) lis

-- 5) Escreva uma função recursiva que, dada uma lista de números, selecione
-- somente os que forem negativos.
selectNeg :: [Float] -> [Float]
selectNeg [] = []
selectNeg (h:t)
	| h < 0 = h : selectNeg t
	| otherwise = selectNeg t

selectNeg2 :: [Float] -> [Float]
selectNeg2 lis = filter (< 0) lis

-- 6) Defina uma função não-recursiva que receba uma string e retire suas vogais,
-- conforme os exemplos abaixo.
--		> semVogais "andrea"
--		"ndr"
--		> semVogais "xyz"
--		"xyz"
--		> semVogais "ae"
--		""
semVogais :: String -> String
semVogais "" = ""
semVogais str = filter(\n -> n /= 'a' && n /= 'e' && n /= 'i' && n /= 'o' && n /= 'u') str

semVogais2 :: String -> String
semVogais2 [] = []
semVogais2 (h:t)
	| h /= 'a' && h /= 'e' && h /= 'i' && h /= 'o' && h /= 'u' = h : semVogais2 t
	| otherwise = semVogais2 t

-- 7) Expresse uma solução recursiva para o exercício anterior.
semVogaisRecursiva :: String -> String
semVogaisRecursiva "" = ""
semVogaisRecursiva (h:t)
	| h /= 'a' && h /= 'e' && h /= 'i' && h /= 'o' && h /= 'u' = h : semVogaisRecursiva t
	| otherwise = semVogaisRecursiva t


-- 8) Defina uma função não-recursiva que receba uma string, possivelmente
-- contendo espaços, e que retorne outra string substituindo os demais caracteres
-- por '-', mas mantendo os espaços. Exemplos:
--		> codifica "Rio Grande do Sul"
--		"--- ------ -- ---"
--		> codifica ""
--		""
codifica :: String -> String
codifica str = map(\x -> if x /= ' ' then '-' else ' ') str


-- 9) Defina uma função recursiva que resolva o mesmo problema do exercício anterior.
codificaRecursiva :: String -> String
codificaRecursiva "" = ""
codificaRecursiva (h:t)
	| h /= ' ' = '-' : codificaRecursiva t
	| otherwise = ' ' : codificaRecursiva t


-- 10) Crie uma função recursiva charFound :: Char -> String -> Bool, que verifique
-- se o caracter (primeiro argumento) está contido na string (segundo argumento).
-- Exemplos de uso da função:
--		> charFound 'a' ""
--		False
--		> charFound 'a' "uau"
--		True
charFound :: Char -> String -> Bool
charFound char str
	| str == [] = False
	| char == head str = True
	| char /= head str = charFound char (tail str)


-- 11) Defina uma função recursiva que receba uma lista de coordenadas de pontos
-- 2D e desloque esses pontos em 2 unidades, conforme o exemplo abaixo:
--		> translate [(0.1,0.2), (1.1,6), (2,3.1)]
--		[(2.1,2.2),(3.1,8.0),(4.0,5.1)]
translate :: [(Float, Float)] -> [(Float, Float)]
translate [] = []
translate (hx:tx) = ((fst hx + 2), (snd hx + 2)) : translate tx


-- 12) Defina uma função recursiva que receba 2 listas e retorne uma lista contendo
--  o produto, par a par, dos elementos das listas de entrada. Exemplos:
--		> prodVet [1,2,3] [4,5,6]
--		[4,10,18]
--		> prodVet [1,2,3] [4,5,6,7]
--		[4,10,18]
prodVet :: [Int] -> [Int] -> [Int]
prodVet [] _ = []
prodVet (ha:ta) (hb:tb) = ha*hb : prodVet ta tb


-- 13) Resolva o exercício anterior usando uma função de alta ordem, eliminando a
-- necessidade de escrever código com recursão.
prodVet2 :: [Int] -> [Int] -> [Int]
prodVet2 [] _ = []
prodVet2 lis1 lis2 = zipWith (*) lis1 lis2


-- 14) Defina uma função recursiva que receba um número n e retorne uma tabela de
-- números de 1 a n e seus quadrados, conforme os exemplos abaixo:
--		> geraTabela 5
--		[(1,1),(2,4),(3,9),(4,16),(5,25)]
--		> geraTabela 0
--		[]
geraTabela :: Int -> [(Int,Int)]
geraTabela 0 = []
geraTabela n = (n, n^2) : geraTabela (n-1)
