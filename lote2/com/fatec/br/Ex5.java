package lote2.com.fatec.br;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int A[] = new int[20];
		
		for(int i=0;i<=19;i++){
			A[i] = entrada.nextInt();
		}		
			new Ex5().somatoria(A);		
	}
	

	public void somatoria(int[] val){
		 int soma = 0;
		
		for(int i = 0;i<10;i++){
			soma = (val[i] - val[19 - i]); 
			System.out.println(soma);
		}			
	}	
}
