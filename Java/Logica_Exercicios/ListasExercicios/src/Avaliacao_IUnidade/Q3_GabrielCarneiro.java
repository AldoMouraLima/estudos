package Avaliacao_IUnidade;

import java.util.Scanner;

public class Q3_GabrielCarneiro {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		double valorPedagio = 300;
		int diasUteis;
		System.out.println("Digite a quantidade de dias do mês: ");
		diasUteis = read.nextInt();
		double totalUteis = valorPedagio / diasUteis;
		double totalNaoUteis = (totalUteis * 2) / 3;
		System.out.printf("Valor do pedagio em dias uteis: %.2f %n", totalUteis);

		System.out.printf("Valor do pedagio em dias nao uteis: %.2f", totalNaoUteis);

		read.close();

	}

}
