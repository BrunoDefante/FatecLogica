package modularizacao.lote1;

import java.util.Scanner;

public class Ex40M {

	public static void main(String[] args) {
		Ex40M func = new Ex40M();
		Scanner entrada = new Scanner(System.in);
    	int val, a = 1, b = 0, c = 0;
    	System.out.println("Digite o Número de termos que deseja ver:");
    	val = entrada.nextInt();
    	
    	System.out.println(func.Fibonacci(val, a, b, c));

	}
	
	public String Fibonacci(int val, int a, int b, int c){
		for(int i = 1;i <= val; i++){
			c = (a+b);
			a = b;
			b = c;
	        System.out.print("(" + i + "):" + c + "\n");
		}		
		return "";
		
	}


}

	

