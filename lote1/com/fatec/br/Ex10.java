package lote1.com.fatec.br;


import javax.swing.JOptionPane;

public class Ex10 {

	public static void main(String[] args) {
		double num1, num2, result;
		
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro N�mero:"));
		
		System.out.println("Digite o Segundo N�mero: ");
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo n�mero"));
		
		result = (num1 - num2);
		System.out.println("A diferen�a entre estes n�meros � de: " + result);
	}

}
