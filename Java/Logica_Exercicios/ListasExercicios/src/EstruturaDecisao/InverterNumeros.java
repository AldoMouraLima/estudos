package EstruturaDecisao;

import java.util.Scanner;

public class InverterNumeros {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num1, num2, aux;
		
		System.out.println("Digite o primeiro número: ");
		num1 = ler.nextInt();
		System.out.println("Digite o primeiro número: ");
		num2 = ler.nextInt();
		
        if (num1>num2) {
           aux = num1;
           num1 = num2;
           num2 = aux;
        }
		System.out.println(num1);
        System.out.println(num2);       	
       ler.close();
	}

}
