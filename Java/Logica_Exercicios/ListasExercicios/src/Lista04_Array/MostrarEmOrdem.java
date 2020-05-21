package Lista04_Array;

public class MostrarEmOrdem {

	public static void main(String[] args) {
		
		int x = 1041;
		int y = x % 2;
		int z = (x-y)/2;
		System.out.printf("%d  %d", z, y);

		int[] array = {8, 17, 25, 50, 14, 19, 28, 77, 85, 45};

		// Valores das posições pares
		System.out.printf("\na) ");
		for (int i = 0; i < array.length; i=i+2) {
			System.out.printf(" %2d |", array[i]);
		}
		
		// Valores pares
		System.out.printf("\nb) ");
		for (int i = 0; i < array.length; i++) {
			if (array[i]%2==0) {
				System.out.printf(" %2d |", array[i]);				
			}
		}

		// Valores das posições 9 - 0
		System.out.printf("\nc) ");
		for (int i = 9; i >= 0; i--) {
			System.out.printf(" %2d |", array[i]);
		}
		
		// Valores das posições 9 - 0
		System.out.printf("\nd) ");
		for (int i = 4; i <= 8; i++) {
			System.out.printf(" %2d |", array[i]);
		}

		// Enquanto estiver em ordem crescente
		int ultimoValor=array[0]-1;
		int c=0;
		System.out.printf("\ne) ");
		while (array[c]>ultimoValor) {
			System.out.printf(" %2d |", array[c]);
			ultimoValor=array[c];
			c++;
		}
		
		// Apenas os elementos em ordem crescente
		System.out.printf("\nf) ");
		ultimoValor=array[0]-1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > ultimoValor) {
				System.out.printf(" %2d |", array[i]);				
				ultimoValor=array[i];
			}
		}

		// A partir do ultimo elemento. 
		// Apenas os elementos em ordem decrescente
		System.out.printf("\ng) ");
		ultimoValor=array[9]+1;
		for (int i = 9; i >= 0; i--) {
			if (array[i] < ultimoValor) {
				System.out.printf(" %2d |", array[i]);				
				ultimoValor=array[i];
			}
		}

		// Intercalado com o inverso do array
		System.out.printf("\nh) ");
		for (int i = 0; i < array.length; i++) {
    		System.out.printf(" %2d |", array[i]);				
    		System.out.printf(" %2d |", array[9-i]);				
		}

		// 0-4, intercalado com 5-9
		System.out.printf("\ni) ");
		for (int i = 0; i < 5; i++) {
    		System.out.printf(" %2d |", array[i]);				
    		System.out.printf(" %2d |", array[5+i]);				
		}

		
		
		System.out.printf("\nj) ");
		int menor;
		int ultimoMenor = 0;
		for (int i = 0; i < array.length; i++) {
			menor = 999;
			
			for (int j = 0 ; j < array.length; j++) {
			
				if (array[j]>ultimoMenor && array[j] < menor ) {
					menor = array[j];				
				}
			}
			System.out.printf(" %2d |",menor);
			ultimoMenor = menor;
		}
	}
}
