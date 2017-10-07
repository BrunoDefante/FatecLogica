package lote1.com.fatec.br;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1 , num2, menor, result = 0, resultFinal = 0;
		
		System.out.println("Digite o primero valor:");
		num1 = entrada.nextInt();
		System.out.println("Digite o segundo valor:");
		num2 = entrada.nextInt();
		
		if(num1 > num2){
			menor = (num1 - num2);
			System.out.println("A soma dos ímpares entre esses valores é: ");
			for(int i=1;i<menor;i++){
				result = (i *2) + 1;	
				if(result > num2){
					resultFinal = (resultFinal + result);
				}				
			}
			System.out.println(resultFinal);
		}else{
			menor = (num2 - num1);
			System.out.println("A soma dos ímpares entre esses valores é: ");
			for(int i=1;i<menor;i++){
				result = (i *2) + 1;
				if(result > num1){
					resultFinal = (resultFinal + result);
				}							
			}
			System.out.println(resultFinal);	
		}
		
	}

}
