package Avaliacao_IUnidade;

import java.util.Scanner;

public class Q3_Naiana {

	public static void main(String[] args) {

	        Scanner ler = new Scanner(System.in);

	        
	        int diasUteis,diasNuteis;
	        float util = 0.67f, nUtil = 0.33f;
	        float valorMensal = 300;
	        
	        
	        System.out.println("Informe quantos dias �teis:");
	        diasUteis = ler.nextInt();
	        System.out.println("Informe quantos dias  n�o �teis:");
	        diasNuteis = ler.nextInt();

	        float totalUtil = (valorMensal*util)/diasUteis;
	        float totalNutil = (valorMensal*nUtil)/diasNuteis;
	       
	        System.out.printf("\nO valor do ped�gio em dias �teis �      R$: %7.2f", totalUtil);
	        System.out.printf("\nO valor do ped�gio em dias  n�o �teis � R$: %7.2f", totalNutil);
	        ler.close();

	}

}
