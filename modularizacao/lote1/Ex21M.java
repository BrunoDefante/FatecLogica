package modularizacao.lote1;

import java.util.Scanner;

public class Ex21M {

	public static void main(String[] args) {
		double nota1, nota2, nota3, nota4, result = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		nota1 = entrada.nextDouble();
		
		System.out.println("Digite a Segunda nota:");
		nota2 = entrada.nextDouble();
		
		System.out.println("Digite a Terceira nota:");
		nota3 = entrada.nextDouble();
		
		System.out.println("Digite a Quarta nota:");
		nota4 = entrada.nextDouble();
		Ex21M procedure = new Ex21M();
		procedure.nota(nota1, nota2, nota3, nota4, result);
	}
	
	public void nota(double nota1, double nota2, double nota3, double nota4, double result){
		result = ((nota1 + nota2 + nota3 + nota4)/4);
		
		if(result >= 6){
			System.out.println("Aprovado!");
		}else if(result >= 3 && result < 6){
			System.out.println("Exame!");
		}else{
			System.out.println("Retido!");
		}
	}

}
