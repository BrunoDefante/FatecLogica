package modularizacao.lote1;

public class Ex34M {

	public static void main(String[] args) {
		Ex34M ex34m = new Ex34M();
		
		System.out.println(ex34m.quadrado());
		

	}

	public String quadrado(){
		for (int i=10;i<=150;i++){
			System.out.println("O quadrado de:" + i +" é: " +(i * i));
		}
		return "";
	}
	
}
