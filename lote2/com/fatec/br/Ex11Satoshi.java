package lote2.com.fatec.br;

public class Ex11Satoshi {

	public static void main(String[] args) {
		int matri[][] = new int[8][8];
		matri = carregaMatri(matri);
		
		for(int x =0;x<8;x++){
			for(int y=0;y<8;y++){			
				System.out.print(matri[x][y] + " ");				
			}
			System.out.println(" ");
		}
	}
	
	public static int[][] carregaMatri(int matri[][]){
		for(int z=0;z<=4;z++){
			for( int x=z;x<(8-z);x++){
				for(int y=z;y<(8-z);y++){
					matri[x][y] = z+1;
				}
			}
		}
		return matri;
	}
}
