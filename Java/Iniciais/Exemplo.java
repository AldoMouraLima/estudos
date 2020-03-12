import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);		
		int idade;

		System.out.printf("Informe sua idade: ");
		idade = ler.nextInt();
		
		if (idade < 16) {
			System.out.println("Você não pode votar");
		}
		
		ler.close();
	}
}