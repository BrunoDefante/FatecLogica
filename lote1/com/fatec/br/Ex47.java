package lote1.com.fatec.br;

import java.util.Scanner;

public class Ex47 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int base, exp, result = 1;
		
		System.out.println("Digite o valor da Base:");
		base = entrada.nextInt();
		System.out.println("Digite o valor do Expoente:");
		exp = entrada.nextInt();
		
		for(int i=1;i<=exp;i++){
			result = (result * base);
		}
		System.out.println("Resultado da Potência: " + base +" ^ " + exp + " = " +result);
	}

}
