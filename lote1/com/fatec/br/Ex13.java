/*
 *  Nome do programador: Bruno Defante da Silva;
 *  Data de elaboração: 03/08/2017;
 *  Objetivo:Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias
durará esse alimento sabendo que a pessoa consome 50g ao dia.

 */

package lote1.com.fatec.br;

import javax.swing.JOptionPane;

public class Ex13 {

	public static void main(String[] args) {	
		double kAlimento, tempoAlimento;
		
		kAlimento = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de comida em Kilos:"));
		
		tempoAlimento = ((kAlimento * 1000) / 50);		
		System.out.println("A comida irá durar: " + tempoAlimento + " dias");		

	}

}
