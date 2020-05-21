package Lista_Revisao2;

import java.util.Scanner;

public class Exec09_Ordenar3Nomes {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome1 = "JOSE", nome2 = "ANTONIO", nome3 = "GERALDO", aux="";
		
		if (nome1.compareTo(nome2) > 0) {
			aux = nome2;
			nome2 = nome1;
			nome1 = aux;
		}
		
		if (nome1.compareTo(nome3) > 0) {
			aux = nome3;
			nome3 = nome1;
			nome1 = aux;
		}

		if (nome2.compareTo(nome3) > 0) {
			aux = nome3;
			nome3 = nome2;
			nome2 = aux;
		}
		
		System.out.println(nome1);
		System.out.println(nome2);
		System.out.println(nome3);
		
	}

}
