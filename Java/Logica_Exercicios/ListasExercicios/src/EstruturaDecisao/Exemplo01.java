package EstruturaDecisao;

import java.util.Scanner;

public class Exemplo01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);		
		int idade;

		System.out.println("Informe sua idade: ");
		idade = ler.nextInt();
		
		if (idade < 16) {
			System.out.println("Não pode votar");
		}		
		ler.close();
	}
}


