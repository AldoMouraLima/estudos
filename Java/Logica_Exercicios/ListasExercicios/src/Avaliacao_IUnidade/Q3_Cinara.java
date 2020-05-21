package Avaliacao_IUnidade;

import java.util.Scanner;

public class Q3_Cinara {

	public static void main(String[] args) {
		   Scanner ler = new Scanner(System.in);
			
		     float valorMensal = 300;
		     int qtdDiasMes;
		     float valorDiaUtil=0;
		     float valorDiaNaoUtil=0; 

		     System.out.print("Informe a quantidade de dias do mês: ");
		     qtdDiasMes = ler.nextInt();

		     if (qtdDiasMes == 28) {
		    	 valorDiaNaoUtil = valorMensal / 28;
		    	 valorDiaUtil = valorDiaNaoUtil / 3 * 2;
		         System.out.printf("\nValor do pedágio em dias úteis: R$ %.2f", valorDiaUtil);
		         System.out.printf("\nValor do pedágio em dias não úteis: R$ %.2f", valorDiaNaoUtil);

		     } else if (qtdDiasMes == 29) {
		         valorDiaNaoUtil = valorMensal / 29;
		         valorDiaUtil = valorDiaNaoUtil / 3 * 2;
		         System.out.printf("\nValor do pedágio em dias úteis: R$ %.2f", valorDiaUtil);
		         System.out.printf("\nValor do pedágio em dias não úteis: R$ %.2f", valorDiaNaoUtil);
		         
		     } else if (qtdDiasMes == 30) {
		         valorDiaNaoUtil = valorMensal / 30;
		         valorDiaUtil = valorDiaNaoUtil / 3 * 2;
		         System.out.printf("\nValor do pedágio em dias úteis: R$ %.2f", valorDiaUtil);
		         System.out.printf("\nValor do pedágio em dias não úteis: R$ %.2f", valorDiaNaoUtil);

		     } else if (qtdDiasMes == 31) {
		         valorDiaNaoUtil = valorMensal / 31;
		         valorDiaUtil = (valorDiaNaoUtil / 3) * 2;
		         System.out.printf("\nValor do pedágio em dias úteis: R$ %.2f", valorDiaUtil);
		         System.out.printf("\nValor do pedágio em dias não úteis: R$ %.2f", valorDiaNaoUtil);

		     } else {
		         System.out.println("Quantidade de dias inválida.");


		     ler.close();
		     }

	}

}
