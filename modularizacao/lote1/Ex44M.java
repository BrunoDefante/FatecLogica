package modularizacao.lote1;

public class Ex44M {

	public static void main(String[] args) {
		Ex44M func = new Ex44M();
		System.out.println(func.dado());

	}
	
	public String dado(){
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
		return "";		
	}

}
