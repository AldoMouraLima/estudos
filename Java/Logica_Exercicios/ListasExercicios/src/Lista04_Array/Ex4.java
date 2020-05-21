package Lista04_Array;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String [] nomes = {"MARIA","JOSE","CARLOS","IVO","ZELIA","ANTONIO"};
		String nome;
		boolean achou=false;
		int posicao=0;
		
		System.out.println("Nome para pesquisar: ");
		nome = ler.next();
		nome = nome.toUpperCase();
		
		for (int i = 0; i < nomes.length; i++) {
			if (nome.equals(nomes[i])) {
				achou = true;
				posicao = i+1;
				break;
			}
		}
		
		if (achou == true) {
			System.out.printf("\n%s encontrado na posição %d", nome, posicao);
		}
		else {
			System.out.printf("Nome não encontrado");
		}
		

		ler.close();
	}

}



