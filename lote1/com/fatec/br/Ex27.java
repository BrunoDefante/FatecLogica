/*
 *  Nome do programador: Bruno Defante da Silva;
 *  Data de elabora��o: 03/08/2017;
 *  Objetivo:Receba o n�mero de voltas, a extens�o do circuito (em metros) e o tempo de
dura��o (minutos). Calcule e mostre a velocidade m�dia em km/h.
 */

package lote1.com.fatec.br;

import javax.swing.JOptionPane;

public class Ex27 {

	public static void main(String[] args) {
		double voltas, distancia, tempo, velocidade = 0;		
		
		voltas = Double.parseDouble(JOptionPane.showInputDialog("Digite o n�mero de voltas:"));
		
		distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite a extens�o do circuito em Metros:"));
		
		tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de dura��o em minutos:"));
		distancia = (voltas * distancia);
				
		tempo = (tempo * 60);
		velocidade = ((distancia / tempo) * 3.6);
		
		System.out.println("A velocidade � de: " + velocidade + " Km/h");

	}

}
