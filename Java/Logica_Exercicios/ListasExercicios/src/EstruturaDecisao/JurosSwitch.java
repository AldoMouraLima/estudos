package EstruturaDecisao;

import java.util.Scanner;

public class JurosSwitch {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int mes;
        System.out.print("Informe o número do mês [0-12]: ");
        mes = ler.nextInt();
        
        switch( mes ){
           case 1:
           case 2:
           case 3:
           case 4:
           case 5:
           case 6:
               System.out.println("Primeiro semestre");
               break;
           case 7:
           case 8:
           case 9: 
           case 10:
           case 11:
           case 12:
               System.out.println("Segundo semestre");
               break;
           default:
                   System.out.println("Més inválido");            
        }
        ler.close();
	}

}
