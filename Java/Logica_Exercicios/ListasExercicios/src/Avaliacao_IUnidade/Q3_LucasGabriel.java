package Avaliacao_IUnidade;

import java.util.Scanner;

public class Q3_LucasGabriel {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double pedagio = 300;
		
		System.out.print("Informe a quantidade de dias �teis: ");
		int diasU = ler.nextInt();
		System.out.print("Informe a quantidade de dias n�o �teis: ");
		int diasNU = ler.nextInt();

		int totalD = diasNU + diasU;
		double valNU = (pedagio / totalD) + 2.86;
		double valU = (valNU * 2) / 3;
		
		System.out.printf("Valor do ped�gio em dias �teis: %.2f reais.", valU);
		System.out.printf("\nValor do ped�gio em dias n�o �teis: %.2f reais.", valNU);
		
		ler.close();

	}

}
