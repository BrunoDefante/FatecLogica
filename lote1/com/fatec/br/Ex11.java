/*
 *  Nome do programador: Bruno Defante da Silva;
 *  Data de elaboração: 03/08/2017;Receba o raio de uma circunferência. Calcule e mostre o comprimento da
circunferência.
 */

package lote1.com.fatec.br;

import javax.swing.JOptionPane;

public class Ex11 {

	public static void main(String[] args) {
		
		double raio = 0, c;
		
		raio = Integer.parseInt(JOptionPane.showInputDialog("Digite o Comprimento do Raio:"));
		
		c = (3.14 * raio);		
		System.out.println("o Tamanho da Circunferência é de: " + c);

	}

}
