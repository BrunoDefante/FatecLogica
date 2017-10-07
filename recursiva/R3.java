package recursiva;

import javax.swing.JOptionPane;

public class R3 {

	public static void main(String[] args) {
		System.out.println(seqFat(coleta(), 1));

		
	}
	
	
	public static int coleta() {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		
		if(num >=3 && num <=10) {
			return num;
		}else {
			return coleta();
		}
	}
	
	public static double fatorial(double num) {
		if(num == 1) {
			return 1;
		}else {		
			
			
			return num * fatorial(num-1);
			
		}		
		
	}
	
	public static double seqFat(double num, double cont) {
		if(num == 0) {
			return 0;
		}else {
			
			num =  fatorial(num) / cont + seqFat(num-1, cont+1);
			
			return num;
		}
		
		
		
	}
	


	

}
