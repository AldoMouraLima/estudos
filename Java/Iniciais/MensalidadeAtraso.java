
import java.util.Scanner;

public class MensalidadeAtraso {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);		
		
		final float IND_FAIXA1 = 0.05F;
		final float IND_FAIXA2 = 0.10F;
		final float IND_FAIXA3 = 0.15F;

		float valorMensalidade, valorJuros, valorPagar, indice;
		int diasAtraso;

		System.out.printf("Valor da Mensalidade R$  ");
		valorMensalidade = ler.nextFloat();
		
		System.out.printf("Dias em Atraso  ");
		diasAtraso = ler.nextInt();

		if (diasAtraso <= 0){
			indice = 0;
		}
		else if (diasAtraso <=30) {
			indice = IND_FAIXA1;
		}
		else if (diasAtraso <=60) {
			indice = IND_FAIXA2;
		}
		else {
			indice = IND_FAIXA3;
		}
	    valorJuros = valorMensalidade * indice;
		valorPagar = valorMensalidade +  valorJuros;
		System.out.println("\nValor dos Juros: R$ " + String.format(" %.2f", valorJuros));
		System.out.println("\nValor a Pagar  : R$ " + String.format(" %.2f", valorPagar));

		ler.close();
	}
}