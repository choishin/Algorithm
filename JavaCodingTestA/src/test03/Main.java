package test03;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 3. Write a program to get descriptive statistics. 
 * 1) User inputs the number N for thenumber of integers 
 * 2) User inputs the numbers in any order. 
 * *Print the roundedaverage, minimum number, maximum number and summation 
 * *Do not call the internal methods in Java libraries to get the minimum and maximum numbers.
 * 
 * sample) 3 8 29 12 46 7 11 
 * Average : 17
 * Minimum : 3
 * Maximum : 46
 * Summation : 116
 * 
 */
public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input size of numbers");
		int size = scanner.nextInt();
		System.out.println("input a number");
		int[] numbers = new int[size];
		for (int i = 0; i <size; i++) {
			numbers[i] = scanner.nextInt();
		}
		//확인//System.out.println(Arrays.toString(numbers));
		calculator(numbers);

	}//main
	
	public static void calculator (int[] numbers) {
		
		//확인//System.out.println(Arrays.toString(numbers));
		int count = 0; 
		double sum = 0.0; double avr =0.0;
		int min =Integer.MAX_VALUE, max =Integer.MIN_VALUE;
		for (int i = 0; i <numbers.length; i++) {
			count++;
			sum = sum + numbers[i];
			if(min > numbers[i]) {
			   min = numbers[i];
			}
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		avr = sum/count;
		System.out.println("Average :" + Math.round(avr));
		System.out.println("Minimum :" + min);
		System.out.println("Maximum :" + max);
		System.out.println("Summation :" + sum);
		
	}//calculator
}//class