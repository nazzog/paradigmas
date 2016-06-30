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
					assadeira[i].posicionaBolacha(i);
					break;
				case 1:
					assadeira[i] = new BolachaRedonda();
					assadeira[i].posicionaBolacha(i);
					break;
				case 2:
					assadeira[i] = new BolachaTriangular();
					assadeira[i].posicionaBolacha(i);
					break;
				default:
					System.out.println("A bolacha torrou, faça outra!");
			}
		}
		
				
		//cozinhando as bolachas.
		for(Assadeira a : assadeira){
			a.cozinhaBolacha();
			//System.out.println(a); //print das 50 bolachas.
		}
		
		//identificando a maior bolacha.
		Assadeira maior = new Assadeira();
		maior.maiorBolacha(assadeira);
	}

}