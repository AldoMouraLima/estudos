package Lista04_Array;

public class Ex9 {

	public static void main(String[] args) {
		int[] passageiros = {3000,  350,  500,  450,  700, 1000,
				             2000, 1500, 1000, 1300, 1200, 1500,
				             1500, 1300, 1300, 1500, 1300, 1800,
                             1700, 1600, 1500, 1200, 1000,  500};

		float mediaPrimeiras12Horas = 0;
		int   picoPrimeiras12Horas  = passageiros[0];
		int   horaPicoPrimeiras12Horas = 0;
		for (int i = 0; i < 12; i++) {
			mediaPrimeiras12Horas = mediaPrimeiras12Horas + passageiros[i];
			if (passageiros[i] > picoPrimeiras12Horas) {
				picoPrimeiras12Horas = passageiros[i];
				horaPicoPrimeiras12Horas = i;
			}
		}
		mediaPrimeiras12Horas = (float) mediaPrimeiras12Horas / 12;
	
		float mediaSegundas12Horas = 0;
		int   picoSegundas12Horas  = passageiros[12];
		int   horaPicoSegundas12Horas = 0;
		for (int i = 12; i < 24; i++) {
			mediaSegundas12Horas = mediaSegundas12Horas + passageiros[i];
			if (passageiros[i] > picoSegundas12Horas) {
				picoSegundas12Horas = passageiros[i];
				horaPicoSegundas12Horas = i;
			}
		}
		mediaSegundas12Horas = (float) mediaSegundas12Horas / 12;
		
		int passageiroHoraAnterior1P = 0; 
		String posicao1P = "";
		float percentual1P=0;
		if (horaPicoPrimeiras12Horas == 0) {
			passageiroHoraAnterior1P = passageiros[0] / 2;

			if (passageiroHoraAnterior1P != 0) {
				posicao1P = "abaixo";
				percentual1P = (mediaPrimeiras12Horas / passageiroHoraAnterior1P * 100) - 100;
			}
		}
		else {
			passageiroHoraAnterior1P = passageiros[horaPicoPrimeiras12Horas - 1];							
			
			if (passageiroHoraAnterior1P > mediaPrimeiras12Horas) {
				posicao1P = "acima";
				percentual1P = 100 - (mediaPrimeiras12Horas / passageiroHoraAnterior1P * 100);
			}
			else {
				if (passageiroHoraAnterior1P < mediaPrimeiras12Horas) {
					posicao1P = "abaixo";
					percentual1P = (mediaPrimeiras12Horas / passageiroHoraAnterior1P * 100) - 100;
				}
			}
		}
		
		System.out.println(passageiroHoraAnterior1P);
		System.out.println(percentual1P);
		
		int passageiroHoraAnterior2P = 0; 
		String posicao2P = "";
		passageiroHoraAnterior2P = passageiros[horaPicoSegundas12Horas - 1];
		float percentual2P = 0;
		if (passageiroHoraAnterior2P > mediaSegundas12Horas) {
			posicao2P = "acima";
			percentual2P = 100 - (mediaSegundas12Horas / passageiroHoraAnterior2P * 100);
		}
		else {
			if (passageiroHoraAnterior2P < mediaSegundas12Horas) {
				percentual2P = (mediaSegundas12Horas / passageiroHoraAnterior2P * 100) - 100;
				posicao2P = "abaixo";
			}
		}
						

		System.out.printf("\nQuantidade média de passageiros    : %6.1f          |  %6.1f",
				           mediaPrimeiras12Horas, mediaSegundas12Horas);

		System.out.printf("\nHora de Pico                       : %2dh             |  %2dh",
		           horaPicoPrimeiras12Horas+1, horaPicoSegundas12Horas+1);

		System.out.printf("\nPercentual (hora anterior) ao pico : %6.1f%% %s   | %6.1f%% %6s", percentual1P, posicao1P, percentual2P, posicao2P);

	}

}
