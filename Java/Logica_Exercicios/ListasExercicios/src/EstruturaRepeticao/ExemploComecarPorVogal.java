package EstruturaRepeticao;

import java.util.Scanner;

public class ExemploComecarPorVogal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int c=0;
		
		for (int i =0; i<3; i++) {
			System.out.printf("Digite do %2dº nome: ", i+1);
			String nome = ler.nextLine();
			
			String letra = nome.toUpperCase().substring(0, 1);
			
			if (letra.equals("A") || letra.equals("E") || letra.equals("I") ||
				letra.equals("O") || letra.equals("I")) {
				c++;
			}
		}
		System.out.printf("\n%2d nome(s) começa(m) com vogal", c);
		ler.close();
	}

}
