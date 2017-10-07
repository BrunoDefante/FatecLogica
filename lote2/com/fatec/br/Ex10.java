package lote2.com.fatec.br;

public class Ex10 {

	public static void main(String[] args) {
		int matriz[][] = new int[2][8];
		 matriz[0][0] = 1;
		 matriz[1][0] = 1;
		matriz = carregaMatriz(matriz);
		
		for(int x =0;x<2;x++){
			for(int y=0;y<8;y++){		
				System.out.print(matriz[x][y] + " ");
				
			}
			System.out.println(" ");
		}

	}
	
	public static int[][] carregaMatriz(int[][] matri){
		for(int i=0;i<2;i++){
			for(int j=1;j<8;j++){
				if(i == 0) matri[i][j] = j + 1;
				if(i == 1) matri[i][j] +=  j * 2;
			}
		}
		return matri;
	}

}
