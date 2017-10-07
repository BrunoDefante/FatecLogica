package modularizacao.lote1;

import java.util.Scanner;

public class Ex39M {

	public static void main(String[] args) {
		Ex39M func = new Ex39M();
		Scanner entrada = new Scanner(System.in);
		int num1, num2 = 1, num = 0, fat = 1;		
		System.out.println("Digite um Valor: ");
		num1 = entrada.nextInt();
		System.out.println(func.fat(num1, num2, num, fat));
	}
	
	public String fat(int num1, int num2, int num, int fat){
		for(int i=1;i<=num1;i++){			
			for(int c = i; c<=i; c++){
				fat = fat * c;
			}
			System.out.println(num2 + "/" + fat);
		}
		return "";
		
	}
}
