package Avaliacao_IUnidade;

import java.util.Scanner;

public class _Q3_Pedagio {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		final float VALORMENSAL = 300f;

		System.out.println("Quantidade de dias �teis: ");
		int diasUteis = ler.nextInt();

		System.out.println("Quantidade de dias n�o �teis: ");
		int diasNaoUteis = ler.nextInt();

		/* 1 ter�os � a unidade comum entre os dois tipos de dias, sendo: 
		 *   1 dia n�o �til = 3 ter�os
		 *   1 dia �til     = 2 ter�os
		 *  
		 * Multiplicando a quantidade de dias pelo quantidade de ter�os do dia,
		 * temos a quantidade de ter�os do m�s. Fazemos isso para os 2 tipos de dias
		 * int unidadesDiasNaoUteis = diasNaoUteis * 3;
		 * int unidadesDiasUteis    = diaUteis * 2;
		 * 
		 * Somando os resultados, temos as UNIDADES (ter�os) NO M�S
		 * unidadesMes = unidadesDiasNaoUteis + unidadesDiasUteis;
		 */
		
		// Calculando a quantidade de unidades (ter�os) que tem no m�s
		int unidadesMes = diasNaoUteis * 3 + diasUteis * 2;

		// Calculando o valor de 1 unidade
		float valorUnidade = VALORMENSAL / unidadesMes;

		// Calculando o valor de 1 dia por tipo de dia
		float valorDiasUteis = valorUnidade * 2;
		float valorDiasNaoUteis = valorUnidade * 3;

		System.out.printf("\nDias �teis     R$ %7.2f",valorDiasUteis);
		System.out.printf("\nDias n�o �teis R$ %7.2f",valorDiasNaoUteis);
		ler.close();

	}

}
