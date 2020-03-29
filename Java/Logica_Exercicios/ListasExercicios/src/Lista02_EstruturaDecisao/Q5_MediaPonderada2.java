package Lista02_EstruturaDecisao;

import java.util.Scanner;

public class Q5_MediaPonderada2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int PESO1 = 4, PESO2 = 6;
		float nota1, nota2, nota3, media;
		
		System.out.printf("Primeira Nota: ");
		nota1 = ler.nextFloat();
		System.out.printf("Segunda Nota: ");
		nota2 = ler.nextFloat();
		System.out.printf("Terceira Nota: ");
		nota3 = ler.nextFloat();
		
		if (nota1 < nota2 && nota1 < nota3){
			if (nota2 < nota3 ) {
				media = (nota2*PESO1 + nota3*PESO2) / (PESO1+PESO2);		
			}
			else {
				media = (nota2*PESO2 + nota3*PESO1) / (PESO1+PESO2);				
			}
		}
		else if (nota2 < nota1 && nota2 < nota3){
			if (nota1 < nota3 ) {
				media = (nota1*PESO1 + nota3*PESO2) / (PESO1+PESO2);
			}
			else {
				media = (nota1*PESO2 + nota3*PESO1) / (PESO1+PESO2);
			}			
		}
		else{
			if (nota1 < nota2 ) {
				media = (nota1*PESO1 + nota2*PESO2) / (PESO1+PESO2);
			}
			else {
				media = (nota1*PESO2 + nota2*PESO1) / (PESO1+PESO2);
			}			
		}
		
		System.out.printf("\nMédia: %5.2f", media);
		
		ler.close();
	}

}
