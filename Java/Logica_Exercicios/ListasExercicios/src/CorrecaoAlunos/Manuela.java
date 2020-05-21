package CorrecaoAlunos;

import java.util.Scanner;

public class Manuela {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		int quantVeiculos = 0, quantPessoas = 0, totalPessoas = 0;
		String novoVeiculo;
		double valorCarros, valorPessoas, valorTotal;


		
		
		
		do {
			System.out.println("Existe um novo veículo? [sim/nao]");
			novoVeiculo = ler.next();
			if (novoVeiculo.equals("sim")) {
				while (totalPessoas <= 20) {
					while (quantPessoas < 1 || quantPessoas > 7) {
						System.out.printf("Digite a quantidade de pessoa(s) no %dº veículo: ",
								           quantVeiculos + 1);
						quantPessoas = ler.nextInt();
						if (quantPessoas < 1 || quantPessoas > 7) {
							System.out.println("Quantidade de pessoas inválida.");
						}
					}
					totalPessoas = totalPessoas + quantPessoas;
				}
			} else {
				break;
			}
			quantVeiculos = quantVeiculos + 1;
		} while (quantVeiculos <= 5);
		
		
		
		
		
		
		
		valorCarros = quantVeiculos * 30;
		valorPessoas = totalPessoas * 30;
		valorTotal = valorCarros + valorPessoas;
		System.out.printf("O número de carros na reserva é %d.", quantVeiculos);
		System.out.printf("\nO número de pessoas na reserva é %d.", totalPessoas);
		System.out.printf("\nO valor apurado foi de R$ %.2f.", valorTotal);
		ler.close();


	}

}
