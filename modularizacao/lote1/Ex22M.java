package modularizacao.lote1;

import java.util.Scanner;

public class Ex22M {

	public static void main(String[] args) {
		int val1, val2;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		val1 = entrada.nextInt();		
		System.out.println("Digite o Segundo valor:");
		val2 = entrada.nextInt();		
		Ex22M procedure = new Ex22M();
		procedure.valores(val1, val2);
	}
	
	public void valores(int val1, int val2){
		if (val1 == val2){
			System.out.println("Os Valores não podem ser iguais!");
		}else{
			if (val1 > val2){
				System.out.println("Os valores em Ordem Crescente São: " + val1 + " e " +val2);
			}else{
				System.out.println("Os Valores em Ordem Crescentes São: " + val2 + " e " + val1);
			}
		}	

		
	}

}
