package Avaliacao_IUnidade;

import java.util.Scanner;

public class Q3_Marcondes {

	public static void main(String[] args) {

	       Scanner leia = new Scanner(System.in); 
	       
	       float ValorMensal = 300.00f;
	        int QuantidadeDiasMes;

	        float ValorDiaUtil;
	        float ValorDiaNaoUtil; 

	        System.out.println("Programa Ped�gio");
	        System.out.println();
	        System.out.print("Informe a quantidade de dias do m�s:");
	        QuantidadeDiasMes = leia.nextInt();

	        if(QuantidadeDiasMes == 28) {

	            ValorDiaNaoUtil = ValorMensal/28;
	            ValorDiaUtil = (ValorDiaNaoUtil/3)*2;

	            System.out.println("Valor do ped�gio em dias �teis: " + ValorDiaUtil);
	            System.out.println("Valor do ped�gio em dias n�o �teis: " + ValorDiaNaoUtil);

	        } else if(QuantidadeDiasMes == 30) {

	            ValorDiaNaoUtil = ValorMensal/30;
	            ValorDiaUtil = (ValorDiaNaoUtil/3)*2;

	            System.out.println("Valor do ped�gio em dias �teis: " + ValorDiaUtil);
	            System.out.println("Valor do ped�gio em dias n�o �teis: " + ValorDiaNaoUtil);

	        }
	        else if(QuantidadeDiasMes == 31) {

	            ValorDiaNaoUtil = ValorMensal/31;
	            ValorDiaUtil = (ValorDiaNaoUtil/3)*2;

	            System.out.println("Valor do ped�gio em dias �teis: " + ValorDiaUtil);
	            System.out.println("Valor do ped�gio em dias n�o �teis: " + ValorDiaNaoUtil);

	        } else {

	            System.out.println("Informe uma quantidade de dias valida.");

	        }

	}

}
