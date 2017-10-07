package lote2.com.fatec.br;

import java.text.NumberFormat;
import java.util.Scanner;

import javax.swing.text.MaskFormatter;



public class SistemaBancario {
	static int dinheiro;
	static int notas[] = new int[6], matriSaque[][] = new int[4][100], vetCont[] = new int[4], matriBanco[][] = new int[4][5];
	static int valorSaque, menu = 0;
	
	public static void main(String[] args) {
			int resp =0;		
			resp = carregaMenu(notas);		
	}
	
	public static int carregaMenu(int[] notas){
		int resp;
		Scanner in = new Scanner(System.in);
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("------------------------------- BEM VINDO --------------------------------");
		System.out.println("---------------------------------- AO ------------------------------------");
		System.out.println("--------------------------- SISTEMA BANCÁRIO -----------------------------");
		System.out.println(" ");
		
		System.out.println("------------------- DIGITE A OPÇÃO DESEJADA A SEGUIR: --------------------");
		System.out.println("--------(1) Carregar Notas-----------");
		System.out.println("--------(2) Retirar Notas------------");
		System.out.println("--------(3) Estatística--------------");
		System.out.println("--------(9) Fim----------");
		resp = in.nextInt();		
		TrataMenu(resp, notas);		
		
		in.close();
		return resp;
	}

	public static void TrataMenu(int resp, int[] notas){
		do{
			switch (resp) {
			case 1:
				carregarNotas(notas);
				resp =0;
				break;
			case 2:
				retirarNotas();
				break;
			case 3:
				gerEstatisticas();
				break;
			case 9:
				System.exit(0);
			default:
				System.out.println("Opção Inválida");
				carregaMenu(notas);		
				break;
			}
		}while(resp != 0);
	}

	private static void gerEstatisticas() {
		Scanner in = new Scanner(System.in);
		int valor=0, aux=0;
		matriBanco[0][1] = 0;
		for(int i=0;i<matriSaque.length;i++){
			for(int j=0;j<matriSaque.length;j++){
				// 1 é o Maior e 2 é o Menor;
				if(matriBanco[i][0] < matriSaque[i][j] || matriBanco[i][0] == 0){
					matriBanco[i][0] = matriSaque[i][j];
				}
				
				if(matriSaque[i][j] < matriBanco[i][1] && matriSaque[i][j] != 0 || matriBanco[i][1] == 0){
					
					matriBanco[i][1] = matriSaque[i][j];
				}
			}	
		if(i == 0) System.out.println("Maior Valor Sacado no Banco do Brasil: " + matriBanco[i][0] + "\n" 
			+ "Menor valor sacado no Banco do Brasil: " + matriBanco[i][1]);
		if(i == 1) System.out.println("Maior Valor Sacado no Santander: " + matriBanco[i][0] + "\n" 
			+ "Menor valor sacado no Santander: " + matriBanco[i][1]);
		if(i == 2) System.out.println("Maior Valor Sacado no Itaú: " + matriBanco[i][0] + "\n" 
				+ "Menor valor sacado no Itaú: " + matriBanco[i][1]);
		if(i == 3) System.out.println("Maior Valor Sacado na Caixa: " + matriBanco[i][0] + "\n" 
				+ "Menor valor sacado na Caixa: " + matriBanco[i][1]);
		}
		
		for(int i=0;i<matriSaque.length;i++){
			for(int j=0;j<matriSaque.length;j++){
				matriBanco[i][2] += matriSaque[i][j];
			}
			if(i == 0 && matriBanco[i][2] != 0) System.out.println("Média dos saques do Banco do Brasil: " + matriBanco[i][2]/vetCont[i]);
			if(i == 1 && matriBanco[i][2] != 0) System.out.println("Média dos saques do Santander: " + matriBanco[i][2]/vetCont[i]);
			if(i == 2 && matriBanco[i][2] != 0) System.out.println("Média dos saques do Itaú " +	matriBanco[i][2]/vetCont[i]);
			if(i == 3 && matriBanco[i][2] != 0) System.out.println("Média dos saques da Caixa " + matriBanco[i][2]/vetCont[i]);
		}
		
		for(int i=0;i<matriSaque.length;i++){
			for(int j=0;j<matriSaque.length;j++){
				matriBanco[i][3] += matriSaque[i][j];
			}
			if(i == 0 && matriBanco[i][3] != 0) System.out.println("O valor total dos saques do Banco do Brasil: " + matriBanco[i][3]);
			if(i == 1 && matriBanco[i][3] != 0) System.out.println("O valor total dos saques do Santander: " + matriBanco[i][3]);
			if(i == 2 && matriBanco[i][3] != 0) System.out.println("O valor total dos saques do Itaú " + matriBanco[i][3]);
			if(i == 3 && matriBanco[i][3] != 0) System.out.println("O Valor total dos saques da Caixa " + matriBanco[i][3]);
		}
		
		for(int i=0;i<matriSaque.length;i++){
			for(int j=0;j<matriSaque.length;j++){
				matriBanco[i][4] += matriSaque[i][j];				
			}
			matriBanco[i][4] -= dinheiro; 
			if(i == 0) System.out.println("O valor restante no caixa do Banco do Brasil: " + matriBanco[i][4]*-1);
			if(i == 1) System.out.println("O valor restante no caixa do Santander: " + matriBanco[i][4]*-1);
			if(i == 2) System.out.println("O valor restante no caixa do Itaú " + matriBanco[i][4]*-1);
			if(i == 3) System.out.println("O valor restante no caixa da Caixa " + matriBanco[i][4]*-1);
		}
		
		
		
		System.out.println("---------------------------------------------" + "\n");
		System.out.println("Tecle ENTER para continuar!");
			
		in.nextLine();
		carregaMenu(notas);
		
		
	}

