package lote1.com.fatec.br;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int tabuada;
		
		System.out.println("Digite um número:");
		tabuada = entrada.nextInt();
		System.out.println("A tabuada do Número escolhido é:");
		
		for(int i=0;i<=10;i++){				
			System.out.println(tabuada +" * " + i +" = " + (tabuada * i));
		}		
	}
}
