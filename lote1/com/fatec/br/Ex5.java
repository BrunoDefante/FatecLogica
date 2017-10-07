package lote1.com.fatec.br;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {		
		Scanner entrada = new Scanner(System.in);		
		double a, b, c, delta, x1 = 0, x2 = 0;
		
		System.out.println("Digite o Valor de A: ");
		a = entrada.nextDouble();
		
		System.out.println("Digite o Valor de B: ");
		b = entrada.nextDouble();
		
		System.out.println("Digite o Valor de C: ");
		c = entrada.nextDouble();
		
		delta = ((b*b) - (4*a*c));		
		
			x1 = ((-b + (Math.sqrt (delta))) / (2*a));
					
			x2 = ((-b - (Math.sqrt (delta))) / (2*a));
		
			System.out.println("Resultado X1: " + x1);
			
			System.out.println("Resultado X2: " + x2);		
	
	}

}
