package Lista04_Array;

public class Q3_MaiorTemperatura {

	public static void main(String[] args) {
		float[] temperatura = {2f, -1f, 0f, -2f, 1f, 3f, -1f};
		float maiorTemperatura = temperatura[0];
		
		for (int i = 0; i < temperatura.length; i++) {
			if (temperatura[i]>maiorTemperatura) {
				maiorTemperatura = temperatura[i];
			}
		}	
		System.out.printf("Maior temperatura: %6.2f",maiorTemperatura);
	}
}
