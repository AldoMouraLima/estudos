package Avaliacao_IUnidade;

import java.util.Scanner;

public class Q3_Raphael {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		final float monthlyToll = 300.00f;
		int workingDays, nonWorkingDays;
		float dailyValueNon, dailyValueWork;

		System.out.print("Enter the number of working days: ");
		workingDays = reader.nextInt();
		System.out.print("Enter the number of non-working days: ");
		nonWorkingDays = reader.nextInt();

		dailyValueNon = (((monthlyToll / (workingDays + nonWorkingDays)) * 3) / 7) * 2;
		dailyValueWork = (((monthlyToll / (workingDays + nonWorkingDays)) * 3) / 7) * 3;

		System.out.printf("The daily value for working days: %.2f\n", dailyValueWork);
		System.out.printf("Daily value for non-working days: %.2f\n", dailyValueNon);

		reader.close();

	}

}
