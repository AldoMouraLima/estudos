package Lista04_Array;

import java.util.Scanner;

public class TesteErro {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		// Crítica de entrada
		while (true) {
			try {
				System.out.println("Digite um número");
				numero = ler.nextInt();
			}
			catch (Exception exception){
				System.out.println("\nDigite apenas números");
				ler.next();
				continue;
			}
			break;
		}	
		// Continuidade do código
		
		System.out.println(numero);
		ler.close();
	}
}
