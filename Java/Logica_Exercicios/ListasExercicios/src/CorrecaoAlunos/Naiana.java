package CorrecaoAlunos;

import java.util.Scanner;

public class Naiana {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float homem;
        float mulher;
        float crian�a;
        float valorConta;

        System.out.print("Digite o valor da conta:");
        valorConta = ler.nextFloat();
        
        homem = valorConta/2;
        mulher = homem*(float)2/3;
        crian�a = mulher/2;

        System.out.println("O valor do homem a pagar �  R$:" + homem);
        System.out.println("O valor da mulher a pagar � R$:" + mulher);
        System.out.println("O valor da crian�aa pagar � R$:" + crian�a);
        ler.close();


	}

}
