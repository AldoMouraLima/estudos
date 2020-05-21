package CorrecaoAlunos;

import java.util.Scanner;

public class Naiana {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float homem;
        float mulher;
        float criança;
        float valorConta;

        System.out.print("Digite o valor da conta:");
        valorConta = ler.nextFloat();
        
        homem = valorConta/2;
        mulher = homem*(float)2/3;
        criança = mulher/2;

        System.out.println("O valor do homem a pagar é  R$:" + homem);
        System.out.println("O valor da mulher a pagar é R$:" + mulher);
        System.out.println("O valor da criançaa pagar é R$:" + criança);
        ler.close();


	}

}
