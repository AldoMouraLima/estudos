package Avaliacao_IUnidade;

import java.util.Scanner;

public class Q4_Manuela {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final double VALORMAXIMO = 1000;
		final double DESCONTOPECA = 0.1;
		final double DESCONTOSERVICO = 0.2;
		String tipoItem;
		double valorItem, valorComDesconto, valorTotal = 0;
		int quantPecas = 0;
		for (int i = 0; i < 6; i++) {
			do {
				System.out.printf("Digite o tipo do %do item [P/S]: ", i + 1);
				tipoItem = ler.nextLine();
				tipoItem = tipoItem.toUpperCase();
				if (!tipoItem.equals("P") && !tipoItem.equals("S")) {
					System.out.println("Tipo de item inválido. Digite P (Peça) ou S (Serviço).");

				}
			} while (!tipoItem.equals("P") && !tipoItem.equals("S"));
			System.out.println("Digite o valor do item: ");
			valorItem = ler.nextDouble();
			ler.nextLine();
			if (tipoItem.equals("P")) {
				quantPecas = quantPecas + 1;
				valorComDesconto = valorItem * (1 - DESCONTOPECA);
			} else {
				valorComDesconto = valorItem * (1 - DESCONTOSERVICO);
			}
			valorTotal = valorTotal + valorComDesconto;
			if (valorTotal < VALORMAXIMO) {
				continue;
			} else {

				System.out.println("Novo item não pode ser adicionado, pois atingiu o valor máximo para manutenção.");

				valorTotal = valorTotal - valorComDesconto;
				break;
			}
		}
		System.out.printf("\nA quantidade de peças utilizadas foi %d.", quantPecas);
		System.out.printf("\nO valor total da manutenção foi R$ %.2f.", valorTotal);

		ler.close();

	}

}
