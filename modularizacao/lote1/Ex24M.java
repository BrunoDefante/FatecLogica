package modularizacao.lote1;

import java.util.Scanner;

public class Ex24M {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int val, result = 0;
		
		System.out.println("Digite um Valor:");
		val = entrada.nextInt();
		Ex24M procedure = new Ex24M();
		procedure.divisao(val, result);
		
	}
	
	public void divisao(int val, int result){
	result = (val % 2);
		
		if (result == 0){
			System.out.println(val + " é divisível por 2");
		}else{
			System.out.println(val + " Não é divisível por 2");
		}
		
		result = (val % 3);
		
		if (result == 0){
			System.out.println(val + " é divisível por 3");
		}else{
			System.out.println(val + " Não é divisível por 3");
		}
		
	}
}
