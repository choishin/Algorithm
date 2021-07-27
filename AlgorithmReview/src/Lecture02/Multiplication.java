package Lecture02;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		System.out.println("Please input a number between 1 and 9");
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		gugudanIf(value);
		gugudanSwitch(value);

	}
	
	static void gugudanIf(int value) {
		if (value <= 9) {
			System.out.println(value + " x 1 =" + value * 1);
			System.out.println(value + " x 2 =" + value * 2);
			System.out.println(value + " x 3 =" + value * 3);
			System.out.println(value + " x 4 =" + value * 4);
			System.out.println(value + " x 5 =" + value * 5);
			System.out.println(value + " x 6 =" + value * 6);
			System.out.println(value + " x 7 =" + value * 7);
			System.out.println(value + " x 8 =" + value * 8);
			System.out.println(value + " x 9 =" + value * 9);
			System.out.println();
		}
		else {
			System.out.println("Please input between 1 and 9 ");
		}
		
	}
	
	static void gugudanSwitch(int value) {
		switch (value) {
			default:
				System.out.println(value + " x 1 =" + value * 1);
				System.out.println(value + " x 2 =" + value * 2);
				System.out.println(value + " x 3 =" + value * 3);
				System.out.println(value + " x 4 =" + value * 4);
				System.out.println(value + " x 5 =" + value * 5);
				System.out.println(value + " x 6 =" + value * 6);
				System.out.println(value + " x 7 =" + value * 7);
				System.out.println(value + " x 8 =" + value * 8);
				System.out.println(value + " x 9 =" + value * 9);
				break;
		}

	}

}
