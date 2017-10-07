/*
 *  Nome do programador: Bruno Defante da Silva;
 *  Data de elaboração: 03/08/2017;
 *  Objetivo: Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de
desconto e o número de descendentes. Calcule o salário que serão as horas
trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto –
desconto). A cada dependente será acrescido R$ 100 no Salário Líquido.
Exiba o salário a receber.

 */

package lote1.com.fatec.br;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Ex16 {

	public static void main(String[] args) {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		int numDescen;
		double hrT, vlHr, percDesc, sB, sL;
		
		hrT = Double.parseDouble(JOptionPane.showInputDialog("Digite as Horas Trabalhadas:"));
		
		vlHr = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da Horas: "));
		
		percDesc = Double.parseDouble(JOptionPane.showInputDialog("Digite o Percentual de Desconto:"));
		
		numDescen = Integer.parseInt(JOptionPane.showInputDialog("Digite o Número de dependentes: "));
		
		sB = (hrT * vlHr);
		
		percDesc = (percDesc/100);
		
		sL = (sB - (sB * percDesc));
		
		sL = (sL + 100 * numDescen);		
	
		System.out.println("O seu Salário Líquido é: " + nf.format(sL));
		

	}

}
