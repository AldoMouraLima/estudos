package Avaliacao_IUnidade;

import java.util.Scanner;

public class Q3z_Andre {

	public static void main(String[] args) {
		double valorPedagio= 300;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de dias dias �teis: ");
		double diasUteis = sc.nextDouble();
		System.out.print("Digite a quantidade de dias n�o �teis: ");
		double diasNaoUteis = sc.nextDouble();
		
		// Express�o: 300 = (vdnu * 2/3 * diasUteis) + (vdnu * diasNaoUteis)
		double valorDiaNaoUtil = (double) valorPedagio / ((((double)2/3) * diasUteis) + diasNaoUteis);
		double valorDiaUtil = (double)2/3 * valorDiaNaoUtil;
		
		System.out.println("\nValor para Dias �teis: R$" + String.format("%.2f", valorDiaUtil));
		System.out.println("Valor para Dias N�o �teis: R$ " + String.format("%.2f", valorDiaNaoUtil));

	}

}
