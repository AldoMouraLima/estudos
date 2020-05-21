package CorrecaoAlunos;

import java.util.Scanner;


public class ThiagoYuji {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

	    int num = ler.nextInt();
        String dia_semana ;
        switch(num){
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            default:
                System.out.println("Dia inválido");
        }

	}

}
