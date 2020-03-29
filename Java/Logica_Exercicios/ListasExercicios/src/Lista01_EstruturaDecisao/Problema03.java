package Lista01_EstruturaDecisao;

import java.util.Scanner;

public class Problema03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		// Daclaração das variáveis
		int numero;
		
		// Entrada
		System.out.println("Digite um número inteiro: ");
		numero = ler.nextInt();
		
		// Processamento / Saída
		if (numero % 2 == 0) {
            System.out.printf("%d é um número Par", numero);
		}
		else {
            System.out.printf("%d é um número Impar", numero);			
		}		
		
        ler.close();
 	}
}
