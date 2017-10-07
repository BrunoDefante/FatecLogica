/*
 *  Nome do programador: Bruno Defante da Silva;
 *  Data de elaboração: 03/08/2017;
 *  Objetivo: Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não
necessariamente em ordem. Mostre os 4 números em ordem crescente.

 */

package lote1.com.fatec.br;

import javax.swing.JOptionPane;

public class Ex23 {

	public static void main(String[] args) {
		double val1, val2, val3, val4;
		
		val1 = Double.parseDouble(JOptionPane.showInputDialog("Digite 3 valores em Ordem Crescente!\n " + "Digite o Primeiro Valor:"));
		
		val2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));
		
		if (val1 < val2){
			System.out.println();
			val3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Terceito valor:"));
			
			System.out.println("Agora não é necessário que esteja em ordem Crescente!");
			
			val4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Quarto valor"));
			
			
			if(val4 < val1){
				System.out.println("Os números em Ordem Crescente São: " + val4 + val1 + val2 + val3);
			}else if (val4 > val1 && val4 < val2){
				System.out.println("Os números em Ordem Crescente São: " + val1 + val4 + val2 + val3);
			}else if (val4 > val2 && val4 < val3){
				System.out.println("Os números em Ordem Crescente São: " + val1 + val2 + val4 + val3);				
			}else if (val4 > val3){
				System.out.println("Os números em Ordem Crescente São: " + val1 + val2 + val3 + val4);
			}
			
			
		}else{
			System.out.println("É necessário que os números estejam em ordem crescente!");
		}
		
		

	}

}
	

