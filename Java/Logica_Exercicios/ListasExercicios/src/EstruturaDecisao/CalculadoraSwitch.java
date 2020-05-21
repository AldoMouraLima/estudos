package EstruturaDecisao;

import java.util.Scanner;

public class CalculadoraSwitch {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        float numero1, numero2, resultado=0;
        char operacao;
        boolean erro = false;
        
        System.out.print("Escolha sua opera��o [+ - * / ]: ");
        operacao = ler.nextLine().charAt(0);
        
        System.out.print("Entre com o primeiro n�mero: ");
        numero1 = ler.nextFloat();
        System.out.print("Entre com o segundo n�mero: ");
        numero2 = ler.nextFloat();
        System.out.println();
        
        switch( operacao )
        {
            case '+':
            	resultado = numero1+numero2;
            	break;        
            case '-':
            	resultado = numero1-numero2;
                break;               
            case '*':
            	resultado = numero1*numero2;
                break;                
            case '/':
            	resultado = numero1/numero2;
                break;         
            default:
                System.out.printf("Opera��o inv�lida."); 
                erro = true;
        }
        if (erro==false) {
        	System.out.printf("%.2f %s %.2f = %.2f", numero1, operacao, numero2, resultado);        	        	
        }
        ler.close();
	}

}
