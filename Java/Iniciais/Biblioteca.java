
import java.util.Scanner;

public class Biblioteca {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);		
		
		final float PERC_MULTA = 0.005F;

		int diasAtraso;
		float valorLivro, valorMulta;


		System.out.printf("Informe valor do livro R$  ");
		valorLivro = ler.nextFloat();

		System.out.printf("Informe os dias de atraso: ");
		diasAtraso = ler.nextInt();
		
		if (diasAtraso > 0) {
			valorMulta = valorLivro * PERC_MULTA * diasAtraso;
			System.out.println();
			System.out.println("O valor da multa e R$ " + String.format(" %.2f", valorMulta));
		}

		ler.close();
	}
}