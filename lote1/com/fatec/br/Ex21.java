/*
 *  Nome do programador: Bruno Defante da Silva;
 *  Data de elaboração: 03/08/2017;
 *  Objetivo:Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética.
Mostre a mensagem de acordo com a média:
a. Se a média for >= 6,0 exibir “APROVADO”;
b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
c. Se a média for < 3,0 exibir “RETIDO”
*/

package lote1.com.fatec.br;

import javax.swing.JOptionPane;

public class Ex21 {

	public static void main(String[] args) {
		double nota1, nota2, nota3, nota4, result;
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
		
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Segunda nota:"));
		
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Terceira nota:"));
		
		nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Quarta nota:"));
		
		result = ((nota1 + nota2 + nota3 + nota4)/4);
		
		if(result >= 6){
			System.out.println("Aprovado!");
		}else if(result >= 3 && result < 6){
			System.out.println("Exame!");
		}else{
			System.out.println("Retido!");
		}

	}

}
