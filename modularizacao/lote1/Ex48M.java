package modularizacao.lote1;

public class Ex48M {

	public static void main(String[] args) {
		Ex48M func = new Ex48M();
		
		System.out.println(func.seq());
	}
	
	public String seq(){
		int i, val = 0;
		
		System.out.println(1);
		for(i = 2; val<225;i++){			
			val = (i * i);
			System.out.println(i + " / " + val);
			
		}
		return "";
	}

}
