package modularizacao.lote1;

import java.util.Scanner;

public class Ex19M {

	public static void main(String[] args) {
		double val1, val2, result = 0;
		Scanner entrada = new Scanner(System.in);		
		System.out.println("Digite o Primeiro valor:");
		val1 = entrada.nextDouble();

		System.out.println("Digite o Segundo Valor:");
		val2 = entrada.nextDouble();
		Ex19M procedure = new Ex19M();
		procedure.maior(val1, val2, result);

	}
	
	public void maior(double val1, double val2, double result){
		if (val1 > val2){
			result = val1;
		}else{
			result = val2;
		}		
		System.out.println("O maior valor é: " + result);
	}
}
