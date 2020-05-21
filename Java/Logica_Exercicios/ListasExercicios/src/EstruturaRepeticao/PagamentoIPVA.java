package EstruturaRepeticao;

import java.util.Scanner;

public class PagamentoIPVA {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		final float IPVA = 0.10F;  // 10%
		String placa, finalPlaca;
		float valor, valorIpva, totalJan=0, totalFev=0, totalMar=0, totalAbr=0, total;
		
		for (int i=0; i<4; i++) {
			System.out.printf("\nPlaca - %dº veículo: ", i+1);
			placa = ler.next();
			System.out.printf("\nValor - %dº veículo: ", i+1);
			valor = ler.nextFloat();
			
			finalPlaca = placa.substring(7);
			valorIpva = valor * IPVA;			
			if (finalPlaca.equals("1") || finalPlaca.equals("2") || finalPlaca.equals("3")) {
				System.out.println("Pagamento em Janeiro");
				totalJan = totalJan + valorIpva;
			}
			else if (finalPlaca.equals("4") || finalPlaca.equals("5") || finalPlaca.equals("6")){
				System.out.println("Pagamento em Fevereiro");				
				totalFev = totalFev + valorIpva;
			}
			else if (finalPlaca.equals("7") || finalPlaca.equals("8") || finalPlaca.equals("9")){
				System.out.println("Pagamento em Março");				
				totalMar = totalMar + valorIpva;
			}
			else {				
				System.out.println("Pagamento em Abril");				
				totalAbr = totalAbr + valorIpva;
			}		
		}
		System.out.printf("\nArrecardação de Janeiro   R$: %10.2f", totalJan);
		System.out.printf("\nArrecardação de Favereiro R$: %10.2f", totalFev);
		System.out.printf("\nArrecardação de Março     R$: %10.2f", totalMar);
		System.out.printf("\nArrecardação de Abril     R$: %10.2f", totalAbr);		
		total = totalJan + totalFev + totalMar + totalAbr;
		System.out.printf("\nArrecardação Geral        R$: %10.2f", total);
		
		ler.close();	}

}
