package lote2.com.fatec.br;

import java.util.Scanner;

public class Ex4 {
	public static int media=0;

	public static void main(String[] args) {
		Ex4 app = new Ex4();
		Scanner entrada = new Scanner(System.in);
		int val[] = new int[30];
		for(int i=0;i<val.length;i++){
			val[i] = entrada.nextInt();
		}
		
		System.out.println("Media do Grupo: " + app.media(val));
		System.out.println("Quantidade acima do grupo: " + app.quantGrup(val));
		for(int i : posicao(val)){
			if(i == 0);
			else System.out.println("Posições acima da média: "+ i);
		}
		
	}
	
	public int media(int[] val){
		for(int i=0;i<val.length;i++){
			media = media + val[i];
		}
		media = (media / val.length);
		return media;
	}
	
	public int quantGrup(int[] val){
		int quant=0;
		for(int i=0;i < val.length;i++){
			if(val[i] > media){
				quant ++;
			}
		}
		return quant;
	}
	
	public static int[] posicao(int[] val){
		int quant[] = new int[30];
		
		for(int i=0;i<quant.length;i++){
			if(val[i] > media){
				quant[i] = i;
			}			
		}		
		return quant;
	}
}
