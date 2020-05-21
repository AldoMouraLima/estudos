package Lista04_Array;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String [] nomes = {"MARIA","IVONETE","CARLOS","MARIA","ZELIA","ANTONIO"};
		int tamanhoMaiorNome = 0, contarMaiorNome=0;
		
		for (int i = 0; i < nomes.length; i++) {
			if(nomes[i].length() > tamanhoMaiorNome) {
				tamanhoMaiorNome = nomes[i].length();	// 5, 6, 7
			}
		}
		System.out.printf("\nTamanho do maior nome: %d", tamanhoMaiorNome);

		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].length() == tamanhoMaiorNome) {
				contarMaiorNome++;	
			}
		}	
		System.out.printf("\nQuantidade nomes com tamanho = ao maior nome: %d", contarMaiorNome);	

		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].length() == tamanhoMaiorNome) {
				System.out.printf("\n%s",nomes[i]);
			}
		}
		ler.close();
	}

}
