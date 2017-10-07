package modularizacao.lote1;

import java.util.Scanner;

public class Ex33M {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i, diaIni, mesIni, anoIni, diaFim, mesFim, anoFim;
		Ex33M function = new Ex33M();
	
		System.out.println("Digite o dia, mês e ano:");
		diaIni = entrada.nextInt();
		
		mesIni = entrada.nextInt();
		anoIni = entrada.nextInt();
		
		System.out.println("Digite o dia, mês e ano atual:");
		diaFim = entrada.nextInt();
		mesFim = entrada.nextInt();
		anoFim = entrada.nextInt();
		
		System.out.println(function.datas(diaIni, mesIni, anoIni, diaFim, mesFim, anoFim));

	}

	public String datas(int diaIni, int mesIni, int anoIni, int diaFim, int mesFim, int anoFim){
		int i, ano, mes, dia, bis = 0;
		int quantDias[] = new int[12];
		
		for(i=1;i<12;i++){
			if(i == 2){
				quantDias[i] = 28;
			}else if(i == 4 || i == 6 || i == 9 || i ==11){
				quantDias[i] = 30;
			}else{
				quantDias[i] = 31;
				
			}
		}	
		ano = (anoFim - anoIni);
		mes = (mesFim - mesIni);
		
		if(mes < 0){
			ano = (ano -1);
			mes = (mes + 12);
		}
		
		dia = (diaFim - diaIni);
		if(dia < 0){
			mes = (mes - 1);			
			if (mes < 0){
				ano = (ano - 1);
				mes = (mes + 12);
			}
			dia = dia + quantDias[mes];
		}
		
		for(int c = anoIni; c<=anoFim;c++){
			if(c % 4 == 0){				
				bis = (bis+1);		
				
			}				
		}		
		return "Se passaram: "+ano + " anos "+ mes +" meses " + (dia + bis) + " dias ";
	}
}
