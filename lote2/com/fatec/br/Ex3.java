package lote2.com.fatec.br;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int j=3;
		int vet1[] = new int[3];
		int vet2[] = new int[3];
		
		for(int i=0;i<vet1.length;i++){
			vet1[i] = entrada.nextInt();
			vet2[i] = entrada.nextInt();
		}
		
		for(int numeros : vetores(vet1, vet2)){
			System.out.println(numeros);
		}
	

	}
	
	public static int[] vetores(int[] vet1,int[] vet2){		
		int vet3[] = new int[6];
		int j=3;
		for(int i=0;i<vet1.length;i++){
			vet3[i] = vet1[i];
			vet3[j] = vet2[i];
			j++;
		}	
		return vet3;
	}

}
