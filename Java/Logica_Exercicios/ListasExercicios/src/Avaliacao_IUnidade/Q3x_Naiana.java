package Avaliacao_IUnidade;

import java.util.Scanner;

public class Q3x_Naiana {

	public static void main(String[] args) {
	       Scanner ler = new Scanner(System.in);

	        int diasUteis, diasNuteis;
	        float util, nUtil;
	        float valorMes = 300;

	        System.out.println("Informe quantos dias �teis:");
	        diasUteis = ler.nextInt();
	        System.out.println("Informe quantos dias N�O �teis:");
	        diasNuteis = ler.nextInt();

	        nUtil = (valorMes / (diasNuteis + diasUteis * (float) 2 / 3));
	        util = (nUtil * 2) / 3;

	        System.out.printf("\nO valor do ped�gio em dias �teis �      R$: %7.2f", util);
	        System.out.printf("\nO valor do ped�gio em dias  n�o �teis � R$: %7.2f", nUtil);
	        ler.close();

	}

}
