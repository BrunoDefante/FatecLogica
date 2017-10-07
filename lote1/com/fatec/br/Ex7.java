package lote1.com.fatec.br;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int compri, larg, alt, vol;
		
		System.out.println("Digite o Comprimento em CM: ");
		compri = entrada.nextInt();
		
		System.out.println("Digite a Largura em CM: ");
		larg = entrada.nextInt();
		
		System.out.println("Digite a Altura em CM: ");
		alt = entrada.nextInt();
		
		vol = (compri * larg * alt);
		
		System.out.println("O Volume do Paralelepipedo é de: " + vol + " CM3");
	}

}
