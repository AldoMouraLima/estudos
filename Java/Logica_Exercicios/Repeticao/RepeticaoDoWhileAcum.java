import java.util.Scanner;

public class RepeticaoDoWhileAcum {
    public static void main(String[] args)  {
    	Scanner ler = new Scanner(System.in);
		int contador = 0;
		float acumulador = 0;
		float valor;

		do {   
            contador = contador + 1;
			System.out.printf("Valor do %2dº produto: ", contador);
			valor = ler.nextFloat();
			acumulador = acumulador + valor;
		} while (contador < 4);
		System.out.printf("Valor Total é: %.2f", acumulador);
    }
}



