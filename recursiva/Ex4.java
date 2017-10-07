package recursiva;

import javax.swing.JOptionPane;

public class Ex4 {

	public static void main(String[] args) {
		int base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base"));
		int potencia = Integer.parseInt(JOptionPane.showInputDialog("Digite a potencia"));
		
		System.out.println(expoente(base, potencia));

	}
	
	public static int expoente(int base, int potencia) { 
		if (potencia == 0) {
			return 1;
		}else {
			base = base * expoente(base, potencia -1);
			return base;
			 
		}
		
		
	}

}
