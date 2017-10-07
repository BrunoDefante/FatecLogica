package modularizacao.lote1;

import java.util.Scanner;

public class Ex37M {

	public static void main(String[] args) {
		Ex37M func = new Ex37M();
		Scanner entrada = new Scanner(System.in);
		int tabuada;
		
		System.out.println("Digite um número:");
		tabuada = entrada.nextInt();
		System.out.println("A tabuada do Número escolhido é:");
			
			System.out.println(func.tab(tabuada));	
		
	}
	
	public String tab(int tabuada){
		for(int i=0;i<=10;i++){				
			System.out.println(tabuada +" * " + i +" = " + (tabuada * i));
		}
		return "";
	}

}
