package lote1.com.fatec.br;

import java.util.Scanner;

public class Ex43 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num, num2, j=1 ,c=0;
		System.out.println("Digite o Primeiro valor: ");
		num = entrada.nextInt();
		System.out.println("Digite o Seguno valor: ");
		num2 = entrada.nextInt();
		
		if(num>num2){
			while(num2<=num){
				while(j<= num2){
					if(num2%j==0){
						c++;
					}
					j++;
				}
			
			if(c==2){
				System.out.println("Os N�meros primos s�o: " + num2);
			}
			num2++;
			j = 1;
			c = 0;							
			}
			
		}else{
			while(num2>=num){
				while(j<= num){
					if(num % j == 0){
						c++;
					}
					j++;
				}
			if(c == 2){
				System.out.println("Os n�meros primos s�o: " + num);
			}
			num++;
			j = 1;
			c = 0;
			}
		}	
	}
}