package Avaliacao_IUnidade;

import java.util.Scanner;

public class _Q4_ManutencaoMaquinas {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final float LIMITE = 1000f;
		final float DESCPRODUTO = 0.9f; // Descontar 10%
		final float DESCSERVICO = 0.8f; // Descontar 20%
		
		float valorItem, valorTotal=0;
		int item=1, itemPeca=0;
		char tipoItem=' ';
		while (item < 6) {
			
			System.out.printf("\nInforme o valor do %d item ou 0 para encerrar: R$ ", item);
			valorItem = ler.nextFloat();
		
			if (valorItem==0) {
				break;
			}
			if (valorTotal+valorItem>LIMITE) {
				System.out.printf("\nO valor deste item ultrapassa o limite");
				System.out.printf("\nO saldo é de R$ %.2f", LIMITE-valorTotal);
				continue;
			}
			
			System.out.printf("Informe o tipo do item [P]roduto  [S]erviço: ");
			ler.nextLine();
			tipoItem = ler.nextLine().charAt(0);
			tipoItem = Character.toUpperCase(tipoItem);
			if (tipoItem=='P') {
				valorItem=valorItem*DESCPRODUTO;
				itemPeca++;
			}
			else if (tipoItem=='S'){
				valorItem=valorItem*DESCSERVICO;				
			}
			else {
				System.out.printf("\nItem inválido!!!");
				continue;				
			}
			valorTotal+=valorItem;
			item++;
		}
		System.out.printf("\nQuantidade de peças: %d", itemPeca);
		System.out.printf("\nValor total        : %.2f", valorTotal);
		ler.close();
	}

}
