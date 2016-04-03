import Text.Printf

type Point     = (Float,Float)
type Rect      = (Point,Float,Float)

maxWidth :: Float
maxWidth = 1000

maxHeight :: Float
maxHeight = 100

-- Gera um unico retangulo SVG
-- a partir de coordenadas+dimensoes e de uma string com atributos de estilo
writeRect :: (Rect,String) -> String
writeRect (((x,y),w,h),style) =
  printf "<rect x='%.3f' y='%.3f' width='%.2f' height='%.2f' style='%s' />\n" x y w h style

-- Gera codigo-fonte de arquivo SVG
-- concatenando uma lista de retangulos e seus atributos de estilo
writeAllRects :: Float -> Float -> [(Rect,String)] -> String
writeAllRects w h rs =
  printf "<svg width='%.2f' height='%.2f' xmlns='http://www.w3.org/2000/svg'>\n" w h
      ++ (concat (map writeRect rs)) ++ "</svg>"

-- TO-DO
-- Esta funcao deve gerar n retangulos de largura w e altura h.
-- Use recursao para implementa-la.
-- genRects :: Float -> Float -> Float -> [Rect]
-- Remova a linha abaixo antes de implementar a nova funcao recursiva
-- genRects n w h = [((0.0,0.0), w, h)] -- Lista com somente um retangulo.
genRects :: Float -> Float -> Float -> [Rect]
genRects 0 _ _ = []
genRects n w h = [((((n*50)-50)+0.0, 0.0), w, h)] ++ genRects (n-1) w h


-- Função myzip para substituir a função zip do applyStyles.
myzip :: [Rect] -> [String] -> [(Rect,String)]
myzip [] _ = []
myzip (ha:ta) (hb:tb) = (ha,hb) : myzip ta tb


-- Função styles do main
genStyles :: Int -> [String]
genStyles 0 = []
genStyles 1 = printf "fill:rgb(0,0,200)" : []
genStyles n
  | mod n 3 == 0 = printf "fill:rgb(200,200,200)" : genStyles (n-1)
  | mod n 3 == 1 = printf "fill:rgb(0,0,200)" : genStyles (n-1)
  | mod n 3 == 2 = printf "fill:rgb(0,0,0)" : genStyles (n-1)

-- Combina (zip) a lista de estilos com a lista de retangulos, aplicando os estilos ciclicamente.
-- Se houverem mais retangulos que cores, havera retangulos com cores repetidas.
-- Se houverem menos retangulos que cores, algumas cores nao serao usadas.
applyStyles :: [String] -> [Rect] -> [(Rect,String)]
applyStyles styles rects = myzip rects (cycle styles)


{--
     O codigo abaixo gera um arquivo "mycolors.svg".
     A geracao usa 2 listas: uma com coordenadas dos retangulos e outra com as cores.
     Essas 2 listas sao combinadas numa lista resultante, que e' escrita no arquivo.
 --}
main :: IO ()
main = do
  let
    rects = genRects 10 50 50                          -- Deve gerar 10 retangulos de 50x50
    styles = genStyles 10 --["fill:rgb(140,0,0)","fill:rgb(0,140,0)"] -- Estilo: vermelho e verde
    rectstyles = applyStyles styles rects
  writeFile "mycolors.svg" (writeAllRects maxWidth maxHeight rectstyles)
