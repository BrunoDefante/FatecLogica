package lote2.com.fatec.br;

import java.util.Scanner;

public class Ex2{

	public static void main(String[] args) {
		Ex2 app = new Ex2();
		Scanner entrada = new Scanner(System.in);
		int[] val = new int[100];

		for(int i=0; i < val.length;i++){
			val[i] = entrada.nextInt();		
		}
		System.out.println(app.maiorMenor(val));
		System.out.println(app.media(val));
	}
	
	public String maiorMenor(int[] val){
		int maior=0, menor=0;
		for(int i=0; i< val.length;i++){
			if(val[i] > maior){
				maior = val[i];	
			}
			if(val[i] < menor || menor == 0){
				menor = val[i];
			}
		}		
		
		return "Maior: " + maior + " Menor: " + menor;
	}

	public String media(int[] val){
		int mediaVal=0;
		for(int i=0;i < val.length;i++){
			mediaVal = mediaVal + val[i];
		}
		mediaVal = (mediaVal / val.length);
		
		return "A média dos valores são: " + mediaVal;		
	}
}
