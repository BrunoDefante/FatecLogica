package lote1.com.fatec.br;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valX, valY, troca;
		
		System.out.println("Digite o Valor de X: ");
		valX = entrada.nextInt();
		
		System.out.println("Digite o Valor de Y: ");
		valY = entrada.nextInt();
		System.out.println("Agora os valores ser�o trocados: ");

		troca = valX;
		valX = valY;
		valY = troca;
		
		System.out.println("Agora os valores s�o X = " + valX + " Y: " + valY);
	}

}
