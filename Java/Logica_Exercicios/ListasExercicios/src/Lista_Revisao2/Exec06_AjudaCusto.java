package Lista_Revisao2;

import java.util.Scanner;

public class Exec06_AjudaCusto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantidade de filhos: ");
		int qtdeFilhos = ler.nextInt();
		int idade, idadeAnterior = -1, contFilhos = 0;
		float ajudaCusto=0;
		boolean anteriorGemeos = false;
		while (contFilhos<qtdeFilhos) {
			System.out.printf("\nIdade do %dº filho: ", ++contFilhos);
			idade = ler.nextInt();
			ajudaCusto=0;
			if (idade < 13) {
				if (idade == idadeAnterior) {
					ajudaCusto = 120;
					if (anteriorGemeos==false) {
						System.out.printf("\nA ajuda de custo do %dº filho ajustada para R$ %.2f",contFilhos-1, ajudaCusto );						
					}
					anteriorGemeos = true;
				}
				else {
					ajudaCusto=100;					
					idadeAnterior = idade;
					anteriorGemeos = false;
				}
			}
			System.out.printf("\nA ajuda de custo do %dº filho é de R$ %.2f",contFilhos, ajudaCusto );
		}
		
		ler.close();
	}

}
