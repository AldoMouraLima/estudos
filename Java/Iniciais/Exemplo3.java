import java.util.Scanner;

public class Exemplo3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);		
		int idade;

		System.out.println("Informe sua idade: ");
		idade = ler.nextInt();
		
		if (idade < 16) {
			System.out.println("Você nao pode votar");
		} else if (idade < 18) {
			System.out.println("Voto Opcional");		
		} else if (idade < 65) {
			System.out.println("Voto Obrigatorio");					
		} else {
			System.out.println("Voto Opcional");		
		}
		
		ler.close();
	}
}

