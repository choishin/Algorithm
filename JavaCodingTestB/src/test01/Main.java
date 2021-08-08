package test01;

import java.util.Scanner;
/*
 * 1. Write a program to check if the input number is divisible by N and M. 
 * 1) Userinputs three numbers 
 * 2) Check if the first number is divisible by the secondnumber N and the third number M as below
 * 
 * sample) 
 * 14 -> 3 ->  5 -> Not divisible by 3 and 5!
 * 6 -> 2 ->  3 -> Divisible by 2 and 3!
 */

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
		System.out.println("Input a number");
		int number = scanner.nextInt();
		System.out.println("Please input the first number");
		int num1 = scanner.nextInt();
		System.out.println("Please input the Second number");
		int num2 = scanner.nextInt();
		
		if (number%num1 == 0 && number%num2 ==0) {
			System.out.println("Divisible by "+ num1 +" and "+ num2 +"!");
		}
		else if (number%num1 != 0 || number%num2 != 0) {
			System.out.println("NOT Divisible by "+ num1 +" and "+ num2 +"!");
		}
		
		else {
			main(null);
		}
		}

	}//main

}//class
