package modularizacao.lote1;

public class Ex46M {

	public static void main(String[] args) {
		Ex46M func = new Ex46M();		
		System.out.println("Serão necessários: " + func.idade() + " anos, para que Ana passe Maria");

	}
	
	public int idade(){
		double ana = 1.10, maria = 1.50;
		int ano = 0;
		
		while(ana <= maria){
			ano++;
			ana = ana + 0.03;
			maria = maria +  0.02;					
		}
		return ano;
	}

}
