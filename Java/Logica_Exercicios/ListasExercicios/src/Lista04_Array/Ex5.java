package Lista04_Array;

public class Ex5 {

	public static void main(String[] args) {
		String[] cidades = {"RECIFE", "OLINDA", "JABOATAO", "CABO", "PAULISTA"};
		int[] contaminados = {350, 190, 250, 190, 280};
		float media = 0;
		
		for (int i=0; i<contaminados.length; i++) {		
			media = media + contaminados[i];
		}
		
		media = media / contaminados.length;

		for (int i = 0; i < contaminados.length; i++) {
			if (contaminados[i] > media) {
				System.out.printf("\n%s %d", cidades[i],  contaminados[i] );
			}		
		}
		
	}

}
