package Lista04_Array;

public class Q2_MenorTemperaturaPositiva {

	public static void main(String[] args) {
		float[] temperatura = {26f, 28.5f, 23.5f, 27f, 23.5f, 25f, 26.5f};
		//float menorTemperatura = 999;
		float menorTemperatura = temperatura[0];
		
		for (int i = 0; i < temperatura.length; i++) {
			if (temperatura[i]<menorTemperatura) {
				menorTemperatura = temperatura[i];
			}
		}	
		System.out.printf("Menor temperatura: %6.2f",menorTemperatura);

	}

}
