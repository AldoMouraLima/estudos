package EstruturaRepeticao;

import java.util.Scanner;

public class PreIncremento {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int laco = 3;
		
		while (laco>0) {
			System.out.printf("\nDigite o %2dº numero: ", laco--);
			int numero = ler.nextInt();
			numero = numero * 1;
			System.out.println(numero);
		}
		ler.close();
	}

}
