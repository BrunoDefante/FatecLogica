package modularizacao.lote1;

import java.util.Scanner;

public class Ex41M {
	static double num = 0, maior = 0, menor = 0;
	
	public static void main(String[] args){
		Ex41M func = new Ex41M();
		Scanner entrada = new Scanner(System.in);
		for(int i = 1;i<=4;i++){
			System.out.println("Digite o valor: " + i);
			num = entrada.nextDouble();
			if(num<0){
				System.out.println("Os Valores tem que ser positivos:");
				System.exit(0);
			}else{
				func.menorMaior(num, maior, menor);
			}
		}
		System.out.println(func.menorMaior(num, maior, menor));
	}
	
	public String menorMaior(double num, double maior, double menor){
		if(num > maior){
			Ex41M.maior = num;
		}
		if(num < menor || menor == 0){
			Ex41M.menor = num;
		}
		return "Maior: " + maior + "Manor: " + menor;
	}
}