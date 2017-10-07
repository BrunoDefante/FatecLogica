/*
 *  Nome do programador: Bruno Defante da Silva;
 *  Data de elaboração: 03/08/2017;
 *  Objetivo:Receba a hora de início e de final de um jogo (HH,MM) sabendo que o tempo
máximo é de 24 horas e pode começar num dia e terminar noutro
 */

package lote1.com.fatec.br;


import javax.swing.JOptionPane;

public class Ex25 {

	public static void main(String[] args) {
		
		int Hi,Mi, Hf, Mf, Hj, Mj;		

		Hi = Integer.parseInt(JOptionPane.showInputDialog("Digite A Hora inicial do Jogo:"));		

		Mi = Integer.parseInt(JOptionPane.showInputDialog("Digite os Minutos Inicial do jogo:"));		

		Hf = Integer.parseInt(JOptionPane.showInputDialog("Digite a Hora Final do Jogo:"));	
		
		Mf = Integer.parseInt(JOptionPane.showInputDialog("Digite os minuto final do Jogo:"));	
		
		Hj = (Hf-Hi);
		Mj = (Mf - Mi);		
		if (Hf < Hi){
			Hj = (24 - Hi) + Hf;
		}else{
			Hj = (Hf - Hi);
		}		
		if(Mf < Mi){
			Mj = (59 - Mi)+Mf;
		}else{
			Mj = (Mf - Mi);
		}		
		System.out.println(Hj + ":" + Mj);
	}
}
