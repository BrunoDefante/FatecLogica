/*
 *  Nome do programador: Bruno Defante da Silva;
 *  Data de elaboração: 03/08/2017;
 *  Objetivo: Receba o salário de um funcionário e mostre o novo salário com reajuste de
15%
 */

package lote1.com.fatec.br;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {

		NumberFormat nf = NumberFormat.getCurrencyInstance();

		double salario, resultado, resultadoFinal;
		
		System.out.println("Digite o Seu Salário: ");
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o Seu Salário: "));
		
		resultado = ((salario * 15)/100);
		resultadoFinal = (resultado + salario);
		
		System.out.println("Seu Novo Salário é de: " + nf.format(resultadoFinal));
	}

}
