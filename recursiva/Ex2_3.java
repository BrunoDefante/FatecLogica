package recursiva;

import javax.swing.JOptionPane;

public class Ex2_3 {

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
		
		if(num == 0) {
			return 1;
		}else {
			return num * fatorial(num-1);
		}
		
	}
	
	public static double seqFat(double num, double divisor) {
		if(num == 0) {
			return 0;
		}else {
			return (fatorial(num)/divisor) + seqFat(num -1, divisor + 1);
		}
	}
	
	

}
