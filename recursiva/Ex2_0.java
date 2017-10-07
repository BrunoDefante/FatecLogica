package recursiva;

import javax.swing.JOptionPane;

public class Ex2_0 {

	public static void main(String[] args) {
		
		System.out.println(seqSoma(coleta()));

	}
	
	public static int coleta() {
		int num = Integer.parseInt(JOptionPane.showInputDialog("DIgite um número"));
		
		if(num >= 3 && num <=10) {
			return num;
		}else {
			return coleta();
		}
		
	}
	
	public static int seqSoma(int num) {
		if(num == 1) {
			return 1;
		}else {
			return num  + seqSoma(num-1); 
		}	
		
	}
	
	

}
