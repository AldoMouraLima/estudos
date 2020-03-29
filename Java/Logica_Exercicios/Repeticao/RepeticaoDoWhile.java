import java.util.Scanner;

public class RepeticaoDoWhile {
    public static void main(String[] args)  {
    	Scanner ler = new Scanner(System.in);
		char tipoCurso = ' ';

		do {   
			System.out.println("Tipo do Curso [G/P]: ");
			tipoCurso = ler.nextLine().charAt(0);
			tipoCurso = Character.toUpperCase(tipoCurso);

		    if (tipoCurso!='G' && tipoCurso!='P') {
		      System.out.println("Tipo de curso incorreto\n");
		    }
		} while (tipoCurso !='G' && tipoCurso !='P' );

		if (tipoCurso=='G'){
		   System.out.println("Graduacao");
		}
		else {
		   System.out.println("Pos-graducao");
		}
    } 
}



