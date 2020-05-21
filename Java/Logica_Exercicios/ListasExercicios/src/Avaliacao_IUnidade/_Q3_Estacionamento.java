package Avaliacao_IUnidade;

import java.util.Scanner;

public class _Q3_Estacionamento {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Informe o custo semanal do estacionamento: R$ ");
		float valorSemanal = ler.nextFloat();
		
		/* 1 quinto é a unidade comum entre os dois tipos de dias, sendo: 
		 *   1 dia não útil = 5 quintos
		 *   1 dia útil     = 6 quintos
		 *  
		 * Multiplicando a quantidade de dias pela quantidade de quintos do dia,
		 * temos a quantidade de quintos da semana. Fazemos isso para os 2 tipos de dias
		 * int unidadesDiasNaoUteis = 2 * 5;
		 * int unidadesDiasUteis    = 5 * 6;
		 * 
		 * Somando os resultados, temos as UNIDADES (quintos) NA SEMANA
		 * unidadesSemana = unidadesDiasNaoUteis + unidadesDiasUteis;
		 */
		
		// Calculando a quantidade de unidades (quintos) que tem na semana
		
		float unidadesSemana = 2 * 5 + 5 * 6;
		float valorUnidade = valorSemanal / unidadesSemana;
		System.out.println(unidadesSemana);
		System.out.println(valorUnidade);
		
		float valorDiasUteis = valorUnidade * 6;
		float valorDiasNaoUteis = valorUnidade * 5;
		System.out.printf("\nDias úteis     R$ %7.2f",valorDiasUteis);
		System.out.printf("\nDias não úteis R$ %7.2f",valorDiasNaoUteis);
		ler.close();
	}

}
