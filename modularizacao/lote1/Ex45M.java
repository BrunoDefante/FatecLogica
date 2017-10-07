package modularizacao.lote1;

public class Ex45M {

	public static void main(String[] args) {
		Ex45M func = new Ex45M();
		System.out.println(func.seqFat());

	}
	
	public String seqFat(){
		int j = 1;
		System.out.println("1");
		for(int i=2;i<=50;i++){
			j = j+2;							
			System.out.println(i + "/" + j);
		}
		return "";
	}

}
