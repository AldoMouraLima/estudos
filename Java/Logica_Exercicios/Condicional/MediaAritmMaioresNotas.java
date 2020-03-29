
import java.util.Scanner;

public class MediaAritmMaioresNotas {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);		
		
		float nota1, nota2, nota3, media;

		System.out.printf("1a Nota: ");
		nota1 = ler.nextFloat();
		System.out.printf("2a Nota: ");
		nota2 = ler.nextFloat();
		System.out.printf("3a Nota: ");
		nota3 = ler.nextFloat();

		if (nota1 < nota2 && nota1 < nota3){
			media = (nota2 + nota3) / 2;
		}
		else if (nota2 < nota1 && nota2 < nota3){
			media = (nota1 + nota3) / 2;
		}
		else{
			media = (nota1 + nota2) / 2;
		}



		System.out.println("\nMedia: " + String.format(" %.2f", media));
		ler.close();
	}
}