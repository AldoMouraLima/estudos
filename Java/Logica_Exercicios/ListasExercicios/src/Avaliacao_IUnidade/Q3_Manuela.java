package Avaliacao_IUnidade;

import java.util.Scanner;

public class Q3_Manuela {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final double VALORMENSAL = 300, RELACAO = 2/3f;
		int diasUteis, diasNaoUteis;
		double valorDiasUteis, valorDiasNaoUteis;
		System.out.println("_Digite o número de dias uteis no mês: ");
		diasUteis = ler.nextInt();
		System.out.println("Digite o número de dias não uteis no mês: ");
		diasNaoUteis = ler.nextInt();
		valorDiasNaoUteis = VALORMENSAL / ((RELACAO * diasUteis) + diasNaoUteis);
		
		valorDiasUteis = RELACAO * valorDiasNaoUteis;

		System.out.println(valorDiasUteis);
		System.out.printf("\nO valor diário do pedágio para dias úteis é R$ %2.2f.",

		valorDiasUteis);

		System.out.printf("\nO valor diário do pedágio para dias não úteis é R$ %.2f.", valorDiasNaoUteis);
		ler.close();
	}

}
