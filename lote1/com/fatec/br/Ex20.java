/*
 *  Nome do programador: Bruno Defante da Silva;
 *  Data de elaboração: 03/08/2017;
 *  Objetivo: Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula
AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso exista,
calcule e mostre.
 */

package lote1.com.fatec.br;

import javax.swing.JOptionPane;

public class Ex20 {

	public static void main(String[] args) {
		double a, b, c, delta, x1 = 0, x2 = 0;
		
		a = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de A:"));
		
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de B:"));
		
		c = Double.parseDouble(JOptionPane.showInputDialog("Diite o Valor de C:"));
		
		
		delta = ((b*b) - (4*a*c));
		if(delta > 0 ){
			x1 = ((-b + (Math.sqrt(delta))) / (2*a));
			x2 = ((-b - (Math.sqrt(delta))) / (2*a)); 
			System.out.println("Resultado X1: " + x1);
			
			System.out.println("Resultado X2: " + x2);
	
		}else {
			System.out.println("Raiz inválida!");
		}
		

	}

}
