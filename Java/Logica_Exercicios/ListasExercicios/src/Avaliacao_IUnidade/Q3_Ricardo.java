package Avaliacao_IUnidade;

import java.util.Locale;
import java.util.Scanner;

public class Q3_Ricardo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int valorMensalPedagio = 300;
		int diasUteis = sc.nextInt();
		int diasNaoUteis = sc.nextInt();
		
		double valorDiasUteis = 300 / (diasUteis + ((3.0/2.0)*diasNaoUteis));
		double valorDiasNaoUteis = (300 - (diasUteis*valorDiasUteis))/diasNaoUteis;

		System.out.printf("O valor do pedágio em dias úteis é: R$ %.2f%n", valorDiasUteis);
		System.out.printf("O valor do pedágio em dias não úteis é: R$ %.2f%n", valorDiasNaoUteis);
		
		sc.close();


	}

}
