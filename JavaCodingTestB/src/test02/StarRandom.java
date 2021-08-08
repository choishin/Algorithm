package test02;

import java.util.Scanner;
/*
 * 2-1.Write a program to draw the lines as below. 
 * 1) The number of the lines is 5. 
 * 2) The five integers from 0 to 8 are randomly generated from Math.random(). 
 * 3) The randomly generated numbers stand for the number of asterisks(*). 
 * 4) On the odd lines, the asterisks are printed from the left, otherwise, they are printed from the right. 
 * *Refer to the picture below
 * 
 * sample) 5 
 * 
 * 3****     *
 * 7* ********
 * 2***      *
 * 8**********
 * 0*        *
 * 
 * 
 */

public class StarRandom {

	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input a number for size");
		int size = scanner.nextInt();
		for (int k = 0; k <size; k++) {
		
		int num = (int) (Math.random()*8);
		
		if (num >5) {
			
			for(int i = 0; i < 1; i++) {
				   System.out.print(num);
				for(int j = 1; j < 2; j++) {
					System.out.print("*");
				}
				for (int j = 2; j < 10-(num); j++) {
					System.out.print(" ");
				}
				for (int j = 10-num; j < 10; j++) {
					System.out.print("*");
				}
				    System.out.print("*");
			}
					System.out.println();
			}
		
		else {
		
		for(int i = 0; i < 1; i++) {
			   System.out.print(num);
			for(int j = 1; j < num+2; j++) {
				System.out.print("*");
			}

			for (int j = num+1; j < 9; j++) {
				System.out.print(" ");
			}
			    System.out.print("*");
		}
				System.out.println();
		}	
		}

}//main
}//class
