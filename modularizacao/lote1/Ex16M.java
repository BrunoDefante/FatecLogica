package modularizacao.lote1;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ex16M {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numDescen;
		double hrT, vlHr, percDesc, sB = 0, sL = 0;
		System.out.println("Digite as Horas Trabalhadas:");
		hrT = entrada.nextDouble();
		
		System.out.println("Digite o valor da Horas: ");
		vlHr = entrada.nextDouble();
		
		System.out.println("Digite o Percentual de Desconto:");
		percDesc = entrada.nextDouble();
		
		System.out.println("Digite o Número de dependentes: ");
		numDescen = entrada.nextInt();
		
		Ex16M sal = new Ex16M();		
		sal.salario(numDescen, hrT, vlHr, percDesc, sB, sL);
	}
	
	
	public void salario(int numDescen, double hrT, double vlHr, double percDesc, double sB, double sL ){
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		sB = (hrT * vlHr);

		percDesc = (percDesc/100);		
		sL = (sB - (sB * percDesc));		
		sL = (sL + 100 * numDescen);
		System.out.println("O seu Salário Líquido é: " + nf.format(sL));
		
		
	}
	

}
