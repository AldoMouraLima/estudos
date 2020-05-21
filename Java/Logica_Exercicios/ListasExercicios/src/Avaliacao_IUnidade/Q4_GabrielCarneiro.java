package Avaliacao_IUnidade;

import java.util.Scanner;

public class Q4_GabrielCarneiro {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int contadorPecas = 0;
		double valorTotal = 0;
		Double[] itens = new Double[6];
		for (int i = 0; i < itens.length; i++) {

			System.out.println("Valor do produto: ");
			itens[i] = read.nextDouble();
			read.nextLine();
			System.out.println("Qual tipo de 'P' ou 'S'?");

			String tipoItem = read.nextLine();
			switch (tipoItem.toUpperCase().charAt(0)) {
			case 'P':

				itens[i] = itens[i] - (itens[i] * 0.2);

				contadorPecas++;
				break;

			case 'S':

				itens[i] = itens[i] - (itens[i] * 0.1);

				break;
			default:

				System.out.println("Item nao existente");

				i--;
				continue;

			}
			if (itens[i] > 1000) {

				System.out.println("Valou passou do limite");

				break;

			}
			valorTotal += itens[i];

		}
		System.out.printf("Quantidade de pecas: %d %n", contadorPecas);

		System.out.printf("Valor total: %.2f", valorTotal);
		read.close();

	}

}
