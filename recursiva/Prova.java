package recursiva;

public class Prova {
	static int soma = 0;
	public static void main(String[] args) {
		int vetNum[] = new int[100];
		vetNum = coleta(vetNum, 0);
		vetNum = classificaVetor(vetNum);
		
		
		
		for(int i=0; i<100; i++) {
			if(i%10 == 0) {
				System.out.print("\n"+vetNum[i]);
			}else {
				System.out.print(" "+vetNum[i]);
			}
		}

	}
	
	
	public static int[] coleta(int[] vetNum, int cont) {
		
		int num = (int) (Math.random()*200);//Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		
		if(cont == 100) {
			return vetNum;
		}
		if(num % 3 == 0) {			
			vetNum[cont] = num;
			if(num >=1 && num <= 300) {
				soma += num;
			}
			cont++;
			
			
		}		
		vetNum = coleta(vetNum, cont);		
		return vetNum;		
		
	}
	
	public static int[] classificaVetor(int[] vetNum) {
		int aux;
		for(int i=0;i<99;i++) {
			if(vetNum[i] > vetNum[i+1]) {
				aux = vetNum[i+1];
				vetNum[i+1] = vetNum[i];
				vetNum[i] = vetNum[i+1];
			}
		}
		return vetNum;	
		
	}
	
	
	
}

