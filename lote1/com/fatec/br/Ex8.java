package lote1.com.fatec.br;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		NumberFormat nf = NumberFormat.getCurrencyInstance();		
		double deposito, valorFinal;
		
		System.out.println("Digite o seu Depósito: ");
		deposito = entrada.nextDouble();
		
		valorFinal = ((deposito * 1.13)/100);
		valorFinal = (valorFinal + deposito);		
		
		System.out.println("Seu Novo Saldo depois de 1 mês é de: " + nf.format(valorFinal));

	}

}
