
import java.util.Scanner;

public class Exemplo2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);		
		float nota1, nota2, media;

		System.out.println("Digite a primeira nota: ");
		nota1 = ler.nextInt();
		System.out.println("Digite a segunda nota: ");
		nota2 = ler.nextInt();
		media = (nota1 + nota2) / 2;

		System.out.println(String.format("%.1f", media));
		
		if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");			
		}

		ler.close();
	}
}

