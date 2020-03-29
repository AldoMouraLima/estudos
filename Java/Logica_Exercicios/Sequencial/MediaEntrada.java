
import java.util.Scanner;

public class MediaEntrada {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);		

		System.out.println("Digite a primeira nota: ");
		float nota1 = ler.nextFloat();
		System.out.println("Digite a segunda nota: ");
		float nota2 = ler.nextFloat();

		float media = (nota1 + nota2) / 2;

		System.out.println("Media: " + media);
		ler.close();
	}
}




