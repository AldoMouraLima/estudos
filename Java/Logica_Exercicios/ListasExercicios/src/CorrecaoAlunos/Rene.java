package CorrecaoAlunos;

import java.util.Scanner;

public class Rene {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idade;
		int cont18ouMais = 0;
		for (int i = 0; i < 7; i++) {
			do {
				System.out.printf("Digite a %dª idade: ", i + 1);
				idade = sc.nextInt();
				if (idade < 0 || idade > 130) {
					System.out.println("Idade incorreta");
					continue;
				}
				if (idade >= 18){
					cont18ouMais++;
				}
			} while (idade < 0 || idade > 130);
		}
		System.out.printf("Idades digitadas maiores ou iguais a 18: %d", cont18ouMais);
		sc.close();
	}

}
