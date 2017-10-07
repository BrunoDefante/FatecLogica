/*
 *  Nome do programador: Bruno Defante da Silva;
 *  Data de elaboração: 03/08/2017;
 *  Objetivo:Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e
quantos anos terá daqui a 17 anos.
 */

package lote1.com.fatec.br;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Ex29 {

	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		double poupanca, renda; 
		int resp;
		
		resp = Integer.parseInt(JOptionPane.showInputDialog("Bem Vindo ao sistema de depósito bancário\n" + 
		"Digite (1) para Poupança e (2) para Renda Fixa"));
		
		if(resp != 1 && resp != 2){
			System.out.println("Opção inválida!");
		}else{
			if(resp == 1){
				poupanca = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor à ser deposítado na Poupança:"));
				poupanca = ((poupanca * 0.03) + poupanca);
				System.out.println("Depósito efetuado com sucesso!");
				System.out.println("Seu saldo Após 1 mês é de: " + nf.format(poupanca));
				
			}else{
				renda = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor à ser deposítado em Renda Fixa:"));
				renda = ((renda * 0.05) + renda);
				System.out.println("Depósito efetuado com sucesso!");
				System.out.println("Seu saldo Após 1 mês é de: " + nf.format(renda));
			}			
			
		}		

	}

}
