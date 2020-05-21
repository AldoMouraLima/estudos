package Avaliacao_IUnidade;

import java.util.Scanner;

public class Q3x_GabrielCarneiro {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		double valorMensal = 300;
		double percentual = 0.6667; // porcentagem de 2/3 de 100 parte dos dias não uteis

		System.out.println("Dias uteis: ");
		int diasUteis = read.nextInt();
		System.out.println("Dias não uteis: ");
		int diasNaoUteis = read.nextInt();

		double totalDiasNaoUteis = valorMensal / ((diasUteis * percentual + diasNaoUteis));
		double totalDiasUteis = totalDiasNaoUteis * percentual;

		System.out.printf("Por dia Uteis: %.2f%n", totalDiasUteis);
		System.out.printf("Por dia nao uteis: %.2f%n", totalDiasNaoUteis);

		System.out.printf("Total no mes apenas dias uteis: %.2f%n", totalDiasUteis * diasUteis);
		System.out.printf("Total no mes só nao uteis: %.2f", totalDiasNaoUteis * diasNaoUteis);
		read.close();

	}

}
