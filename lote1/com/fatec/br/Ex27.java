/*
 *  Nome do programador: Bruno Defante da Silva;
 *  Data de elaboração: 03/08/2017;
 *  Objetivo:Receba o número de voltas, a extensão do circuito (em metros) e o tempo de
duração (minutos). Calcule e mostre a velocidade média em km/h.
 */

package lote1.com.fatec.br;

import javax.swing.JOptionPane;

public class Ex27 {

	public static void main(String[] args) {
		double voltas, distancia, tempo, velocidade = 0;		
		
		voltas = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de voltas:"));
		
		distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite a extensão do circuito em Metros:"));
		
		tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de duração em minutos:"));
		distancia = (voltas * distancia);
				
		tempo = (tempo * 60);
		velocidade = ((distancia / tempo) * 3.6);
		
		System.out.println("A velocidade é de: " + velocidade + " Km/h");

	}

}
