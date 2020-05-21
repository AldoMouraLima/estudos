package Lista04_Array;

public class Q4_MaiorMenorTemperatura {

	public static void main(String[] args) {
		float[] temperatura = {2f, -1f, 0f, -2f, 1f, 3f, -1f};
		float maiorTemperatura = temperatura[0];
		float menorTemperatura = temperatura[0];
		
		for (int i = 0; i < temperatura.length; i++) {
			if (temperatura[i]>maiorTemperatura) {
				maiorTemperatura = temperatura[i];
			}
			if (temperatura[i]<menorTemperatura) {
				menorTemperatura = temperatura[i];
			}
		}	
		System.out.printf("\nMaior temperatura: %6.2f",maiorTemperatura);
		System.out.printf("\nMenor temperatura: %6.2f",menorTemperatura);


	}

}
