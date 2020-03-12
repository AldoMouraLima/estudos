import java.util.Scanner;

public class RepeticaoWhileCont {
    public static void main(String[] args)  {
    	Scanner ler = new Scanner(System.in);
		char tipoCurso = ' ';
		int contador = 0;

		while (tipoCurso !='G' && tipoCurso !='P' ) {   
			System.out.println("Tipo do Curso [G/P]: ");
			tipoCurso = ler.nextLine().charAt(0);
			tipoCurso = Character.toUpperCase(tipoCurso);

		    if (tipoCurso!='G' && tipoCurso!='P') {
		      System.out.println("Tipo de curso incorreto\n");
		    }
            contador = contador + 1;
		}
		if (tipoCurso=='G'){
		   System.out.println("Graduacao");
		}
		else {
		   System.out.println("Pos-graducao");
		}
		System.out.printf("Acertou na %d tentativa", contador);
    }
}



