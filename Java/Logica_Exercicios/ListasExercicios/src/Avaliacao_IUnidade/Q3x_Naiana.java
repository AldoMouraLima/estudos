package Avaliacao_IUnidade;

import java.util.Scanner;

public class Q3x_Naiana {

	public static void main(String[] args) {
	       Scanner ler = new Scanner(System.in);

	        int diasUteis, diasNuteis;
	        float util, nUtil;
	        float valorMes = 300;

	        System.out.println("Informe quantos dias ùteis:");
	        diasUteis = ler.nextInt();
	        System.out.println("Informe quantos dias NÃO ùteis:");
	        diasNuteis = ler.nextInt();

	        nUtil = (valorMes / (diasNuteis + diasUteis * (float) 2 / 3));
	        util = (nUtil * 2) / 3;

	        System.out.printf("\nO valor do pedágio em dias úteis é      R$: %7.2f", util);
	        System.out.printf("\nO valor do pedágio em dias  não úteis é R$: %7.2f", nUtil);
	        ler.close();

	}

}
