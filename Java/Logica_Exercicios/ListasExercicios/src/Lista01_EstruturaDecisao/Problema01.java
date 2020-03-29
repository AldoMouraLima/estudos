package Lista01_EstruturaDecisao;

import java.util.Scanner;

public class Problema01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		// Declaração das constantes
		final float DESCONTODEPENDENTE = 1000f;
		
		// Declaração das variáveis para entrada, processamento e saída
		float valorBrutoImposto, valorImpostoPagar, valorDescontoDependente;
		int qtdeDependentes;

		// Entrada de dados
		System.out.println("Valor Bruto do Imposto: R$ ");
		valorBrutoImposto = ler.nextFloat();

		System.out.println("Quantidade de Dependentes: ");
		qtdeDependentes = ler.nextInt();		
		
		// Processamento
		valorDescontoDependente = qtdeDependentes * DESCONTODEPENDENTE;
		valorImpostoPagar = valorBrutoImposto - valorDescontoDependente;
		
		if (valorDescontoDependente > valorBrutoImposto) {
			valorDescontoDependente = valorBrutoImposto;
			valorImpostoPagar = 0;
		}

		// Saída
		System.out.printf("\nDesconto com Dependentes: R$ %9.2f", valorDescontoDependente);
		System.out.printf("\nImposto a Pagar         : R$ %9.2f", valorImpostoPagar);

		
		ler.close();
	}
}
