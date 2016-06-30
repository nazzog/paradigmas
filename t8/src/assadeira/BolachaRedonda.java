
package assadeira;

import java.util.Random;

public class BolachaRedonda extends Assadeira{
	private float raio;
	
	public void cozinhaBolacha(){
		Random gerador = new Random();
		this.raio = gerador.nextFloat()*3+1; //valores entre 1-4cm.
		area = 3.14*(raio*raio); //area entre 3,14 - 50,24cm².
		tipo = "Redonda";
	}
	
	public String toString(){
		return "Tamanho da bolacha redonda: "+String.format("%.2f", area)+"cm²."+ponto;
	}
}