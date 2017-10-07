package modularizacao.lote1;

import java.util.Scanner;

public class Ex38M {

	public static void main(String[] args) {
		Ex38M func = new Ex38M();
		Scanner entrada = new Scanner(System.in);
		int num1 , num2, menor = 0, result = 0, resultFinal = 0;
		
		System.out.println("Digite o primero valor:");
		num1 = entrada.nextInt();
		System.out.println("Digite o segundo valor:");
		num2 = entrada.nextInt();
		
		System.out.println("A soma dos ímpares entre esses valores é: " + func.impares(num1, num2, menor, result, resultFinal));

	}
	
	public int impares(int num1 , int num2, int menor, int result, int resultFinal){
		if(num1 > num2){
			menor = (num1 - num2);			
			for(int i=1;i<menor;i++){
				result = (i *2) + 1;	
				if(result > num2){
					resultFinal = (resultFinal + result);
				}				
			}
			return resultFinal;
		}else{
			menor = (num2 - num1);			
			for(int i=1;i<menor;i++){
				result = (i *2) + 1;
				if(result > num1){
					resultFinal = (resultFinal + result);
				}							
			}
			return resultFinal;	
		}		
	}
}
