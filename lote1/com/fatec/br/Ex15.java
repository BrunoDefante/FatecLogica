/*
 *  Nome do programador: Bruno Defante da Silva;
 *  Data de elabora��o: 03/08/2017;
 *  Objetivo: Receba os valores de 2 catetos de um tri�ngulo ret�ngulo. Calcule e mostre
a hipotenusa.
 */

package lote1.com.fatec.br;

import javax.swing.JOptionPane;

public class Ex15 {

	public static void main(String[] args) {
				
		int ladoA, ladoB;
		double h;
		
		ladoA = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado A do tri�ngulo:"));
		
		System.out.println();
		ladoB = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado B do tri�ngulo:"));
			
		h = (Math.pow(ladoA, 2) + Math.pow(ladoB, 2));		
		h = (Math.sqrt(h));		
		System.out.println("O Valor da Hipotenusa � de: " + h);

	}

}
