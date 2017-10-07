package lote1.com.fatec.br;

import java.util.Scanner;

public class Ex41 {

	public static void main(String[] args) {		
	Scanner entrada = new Scanner(System.in);
	double num, maior = 0, menor = 0;
			
		for(int i=1;i<=100;i++){
			System.out.println("Digite o valor: " + i);
			num = entrada.nextDouble();
			if(num < 0){
				System.out.println("Os Valores tem que ser positivos:");
				System.exit(0);
			}else{
				if(num > maior){
					maior = num;
					
				}if(num < menor || menor == 0){
					menor = num;
				}	
			}
		}
		System.out.println("maior: " + maior + " menor: " + menor);

	}

}
