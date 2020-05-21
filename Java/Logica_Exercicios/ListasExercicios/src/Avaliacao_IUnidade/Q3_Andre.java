package Avaliacao_IUnidade;

import java.util.Scanner;

public class Q3_Andre {

	public static void main(String[] args) {
		double valorPedagio= 300;
		

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de dias dias úteis: ");
		double diasUteis = sc.nextDouble();
		System.out.print("Digite a quantidade de dias não úteis: ");
		double diasNaoUteis = sc.nextDouble();
		
		// Expressão:
		//300 = (vdnu * 2/3 * diasUteis) + (vdnu * diasNaoUteis)
		
		double valorDiaNaoUtil =  300 / ((2/3 * diasUteis) + diasNaoUteis);
		
		System.out.println(valorDiaNaoUtil);
		double valorDiaUtil = 2/3 * valorDiaNaoUtil;
		
		System.out.println("\nValor para Dias Úteis: R$" + String.format("%.2f", valorDiaUtil));
		System.out.println("Valor para Dias Não Úteis: R$ " + valorDiaNaoUtil);
		sc.close();

	}

}
