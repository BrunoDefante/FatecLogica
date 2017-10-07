package lote1.com.fatec.br;

public class Ex46 {

	public static void main(String[] args) {
		double ana = 1.10, maria = 1.50;
		int ano = 0;
		
		while(ana <= maria){
			ano++;
			ana = ana + 0.03;
			maria = maria +  0.02;					
		}
		System.out.println("Serão necessários: " + ano + " anos, para que Ana passe Maria");
	}

}
