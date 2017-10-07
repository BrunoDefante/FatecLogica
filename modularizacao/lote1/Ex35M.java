package modularizacao.lote1;

import java.util.Scanner;

public class Ex35M {

	public static void main(String[] args) {
		Ex35M func = new Ex35M();
		Scanner entrada = new Scanner(System.in);
		int num, fat = 1;		
		System.out.println("Digite um Valor inteiro:");
		num = entrada.nextInt();
		
		System.out.println("O fatorial de: " + num + " é -> " + func.fatorial(fat, num));
	}
	
	public int fatorial(int fat, int num){
		fat = 1;
		for(int i = 1; i<=num; i++){
			fat = fat * i;
			
		}	
		return fat;
	}

}
