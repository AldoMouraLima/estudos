package Avaliacao_IUnidade;

import java.util.Scanner;

public class Q4_Alberto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		final double Conta = 20;
		final double descontoComida = 0.10;
		final double descontoBebida = 0.05;
		char escolha;
		double totalComida;
		double totalBebida;
		double valor = 0;
		double acumulador = 0;

		do {
			System.out.println("------CANTINA------");
			System.out.println("B - Bebida");
			System.out.println("C - Comida");
			System.out.println("F - Finalizar");
			escolha = ler.next().toUpperCase().charAt(0);
			switch (escolha) {
			case 'B':
				System.out.printf("Digite o valor: R$");
				valor = ler.nextDouble();
				totalBebida = valor - (valor * descontoBebida);
				if (totalBebida > Conta) {
					System.out.println("Desculpe, saldo insuficiente. Tente novamente.");
					continue;
				}

				else {
					acumulador = acumulador + totalBebida;
					if (acumulador > Conta) {
						System.out.println("Desculpe, você ultrapassou o limite. Tente novamente.");
						continue;
					}
					System.out.println("Total usado até agora: R$" + acumulador);
				}
				break;
			case 'C':
				System.out.printf("Digite o valor: R$");
				valor = ler.nextDouble();
				totalComida = valor - (valor * descontoComida);
				if (totalComida > Conta) {
					System.out.println("Desculpe, saldo insuficiente. Tente novamente.");
					continue;
				}

				else {
					acumulador = acumulador + totalComida;
					if (acumulador > Conta) {
						System.out.println("Desculpe, você ultrapassou o limite. Tente novamente.");
						continue;
					}
				}
				System.out.println("Total usado até agora: R$" + acumulador);
				break;
			case 'F':
				System.out.println("---Programa Finalizado---");
			}
		} while (escolha != 'F');
	}


}