	private static void retirarNotas() {
		int val, saque[] = new int[6], contSaque[] = new int[6], codBanco;
		Scanner in = new Scanner(System.in);
		System.out.println("Por Favor, Digite o Código do Banco que o senhor(a) é clíente: ");
		System.out.println("Código: " + "\n" + "(1) - Banco do Brasil ");
		System.out.println("(2) - Santander");
		System.out.println("(3) - Itaú");
		System.out.println("(4) - Caixa");
		codBanco = in.nextInt();
		
		if(checaNotas() == false){
			System.out.println("Caixa sem Notas!");
			System.out.println("Por Favor, Insira Notas no Banco!");
			carregaMenu(contSaque);
		}else{			
			System.out.println("Digite o Valor a ser retirado: ");
			val = in.nextInt();
			valorSaque = val;
			if(val <= dinheiro){
				for(int i=0;i<6;i++){
					while(saque[i] < val){
						if(i == 0){
							if(val >= 2){
								saque[i] += 2;
								contSaque[i] ++;
							}else{
								saque[i] += 2;
								contSaque[i] = 0;
							}
						}else if (i == 1){
							if(val >= 5){
								saque[i] += 5;
								contSaque[i] ++;
							}else{
								saque[i] += 5;
								contSaque[i] = 0;
							}
							
						}else if (i == 2){
							if(val >= 10){
								saque[i] += 10;
								contSaque[i] ++;
							}else{
								saque[i] += 10;
								contSaque[i] = 0;
							}
							
						}else if (i == 3){
							if(val >= 20){
								saque[i] += 20;
								contSaque[i] ++;
							}else{
								saque[i] += 20;
								contSaque[i] = 0;
							}
							
						}else if (i == 4){
							if(val >= 50){
								saque[i] += 50;
								contSaque[i] ++;
							}else{
								saque[i] += 50;
								contSaque[i] = 0;
							}
							
						}else if (i == 5){
							if(val >=100){
								saque[i] += 100;
							contSaque[i] ++;
							
							}else{
								saque[i] += 100;
								contSaque[i] = 0;
							}
							
						}
					}			
				}
				System.out.println("Por favor, Escolha uma das Opções a baixo:");
 
				for(int i=0;i<6;i++){
					if(contSaque[i] == 0){
						
					}else{
						if(i == 0 && notas[i] / 2 >= contSaque[i]) System.out.println(i + ") " + "Notas de 2 disponiveis: " + contSaque[i]);
						if(i == 1 && notas[i] / 5 >= contSaque[i]) System.out.println(i + ") " + "Notas de 5 disponiveis: " + contSaque[i]);
						if(i == 2 && notas[i] / 10 >= contSaque[i]) System.out.println(i + ") " + "Notas de 10 disponiveis: " + contSaque[i]);
						if(i == 3 && notas[i] / 20 >= contSaque[i]) System.out.println(i + ") " + "Notas de 20 disponiveis: " + contSaque[i]);
						if(i == 4 && notas[i] / 50 >= contSaque[i]) System.out.println(i + ") " + "Notas de 50 disponiveis: " + contSaque[i]);
						if(i == 5 && notas[i] / 100 >= contSaque[i]) System.out.println(i + ") " + "Notas de 100 disponiveis: " + contSaque[i]);
					}
				}
				int resp = in.nextInt();
			
				switch (resp) {
				case 0:
					notas[0] = notas[0] - (contSaque[0]*2);
					System.out.println("Resta: " + notas[0]);
					break;
				case 1:
					notas[1] = notas[1] - (contSaque[1]*5);
				//	System.out.println("Resta: " + notas[1]);
					break;
				case 2:
					notas[2] = notas[2] - (contSaque[2]*10);
					//System.out.println("Resta: " + notas[2]);
					break;
				case 3:
					notas[3] = notas[3] - (contSaque[3]*20);
					//System.out.println("Resta: " + notas[3]);
					break;
				case 4:
					notas[4] = notas[4] - (contSaque[4]*50);
					//System.out.println("Resta: " + notas[4]);
					break;
				case 5:
					notas[5] = notas[5] - (contSaque[5]*100);
					//System.out.println("Resta: " + notas[5]);
					break;	
				default:
					System.out.println("Opção inválida!");
					carregaMenu(contSaque);
					break;
				}
		
				System.out.println("VALOR SACADO COM SUCESSO!");
				vetCont[codBanco-1]++;
			gerenciaBanco(codBanco, val);
				carregaMenu(contSaque);
			}else{
				System.out.println("EXCEDEU O LIMITE DO CAIXA");
				System.exit(0);
			}
		}		
	}
	
