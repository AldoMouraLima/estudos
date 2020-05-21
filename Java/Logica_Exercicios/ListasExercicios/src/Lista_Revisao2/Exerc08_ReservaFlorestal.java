package Lista_Revisao2;

import java.util.Scanner;

public class Exerc08_ReservaFlorestal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int LIMITEPESSOAS = 25;
		final int LIMITEVEICULOS = 5;
		final float TAXAVEICULO = 40f;
		final float TAXAPESSOA = 30f;
		
		int totalPassageiros = 0;
		int passageiros = 0;
		int veiculos = 0;
		do {
			System.out.printf("\nInforme a quantidade de pessoas do %d� ve�culo", veiculos+1);
			passageiros = ler.nextInt();
			if (passageiros < 0) {
				System.out.println("\nN�mero de passageiro incorreto");
				continue;
			}
			if (passageiros > 7) {
				System.out.println("\nVe�culo com mais de 7 passageiros n�o pode acessar a reserva");
				continue;
			}
			
			if (passageiros + totalPassageiros > LIMITEPESSOAS) {
				System.out.println("\nQuantidade de passageiros excede o limite de pessoas permitido");
				continue;				
			}
			
			totalPassageiros = totalPassageiros + passageiros;
			if (totalPassageiros == LIMITEPESSOAS) {
				System.out.println("\nLimite de pessoas atingido. Acesso interrompida");
				break;	
			}
			veiculos++;
		} while (veiculos<5);
		if (veiculos == LIMITEVEICULOS) {
			System.out.println("\nLimite de ve�culo atingido. Acesso interrompida");	
		}
		float apurado = totalPassageiros*TAXAPESSOA+veiculos*TAXAVEICULO;
		System.out.printf("\nN�mero de pessoas na reserva  : %2d", totalPassageiros);
		System.out.printf("\nN�mero de ve�culos na reserva : %2d", veiculos);
		System.out.printf("\nValor do apurado           R$ : %.2f", apurado);
		
		ler.close();
	}

}
