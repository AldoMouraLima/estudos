package Avaliacao_IUnidade;

import java.util.Scanner;

public class _Q4_Cantina {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final float FRANQUIA = 20f;
		final float DESCBEBIDA = 0.95f; // Descontar 5%
		final float DESCCOMIDA = 0.9f;  // Descontar 10%
		
		float valorProduto, valorTotal=0, desconto;
		int produto=1;
		char tipoProduto=' ';
		while (produto < 6) {
			
			System.out.printf("\nInforme o tipo do produto [B]ebida  [C]omida  [F]im: ");
			tipoProduto = ler.nextLine().charAt(0);
			tipoProduto = Character.toUpperCase(tipoProduto);
			if (tipoProduto=='F') {
				break;
			}

			if (tipoProduto=='B') {
				desconto = DESCBEBIDA;
			}
			else if (tipoProduto=='C'){
				desconto = DESCCOMIDA;				
			}
			else {
				System.out.printf("\nItem inválido!!!");
				continue;				
			}

			System.out.printf("\nInforme o valor do %d item: R$ ", produto);
			valorProduto = ler.nextFloat();
		
			if (valorTotal+valorProduto>FRANQUIA) {
				System.out.printf("\nO valor deste item ultrapassa o limite");
				System.out.printf("\nO saldo é de R$ %.2f", FRANQUIA-valorTotal);
				continue;
			}
			valorTotal+=valorProduto*desconto;
			produto++;
			
			System.out.println(valorTotal);
			ler.nextLine();
		}
		System.out.printf("\nValor total        : %.2f", valorTotal);
		ler.close();


	}

}
