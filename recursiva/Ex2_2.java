package recursiva;

import javax.swing.JOptionPane;

public class Ex2_2 {

	public static void main(String[] args) {
		System.out.println(seqSoma(coleta(), 1));
	}
	
	public static int coleta() {
		int num = Integer.parseInt(JOptionPane.showInputDialog("DIgite um valor"));
		if(num >= 3 && num <= 10) {
			return num;
		}else {
			return coleta();
		}	
		
	}
	
	
	public static double seqSoma(double num, double divisor) {
		if(num == 0) {
			return 0;
		}else {
			
			return (num / divisor) + seqSoma(num - 1, divisor +1);
		}
		
		
	}
	

}
