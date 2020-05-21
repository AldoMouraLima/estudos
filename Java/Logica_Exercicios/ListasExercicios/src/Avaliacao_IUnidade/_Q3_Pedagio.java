package Avaliacao_IUnidade;

import java.util.Scanner;

public class _Q3_Pedagio {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		final float VALORMENSAL = 300f;

		System.out.println("Quantidade de dias úteis: ");
		int diasUteis = ler.nextInt();

		System.out.println("Quantidade de dias não úteis: ");
		int diasNaoUteis = ler.nextInt();

		/* 1 terços é a unidade comum entre os dois tipos de dias, sendo: 
		 *   1 dia não útil = 3 terços
		 *   1 dia útil     = 2 terços
		 *  
		 * Multiplicando a quantidade de dias pelo quantidade de terços do dia,
		 * temos a quantidade de terços do mês. Fazemos isso para os 2 tipos de dias
		 * int unidadesDiasNaoUteis = diasNaoUteis * 3;
		 * int unidadesDiasUteis    = diaUteis * 2;
		 * 
		 * Somando os resultados, temos as UNIDADES (terços) NO MÊS
		 * unidadesMes = unidadesDiasNaoUteis + unidadesDiasUteis;
		 */
		
		// Calculando a quantidade de unidades (terços) que tem no mês
		int unidadesMes = diasNaoUteis * 3 + diasUteis * 2;

		// Calculando o valor de 1 unidade
		float valorUnidade = VALORMENSAL / unidadesMes;

		// Calculando o valor de 1 dia por tipo de dia
		float valorDiasUteis = valorUnidade * 2;
		float valorDiasNaoUteis = valorUnidade * 3;

		System.out.printf("\nDias úteis     R$ %7.2f",valorDiasUteis);
		System.out.printf("\nDias não úteis R$ %7.2f",valorDiasNaoUteis);
		ler.close();

	}

}
