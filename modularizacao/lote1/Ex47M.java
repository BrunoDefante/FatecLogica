package modularizacao.lote1;

import java.util.Scanner;

public class Ex47M {

	public static void main(String[] args) {
		Ex47M func = new Ex47M();
		Scanner entrada = new Scanner(System.in);
		int base, exp, result = 1;
		
		System.out.println("Digite o valor da Base:");
		base = entrada.nextInt();
		System.out.println("Digite o valor do Expoente:");
		exp = entrada.nextInt();
		
		System.out.println(func.pot(base, exp, result));

	}
	
	public String pot(int base, int exp, int result){
		for(int i=1;i<=exp;i++){
			result = (result * base);
		}
		return "Resultado da Potência: " + base +" ^ " + exp + " = " +result;
	}

}
