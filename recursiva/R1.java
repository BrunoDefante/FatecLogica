package recursiva;

import javax.swing.JOptionPane;

public class R1 {

	public static void main(String[] args) {
		System.out.println(seqSoma(coleta()));

	}

	
	public static int coleta() {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		if(num >=3 && num <= 10) {
			return num;
		}else {
			return coleta();

		}		
		
	}
	
	public static int seqSoma(int num) {
		
		if(num == 1) {
			return num;
		}else {
			num += seqSoma(num -1);
			
			return num;	
		}	
		
		
	}
}
