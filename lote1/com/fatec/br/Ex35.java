package lote1.com.fatec.br;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num, fat = 1;
		
		System.out.println("Digite um Valor inteiro:");
		num = entrada.nextInt();
	
		for(int i = 1; i<=num; i++){
			fat = fat * i;
			
		}		
		System.out.println("O fatorial de: " + num + " é -> " + fat);
	}

}
