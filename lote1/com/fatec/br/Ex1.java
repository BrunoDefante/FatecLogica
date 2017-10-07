/*
 *  Nome do programador: Bruno Defante da Silva;
 *  Data de elaboração: 03/08/2017;
 *  Objetivo: Coletar o valor do lado de um quadrado, calcular sua área e apresentar o
resultado.
 * 
 */

package lote1.com.fatec.br;

import javax.swing.JOptionPane;

public class Ex1 {
	
	public static void main(String[] args) {
		
		double lado, result;

		lado = Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor do Lado "));
		
		result = (lado * lado);
		System.out.println("A Área do Quadrado é de: " + "\n" + result + " M2");

	
	}

}
