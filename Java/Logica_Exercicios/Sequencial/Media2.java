import java.util.Scanner;

public class Media2{
	public static void main(String[] args) {
		
		// Cria e instancia o objeto entrada do tipo Scanner
		// A classe Scanner facilitar a entrada de dados no modo Console
		Scanner entrada = new Scanner(System.in);

		double nota1, nota2, media;

		System.out.print("1 Nota: ");
		nota1 = entrada.nextDouble();

		System.out.print("2 Nota: ");
		nota2 = entrada.nextDouble();

		media = (nota1 + nota2) / 2;

		System.out.println("Media: " + media);	

		System.out.println("Media: " + String.format("%.1f", media));
		entrada.close();		
	}
}