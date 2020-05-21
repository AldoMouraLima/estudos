package Avaliacao_IUnidade;

import java.util.Scanner;

public class Q4_LucasGabriel {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double total = 0;
		int cont = 0;

		Double[] valor = new Double[6];

		for (int i = 0; i < valor.length; i++) {
			System.out.print("\nInforme o valor do produto: ");
			valor[i] = ler.nextDouble();
			ler.nextLine();

			System.out.print("Informe o tipo 'P'(peças) ou 'S'(serviços): ");
			String tipo = ler.nextLine();

			switch (tipo.toUpperCase().charAt(0)) {
			case 'S':
				valor[i] = valor[i] - (valor[i] * 0.2);
				break;
			case 'P':
				valor[i] = valor[i] - (valor[i] * 0.1);
				cont++;
				break;
			default:
				System.out.println("Essa peça não existe!\n");
				i--;
				continue;
			}

			if (valor[i] > 1000 || total > 1000) {
				System.out.println("O valor total excedeu o limite!\n");
				break;
			}

			total += valor[i];
		}
		
		System.out.println("\nQuantidade de peças: " + cont);
		System.out.println("Valor total: " + total);

		ler.close();

	}

}
