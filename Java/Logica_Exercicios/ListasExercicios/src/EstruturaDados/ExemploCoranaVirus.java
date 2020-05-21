package EstruturaDados;

import java.util.Scanner;

public class ExemploCoranaVirus {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int[] cidades = new int[5];
		
		int totalContamindos = 0;
		
		for (int i =0; i<cidades.length; i++) {
			System.out.printf("Pessoas contaminadas na %dº cidade: ", i+1);
			cidades[i] = ler.nextInt();
			totalContamindos = totalContamindos + cidades[i];
		}
		
		float media = (float) totalContamindos / cidades.length;
		System.out.printf("\nMédia de contaminados: %9.3f", media);

		int totalCidades = 0;
		int totalPessoas =0;
		for (int i =0 ; i<cidades.length; i++) {
			if (cidades[i]>=media) {
				totalCidades = totalCidades + 1; 
				totalPessoas = totalPessoas + cidades[i];
			}
		}
		System.out.printf("\nQuant. Cidades com pessoas infectadas >= media: %d", totalCidades);
		System.out.printf("\nPessoas contaminadas nestas cidades: %d", totalPessoas);
	
		ler.close();
	}
}
