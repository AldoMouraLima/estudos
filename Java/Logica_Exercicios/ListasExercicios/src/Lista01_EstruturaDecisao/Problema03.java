package Lista01_EstruturaDecisao;

import java.util.Scanner;

public class Problema03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		// Daclara��o das vari�veis
		int numero;
		
		// Entrada
		System.out.println("Digite um n�mero inteiro: ");
		numero = ler.nextInt();
		
		// Processamento / Sa�da
		if (numero % 2 == 0) {
            System.out.printf("%d � um n�mero Par", numero);
		}
		else {
            System.out.printf("%d � um n�mero Impar", numero);			
		}		
		
        ler.close();
 	}
}
