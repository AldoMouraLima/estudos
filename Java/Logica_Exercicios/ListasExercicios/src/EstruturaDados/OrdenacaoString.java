package EstruturaDados;

public class OrdenacaoString {

	public static void main(String[] args) {
					
		int menorValor;
		String[] array = {"MARCOS", "MANUELA", "ANNA", "LICIA", "ANDRE", "GABRIEL", "ALBERTO"};
		
		for (int i = 0; i < array.length-1; i++) {
			menorValor = i;

			for (int j = i+1 ; j < array.length; j++) {
				
				if (array[j].compareTo(array[menorValor]) < 0) {
					menorValor = j;					
				}
			}
			String temp = array[i];
			array[i] = array[menorValor];
			array[menorValor] = temp;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("\n[%d] = %s", i, array[i]);
		}

		System.out.println("\n");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%s |", array[i]);
		}

		System.out.println("\n");
		for (String item : array) {
			System.out.printf("%s |", item);		
		}
		
		System.out.println();

	}

}
