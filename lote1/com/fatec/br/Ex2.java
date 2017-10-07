/*
 *  Nome do programador: Bruno Defante da Silva;
 *  Data de elabora��o: 03/08/2017;
 *  Objetivo: Receba o sal�rio de um funcion�rio e mostre o novo sal�rio com reajuste de
15%
 */

package lote1.com.fatec.br;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {

		NumberFormat nf = NumberFormat.getCurrencyInstance();

		double salario, resultado, resultadoFinal;
		
		System.out.println("Digite o Seu Sal�rio: ");
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o Seu Sal�rio: "));
		
		resultado = ((salario * 15)/100);
		resultadoFinal = (resultado + salario);
		
		System.out.println("Seu Novo Sal�rio � de: " + nf.format(resultadoFinal));
	}

}
