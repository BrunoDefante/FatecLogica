/*
 *  Nome do programador: Bruno Defante da Silva;
 *  Data de elaboração: 03/08/2017;
 *  Objetivo:Receba 2ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
 */

package lote1.com.fatec.br;


import javax.swing.JOptionPane;

public class Ex14 {

	public static void main(String[] args) {
		int ang1, ang2, ang3;
		
		ang1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro Ângulo: "));
		
		ang2 = Integer.parseInt(JOptionPane.showInputDialog("DIgite o Segundo Ângulo: "));
		
		ang3 = (ang1 + ang2);		
		ang3 = (180 - ang3);		
		System.out.println("O valor do terceiro ângulo é de: " + ang3 + " Graus");

	}

}
