package Avaliacao_IUnidade;

import java.util.Scanner;

public class Q3_AnaElisa {

	public static void main(String[] args) {
        Scanner leia = new Scanner(System.in); 

        float ValorMensal = 300.00f;
        int qtdDiasUteis;
        int qtdDiasnaouteis;
        float vrDiaUtil;
        float vrDiaNaoUtil; 
        float totalDiasUteis;
        float totalDiasNaoUteis;
        
        System.out.println("Valor unit�rio do Ped�gio");
        System.out.println();
        System.out.print("Informe a quantidade de dias �teis do m�s:");
        qtdDiasUteis = leia.nextInt();
        System.out.print("Informe a quantidade de dias n�o �teis do m�s:");
        qtdDiasnaouteis = leia.nextInt();
        
        vrDiaUtil = (ValorMensal*2 / 3) /qtdDiasUteis; 
        System.out.printf("\nValor do ped�gio em dias �teis: R$ %.2f", vrDiaUtil);
        vrDiaNaoUtil = (ValorMensal*1/3) / qtdDiasnaouteis;
        System.out.printf("\nValor do ped�gio em dias �teis: R$ %.2f", vrDiaNaoUtil);
        
       
        
        totalDiasUteis = vrDiaUtil*qtdDiasUteis;
        System.out.printf("\nValor a ser pago de ped�gio por dias �teis: R$ %.2f", totalDiasUteis);
        totalDiasNaoUteis = vrDiaNaoUtil*qtdDiasnaouteis;
        System.out.printf("\nValor a ser pago de ped�gio por dias n�o �teis: R$ %.2f", totalDiasNaoUteis);
       

       leia.close();
	}

}
