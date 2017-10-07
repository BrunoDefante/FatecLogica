package lote1.com.fatec.br;


import javax.swing.JOptionPane;

public class Ex10 {

	public static void main(String[] args) {
		double num1, num2, result;
		
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro Número:"));
		
		System.out.println("Digite o Segundo Número: ");
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
		
		result = (num1 - num2);
		System.out.println("A diferença entre estes números é de: " + result);
	}

}
