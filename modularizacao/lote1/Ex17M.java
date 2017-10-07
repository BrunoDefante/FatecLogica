package modularizacao.lote1;

import java.util.Scanner;

public class Ex17M {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int tempoPercurso, velMedia, litrosGasto = 0;				
		System.out.println("Informe o Tempo do Percurso:");
		tempoPercurso = entrada.nextInt();
		
		System.out.println("Informe a Velocidade Média do percurso:");
		velMedia = entrada.nextInt();
		
		Ex17M litro = new Ex17M();
		litro.litros(tempoPercurso, velMedia, litrosGasto);

	}

	public void litros(int tempoPercurso, int velMedia, int litrosGasto){		
		litrosGasto = ((velMedia * tempoPercurso)/12);		
		System.out.println("Serão gastos " + litrosGasto + " litros nesta Viagem");

		
	}
	
}
