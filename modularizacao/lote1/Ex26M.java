package modularizacao.lote1;

import java.util.Scanner;

public class Ex26M {

	public static void main(String[] args) {
		int val1, val2, result = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o Primeiro N�mero:");
		val1 = entrada.nextInt();
		
		System.out.println("Digite o Segundo N�mero:");
		val2 = entrada.nextInt();
		
		Ex26M procedure = new Ex26M();
		procedure.multiplo(val1, val2, result);
	}
	
	public void multiplo(int val1, int val2, int result){
		if(val1 > val2){
			result = (val1 % val2);
			if(result == 0){
				System.out.println("O N�mero: " + val1 + " � m�ltiplo de " + val2);
			}else{
				System.out.println("O N�mero: " + val1 + " n�o � m�ltiplo de " + val2);
			}
		}else{
			result = (val2 % val1);
			if (result == 0){
				System.out.println("O N�mero: " + val2 + " � m�ltiplo de " + val1);
			}else{
				System.out.println("O N�mero: " + val2 + " n�o � m�ltiplo de " + val1);
			}
		}
	}
}
