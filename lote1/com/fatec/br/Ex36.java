package lote1.com.fatec.br;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			int num1, num2 = 1;
			System.out.println("Digite um Valor: ");
			num1 = entrada.nextInt();
			
			for(int i=1;i<=num1;i++){				
				System.out.println(num2 + "/" + i);
			}

	}

}
