package modularizacao.lote1;

import java.util.Scanner;

public class Ex27M {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double voltas, distancia, tempo, velocidade = 0;		
		
		System.out.println("Digite o n�mero de voltas:");
		voltas = entrada.nextDouble();
		
		System.out.println("Digite a extens�o do circuito em metros:");
		distancia = entrada.nextDouble();
		
		System.out.println("Digite o tempo de dura��o em minutos:");
		tempo = entrada.nextDouble();
		
		Ex27M procedure = new Ex27M();
		procedure.determVelocidade(voltas, distancia, tempo, velocidade);
	}
	
	public void determVelocidade(double voltas, double distancia, double tempo, double velocidade){
		distancia = (voltas * distancia);			
		tempo = (tempo * 60);
		velocidade = ((distancia / tempo) * 3.6);		
		System.out.println("A velocidade � de: " + velocidade + " Km/h");
		
	}

}
