package assadeira;

public class Local {
	private double pontoX;
	private double pontoY;
	
	public Local(){
		
	}
	
	public Local(int pontoX, int pontoY){
		this.pontoX = pontoX;
		this.pontoY = pontoY;
	}
	
	public double getX(){
		return pontoX;
	}
	
	public double getY(){
		return pontoY;
	}
	
	public void setX(int x){
		this.pontoX = x;
	}
	
	public void setY(int y){
		this.pontoY = y;
	}
	public String toString(){
		return "na posição " + pontoX + "," + pontoY;
	}
}