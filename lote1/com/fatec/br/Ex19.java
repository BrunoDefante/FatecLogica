/*
 *  Nome do programador: Bruno Defante da Silva;
 *  Data de elaboração: 03/08/2017;
 *  Objetivo:Receba 2 valores reais. Calcule e mostre o maior deles.
 */

package lote1.com.fatec.br;

import javax.swing.JOptionPane;

public class Ex19 {

	public static void main(String[] args) {		
		double val1, val2, result;
		
		System.out.println();
		val1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro valor:"));

		System.out.println("Digite o Segundo Valor:");
		val2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo valor:"));
		
		if (val1 > val2){
			result = val1;
		}else{
			result = val2;
		}		
		
		System.out.println("O maior valor é: " + result);		
	}

}
