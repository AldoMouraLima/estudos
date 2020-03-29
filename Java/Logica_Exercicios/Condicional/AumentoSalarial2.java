
import java.util.Scanner;

public class Biblioteca {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);		
		
		final float PERC_FAIXA1 = 0.05F;
		final float PERC_FAIXA2 = 0.03F;

		float salarioAtual, valorAumento, SalarioReajustado;

		System.out.printf("Informe o valor do salario R$  ");
		salarioAtual = ler.nextFloat();
		
		if (salarioAtual <= 3000) {
			valorAumento = salarioAtual * PERC_FAIXA1;
		else {
			valorAumento = salarioAtual * PERC_FAIXA2;
		}

		SalarioReajustado = salarioAtual + valorAumento;
		System.out.println();
		System.out.println("O valor do aumento: R$ " + String.format(" %.2f", valorAumento));
		System.out.println("O valor do salario reajustado: R$ " + String.format(" %.2f", SalarioReajustado));

		ler.close();
	}
}