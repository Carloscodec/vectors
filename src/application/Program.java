package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of measurements to calculate the average: ");
		int n = input.nextInt();
		double[] vect = new double[n];
		
		System.out.println("Enter the meansurements: ");
		for (int i = 0; i < n; i++) {
			System.out.print("#" + (i + 1) + " meansurement: ");
			vect[i] = input.nextDouble();
		}
		
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("Average: %.2f" + avg);
		
		
		
		input.close();

	}

}
