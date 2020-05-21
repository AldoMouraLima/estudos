package Avaliacao_IUnidade;

import java.util.Scanner;

public class __Q4_CD {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o valor mensal do estacional: R$ ");
		float valorSemanal = ler.nextFloat();
		
		float unidadesSemana = 2 * 5 + 5 * 6;
		float valorUnidade = valorSemanal / unidadesSemana;

		float valorDiasUteis = valorUnidade * 6;
		float valorDiasNaoUteis = valorUnidade * 5;
		System.out.printf("\nDias úteis     R$ %7.2f",valorDiasUteis);
		System.out.printf("\nDias não úteis R$ %7.2f",valorDiasNaoUteis);
		ler.close();

		
		

	}

}
