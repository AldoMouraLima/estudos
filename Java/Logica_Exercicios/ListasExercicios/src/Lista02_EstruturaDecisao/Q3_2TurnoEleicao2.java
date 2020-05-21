package Lista02_EstruturaDecisao;

import java.util.Scanner;

public class Q3_2TurnoEleicao2 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		// Declara��o das vari�veis
		int votosCand1, votosCand2, votosCand3;
		String nomeCand1, nomeCand2, nomeCand3, nome1SegTurno="", nome2SegTurno="", nomeVencedor="";

		// Entrada
		System.out.printf("\nNome do primeiro candidato : ");
		nomeCand1 = ler.nextLine();
		System.out.printf("Votos do primeiro candidato: ");
		votosCand1 = ler.nextInt();

		ler.nextLine(); // Limpar o buffer antes de uma entrada string e apos uma entrada numerica
		System.out.printf("\nNome do segundo candidato : ");
		nomeCand2 = ler.nextLine();
		System.out.printf("Votos do segundo candidato: ");
		votosCand2 = ler.nextInt();

		ler.nextLine(); // Limpar o buffer antes de uma entrada string e apos uma entrada numerica
		System.out.printf("\nNome do terceiro candidato : ");
		nomeCand3 = ler.nextLine();
		System.out.printf("Votos do terceiro candidato: ");
		votosCand3 = ler.nextInt();
		
		// Definindo se haver� ou n�o o segundo turno e quem � o vencedor
		boolean segundoTurno = true;
		if (votosCand1 > votosCand2 + votosCand3) {
			nomeVencedor = nomeCand1;
			segundoTurno = false;
		}
		if (votosCand2 > votosCand1 + votosCand3) {
			nomeVencedor = nomeCand2;
			segundoTurno = false;
		}
		if (votosCand3 > votosCand1 + votosCand2) {
			nomeVencedor = nomeCand3;				
			segundoTurno = false;
		}
		
		// Definindo quem ser�o os concorentes ao 2� turno ou mostrando o vencedor no 1� turno
		if (segundoTurno != true) {	
			System.out.printf("\nN�o haver� segundo turno!");
			System.out.printf("\nO candidato vencedor � " + nomeVencedor);
		}
		else {
			if (votosCand1 < votosCand2 && votosCand1 < votosCand3) {
				nome1SegTurno = nomeCand2;
				nome2SegTurno = nomeCand3;
			}
			if (votosCand2 < votosCand1 && votosCand2 < votosCand3) {
				nome1SegTurno = nomeCand1;
				nome2SegTurno = nomeCand3;
			}
			if (votosCand3 < votosCand1 && votosCand3 < votosCand2) {
				nome1SegTurno = nomeCand1;
				nome2SegTurno = nomeCand2;
			}
			System.out.printf("\nHaver� segundo turno entre %s e %s", nome1SegTurno, nome2SegTurno);
		}
		

        ler.close();
	}
}
