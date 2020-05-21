package Avaliacao_IUnidade;

import java.util.Scanner;

public class Q3_LucasGabriel {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double pedagio = 300;
		
		System.out.print("Informe a quantidade de dias úteis: ");
		int diasU = ler.nextInt();
		System.out.print("Informe a quantidade de dias não úteis: ");
		int diasNU = ler.nextInt();

		int totalD = diasNU + diasU;
		double valNU = (pedagio / totalD) + 2.86;
		double valU = (valNU * 2) / 3;
		
		System.out.printf("Valor do pedágio em dias úteis: %.2f reais.", valU);
		System.out.printf("\nValor do pedágio em dias não úteis: %.2f reais.", valNU);
		
		ler.close();

	}

}
