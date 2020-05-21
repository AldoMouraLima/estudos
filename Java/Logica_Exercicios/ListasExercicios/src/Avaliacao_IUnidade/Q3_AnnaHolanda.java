package Avaliacao_IUnidade;

import java.util.Scanner;

public class Q3_AnnaHolanda {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final float valorMensalPedagio = 300f;
		int qtdDiasUteis, qtdDiasNaoUteis;
		float valorDiasUteis, valorDiasNaoUteis;
		
		System.out.print("Digite a quantidade de dias úteis do mês: ");
		qtdDiasUteis = teclado.nextInt();
		System.out.print("Digite a quantidade de dias não úteis do mês: ");
		qtdDiasNaoUteis = teclado.nextInt();
		
		valorDiasUteis = ((valorMensalPedagio/3) * 2) / qtdDiasUteis; 
		valorDiasNaoUteis = (valorMensalPedagio/3) / qtdDiasNaoUteis;
		
		System.out.printf("O valor do pedágio nos dias úteis é de R$ %.2f.\n", valorDiasUteis);
		System.out.printf("O valor do pedágio nos dias não úteis é de R$ %.2f.", valorDiasNaoUteis);
		teclado.close();


	}

}
