package EstruturaRepeticao;

import java.util.Scanner;
public class QuebraLaco {

	public static void main(String[] args) {
    	Scanner ler = new Scanner(System.in);
		char letra = ' ';

		while (true) {   
			System.out.println("Letra: ");
			letra = ler.nextLine().charAt(0);

		    if (!Character.isLetter(letra)) {
		       System.out.println("N�o � um n�mero\n");
		       continue;
		    }
		    break;

		} 
		System.out.printf("\nCaractere � uma letra!!!");
		ler.close();
	}

}
