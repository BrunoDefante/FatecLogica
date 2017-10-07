package lote2.com.fatec.br;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {		
		int mat[][] = new int[4] [3];
		int k=1;		
		mat = carregaMat(mat);
		
		for(int i : quantProdutoMes(mat)){
			System.out.println("Quantidade do Produto  " + k + " vendido por mes" +" é: " + i);
			k++;			
		}
		k = 1;
		for(int i : quantProdSem(mat)){			
			System.out.println("Quantidade de Produtos  "+ k + " vendido por semana" +" é: " + i);
			k++;
		}
		System.out.println("Total de produtos vendidos no mês: " + quantProdTotal(mat));
				
	}
	
	public static int[][] carregaMat(int[][] matri){
		Scanner in = new Scanner(System.in);
		for(int x =0;x<4;x++){
			for(int y=0;y<3;y++){
				matri[x][y] = in.nextInt();
			}
		}
				
		return matri;
	}
	
	public static int[] quantProdutoMes(int[][] matri){
		int quant[] = new int[3];
		for(int i=0;i<4;i++){			
			for(int j=0;j<3;j++){
				quant[j] = quant[j] + matri[i][j];
			}
		}		
		return quant;
	}
	
	public static int[] quantProdSem(int[][] matri){
		int quant[] = new int[4];
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				quant[i] = quant[i] + matri[i][j];
			}
		}	
		
		return quant;
	}
	
	public static int quantProdTotal(int[][] matri){
		int total = 0;
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				total = total + matri[i][j];				
			}
		}		
		return total;
	}
}
