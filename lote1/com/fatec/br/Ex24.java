/*
 *  Nome do programador: Bruno Defante da Silva;
 *  Data de elabora��o: 03/08/2017;
 *  Objetivo:Receba um valor inteiro. Verifique e mostre se � divis�vel por 2 e 3.
 */

package lote1.com.fatec.br;


import javax.swing.JOptionPane;

public class Ex24 {

	public static void main(String[] args) {
		
		int val, result;
		
		System.out.println();
		val = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor:"));
		
		result = (val % 2);
		
		if (result == 0){
			System.out.println(val + " � divis�vel por 2");
		}else{
			System.out.println(val + " N�o � divis�vel por 2");
		}
		
		result = (val % 3);
		
		if (result == 0){
			System.out.println(val + " � divis�vel por 3");
		}else{
			System.out.println(val + " N�o � divis�vel por 3");
		}
		

	}

}
