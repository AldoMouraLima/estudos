package Avaliacao_IUnidade;

import java.util.Scanner;

public class Q3_Manuela {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final double VALORMENSAL = 300, RELACAO = 2/3f;
		int diasUteis, diasNaoUteis;
		double valorDiasUteis, valorDiasNaoUteis;
		System.out.println("_Digite o n�mero de dias uteis no m�s: ");
		diasUteis = ler.nextInt();
		System.out.println("Digite o n�mero de dias n�o uteis no m�s: ");
		diasNaoUteis = ler.nextInt();
		valorDiasNaoUteis = VALORMENSAL / ((RELACAO * diasUteis) + diasNaoUteis);
		
		valorDiasUteis = RELACAO * valorDiasNaoUteis;

		System.out.println(valorDiasUteis);
		System.out.printf("\nO valor di�rio do ped�gio para dias �teis � R$ %2.2f.",

		valorDiasUteis);

		System.out.printf("\nO valor di�rio do ped�gio para dias n�o �teis � R$ %.2f.", valorDiasNaoUteis);
		ler.close();
	}

}
