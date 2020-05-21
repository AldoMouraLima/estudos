package Avaliacao_IUnidade;

import java.util.Scanner;

public class __Q4AB {

	public static void main(String[] args) {
		/*
		 * O valor mensal de um pedágio é R$ 300,00. Mensalmente o valor diário é
		 * ajustado, de acordo com a quantidade de dias úteis e de dias não úteis do
		 * mês. O valor de dias uteis é 2/3 do valor de dias não úteis.
		 */
		Scanner ler = new Scanner(System.in);
		

		final float VALORMENSAL = 300f;

		int diasUteis = ler.nextInt();
		int diasNaoUteis = ler.nextInt();
		
		float valorUnidade = VALORMENSAL / (diasUteis * 2 + diasNaoUteis * 3);
		float valorDiaUteis = valorUnidade * 2;
		float valorDiaNaoUteis = valorUnidade * 3;
				

		System.out.println(valorDiaUteis);
		System.out.println(valorDiaNaoUteis);
		
		
		

	}

}
