package Avaliacao_IUnidade;

import java.util.Scanner;

public class Q4_Cinara {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		float valorItem = 0;
		String Tipo;
		int contador = 1;
		int qtdPeças = 0;
		int valorTotal = 0;

		while (contador < 7) {
			System.out.println("Informe o valor do " + contador + "º item: ");
			valorItem = ler.nextFloat();

			if (valorItem > 1000) {
				System.out.println("Não é permitido valores acima de R$ 1000.");
				break;
			}

			System.out.println("Informe o tipo do item [P/S]: ");
			Tipo = ler.next();

			if (Tipo.toUpperCase().equals("P")) {
				valorItem = valorItem - (valorItem * 0.1f);
				qtdPeças += 1;

			}
			if (Tipo.toUpperCase().equals("S")) {
				valorItem = valorItem - (valorItem * 0.2f);
			}

			valorTotal += valorItem;
			contador++;
		}

		if (contador >= 7) {

			System.out.printf("Quantidade de Peças: %2", qtdPeças);
			System.out.printf("O valor total é: R$ %.2f", valorTotal);

			ler.close();
		}
	}

}
