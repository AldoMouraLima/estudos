package Avaliacao_IUnidade;

import java.util.Scanner;

public class Q3x_Rene {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double pagamento = 300;

		double fracionar = 0.66;

		double diasNaoUteis, diasUteis;

		double totalNaoUteis, totalUteis;

		System.out.println("Digite a quantidade de dias �teis: ");

		diasUteis = ler.nextDouble();

		System.out.println("Digite a quantidade de dias n�o �teis: ");

		diasNaoUteis = ler.nextDouble();

		totalNaoUteis = pagamento / ((diasUteis * fracionar) + diasNaoUteis);

		totalUteis = totalNaoUteis * fracionar;

		System.out.println("Valor da tarifa em dias �teis: R$ " + totalUteis);

		System.out.println("Valor da tarifa em dias n�o �teis: R$ " + totalNaoUteis);

		ler.close();

	}

}
