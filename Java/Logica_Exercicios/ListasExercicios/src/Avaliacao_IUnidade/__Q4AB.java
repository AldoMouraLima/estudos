package Avaliacao_IUnidade;

import java.util.Scanner;

public class __Q4AB {

	public static void main(String[] args) {
		/*
		 * O valor mensal de um ped�gio � R$ 300,00. Mensalmente o valor di�rio �
		 * ajustado, de acordo com a quantidade de dias �teis e de dias n�o �teis do
		 * m�s. O valor de dias uteis � 2/3 do valor de dias n�o �teis.
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
