package recursiva;

import javax.swing.JOptionPane;

public class recursivaFat {

	public static void main(String[] args) {
		System.out.println(seqFat(coleta()));

	}
	
	public static int coleta() {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		
		return num;
		
	}
	
	public static int seqFat(int num) {
		
		if(num == 1) {
			return num;
		}else {
			return num * seqFat(num - 1);
		}
		
	}

}
