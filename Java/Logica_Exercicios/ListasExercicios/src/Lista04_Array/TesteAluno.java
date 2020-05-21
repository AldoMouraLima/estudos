package Lista04_Array;
import java.util.Random;
import java.util.stream.IntStream;
public class TesteAluno {

	public static void main(String[] args) {
		String[] nomes = {"Ana", "Gabriel", "Licia", "Raphael", "Ricardo"};
		String[] temas = {"Tema 1", "Tema 2", "Tema 3", "Tema 4", "Tema 5"};
		int[] num = {-1, -1, -1, -1, -1};

		Random gerador = new Random();

		int i=0;
		while (i < temas.length) {

			final int temp = gerador.nextInt(5);
			if (IntStream.of(num).anyMatch(x -> x == temp) == false) {
				num[i]=temp;
				System.out.printf("\n%s - %s", nomes[i], temas[num[i]]);
				i++;
			}
		}
	}
}
