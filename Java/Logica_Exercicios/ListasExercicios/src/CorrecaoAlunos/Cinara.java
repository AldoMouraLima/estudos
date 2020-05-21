package CorrecaoAlunos;

import java.util.Scanner;

public class Cinara {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int dia;
    	System.out.print("Digite um número: ");
    	dia = ler.nextInt();

    	
        int mes;
        	System.out.print("Digite o número correspondente ao mês: ");
        	mes = ler.nextInt();
        
        switch ( mes){
            case 1:
            case 2:
            case 7:
            case 12:
                System.out.println("Alta temporada.");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("Baixa temporada.");
                break;                
        }
    ler.close();
	}

}
