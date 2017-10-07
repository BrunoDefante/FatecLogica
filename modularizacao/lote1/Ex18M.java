package modularizacao.lote1;

import java.util.Scanner;

public class Ex18M {

	public static void main(String[] args) {
		int val1, val2, result = 0;
		Scanner entrada = new Scanner(System.in);		
		System.out.println("Digite o Primeiro valor:");
		val1 = entrada.nextInt();
		
		System.out.println("Digite o segundo valor:");
		val2 = entrada.nextInt();
		Ex18M dif = new Ex18M();
		dif.diferenca(val1, val2, result);

	}
	
	public void diferenca(int val1, int val2, int result){
		if (val1 > val2){
			result = (val1 - val2);
		}else{
			result = (val2 - val1);
		}
		System.out.println("A Diferença do Menor pelo maior é de: " + result);
	}

}
