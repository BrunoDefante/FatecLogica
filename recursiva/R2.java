package recursiva;

import javax.swing.JOptionPane;

public class R2 {

	public static void main(String[] args) {
		System.out.println(seqSoma(coleta(), 1));
		

	}
	
	
	public static int coleta() {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		
		if(num >=3 && num <=10) {
			return num;
		}else {
			return coleta();
		}		
		
	}
	
	public static double seqSoma(double num, double cont) {

		if(num == 0) {
			return 0;
		}else {			
			num = (cont / num) + seqSoma(num -1, cont+1);
			
			return num;
			
			
		}
		
		
		
	}

}
