package Lecture02;

import java.util.Scanner;

public class One {
	
	public static  void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input 1 ");
		int input = scanner.nextInt();
		
		if (input == 1) {
			System.out.println("It's One!");
		}
		else {
			System.out.println("It's not One!");
		}
	}

}
