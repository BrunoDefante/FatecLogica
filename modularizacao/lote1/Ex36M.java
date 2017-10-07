package modularizacao.lote1;

import java.util.Scanner;

public class Ex36M {

	public static void main(String[] args) {
		Ex36M proc = new Ex36M();
		Scanner entrada = new Scanner(System.in);
		int num1, num2 = 1;
		System.out.println("Digite um Valor: ");
		num1 = entrada.nextInt();		
		
		System.out.println(proc.seq(num1, num2));	

	}
	
	public String seq(int num1, int num2){
		for(int i=1;i<=num1;i++){				
			System.out.println(num2 + "/" + i);
		}
		return "";	
	}

}
