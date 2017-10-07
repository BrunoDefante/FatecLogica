package lote2.com.fatec.br;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int val[] = new int[20];
		int num;
		for(int i=0;i<val.length;i++){
			val[i] = entrada.nextInt();
		}		
		num = entrada.nextInt();
	
		int indice = binaria(ordenaNum(val), num);
		if(indice == -1){
			System.out.println("Valor não encontrado!");
		}else{
			System.out.println("O valor está na casa: " + indice);
		}
	}

	private static int binaria(int[] s, int x) {
		int meio;
		int inicio = 0, fim;
		fim = s.length - 1;
		
		while(inicio <= fim){
			meio = (inicio + fim)/2;
			if(s[meio] == x)return meio;
			else if (s[meio] < x) inicio = meio + 1;
			else if (s[meio] > x) fim = meio -1;
		}
		
		return -1;
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
