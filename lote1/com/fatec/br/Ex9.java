package lote1.com.fatec.br;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);		
		int num1, num2;
		
		System.out.println("Digite o Primeiro Número: ");
		num1 = entrada.nextInt();
		
		System.out.println("Digite o Segundo Número: ");
		num2 = entrada.nextInt();
		
		num1 = (num1 * num1);
		num2 = (num2 * num2);
		
		System.out.println("Os Quadrados são: " + num1 + " e " + num2);

	}

}
