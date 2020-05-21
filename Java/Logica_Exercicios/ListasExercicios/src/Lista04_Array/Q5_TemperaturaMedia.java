package Lista04_Array;

public class Q5_TemperaturaMedia {

	public static void main(String[] args) {
		float[] temperatura = {26f, 28.5f, 23f, 27.5f, 23f, 24f, 26.5f};
		float temperaturaMedia = 0, temperaturaTotal = 0;
		int qtdTemperaturaAcimaMedia = 0;
		
		for (int i = 0; i < temperatura.length; i++) {
			temperaturaTotal +=temperatura[i];
		}
		temperaturaMedia = temperaturaTotal/temperatura.length;
		System.out.printf("\nTemperatura Media: %6.2f",temperaturaMedia);

		
		System.out.printf("\nTemperaturas acima da média:");
		for (int i = 0; i < temperatura.length; i++) {
			if (temperatura[i]>temperaturaMedia) {
				qtdTemperaturaAcimaMedia++;
				System.out.printf("   %6.2f", temperatura[i]);
			}
			temperaturaTotal +=temperatura[i];
		}
		System.out.printf("\nQuantidade de temperaturas acima da média: %d", qtdTemperaturaAcimaMedia);
		
		if (-4 % 2 == 0) {
			System.out.println("par");
		}
		else {
			System.out.println("impar");
			
		}
	}

}
