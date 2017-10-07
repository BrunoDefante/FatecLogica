package lote1.com.fatec.br;

import java.util.Scanner;

public class Ex40 {
	
	
    public static void main(String[] args) {
    	Scanner entrada = new Scanner(System.in);
    	int val, a = 1, b = 0, c;
    	System.out.println("Digite o Número de termos que deseja ver:");
    	val = entrada.nextInt();
   
	for (int i = 1; i <= val; i++) {
		c = (a + b);
		a = b;
		b = c;		
            System.out.print("(" + i + "):" + c + "\n");   
            
        }
	System.out.println();
    }  
    
}
