/*
 *  Nome do programador: Bruno Defante da Silva;
 *  Data de elabora��o: 03/08/2017;
 *  Objetivo:Calcule a quantidade de litros gastos em uma viagem, sabendo que o
autom�vel faz 12 km/l. Receber o tempo de percurso e a velocidade m�dia.
 */

package lote1.com.fatec.br;

import javax.swing.JOptionPane;

public class Ex17 {

	public static void main(String[] args) {
		
		int tempoPercurso, velMedia, litrosGasto;
		
		tempoPercurso = Integer.parseInt(JOptionPane.showInputDialog("Informe o Tempo do Percurso:"));
		
		System.out.println();
		velMedia = Integer.parseInt(JOptionPane.showInputDialog("Informe a Velocidade M�dia do percurso:"));
		
		litrosGasto = ((velMedia * tempoPercurso)/12);		
		System.out.println("Ser�o gastos " + litrosGasto + " litros nesta Viagem");

	}

}
