package Avaliacao_IUnidade;

import java.util.Scanner;

public class Q4_Raphael {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int pieceType = 0;
		int counter = 1;
		final float limit = 1000.0f;
		float currentValue = 0f;
		
		
		while(currentValue <= limit && counter <= 6) {
			System.out.printf("Enter the value of the %dº item: ", counter);
			float itemValue = reader.nextFloat();
			System.out.printf("Enter the type of the %dº item (P/S): ", counter);
			char itemType = reader.next().charAt(0);
			itemType = Character.toUpperCase(itemType);
			if (itemType == 'P') {
				if(currentValue + (itemValue * 0.90f) > 1000.0f) {
					break;
				}
				currentValue += (itemValue * 0.90f);
				pieceType++;
				counter++;
			} else {
				if(currentValue + (itemValue * 0.80f) > 1000.0f) {
					break;
				}
				currentValue += (itemValue * 0.80f);
				counter++;
			}	
		}
		
		System.out.printf("Piece amount: %d\n", pieceType);
		System.out.printf("Total value: %.2f", currentValue);
		
		reader.close();

	}

}
