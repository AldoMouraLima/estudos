package Avaliacao_IUnidade;

import java.util.Scanner;

public class Q3x_Cinara {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float valorMensal = 300;
		
		int qtdDiasUteis;
		int qtdDiasNaoUteis;
		
		float valorDiaUtil; 
		float valorDiaNaoUtil;
		
		System.out.print("Informe a quantidade dos dias �TEIS: ");
		qtdDiasUteis = ler.nextInt();
		
		System.out.print("Informe a quantidade dos dias N�O �TEIS: ");
		qtdDiasNaoUteis = ler.nextInt();
		
		valorDiaNaoUtil = valorMensal / ((qtdDiasUteis * 2/3f) + qtdDiasNaoUteis);
		valorDiaUtil = (valorDiaNaoUtil / 3) * 2; 
		
		System.out.printf("\nO valor do ped�gio em dia �TIL �: R$ %.2f.", valorDiaUtil);
		System.out.printf("\nO valor do ped�gio em dia N�O �TIL �: R$ %.2f.", valorDiaNaoUtil);
		
		ler.close();

	}

}
