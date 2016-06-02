package forma;

import java.util.Random;

import assadeira.*;

public class Fornada {

	public static void main(String[] args) {
		Assadeira assadeira[] = new Assadeira[50];
		
		//instanciando as bolachas na assadeira.
		for(int i=0; i < assadeira.length; i++ ){
			Random gerador = new Random();
			int bolacha = gerador.nextInt(3);
			switch(bolacha){
				case 0:
					assadeira[i] = new BolachaQuadrada();
					break;
				case 1:
					assadeira[i] = new BolachaRedonda();
					break;
				case 2:
					assadeira[i] = new BolachaTriangular();
					break;
				default:
					System.out.println("A bolacha torrou, faça outra!");
			}
		}
		
				
		//cozinhando as bolachas.
		for(Assadeira a : assadeira){
			a.cozinhaBolacha();
			System.out.println(a);
		}
		
		//identificando a maior bolacha.
		Assadeira maior = new Assadeira();
		maior.maiorBolacha(assadeira);
	}

}
