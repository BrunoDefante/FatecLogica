/*
 *  Nome do programador: Bruno Defante da Silva;
 *  Data de elabora��o: 03/08/2017;
 *  Objetivo: Receba a base e a altura de um tri�ngulo. Calcule e mostre a sua �rea
15%
 */

package lote1.com.fatec.br;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		double base, altura, area;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o comprimento da Base do Tri�ngulo: ");
		base = entrada.nextDouble();
		System.out.println("Digite a Altura do Triangulo: ");
		altura = entrada.nextDouble();
		
		area = ((base*altura)/2);
		
		System.out.println("A Base do deste Tri�ngulo � de: " + area + " M2");

	}

}
