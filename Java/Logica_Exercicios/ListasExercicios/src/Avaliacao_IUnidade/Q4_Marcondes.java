package Avaliacao_IUnidade;

import java.util.Scanner;

public class Q4_Marcondes {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float ValorItem;
		String Tipo;
		int Contador = 1;
		int QuantidadePe�as = 0;
		int ValorTotal = 0;

		System.out.println("Programa Manuten��o");
		System.out.println();

		while (Contador < 7) {

			System.out.println("Escreva o valor do " + Contador + " item: ");
			ValorItem = leia.nextFloat();

			if (ValorItem > 1000) {

				System.out.println("ERRO!");
				System.out.println("� permitido apenas valores menores que 1000R$");
				break;

			}

			System.out.println("Escreva tamb�m o tipo do item: (P/S)");
			Tipo = leia.next();
			System.out.println();

			if (Tipo.toUpperCase().equals("P")) {

				ValorItem = ValorItem - (ValorItem * 0.1f);
				QuantidadePe�as += 1;

			}

			if (Tipo.toUpperCase().equals("S")) {

				ValorItem = ValorItem - (ValorItem * 0.2f);

			}

			ValorTotal += ValorItem;
			Contador++;
		}

		if (Contador >= 7) {

			System.out.println("Quantidade de Pe�as: " + QuantidadePe�as);
			System.out.println("Valor Total: " + ValorTotal);

		}
	}

}
