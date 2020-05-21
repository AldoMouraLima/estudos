package Avaliacao_IUnidade;

import java.util.Scanner;

public class Q3x_JoseMarcos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final double ADD_TAXA_DIAS_UTEIS = 0.20; // 20% de acrescimo seg a sex
		final double TAXA_DIA = 0.1429; // representa 1/7 ( 7 dias da semana)

		int semana = 7, diasUteis = 5, diasFinalSemana = 2;
		double representacaoDia, valorSemanal, valorTaxa, valorDiasUteis = 0, valorDiaria, totalDiasUteis,
				totalFinalSemana, valorDiariaFinalSemana;

		System.out.println("Informe Valor Semanal do Estacionamento: R$ ");
		valorSemanal = sc.nextDouble();

		valorDiaria = valorSemanal / semana;
		representacaoDia = valorDiaria * TAXA_DIA;
		valorTaxa = valorDiaria * ADD_TAXA_DIAS_UTEIS;

		valorDiariaFinalSemana = valorDiaria - representacaoDia;
		valorDiasUteis = (valorDiaria + valorTaxa) - representacaoDia;

		totalFinalSemana = valorDiariaFinalSemana * diasFinalSemana;
		totalDiasUteis = valorDiasUteis * diasUteis;

		System.out.println("Valor Seg a Sex / Final se Semana:");
		System.out.println("Total Sab e Dom: R$ " + String.format("%.2f", totalFinalSemana));
		System.out.println("Total Seg a Sex: R$ " + String.format("%.2f", totalDiasUteis));

		System.out.println("\nValor Diária Seg a Sex / Final se Semana:");
		System.out
				.println("Valor da vaga em dias finais de semana: R$ " + String.format("%.2f", valorDiariaFinalSemana));
		System.out.println("Valor cobrado em dias úteis: R$ " + String.format("%.2f", valorDiasUteis));

		sc.close();
	}

}
