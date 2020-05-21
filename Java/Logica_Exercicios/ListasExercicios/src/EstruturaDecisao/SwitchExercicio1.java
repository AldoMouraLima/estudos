package EstruturaDecisao;

import java.util.Scanner;

public class SwitchExercicio1 {

	public static void main(String[] args) {
		int dia=0;
		Scanner ler = new Scanner(System.in);
        String diaExtenso = "";
     
        do {
        	try {
        		System.out.print("Informe o número do dia da semana: ");
        		dia = ler.nextInt();        		
        	}
        	catch (Exception exception) {
           		System.out.println("Digite apenas número!!!");
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
            	diaExtenso = "Terça";
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
            	diaExtenso = "Sábado";
                break;         
        }
        System.out.printf("O dia digitado é %s", diaExtenso);        	
        ler.close();	
	}
}
