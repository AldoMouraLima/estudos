package EstruturaDecisao;

import java.util.Scanner;

public class SwitchExercicio1 {

	public static void main(String[] args) {
		int dia=0;
		Scanner ler = new Scanner(System.in);
        String diaExtenso = "";
     
        do {
        	try {
        		System.out.print("Informe o n�mero do dia da semana: ");
        		dia = ler.nextInt();        		
        	}
        	catch (Exception exception) {
           		System.out.println("Digite apenas n�mero!!!");
           		ler.next();
           		continue;
			}
        	if (dia<1 || dia>7) {
        		System.out.println("Dia invalido!!!");
        	}
		} while (dia<1 || dia>7);
        
        switch( dia )
        {
            case 1:
            	diaExtenso = "Domingo";
            	break;        
            case 2:
            	diaExtenso = "Segunda";
                break;               
            case 3:
            	diaExtenso = "Ter�a";
                break;                
            case 4:
            	diaExtenso = "Quarta";
                break;         
            case 5:
            	diaExtenso = "Quinta";
                break;         
            case 6:
            	diaExtenso = "Sexta";
                break;         
            case 7:
            	diaExtenso = "S�bado";
                break;         
        }
        System.out.printf("O dia digitado � %s", diaExtenso);        	
        ler.close();	
	}
}
