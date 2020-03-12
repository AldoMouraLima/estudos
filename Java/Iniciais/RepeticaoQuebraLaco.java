import java.util.Scanner;

public class RepeticaoQuebraLaco {
    public static void main(String[] args)  {
    	Scanner ler = new Scanner(System.in);
		char letra = ' ';

		while (true) {   
			System.out.println("Letra: ");
			letra = ler.nextLine().charAt(0);

		    if (!Character.isLetter(letra)) {
		       System.out.println("Não é um número\n");
		       continue;
		    }
		    break;
		} 
		System.out.printf("\nCaractere é uma letra!!!");
		ler.close();
    }
}



