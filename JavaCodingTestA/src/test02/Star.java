package test02;
/*
 * 2. Compose a program to make 
 * 
	          *
		     --
		    ***
		   ----
		  *****
		 ------
		*******

 */

import java.util.Scanner;

public class Star {

	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Input size");
		int size = scanner.nextInt();

		for (int i = 0; i <size+1; i++) {
			for(int j = 0; j <size-i; j++) {
				System.out.print(" ");
			}
			if (i%2 != 0) {
				for (int k = 0; k<i; k++) {
					System.out.print("*");
				}
			}
			else {
				for(int k = 0; k<i; k++) {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}//main
}//class
