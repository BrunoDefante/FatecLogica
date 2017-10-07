package lote1.com.fatec.br;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double c, f;
		
		System.out.println("Digite a temperatura em Graus Celsius: ");
		
		c = entrada.nextDouble();
		
		f = ((9*c+160)/5);
		
		System.out.println("A temperatura em Fahrenheit é: " + f);
		
		
		
		
	}

}
