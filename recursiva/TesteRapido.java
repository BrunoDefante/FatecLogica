package recursiva;

public class TesteRapido {

	public static void main(String[] args) {
		int matri[][] = new int[8][8];

	}
	
	public static int[][] carregaMatri(int matri[][]) {
		
		for(int i = 0;i<=8;i++) {
			for(int j = i+1; j<=8-i; j++) {
				matri[i][j]= i;
			}
		}
		
		return matri;
	}
	
	
	

}
