package Avaliacao_IUnidade;

import java.util.Scanner;

public class __Q5_ABC {

	public static void main(String[] args) {
/*
 * O contrato de manuten��o preventiva de uma m�quina avalia 6 itens, que poder�o ser substitu�dos,
 * desde que o valor total n�o ultrapasse R$ 1.000,00.
 * Elabore um programa para receber os valores e os tipos de at� 6 itens ou at� que o total dos
 *  valores informados n�o ultrapasse o valor m�ximo permitido.
 *  Para os itens do tipo �P� (pe�as) conceder desconto de 10%. 
 *  Para os itens do tipo �S� (servi�os) conceder desconto de 20%. 
 *  No final mostrar:
 *  - Quantidade de pe�as;
 *  - Valor total
 */
		Scanner ler = new Scanner(System.in);
		
		final float LIMITE = 1000f;
		final float DESCPECA    = 0.9f; // Concede desconto de 10%
		final float DESCSERVICO = 0.8f; // Concede desconto de 20%
		
		float valorItem, valorTotal=0;
		char tipoItem = ' ';

		int item = 1, contPecas=0; 
		while (item <= 6) {
			
			System.out.printf("\nInforme o valor do %d item ou 0 para encerrar: R$ ", item);
			valorItem = ler.nextFloat();
			if (valorItem == 0) {
				break;
			}
			
			System.out.printf("Informe o tipo do item [P]e�a ou  [S]ervi�o: ");
			ler.nextLine();  // limpa o buffer do teclado
			tipoItem = ler.nextLine().charAt(0);
			tipoItem = Character.toUpperCase(tipoItem);
			
			if (tipoItem=='P') {
				valorItem = valorItem * DESCPECA;
				contPecas++;
			} else if (tipoItem=='S') {
				valorItem = valorItem * DESCSERVICO;
			} else {
				System.out.printf("\nItem inv�lido!!!");
				continue;
			}
		
			if (valorTotal + valorItem > LIMITE) {
				System.out.printf("\nO valor deste item ultrapassa o limite");
				System.out.printf("\nO saldo � de R$ %.2f", LIMITE-valorTotal);
				continue;				
			}
			valorTotal+=valorItem; // valorTotal = ValorTotal + valorItem
			item++;
		}
		System.out.printf("\nValor total        : %.2f", valorTotal);
		System.out.printf("\nQuantidade de pe�as: %d", contPecas);

		
	}

}
