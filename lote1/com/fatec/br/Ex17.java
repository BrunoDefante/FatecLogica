/*
 *  Nome do programador: Bruno Defante da Silva;
 *  Data de elaboração: 03/08/2017;
 *  Objetivo:Calcule a quantidade de litros gastos em uma viagem, sabendo que o
automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
 */

package lote1.com.fatec.br;

import javax.swing.JOptionPane;

public class Ex17 {

	public static void main(String[] args) {
		
		int tempoPercurso, velMedia, litrosGasto;
		
		tempoPercurso = Integer.parseInt(JOptionPane.showInputDialog("Informe o Tempo do Percurso:"));
		
		System.out.println();
		velMedia = Integer.parseInt(JOptionPane.showInputDialog("Informe a Velocidade Média do percurso:"));
		
		litrosGasto = ((velMedia * tempoPercurso)/12);		
		System.out.println("Serão gastos " + litrosGasto + " litros nesta Viagem");

	}

}
