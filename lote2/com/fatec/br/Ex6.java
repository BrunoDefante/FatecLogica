package lote2.com.fatec.br;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int val[] = new int[20];
		for(int i=0;i<val.length;i++){
			val[i] = entrada.nextInt();
		}

		for(int result : ordenaNum(val)){
			System.out.println(result);
		}		
	}
	
	public static int[] ordenaNum(int[] val){
		int ordena;
		for(int i=0;i<val.length;i++){
			for(int j=0;j<val.length;j++){
				if(val[j] > val[i]){					
					ordena = val[j];					
					val[j] = val[i];
					val[i] = ordena;					
				}
			}			
		}
		
		return val;
	}
}
