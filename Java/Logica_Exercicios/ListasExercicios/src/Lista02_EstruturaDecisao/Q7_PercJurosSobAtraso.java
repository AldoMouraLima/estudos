package Lista02_EstruturaDecisao;

import java.util.Scanner;

public class Q7_PercJurosSobAtraso {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);		

		final float PERCJUROSDIA = 0.004f; // 0,04% por dia de atraso
		float valorParcela, valorJuros, valorPagar;
		int diaVencimento, diaPagamento, diasAtraso;

		System.out.printf("Valor da Parcela : R$  ");
		valorParcela = ler.nextFloat();
		
		System.out.printf("Dia do Vencimento: ");
		diaVencimento = ler.nextInt();

		System.out.printf("Dia do Pagamento : ");
		diaPagamento = ler.nextInt();
			
		if (diaPagamento <= diaVencimento){
			diasAtraso = 0;
			valorJuros = 0;
		}
		else {
			diasAtraso = diaPagamento - diaVencimento;
			valorJuros = diasAtraso * PERCJUROSDIA * valorParcela / 100;
		}
		valorPagar = valorParcela +  valorJuros;

		System.out.printf("\nDias de Atraso: %d", diasAtraso);
		System.out.printf("\nValor dos Juros: R$ %9.2f", valorJuros);
		System.out.printf("\nValor a Pagar  : R$ %9.2f", valorPagar);

		ler.close();
	}
}
