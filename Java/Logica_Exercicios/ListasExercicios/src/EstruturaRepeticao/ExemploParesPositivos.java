package EstruturaRepeticao;
import java.util.Scanner;

public class ExemploParesPositivos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("\nDigite o numero limite: ");
		int limite = ler.nextInt();		
		
		/* Solução clássica
		for (int i = 0; i<=limite; i++) {
		    if (i % 2 == 0) {
		       System.out.println(i);				
   	        }
		}
		    
		Solução com base em performance, se iniciar com número par    
    	for (int i = 0; i<=limite; i = i + 2) {
			System.out.println(i);				
	    }
    	*/

		/* Solução com base em performance, sem garantia que começa com número par    
    	int inicio = 7;
    	if (inicio % 2 != 0) {
    		inicio++;
    	}
		for (int i = inicio; i<=limite; i = i + 2) {
			System.out.println(i);				
	    }
	    */
    	

	}

}
