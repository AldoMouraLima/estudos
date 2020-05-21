package Lista_Revisao2;

import java.util.Scanner;

public class Exec07_FundoCaixa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final float FUNDOCAIXA = 500f;
		float saldo = FUNDOCAIXA, despesa;
		char continuar;
		do {
			System.out.println("\nInforme o valor da despesa: ");
			despesa = ler.nextFloat();
			//if (despesa == 0) {
			//	break;
			//}
			if (despesa > saldo) {
				System.out.println("\nNão tem saldo no fundo de caixa para esta despesa");
				continue;
			}
			
			
			saldo = saldo - despesa;
			System.out.printf("\nSaldo: %.2f", saldo);
			do {
				
				System.out.println("\nTem mais despesas para lançar [S/N]? ");
				continuar = ler.next().charAt(0);
				continuar = Character.toUpperCase( continuar ); 
				if (continuar == 'S' || continuar == 'N')  {
					break;
				}
			} while (true);
			if (continuar == 'N') {
				break;
			}
		} while (saldo>0);
		
		ler.close();
	}

}
