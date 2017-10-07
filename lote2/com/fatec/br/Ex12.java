package lote2.com.fatec.br;

public class Ex12 {

	public static void main(String[] args) {
		int matriXadrez[][] = new int[8][8], vetCont[] = new int[8], soma=0;
		preencherTabuleiro(matriXadrez);
		mostraTabuleiro(matriXadrez);
		System.out.println("Total de Peças no Tabuleiro: " + contaPecas(matriXadrez, vetCont, soma));			

	}
	
	public static int[][] preencherTabuleiro(int matri[][]){
		for(int i=0;i<matri.length;i++){
			for(int j=0;j<matri.length;j++){
				matri[i][j] = (int) (1 + (Math.random() * 7));
			}
		}
		
		return matri;
	}
	
	public static void mostraTabuleiro(int matri[][]){
		for(int i=0;i<matri.length;i++){
			for(int j=0;j<matri.length;j++){
				System.out.print(matri[i][j] + " ");
			}
			
			System.out.println(" ");
		}	
		
	}
	
	public static int contaPecas(int matri[][], int[] vet, int soma){
		for(int i=0;i<matri.length;i++){
			for(int j=0;j<matri.length;j++){
				vet[matri[i][j]]++;
			}
		}
		
		for(int i=1;i<vet.length;i++){
			System.out.println(vet[i]);
			soma += vet[i];
		}
		return soma;
	}
	

}
