package EstruturaDados;

import java.util.Scanner;

public class ExemposDiversos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);


         
         
         // array
		
		//String dia1="Domingo", dia2="Segunda", dia3="Ter�a", dia4="Quarta", dia5="Quinta", dia6="Sexta", dia7="S�bado";


		/*
		String[] diaSemana; // Declara��o
		diaSemana = new String[7]; // Cria��o
		diaSemana[0]="Domingo"; // Atribui��o ...
		diaSemana[1]="Segunda";
		diaSemana[2]="Terca";
		diaSemana[3]="Quarta";
		diaSemana[4]="Quinta";
		diaSemana[5]="Sexta";
		diaSemana[6]="S�bado";
		*/
		
		// String[] diaSemana = new String[7];  // Declara��o / Cria��o

		//Declara / Cria��o / Atribui��o
		String[] diaSemana={"Domingo","Segunda","Ter�a","Quarta","Quinta","Sexta", "S�bado"};

		System.out.println("Informe o n�mero do dia da semana");
		int numDia = ler.nextInt();
		
		System.out.println( diaSemana[numDia-1] );

		
		/* Entrada dos dados via teclado de todos os elementos do array
		for (int i = 0; i < diaSemana.length; i++) {
			System.out.println("Digite um dia semana");
			diaSemana[i] = ler.next();			
		}
		*/
		
		/* S�ida de dados de todos os elementos
		for (int i = 0; i < diaSemana.length; i++) {
			System.out.println(diaSemana[i]);			
		}
		*/

         
         
         
	}

}
