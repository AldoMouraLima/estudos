package Lista04_Array;

import java.util.Scanner;

public class TesteErro {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		// Cr�tica de entrada
		while (true) {
			try {
				System.out.println("Digite um n�mero");
				numero = ler.nextInt();
			}
			catch (Exception exception){
				System.out.println("\nDigite apenas n�meros");
				ler.next();
				continue;
			}
			break;
		}	
		// Continuidade do c�digo
		
		System.out.println(numero);
		ler.close();
	}
}
