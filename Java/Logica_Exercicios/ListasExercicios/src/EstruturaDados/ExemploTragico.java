package EstruturaDados;

import java.util.Scanner;

public class ExemploTragico {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		/* O pre�o de custo de um produto aumentou 10%.
		 * Mantendo-se o pre�o de venda, quantas vezes o
		 * pre�o de venda cont�m o valor do lucro */
		final float PERC = 10f;
		System.out.print("Pre�o de Venda: ");
		float prVenda = ler.nextFloat();
		System.out.print("Pre�o de Custo: ");
		float prCusto = ler.nextFloat();
		float novoPrCusto = prCusto*(1+PERC/100);
		float vlLucro = prVenda-novoPrCusto;
		float contem = prVenda/vlLucro;			
		System.out.printf("\nNovo Custo  : %9.2f", novoPrCusto);
		System.out.printf("\nValor Lucro : %9.2f", vlLucro);
		System.out.println();
		System.out.printf("\nPr. de venda: %9.2f ", prVenda);
		System.out.printf("\ncont�m: %7.5f vez(es)", contem);
		System.out.printf("\no lucro     : %9.2f", vlLucro);

		System.out.println();
		ler.close();
	}
}
