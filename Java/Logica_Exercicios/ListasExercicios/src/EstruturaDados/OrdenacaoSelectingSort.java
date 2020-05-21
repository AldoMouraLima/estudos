package EstruturaDados;

public class OrdenacaoSelectingSort {

	public static void main(String[] args) {

		int menorValor;
		int[] array = {17, 32, 5, 87, 2, 48};
		
		for (int i = 0; i < array.length-1; i++) {
			menorValor = i;

			for (int j = i+1 ; j < array.length; j++) {
				
				if (array[j] < array[menorValor]) {
					menorValor = j;					
				}
			}
			int temp = array[i];
			array[i] = array[menorValor];
			array[menorValor] = temp;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("\n[%d] = %d", i, array[i]);
		}

		System.out.println("\n");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d |", array[i]);
		}

		System.out.println("\n");
		for (int item : array) {
			System.out.printf("%d |", item);
		}
		
	}
}
