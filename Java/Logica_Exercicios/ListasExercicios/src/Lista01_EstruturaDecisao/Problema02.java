package Lista01_EstruturaDecisao;

import java.util.Scanner;

public class Problema02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		// Daclaração das variáveis
		int numero1, numero2, copiaNumero;
		
		// Entrada
		System.out.println("Primeiro número: ");
		numero1 = ler.nextInt();
		
		System.out.println("Segundo  número: ");
		numero2 = ler.nextInt();		
		
		// Processamento
		if (numero1>numero2) {
			copiaNumero = numero1;
			numero1 = numero2;
			numero2 = copiaNumero;
		}		
		
		// Saída
		System.out.printf("\nPrimeiro número: %d", numero1);
		System.out.printf("\nSegundo  número: %d", numero2);
		
        ler.close();
 	}
}
