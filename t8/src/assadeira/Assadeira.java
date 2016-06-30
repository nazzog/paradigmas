package assadeira;

public class Assadeira {
	protected double area; //área da bolacha.
	protected String tipo; //Tipo da bolacha
	protected Local ponto = new Local(); //Posição da bolacha.
	
	public Assadeira(){
		
	}
	
	public void cozinhaBolacha(){
		
	}
	
	public void posicionaBolacha(int p){
		ponto.setX(p);
		ponto.setY(p);
	}
	
	public void maiorBolacha(Assadeira assadeira[]){
		double max = assadeira[0].getArea();
	      for (int i = 1; i < assadeira.length; i++) {
	         if (assadeira[i].getArea() > max){
	        	 max = assadeira[i].getArea();
	        	 tipo = assadeira[i].getTipo();
	        	 ponto = assadeira[i].getPonto();
	         }
	      }
	System.out.println("A maior bolacha é " + tipo + " de área " + String.format("%.2f", max)+"cm², "+ ponto);
	}
	
	public String getTipo(){
		return tipo;
	}
	
	public double getArea(){
		return area;
	}

	public Local getPonto(){
		return ponto;
	}
}