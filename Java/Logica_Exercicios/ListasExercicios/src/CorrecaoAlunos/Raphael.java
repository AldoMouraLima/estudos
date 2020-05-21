package CorrecaoAlunos;

import java.util.Scanner;

public class Raphael {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int number = reader.nextInt();
		
		for (int i = 0; i < number; i++) {
			if (i == 0) {
				System.out.println(i);
			}
			else {
				System.out.println(i+1);
				i++;
			}
		}
		reader.close();

	}

}
