package EstruturaDados;

import java.util.Scanner;

public class ExemposDiversos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);


         
         
         // array
		
		//String dia1="Domingo", dia2="Segunda", dia3="Terça", dia4="Quarta", dia5="Quinta", dia6="Sexta", dia7="Sábado";


		/*
		String[] diaSemana; // Declaração
		diaSemana = new String[7]; // Criação
		diaSemana[0]="Domingo"; // Atribuição ...
		diaSemana[1]="Segunda";
		diaSemana[2]="Terca";
		diaSemana[3]="Quarta";
		diaSemana[4]="Quinta";
		diaSemana[5]="Sexta";
		diaSemana[6]="Sábado";
		*/
		
		// String[] diaSemana = new String[7];  // Declaração / Criação

		//Declara / Criação / Atribuição
		String[] diaSemana={"Domingo","Segunda","Terça","Quarta","Quinta","Sexta", "Sábado"};

		System.out.println("Informe o número do dia da semana");
		int numDia = ler.nextInt();
		
		System.out.println( diaSemana[numDia-1] );

		
		/* Entrada dos dados via teclado de todos os elementos do array
		for (int i = 0; i < diaSemana.length; i++) {
			System.out.println("Digite um dia semana");
			diaSemana[i] = ler.next();			
		}
		*/
		
		/* Sáida de dados de todos os elementos
		for (int i = 0; i < diaSemana.length; i++) {
			System.out.println(diaSemana[i]);			
		}
		*/

         
         
         
	}

}
