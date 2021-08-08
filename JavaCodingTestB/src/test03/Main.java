package test03;

import java.util.Scanner;
/*
 * 3. Write a program get descriptive statistics. 
 * 1) User inputs 4 of numbers as below. 
 * 2) Print the summation, average, minimum and maximum values
 * 
 * sample) 3.23 114.32 54.22 12.34
 * summation : 184.11
 * Average : 46.0275
 * Minimum : 3.23
 * Maximum : 114.32
 * 
 */
public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Input 4 any numbers");
		double[] arr = new double[4];
		for (int i = 0; i < 4; i++) {
			arr[i] = scanner.nextDouble();
		}
		int count = 0;
		double sum = 0, avr = 0, min = Double.MAX_VALUE, max = Double.MIN_VALUE;
		for (int i = 0; i < 4; i++ ) {
			count++;
			sum = sum + arr[i];
			if (min > arr[i]) {
				min = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}
		}
			avr = sum/count;

		System.out.printf("Summation : %.2f\n",sum);
		System.out.printf("Average : %.4f\n", avr);
		System.out.println("Minimum : " + min);
		System.out.println("Maximum : " + max);

	}//main

}//class
