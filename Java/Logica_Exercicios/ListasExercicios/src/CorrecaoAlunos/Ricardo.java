package CorrecaoAlunos;

import java.util.Locale;
import java.util.Scanner;

public class Ricardo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valorParcela = sc.nextDouble();
		int diaVencimento = sc.nextInt();
		int diaPagamento = sc.nextInt();
		int diasAtraso;
		double valorJuros;
		double valorTotal;

		if (diaPagamento <= diaVencimento) {
			diasAtraso = 0;
			valorJuros = 0;
			valorTotal = valorParcela;
		} else {
			diasAtraso = diaPagamento - diaVencimento;
			valorJuros = (0.4 / 100) * valorParcela * diasAtraso;
			valorTotal = valorParcela + valorJuros;
		}
		System.out.println(diasAtraso);
		System.out.println(valorJuros);
		System.out.println(valorTotal);

		sc.close();


	}

}
