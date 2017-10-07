package lote2.com.fatec.br;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int soma = 0, somaImpar = 0;
		int[] val = new int[50];

		for(int i = 0; i<val.length;i++){
			val[i] = entrada.nextInt();
		}	
		System.out.println(new Ex1().soma(val));
		
	}
	
	public String soma(int[] val){
		int soma=0, somaImpar=0;
		
		for(int i = 0; i<val.length;i++){
			
			if(val[i] >=10 && val[i] <= 200){
				soma = soma + val[i];
			}
			
			if(val[i] %2 != 0){								
				somaImpar = somaImpar + val[i];
			}
		}		
		return "Soma dos Números entre 10 e 200: " + soma + " Soma dos números ímpares: " + somaImpar;
	}
	
}
