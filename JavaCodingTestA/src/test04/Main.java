package test04;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 4. Write a program to get descriptive statistics with using "while" statement insteadof "for" statement 
 * 
 * sample) 7
 * 3 8 29 12 46 7 11 
 * Average : 17
 * Minimum : 3
 * Maximum : 46
 * Summation : 116

 */
public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input a number");
		int size = scanner.nextInt();
		System.out.println("input a number");
		int[] numbers = new int[size];
		int i =0;
		while(i <size) {
			numbers[i] = scanner.nextInt();
			i++;
		}
		//확인//System.out.println(Arrays.toString(numbers));
		calculator(numbers);

	}//main
	
	public static void calculator (int[] numbers) {
		
		//확인//System.out.println(Arrays.toString(numbers));
		int count = 0; 
		double avr =0.0; double sum = 0.0; 
		int min =Integer.MAX_VALUE, max =Integer.MIN_VALUE;
		int i = 0;
		while(i <numbers.length) {
			count++;
			sum = sum + numbers[i];
			if(min > numbers[i]) {
			   min = numbers[i];
			}
			if (max < numbers[i]) {
				max = numbers[i];
			}
			i++;
		}
		avr = sum/count;
		System.out.println("Average :" + Math.round(avr));
		System.out.println("Minimum :" + min);
		System.out.println("Maximum :" + max);
		System.out.println("Summation :" + sum);
		
	}//calculator
}//class