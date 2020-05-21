package Lista07_Array;

public class Basico {

	public static void main(String[] args) {

		int[] numeros = { 150, 18, 540, 320, 7, 1350, 25, 2777, 3, 87 };

		// 1.1. Os elementos impares
		System.out.println("1.1 - Elementos impares");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 1) {
				System.out.printf("\nImpar => %4d", numeros[i]);
			}
		}

		// 1.2. Os elementos pares
		System.out.print("\n\n1.2 - Elementos das posições pares");
		for (int i = 0; i < numeros.length; i += 2) {
			System.out.printf("\nElemento %2d => %4d", i, numeros[i]);
		}

		// 1.3. Os elementos menores que 500
		System.out.print("\n\n1.3 - Elementos menores que 500");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < 500) {
				System.out.printf("\n< 500 => %4d", numeros[i]);
			}
		}

		// 1.4. Os elementos que são da ordem de centena
		System.out.print("\n\n1.4 - Elementos da ordem de centena");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > 99 && numeros[i] < 1000) {
				System.out.printf("\nCentena => %4d", numeros[i]);
			}
		}

		// 1.5. Os elementos que são da ordem de dezena ou milhar
		System.out.print("\n\n1.5 - Elementos da ordem de dezena ou milhar");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > 9 && numeros[i] < 100 || numeros[i] > 999 && numeros[i] < 10000) {
				System.out.printf("\nDezena ou milhar => %4d", numeros[i]);
			}
		}

		// 1.6. A primeira metade do array
		System.out.print("\n\n1.6 - Primeira metade");
		for (int i = 0; i < numeros.length / 2; i++) {
			System.out.printf("\nElemento %2d => %4d", i, numeros[i]);
		}

		// 1.7. A primeira metade do array
		System.out.print("\n\n1.7 - Segunda metade");
		for (int i = numeros.length / 2; i < numeros.length; i++) {
			System.out.printf("\nElemento %2d => %4d", i, numeros[i]);
		}

		// 1.8. Todos os elementos na ordem inversa (ordem decrescente de posição)
		System.out.print("\n\n1.8 - Ordem inversa das posições");
		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.printf("\nElemento %2d => %4d", i, numeros[i]);
		}


	}
}
