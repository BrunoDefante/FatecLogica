/*
 *  Nome do programador: Bruno Defante da Silva;
 *  Data de elabora��o: 03/08/2017;Receba o raio de uma circunfer�ncia. Calcule e mostre o comprimento da
circunfer�ncia.
 */

package lote1.com.fatec.br;

import javax.swing.JOptionPane;

public class Ex11 {

	public static void main(String[] args) {
		
		double raio = 0, c;
		
		raio = Integer.parseInt(JOptionPane.showInputDialog("Digite o Comprimento do Raio:"));
		
		c = (3.14 * raio);		
		System.out.println("o Tamanho da Circunfer�ncia � de: " + c);

	}

}
