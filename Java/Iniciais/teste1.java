import java.util.Scanner;

public class teste1 {
    public static void main(String[] args)  {
    	Scanner ler = new Scanner(System.in);
		char tipoCurso = ' ';
		boolean erro = true;

		while (erro == true)
		{   
			System.out.println("Tipo do Curso [T/S]: ");
			tipoCurso = ler.nextLine().charAt(0);
			tipoCurso = Character.toUpperCase(tipoCurso);

		    if (tipoCurso=='G' || tipoCurso=='P') {
		      erro = false;
		    }
		    else {
		      System.out.println("Tipo de curso incorreto");
		    }
		}
		if (tipoCurso == 'G'){
		   System.out.println("Graduacao");
		}
		else {
		   System.out.println("Pos-graducao");
		}
    }
}



