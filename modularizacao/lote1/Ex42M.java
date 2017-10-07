package modularizacao.lote1;

public class Ex42M {

	public static void main(String[] args) {
		Ex42M func = new Ex42M();
		System.out.println(func.graos());
	}
	
	
	public String graos(){
		double grao = 1;		
		for(int i=1;i<=64;i++){			
			grao = grao * 2;			
		System.out.println("Quantidade de Casas: " + i + " Quantidade de Graos: " + grao);
		}
		return "";
		
	}

}
