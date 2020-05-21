package Avaliacao_IUnidade;

import java.util.Scanner;

public class Q4_Andre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] valores = new double[6];
		char[] tipos = new char[6];
		double total = 0;
		int contador = 0;
		
		for (int i = 0; i < 6; i ++) {
			System.out.print("Digite o valor: R$: ");
			valores[i] = sc.nextDouble();
			System.out.print("Digite o tipo: ");
			tipos[i] = sc.next().charAt(0);
		}
		
		for (int i = 0; i < tipos.length; i++) {
			if (tipos[i] == 'P') {
				valores[i] = valores[i] - (valores[i] * 0.1);
				contador++;
			}
			else if (tipos[i] == 'S') {
				valores[i] = valores[i] - (valores[i] * 0.2);
			}
		}
		
		for (int i = 0; i < valores.length; i++) {
			total = total + valores[i];
		}
		
		if (total > 1000) {
			System.out.println("\nValor superior ao orçamento");
		}
		else {
			System.out.println("\nTOTAL R$ " + String.format("%.2f", total ));
		}
		
		System.out.println("Total de peças: " + contador);
		

	}

}
