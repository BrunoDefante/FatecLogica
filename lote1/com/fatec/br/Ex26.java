/*
 *  Nome do programador: Bruno Defante da Silva;
 *  Data de elabora��o: 03/08/2017;
 *  Objetivo: Receba 2 n�meros inteiros. Verifique e mostre se o maior n�mero � m�ltiplo
do menor.
 */

package lote1.com.fatec.br;

import javax.swing.JOptionPane;

public class Ex26 {

	public static void main(String[] args) {
		int val1, val2, result;
		
		val1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro N�mero:"));
		
		val2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo N�mero:"));
		
		if(val1 > val2){
			result = (val1 % val2);
			if(result == 0){
				System.out.println("O N�mero: " + val1 + " � m�ltiplo de " + val2);
			}else{
				System.out.println("O N�mero: " + val1 + " n�o � m�ltiplo de " + val2);
			}
		}else{
			result = (val2 % val1);
			if (result == 0){
				System.out.println("O N�mero: " + val2 + " � m�ltiplo de " + val1);
			}else{
				System.out.println("O N�mero: " + val2 + " n�o � m�ltiplo de " + val1);
			}
		}		

	}

}
