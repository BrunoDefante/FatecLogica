/*
 *  Nome do programador: Bruno Defante da Silva;
 *  Data de elabora��o: 03/08/2017;
 *  Objetivo:Receba 2 valores inteiros. Calcule e mostre o resultado da diferen�a do
maior pelo menos valor.

 */

package lote1.com.fatec.br;

import javax.swing.JOptionPane;

public class Ex18 {

	public static void main(String[] args) {
		int val1, val2, result;
		
		val1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro valor:"));
		
		val2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
		
		if (val1 > val2){
			result = (val1 - val2);
		}else{
			result = (val2 - val1);
		}
		System.out.println("A Diferen�a do Menor pelo maior � de: " + result);
	}

}
