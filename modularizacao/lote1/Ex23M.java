package modularizacao.lote1;

import java.util.Scanner;

public class Ex23M {

	public static void main(String[] args) {
		double val1, val2, val3 = 0, val4 = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite 3 valores em Ordem Crescente!");
		System.out.println("Digite o Primeiro Valor:");
		val1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo valor:");
		val2 = entrada.nextDouble();
		
		if (val1 < val2){
			System.out.println("Digite o Terceito valor:");
			val3 = entrada.nextDouble();
			
			System.out.println("Agora não é necessário que esteja em ordem Crescente!");
			System.out.println("Digite o Quarto valor");
			val4 = entrada.nextDouble();
		}else{
			System.out.println("É necessário que os números estejam em ordem crescente!");
		}
		
		Ex23M procedure = new Ex23M();
		procedure.ordemCrescente(val1, val2, val3, val4);
		
		
	}
	
	public void ordemCrescente(double val1, double val2, double val3, double val4){
		if(val4 < val1){
			System.out.println("Os números em Ordem Crescente São: " + val4 + val1 + val2 + val3);
		}else if (val4 > val1 && val4 < val2){
			System.out.println("Os números em Ordem Crescente São: " + val1 + val4 + val2 + val3);
		}else if (val4 > val2 && val4 < val3){
			System.out.println("Os números em Ordem Crescente São: " + val1 + val2 + val4 + val3);				
		}else if (val4 > val3){
			System.out.println("Os números em Ordem Crescente São: " + val1 + val2 + val3 + val4);
		}
	}

}
