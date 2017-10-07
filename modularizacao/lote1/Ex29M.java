package modularizacao.lote1;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ex29M {
	NumberFormat nf = NumberFormat.getCurrencyInstance();

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Ex29M procedure = new Ex29M();
		double poupanca, renda; 
		int resp;
		
		System.out.println("Bem Vindo ao sistema de dep�sito banc�rio");
		System.out.println("Digite (1) para Poupan�a e (2) para Renda Fixa");		
		resp = entrada.nextInt();
		
		if(resp != 1 && resp != 2){
			System.out.println("Op��o inv�lida!");
		}else{
			if(resp == 1){
				System.out.println("Digite o valo � ser depos�tado na Poupan�a:");
				poupanca = entrada.nextDouble();
				procedure.depositaPoup(poupanca);			
			}else{
				System.out.println("Digite o valo � ser depos�tado na Renda Fixa:");
				renda = entrada.nextDouble();
				procedure.depositaRenda(renda);				
			}
		}
	}
	
	public void depositaPoup(double poupanca){
		poupanca = ((poupanca * 0.03) + poupanca);
		System.out.println("Dep�sito efetuado com sucesso!");
		System.out.println("Seu saldo Ap�s 1 m�s � de: " + nf.format(poupanca));
	}
	
	public void depositaRenda(double renda){
		renda = ((renda * 0.05) + renda);
		System.out.println("Dep�sito efetuado com sucesso!");
		System.out.println("Seu saldo Ap�s 1 m�s � de: " + nf.format(renda));
	}

}
