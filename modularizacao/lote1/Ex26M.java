package modularizacao.lote1;

import java.util.Scanner;

public class Ex26M {

	public static void main(String[] args) {
		int val1, val2, result = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o Primeiro Número:");
		val1 = entrada.nextInt();
		
		System.out.println("Digite o Segundo Número:");
		val2 = entrada.nextInt();
		
		Ex26M procedure = new Ex26M();
		procedure.multiplo(val1, val2, result);
	}
	
	public void multiplo(int val1, int val2, int result){
		if(val1 > val2){
			result = (val1 % val2);
			if(result == 0){
				System.out.println("O Número: " + val1 + " é múltiplo de " + val2);
			}else{
				System.out.println("O Número: " + val1 + " não é múltiplo de " + val2);
			}
		}else{
			result = (val2 % val1);
			if (result == 0){
				System.out.println("O Número: " + val2 + " é múltiplo de " + val1);
			}else{
				System.out.println("O Número: " + val2 + " não é múltiplo de " + val1);
			}
		}
	}
}
