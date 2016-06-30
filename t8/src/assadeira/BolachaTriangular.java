package assadeira;

import java.util.Random;

public class BolachaTriangular extends Assadeira{
	private float base;
	private float altura;

	
	public void cozinhaBolacha(){
		Random gerador = new Random();
		this.base = gerador.nextFloat()*7+3; //valores entre 3-10cm.
		this.altura = gerador.nextFloat()*7+3;
		area = (base*altura) / 2; //area entre 4,5 - 50cm².
		tipo = "Triangular";
	}
	
	public String toString(){
		return "Tamanho da bolacha triangular: "+String.format("%.2f", area)+"cm²."+ponto;
	}
}