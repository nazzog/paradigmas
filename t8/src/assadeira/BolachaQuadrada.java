package assadeira;

import java.util.Random;

public class BolachaQuadrada extends Assadeira{
	private float comprimento;
	private float largura;
	
	public void cozinhaBolacha(){
		Random gerador = new Random();
		this.comprimento = gerador.nextFloat()*4+3; //valores entre 3-7cm.
		this.largura = gerador.nextFloat()*4+3;
		area = comprimento*largura; // area entre 9cm - 49cm².
	}
	
	public String toString(){
		return "Tamanho da bolacha quadrada: "+String.format("%.2f", area)+"cm².";
	}
}
