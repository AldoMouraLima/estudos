package EstruturaDados;

public class OrdenacaoBubbleSort {

	public static void main(String[] args) {

		int[] array = {17, 32, 5, 87, 2, 48};
		
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1 ; j < array.length; j++) {
				
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;				
				}
			}

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
