/*
 *  Nome do programador: Bruno Defante da Silva;
 *  Data de elabora��o: 03/08/2017;
 *  Objetivo:R Receba o pre�o atual e a m�dia mensal de um produto. Calcule e mostre o
novo pre�o sabendo que:
Venda Mensal Pre�o Atual Pre�o Novo
< 500 < 30 + 10%
>= 500 e < 1000 >= 30 e < 80 +15%
>= 1000 >= 80 - 5%
Obs.: para outras condi��es, pre�o novo ser� igual ao pre�o atual.
 */

package lote1.com.fatec.br;

import javax.swing.JOptionPane;

public class Ex28 {

	public static void main(String[] args) {
		double precoAtual, vendaMensal, novoPreco;
		
		precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o atual do produto:"));
		
		vendaMensal = Integer.parseInt(JOptionPane.showInputDialog("Digite a m�dia mensal de venda do produto:"));
		
		if(vendaMensal < 500 && precoAtual < 30){
			novoPreco = (precoAtual * 0.10) + precoAtual ;
			
		}else if(vendaMensal >=500 && vendaMensal <1000 && precoAtual >=10 && precoAtual <80){
			novoPreco = (precoAtual * 0.15) + precoAtual;
			System.out.println(novoPreco);
			
		}else if(vendaMensal >=1000 && precoAtual >=80){
			novoPreco = precoAtual - (precoAtual * 0.05);
			System.out.println(novoPreco);
			
		}else{
			novoPreco = precoAtual;
			System.out.println("O pre�o permanecer�: " + novoPreco);
		}

	}

}
