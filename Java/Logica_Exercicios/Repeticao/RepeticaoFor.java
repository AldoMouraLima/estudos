import java.util.Scanner;

public class RepeticaoFor {
    public static void main(String[] args)  {
    	Scanner ler = new Scanner(System.in);
		float acumulador = 0;
		float valor;

		for (int contador = 1; contador < 5; contador ++){   
			System.out.printf("Valor do %2dº produto: ", contador);
			valor = ler.nextFloat();
			acumulador = acumulador + valor;
		} 
		System.out.printf("\nValor Total é: %.2f", acumulador);
    }
}



