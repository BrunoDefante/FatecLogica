/*
 *  Nome do programador: Bruno Defante da Silva;
 *  Data de elaboração: 03/08/2017;
 *  Objetivo: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo
do menor.
 */

package lote1.com.fatec.br;

import javax.swing.JOptionPane;

public class Ex26 {

	public static void main(String[] args) {
		int val1, val2, result;
		
		val1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro Número:"));
		
		val2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo Número:"));
		
		if(val1 > val2){
			result = (val1 % val2);
			if(result == 0){
				System.out.println("O Número: " + val1 + " é múltiplo de " + val2);
			}else{
				System.out.println("O Número: " + val1 + " não é múltiplo de " + val2);
			}
		}else{
			result = (val2 % val1);
			if (result == 0){
				System.out.println("O Número: " + val2 + " é múltiplo de " + val1);
			}else{
				System.out.println("O Número: " + val2 + " não é múltiplo de " + val1);
			}
		}		

	}

}