	public static void gerenciaBanco(int codBanco, int saque){
		
		switch (codBanco) {
		case 1:
			matriSaque[0][vetCont[codBanco]] = saque;
			break;
		case 2:
			matriSaque[1][vetCont[codBanco]] = saque;
			break;
		case 3:
			matriSaque[2][vetCont[codBanco]] = saque;
			break;
		case 4:
			matriSaque[3][vetCont[codBanco]] = saque;
			break;

		default:
			break;
		}
		
	}

	

	public static double carregarNotas(int[] notas){
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		Scanner in = new Scanner(System.in);
		int val = 0;
		for(int i=0;i<6;i++){
			if(i == 0){
				System.out.println("Digite a quantidade de notas de 2 à ser inserida: ");
				notas[i] += in.nextInt() * 2;
			}else if (i == 1){
				System.out.println("Digite a quantidade de notas de 5 à ser insetida: ");
				notas[i] += in.nextInt() * 5;
			}else if (i == 2){
				System.out.println("Digite a quantidade de notas de 10 à ser inserida: ");
				notas[i] += in.nextInt() * 10;
			}else if (i == 3){
				System.out.println("Digite a quantidade de notas de 20 à ser inserida: ");
				notas[i] += in.nextInt() * 20;
			}else if(i == 4){
				System.out.println("Digite a quandidade de notas de 50 à ser inserida: ");
				notas[i] += in.nextInt() * 50;
			}else if (i == 5){
				System.out.println("Digite a quantidade de notas de 100 à ser inserida: ");
				notas[i] += in.nextInt() * 100;
			}
			
		}
		for(int i=0;i<6;i++){
			val = val + notas[i];
		}
		
		System.out.println("Notas Carregadas com Sucesso!");
		System.out.println("Valor Carregado: " + nf.format(val));
		dinheiro = val;
		carregaMenu(notas);
		return val;
	}
	

	
	public static boolean checaNotas(){
		for(int i =0;i<6;i++){
			if(i == 0 && notas[i] / 2 == 0) return false;
			if(i == 1 && notas[i] / 5 == 0) return false;
			if(i == 2 && notas[i] / 10 == 0) return false;
			if(i == 3 && notas[i] / 20 == 0) return false;
			if(i == 4 && notas[i] / 50 == 0) return false;
			if(i == 5 && notas[i] / 100 == 0) return false;
		}		
		
		return true;
	}
}