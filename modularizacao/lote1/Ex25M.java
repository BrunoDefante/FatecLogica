package modularizacao.lote1;

import java.util.Scanner;

public class Ex25M {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int Hi,Mi, Hf, Mf, Hj = 0, Mj = 0;		
		System.out.println("Digite A Hora inicial do Jogo:");
		Hi = entrada.nextInt();		
		System.out.println("Digite os Minutos Inicial do jogo:");
		Mi = entrada.nextInt();		
		System.out.println("Digite a Hora Final do Jogo:");
		Hf = entrada.nextInt();		
		System.out.println("Digite os minuto final do Jogo:");
		Mf = entrada.nextInt();		
		
		Ex25M procedore = new Ex25M();
		procedore.tempoJogo(Hi, Mi, Hf, Mf, Hj, Mj);
	}

	public void tempoJogo(int Hi,int Mi,int Hf,int Mf,int Hj,int Mj){
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
