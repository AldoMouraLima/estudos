package Lista04_Array;

public class Q1_MaiorTemperaturaPositiva {

	public static void main(String[] args) {
		float[] temperatura = {26f, 28.5f, 23.5f, 27f, 23.5f, 25f, 26.5f};
		// float maiorTemperatura = 0;
		float maiorTemperatura = temperatura[0];
		
		for (int i = 0; i < temperatura.length; i++) {
			if (temperatura[i]>maiorTemperatura) {
				maiorTemperatura = temperatura[i];
			}
		}	
		System.out.printf("Maior temperatura: %6.2f",maiorTemperatura);
	}
}
