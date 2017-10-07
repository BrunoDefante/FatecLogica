package modularizacao.lote1;

import java.util.Scanner;

import lote1.com.fatec.br.Ex20;

public class Ex20M {

	public static void main(String[] args) {
		double a, b, c, delta = 0, x1 = 0, x2 = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o Valor de A:");
		a = entrada.nextDouble();
		
		System.out.println("Digite o Valor de B:");
		b = entrada.nextDouble();
		
		System.out.println("Diite o Valor de C:");
		c = entrada.nextDouble();
		
		Ex20M procedure = new Ex20M();
		procedure.equacao(a, b, c, delta, x1, x2);
		
	}
	
	public void equacao(double a, double b, double c, double delta, double x1, double x2){
		delta = ((b*b) - (4*a*c));
		if(delta > 0 ){
			x1 = ((-b + (Math.sqrt(delta))) / (2*a));
			x2 = ((-b - (Math.sqrt(delta))) / (2*a)); 
			System.out.println("Resultado X1: " + x1);			
			System.out.println("Resultado X2: " + x2);
	
		}else {
			System.out.println("Raiz inválida!");
		}
	}

}
