package EstruturaDecisao;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String nome1, nome2;
 
        System.out.println("Informe o pirmeiro nome:");
        nome1 = ler.next();
        System.out.println("Informe o segundo nome:");
        nome2 = ler.next();
 
        if (nome1.compareTo(nome2) == 0  ) {
        	System.out.printf("\nNomes iguais");        	
        }
        else if (nome1.compareTo(nome2) < 0 ) {
        	System.out.printf("\n%s antecede %s", nome1, nome2);        
        }
        else {
        	
        	System.out.printf("\n%s procede %s", nome1, nome2);        
        }	
        	
        System.out.println(nome1.length());
        
        ler.close();

                

        }
	}

