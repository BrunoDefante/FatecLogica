/*
 *  Nome do programador: Bruno Defante da Silva;
 *  Data de elabora��o: 03/08/2017;
 *  Objetivo:Receba 2�ngulos de um tri�ngulo. Calcule e mostre o valor do 3� �ngulo.
 */

package lote1.com.fatec.br;


import javax.swing.JOptionPane;

public class Ex14 {

	public static void main(String[] args) {
		int ang1, ang2, ang3;
		
		ang1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro �ngulo: "));
		
		ang2 = Integer.parseInt(JOptionPane.showInputDialog("DIgite o Segundo �ngulo: "));
		
		ang3 = (ang1 + ang2);		
		ang3 = (180 - ang3);		
		System.out.println("O valor do terceiro �ngulo � de: " + ang3 + " Graus");

	}

}
