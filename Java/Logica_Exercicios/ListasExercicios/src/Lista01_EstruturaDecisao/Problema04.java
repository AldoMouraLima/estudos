package Lista01_EstruturaDecisao;

import java.util.Scanner;

public class Problema04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		// Declaração das constantes
		final float PASSAGEM = 4.5f;
		final int LIMITE = 9999;
		
		// Daclaração das variáveis
		int catracaInicial, catracaFinal, qtdePassageiros;
		float valorApurado;
		
		// Entrada
		System.out.println("Número inicial da catraca: ");
		catracaInicial = ler.nextInt();

		System.out.println("Número final   da catraca: ");
		catracaFinal = ler.nextInt();		

		// Processamento
		if (catracaInicial < catracaFinal) {
			qtdePassageiros = catracaFinal - catracaInicial;
		}
		else {
			qtdePassageiros = LIMITE - catracaInicial + catracaFinal;
		}

		valorApurado = qtdePassageiros * PASSAGEM;

		// Saída
		System.out.printf("\nQuantidade de passagem: %d", qtdePassageiros);
		System.out.printf("\nValor do apurado: R$ %9.2f", valorApurado);

        ler.close();
 	}
}
