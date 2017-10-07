package lote1.com.fatec.br;

public class Ex44 {

	public static void main(String[] args) {
		int dado1 = 6, dado2 = 1;
		
		for(int i = 1;i<=6;i++){			
			dado1--;
			dado2++;
			if(dado1 + dado2 == 7){
				if(dado1 ==0){
					
				}else{
				System.out.println("(dado1) =  " + dado1 +"  +  " + "(dado2) = "+ dado2 + " = 7");
				}
			}
		}

	}

}
