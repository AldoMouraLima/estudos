package Revisao3;

import java.util.Scanner;

public class MesExtenso {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String dia="";
		String mes="";
		String ano="";

		do {
			System.out.println("\nInforme uma data no formato dd/mm/aaaa: ");
			String data = ler.next();
			
			dia = data.substring(0,2);
			mes = data.substring(3,5);
			ano = data.substring(6);
			
			int diaInt = Integer.parseInt(dia);
			int mesInt = Integer.parseInt(mes);
			int anoInt = Integer.parseInt(ano); 
			
			String primeiraBarra = data.substring(2,3);
			String segundaBarra  = data.substring(5,6);
			
			if (!(primeiraBarra.equals("/")) || !(segundaBarra.equals("/"))) {
				System.out.println("\nData no formato inválido");
				continue;
			}
			
			if (diaInt<1 || diaInt >31) {
				System.out.println("\nDia inválido");
				continue;
			}
			if (mesInt<1 || mesInt >12) {
				System.out.println("\nMês inválido");
				continue;
			}
			
			if (diaInt==31 && (mesInt==2 || mesInt==4 || mesInt==6 || mesInt==9 || mesInt==11)) {
				System.out.printf("\nDia inválido para o mês %s", mes);
				continue;				
			}
			
			break;
		} while (true);
		
		String mesExtenso="";
		if (mes.equals("01")) mesExtenso="Janeiro";
		if (mes.equals("02")) mesExtenso="Fevereiro";
		if (mes.equals("03")) mesExtenso="Março";	
		if (mes.equals("04")) mesExtenso="Abril";	
		if (mes.equals("05")) mesExtenso="Maio";	
		if (mes.equals("06")) mesExtenso="Junho";	
		if (mes.equals("07")) mesExtenso="Julho";	
		if (mes.equals("08")) mesExtenso="Agosto";
		if (mes.equals("09")) mesExtenso="Setembro";
		if (mes.equals("10")) mesExtenso="Outubro";
		if (mes.equals("11")) mesExtenso="Novembro";
		if (mes.equals("12")) mesExtenso="Dezembro";
		
		System.out.println(dia+" de "+mesExtenso+" de "+ano);
		ler.close();
	}

}
