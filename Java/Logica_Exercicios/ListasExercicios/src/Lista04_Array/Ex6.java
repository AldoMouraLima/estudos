package Lista04_Array;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String [] nomes = {"MARIA","JOSE","CARLOS","MARIA","ZELIA","ANTONIO"};
		String nome;

		System.out.println("Nome para pesquisar:");
		nome = ler.next();
		nome = nome.toUpperCase();		
		
		int qtdeNomes = 0;
		boolean achou = false;
		
		for (int i = 0; i < nomes.length; i++) {
			
			if(nome.equals(nomes[i])) {
				achou = true;
				qtdeNomes++;
			}	
		}
		
		if (achou == true) {
			System.out.printf("%s foi encontrado %d vez(es)", nome, qtdeNomes);
		}
		else {
			System.out.printf("Nome não encontrado");
		}
		ler.close();
	}
}
