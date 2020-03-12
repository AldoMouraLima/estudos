import java.util.Scanner;

public class RepeticaoWhile {
    public static void main(String[] args)  {
    	Scanner ler = new Scanner(System.in);
	
    	//while (true){

		char tipoCurso = ' ';

		while (tipoCurso !='G' && tipoCurso !='P' ) {  
		char esc = 27;
		String clear = esc + "[2J"; //codigo ansi para limpar a tela
		System.out.print(clear); 
			System.out.println("Tipo do Curso [G/P]: ");
			tipoCurso = ler.nextLine().charAt(0);
			tipoCurso = Character.toUpperCase(tipoCurso);

		    if (tipoCurso!='G' && tipoCurso!='P') {
		      System.out.println("Tipo de curso incorreto\n");
		    }
		}
		if (tipoCurso=='G'){
		   System.out.println("Graduacao");
		}
		else {
		   System.out.println("Pos-graducao");
		}
	//	}
    }
}



