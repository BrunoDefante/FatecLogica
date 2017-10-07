package modularizacao.lote1;

import java.util.Scanner;

public class Ex28M {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double precoAtual, vendaMensal, novoPreco = 0;		
		System.out.println("Digite o preço atual do produto:");
		precoAtual = entrada.nextDouble();		
		System.out.println("Digite a média mensal de venda do produto:");
		vendaMensal= entrada.nextDouble();
		Ex28M procedure = new Ex28M();
		procedure.reajuste(precoAtual, vendaMensal, novoPreco);
	}
	
	public void reajuste(double precoAtual, double vendaMensal, double novoPreco){
		if(vendaMensal < 500 && precoAtual < 30){
			novoPreco = (precoAtual * 0.10) + precoAtual ;
			
		}else if(vendaMensal >=500 && vendaMensal <1000 && precoAtual >=10 && precoAtual <80){
			novoPreco = (precoAtual * 0.15) + precoAtual;
			System.out.println(novoPreco);
			
		}else if(vendaMensal >=1000 && precoAtual >=80){
			novoPreco = precoAtual - (precoAtual * 0.05);
			System.out.println(novoPreco);			
		}else{
			novoPreco = precoAtual;
			System.out.println("O preço continua como está: " + novoPreco);
		}
	}

}
