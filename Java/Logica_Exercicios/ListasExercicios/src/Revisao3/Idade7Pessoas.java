package Revisao3;

import java.util.Scanner;

public class Idade7Pessoas {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int PESSOAS=4;
		int idade, contMaioridade=0, maiorIdade=0, menorIdade=0, acumIdade=0, qtdeMaiorIdade=0;
		String nome, nomeMaiorIdade="";
		
		// for (int i=0; i<7; i++) {	
		int i=0;
		do {
			
			
			System.out.printf("Informe o %dª nome: ", i+1);
			nome = ler.next();
			System.out.printf("Informe a %dª idade: ", i+1);
			idade = ler.nextInt();
			
			
			if (idade<0 || idade>130 ) {
				System.out.println("\nIdade incorreta. Informe um valor de 0 a 130.");
				continue;
			}
			
			acumIdade = acumIdade + idade;
			
			if (idade>=18) {
				contMaioridade++;
			}

			if (i == 0) { // i é 0 na primeira vez, então quando i for 0, armazene a idade recebido como referência 
				maiorIdade = idade;
				menorIdade = idade;
			}
						
			if (idade>maiorIdade) {
				maiorIdade = idade;
				nomeMaiorIdade = nome;
				qtdeMaiorIdade=0;
			}
			
			if (idade == maiorIdade) {
				qtdeMaiorIdade++;
			}
				
			if (idade<menorIdade) {
				menorIdade = idade;
			}
			
			
			i++; //  i = i + 1
		} while (i<PESSOAS);

		float media = (float) acumIdade / PESSOAS;

		System.out.printf("\nPessoas com 18 anos ou mais  : %d", contMaioridade);
		System.out.printf("\nIdade da pessoa mais idosa   : %d", maiorIdade);
		System.out.printf("\nIdade da pessoa mais nova    : %d", menorIdade);
		System.out.printf("\nMédia das idade              : %.1f", media);
		System.out.printf("\nQuant. de pessoas com idade");
		System.out.printf("\nmaior ou igual a maior idade : %d", qtdeMaiorIdade);
		System.out.printf("\n\nO nome da pessoa com\na maior idade é: %s", nomeMaiorIdade);
		ler.close();
	}
}

/*

temperatura => -25  -22  -30 -20 -26 -27 -23 
 
idade => 80 15  80  4  30  7   20
 
maiorIdade -20
 
  
  
  
  
 * */










