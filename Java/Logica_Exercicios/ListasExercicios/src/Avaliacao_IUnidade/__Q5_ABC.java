package Avaliacao_IUnidade;

import java.util.Scanner;

public class __Q5_ABC {

	public static void main(String[] args) {
/*
 * O contrato de manutenção preventiva de uma máquina avalia 6 itens, que poderão ser substituídos,
 * desde que o valor total não ultrapasse R$ 1.000,00.
 * Elabore um programa para receber os valores e os tipos de até 6 itens ou até que o total dos
 *  valores informados não ultrapasse o valor máximo permitido.
 *  Para os itens do tipo “P” (peças) conceder desconto de 10%. 
 *  Para os itens do tipo “S” (serviços) conceder desconto de 20%. 
 *  No final mostrar:
 *  - Quantidade de peças;
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
			
			System.out.printf("Informe o tipo do item [P]eça ou  [S]erviço: ");
			ler.nextLine();  // limpa o buffer do teclado
			tipoItem = ler.nextLine().charAt(0);
			tipoItem = Character.toUpperCase(tipoItem);
			
			if (tipoItem=='P') {
				valorItem = valorItem * DESCPECA;
				contPecas++;
			} else if (tipoItem=='S') {
				valorItem = valorItem * DESCSERVICO;
			} else {
				System.out.printf("\nItem inválido!!!");
				continue;
			}
		
			if (valorTotal + valorItem > LIMITE) {
				System.out.printf("\nO valor deste item ultrapassa o limite");
				System.out.printf("\nO saldo é de R$ %.2f", LIMITE-valorTotal);
				continue;				
			}
			valorTotal+=valorItem; // valorTotal = ValorTotal + valorItem
			item++;
		}
		System.out.printf("\nValor total        : %.2f", valorTotal);
		System.out.printf("\nQuantidade de peças: %d", contPecas);

		
	}

}
