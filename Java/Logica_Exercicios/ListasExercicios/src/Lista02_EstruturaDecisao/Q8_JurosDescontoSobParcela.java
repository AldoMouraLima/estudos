package Lista02_EstruturaDecisao;

import java.util.Scanner;

public class Q8_JurosDescontoSobParcela {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);		

		final float PERCJUROSDIA = 0.004f; // 0,04% por dia de atraso
		final float PERCDESCONTO = 0.05f;  // 5% para pagamento até o vencimento
		final int DIAVENCIMENTO = 5;
		
		float valorParcela, valorJuros, valorDesconto, valorPagar;
		int diaPagamento, diasAtraso;

		System.out.printf("Valor da Parcela : R$  ");
		valorParcela = ler.nextFloat();
		
		System.out.printf("Dia de Pagamento: ");
		diaPagamento = ler.nextInt();
			
		if (diaPagamento <= DIAVENCIMENTO){
			valorDesconto = valorParcela * PERCDESCONTO;
			diasAtraso = 0;
			valorJuros = 0;
		}
		else {
			valorDesconto = 0;
			diasAtraso = diaPagamento - DIAVENCIMENTO;
			valorJuros = diasAtraso * PERCJUROSDIA * valorParcela / 100;
		}
		valorPagar = valorParcela +  valorJuros - valorDesconto;

		System.out.printf("\nDias de Atraso   : %d", diasAtraso);
		System.out.printf("\nValor dos Juros  : R$ %9.2f", valorJuros);
		System.out.printf("\nValor do Desconto: R$ %9.2f", valorDesconto);
		System.out.printf("\nValor a Pagar    : R$ %9.2f", valorPagar);

		ler.close();
	}

}
