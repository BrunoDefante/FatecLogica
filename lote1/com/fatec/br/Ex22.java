package lote1.com.fatec.br;

import javax.swing.JOptionPane;

public class Ex22 {

	public static void main(String[] args) {
		int val1, val2;
		
		val1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
		
		val2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo valor:"));		
		
		if (val1 == val2){
			System.out.println("Os Valores não podem ser iguais!");
		}else{
			if (val1 > val2){
				System.out.println("Os valores em Ordem Crescente São: " + val1 + " e " +val2);
			}else{
				System.out.println("Os Valores em Ordem Crescentes São: " + val2 + " e " + val1);
			}
		}	

	}

}
