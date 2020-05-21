package EstruturaDados;

public class OrdenacaoInsertSort {

	public static void main(String[] args) {
		int[] array = { 17, 32, 5, 87, 2, 48 };
		int j;
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			for (j = i - 1; j >= 0 && temp < array[j]; j--) {
				array[j + 1] = array[j];
			}
			array[j + 1] = temp;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.printf("\n[%d] = %d", i, array[i]);
		}

	}

}
