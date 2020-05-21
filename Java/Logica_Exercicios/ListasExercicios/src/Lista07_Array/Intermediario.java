package Lista07_Array;

public class Intermediario {

	public static void main(String[] args) {

		int[] numeros = { 50, -450, 1, 1587, -8, 755, -3588, 87, -33, 9 };

		// 2.1 A diferen�a entre os elementos
		System.out.print("\n\n2.1 - Diferen�a entre os elementos");
		for (int i = 0; i < numeros.length - 1; i++) {
			System.out.printf("\n(%2d�) %5d - %5d (%2d�) => %5d", i, numeros[i], numeros[i + 1], i + 1,
					numeros[i] - numeros[i + 1]);
		}

		// 2.2 Todos os elementos, sendo, primeiro os positivos e depois os negativos
        // 2.3 2.3	Percentual de n�meros negativos e percentual de n�meros positivos
		int contaPositivo=0, contaNegativo=0;
		System.out.print("\n\n2.2 - Todos elementos positivos depois os negativos");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] >= 0) {
				System.out.printf("\nPositivo %5d", numeros[i]);
				contaPositivo++;
			}
		}
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < 0) {
				System.out.printf("\nNegativo %5d", numeros[i]);
				contaNegativo++;
			}
		}
		System.out.print("\n\n2.3 - Percentual de positivos e percentual de negativos");
		float percPositivo = (float) contaPositivo/numeros.length*100;
		float percNegativo = (float) contaNegativo/numeros.length*100;
		System.out.printf("\nPercentual de Positivo %6.1f", percPositivo);
		System.out.printf("\nPercentual de Negativo %6.1f", percNegativo);
		
				
		// 2.4	Os elementos que s�o da ordem de centena
		System.out.print("\n\n2.4 - Os elementos que s�o da ordem de centena");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] >-1000 && numeros[i] < -99 || numeros[i] > 99 && numeros[i] < 1000) {
				System.out.printf("\nCentena => %4d", numeros[i]);
			}
		}

		// 2.5	O maior valor absoluto
		System.out.print("\n\n2.5 - O maior valor absoluto");
		int maiorValor = numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			int valorAbsoluto = (numeros[i]<0?numeros[i]*-1:numeros[i]*1);
			if (valorAbsoluto>maiorValor) {
				maiorValor=valorAbsoluto;
			}
		}
		System.out.printf("\nMaior valor absoluto %d ", maiorValor);
		
		
		
	}
}
