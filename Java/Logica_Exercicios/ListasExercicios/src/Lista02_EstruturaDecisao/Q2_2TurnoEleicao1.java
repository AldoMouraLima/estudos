package Lista02_EstruturaDecisao;

import java.util.Scanner;

public class Q2_2TurnoEleicao1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		// Daclara��o das vari�veis
		int votosCand1, votosCand2, votosCand3;
		
		// Entrada
		System.out.printf("Votos do primeiro candidato: ");
		votosCand1 = ler.nextInt();
		System.out.printf("Votos do segundo candidato: ");
		votosCand2 = ler.nextInt();
		System.out.printf("Votos do terceiro candidato: ");
		votosCand3 = ler.nextInt();

		/*
		boolean segundoTurno = true;
		if (votosCand1 > votosCand2 + votosCand3) {
			segundoTurno = false;
		}
		if (votosCand2 > votosCand1 + votosCand3) {
			segundoTurno = false;
		}
		if (votosCand3 > votosCand1 + votosCand2) {
			segundoTurno = false;
		}
		
		if (segundoTurno == false) {
			System.out.println("N�o haver� segundo turno!");
		}
		else {
			System.out.println("Haver� segundo turno!");
		}
		*/	
		
		if (votosCand1 > votosCand2 + votosCand3 ||
			votosCand2 > votosCand1 + votosCand3 ||
			votosCand3 > votosCand1 + votosCand2)  {
			System.out.println("N�o haver� segundo turno!");
		}
		else {
			System.out.println("Haver� segundo turno!");
		}			

		
		ler.close();
	}
}
