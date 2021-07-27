package Lecture02;

import java.util.Scanner;

public class Factor {
	
	public static void main (String[] args) {
		System.out.println("Please input any number");
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		getFactors(value);
		
	}
	
	public static void getFactors(int value) {
				
		for (int i=1; i<=value; i++) {
			if (value%i == 0) {
				System.out.println(i);
			}
		}
		
	}

}
