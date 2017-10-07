/*
 *  Nome do programador: Bruno Defante da Silva;
 *  Data de elabora��o: 03/08/2017;
 *  Objetivo:Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e
quantos anos ter� daqui a 17 anos.
 */

package lote1.com.fatec.br;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Ex29 {

	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		double poupanca, renda; 
		int resp;
		
		resp = Integer.parseInt(JOptionPane.showInputDialog("Bem Vindo ao sistema de dep�sito banc�rio\n" + 
		"Digite (1) para Poupan�a e (2) para Renda Fixa"));
		
		if(resp != 1 && resp != 2){
			System.out.println("Op��o inv�lida!");
		}else{
			if(resp == 1){
				poupanca = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor � ser depos�tado na Poupan�a:"));
				poupanca = ((poupanca * 0.03) + poupanca);
				System.out.println("Dep�sito efetuado com sucesso!");
				System.out.println("Seu saldo Ap�s 1 m�s � de: " + nf.format(poupanca));
				
			}else{
				renda = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor � ser depos�tado em Renda Fixa:"));
				renda = ((renda * 0.05) + renda);
				System.out.println("Dep�sito efetuado com sucesso!");
				System.out.println("Seu saldo Ap�s 1 m�s � de: " + nf.format(renda));
			}			
			
		}		

	}

}
