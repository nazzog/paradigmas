package assadeira;

public class Assadeira {
	protected double area; //área da bolacha.
	protected Local ponto; //Posição da bolacha.
	
	public Assadeira(){
		
	}
	
	public void cozinhaBolacha(){
		
	}
	
	public void posicionaBolacha(){
		
	}
	public void maiorBolacha(Assadeira assadeira[]){
		double max = assadeira[0].getArea();
	      for (int i = 1; i < assadeira.length; i++) {
	         if (assadeira[i].getArea() > max) 
	        	 max = assadeira[i].getArea();
	      }
	System.out.println("A maior bolacha é: " + String.format("%.2f", max)+"cm².");
	}
	
	public double getArea(){
		return area;
	}
}
