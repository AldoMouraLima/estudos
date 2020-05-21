package Avaliacao_IUnidade;

import java.util.Scanner;

public class Q3_JoseMarcos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final double TAXA_ADICIONAL = 0.2;

		int dia;
		double valorDiaria, valorApagar = 0;

		System.out.println("Informe o valor da diária: R$ ");
		valorDiaria = sc.nextDouble();

		System.out.println("Informe o Dia conforme abaixo:");
		System.out.println("1 = Dom, 2 = Seg, 3 = Ter, 4 = Qua, 5 = Qui, 6 = Sex, 7 = Sab");
		dia = sc.nextInt();

		switch (dia) {

		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			valorApagar = valorDiaria + (valorDiaria * TAXA_ADICIONAL);

			break;

		case 1:
		case 7:
			valorApagar = valorDiaria;

		default:

			break;
		}

		System.out.printf("Valor a pagar referente o estacionamento: R$ %.2f", valorApagar);

		sc.close();


	}

}
