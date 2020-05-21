package Avaliacao_IUnidade;

import java.util.Scanner;

public class Q4_JoseMarcos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double valor = 0, acumulador = 0;
		String tipo;

		int cont = 0;

		boolean infValida = false;

		do {

			do {
				cont++;
				System.out.printf("Entre com Valor da %dª peça R$: ", cont);
				valor = sc.nextDouble();
				acumulador = acumulador + valor;
				if (acumulador <= 1000) {
					infValida = true;
				} else {
					System.out.println("Valor total já ultrapassou o limite R$ 1000,00");
					continue;
				}

			} while (!infValida);

		} while (acumulador < 1000 && cont < 6);

		System.out.println(acumulador);

		sc.close();


	}

}
