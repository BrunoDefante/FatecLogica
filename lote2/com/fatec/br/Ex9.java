package lote2.com.fatec.br;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		int matri[][] = new int[4][4];
		matri = carregaMatriz(matri);
		for(int x =0;x<4;x++){
			for(int y=0;y<4;y++){
				System.out.print(matri[x][y] + " ");
				
			}
			System.out.println(" ");
		}	
	}	
	public static int[][] carregaMatriz(int matri[][]){
		Scanner in = new Scanner(System.in);
		for(int i=0; i<4;i++){
			for(int j=0;j<4;j++){
				if(i == j){
					matri[i][j] = (int) Math.pow(4, i);
				}else{
					matri[i][j] = in.nextInt();
				}
			}
		}		
		return matri;
	}

}
