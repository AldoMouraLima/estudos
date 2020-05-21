package EstruturaRepeticao;

import java.util.Scanner;

public class QtdeSalasVestibular {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int qtdePessoas;
		
		qtdePessoas = ler.nextInt();
		int qtdeSalas = qtdePessoas /50;
		int sobra = qtdePessoas % 50;
		System.out.println(qtdeSalas);
		System.out.println(sobra);
		ler.close();
	}

}
