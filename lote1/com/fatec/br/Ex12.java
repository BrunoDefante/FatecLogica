/*
 *  Nome do programador: Bruno Defante da Silva;
 *  Data de elaboração: 03/08/2017;
 *  Objetivo:Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e
quantos anos terá daqui a 17 anos.
 */

package lote1.com.fatec.br;

import javax.swing.JOptionPane;

public class Ex12 {

	public static void main(String[] args) {	
		int anoNasc, anoAtual, idade, idadeFutura;
		
		anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu Ano de Nascimento: "));
		
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano Atual: "));
		
		idade = (anoAtual - anoNasc);		
		idadeFutura = (idade + 17);		
		System.out.println("Idade Atual: " + idade + " anos" +"\n" +"Você terá " + idadeFutura +" anos " +"daqui a 17 anos");
		

	}

}
