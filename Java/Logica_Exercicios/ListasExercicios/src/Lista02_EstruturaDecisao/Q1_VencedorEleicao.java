package Lista02_EstruturaDecisao;

import java.util.Scanner;

public class Q1_VencedorEleicao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		// Daclaração das variáveis
		int votosCand1, votosCand2, votosCand3;
		String nomeCand1, nomeCand2, nomeCand3, nomeVencedor = "";		

		// Entrada
		System.out.printf("\nNome do primeiro candidato : ");
		nomeCand1 = ler.nextLine();
		System.out.printf("Votos do primeiro candidato: ");
		votosCand1 = ler.nextInt();

		ler.nextLine();
		System.out.printf("\nNome do segundo candidato : ");
		nomeCand2 = ler.nextLine();
		System.out.printf("Votos do segundo candidato: ");
		votosCand2 = ler.nextInt();

		ler.nextLine();
		System.out.printf("\nNome do terceiro candidato : ");
		nomeCand3 = ler.nextLine();
		System.out.printf("Votos do terceiro candidato: ");
		votosCand3 = ler.nextInt();
		
		/*
		if (votosCand1>votosCand2 && votosCand1>votosCand3) {
			nomeVencedor = nomeCand1;
		}
		if (votosCand2>votosCand1 && votosCand2>votosCand3) {
			nomeVencedor = nomeCand2;
		}
		if (votosCand3>votosCand1 && votosCand3>votosCand2) {
			nomeVencedor = nomeCand3;
		}
		*/
		
		if (votosCand1>votosCand2 && votosCand1>votosCand3) {
			nomeVencedor = nomeCand1;
		}
		else {
			if (votosCand2>votosCand1 && votosCand2>votosCand3) {
				nomeVencedor = nomeCand2;				
			}
		}		
		System.out.printf("\nO candidato vencedor é " + nomeVencedor);
		
        ler.close();
	}
}
