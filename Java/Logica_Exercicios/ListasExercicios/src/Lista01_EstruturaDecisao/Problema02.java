package Lista01_EstruturaDecisao;

import java.util.Scanner;

public class Problema02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		// Daclara��o das vari�veis
		int numero1, numero2, copiaNumero;
		
		// Entrada
		System.out.println("Primeiro n�mero: ");
		numero1 = ler.nextInt();
		
		System.out.println("Segundo  n�mero: ");
		numero2 = ler.nextInt();		
		
		// Processamento
		if (numero1>numero2) {
			copiaNumero = numero1;
			numero1 = numero2;
			numero2 = copiaNumero;
		}		
		
		// Sa�da
		System.out.printf("\nPrimeiro n�mero: %d", numero1);
		System.out.printf("\nSegundo  n�mero: %d", numero2);
		
        ler.close();
 	}
}
