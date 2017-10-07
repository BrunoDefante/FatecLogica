/*
 *  Nome do programador: Bruno Defante da Silva;
 *  Data de elaboração: 03/08/2017;
 *  Objetivo:R Receba o preço atual e a média mensal de um produto. Calcule e mostre o
novo preço sabendo que:
Venda Mensal Preço Atual Preço Novo
< 500 < 30 + 10%
>= 500 e < 1000 >= 30 e < 80 +15%
>= 1000 >= 80 - 5%
Obs.: para outras condições, preço novo será igual ao preço atual.
 */

package lote1.com.fatec.br;

import javax.swing.JOptionPane;

public class Ex28 {

	public static void main(String[] args) {
		double precoAtual, vendaMensal, novoPreco;
		
		precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual do produto:"));
		
		vendaMensal = Integer.parseInt(JOptionPane.showInputDialog("Digite a média mensal de venda do produto:"));
		
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
			System.out.println("O preço permanecerá: " + novoPreco);
		}

	}

}
