package test02;

import java.util.Scanner;
/*
 * 2-2.Write a program to count the number of trials for the dedicated number. 
 * 1)User inputs a number from 0 to 20. 
 * 2) The program generates a random number from 0 to 20. 
 * 3) The program is stopped when the random number is the same as the one user input. 
 * 
 * sample) 
 * 1-2
 * 2-7
 * 3-11
 * 4-16
 * 5-3
 * 6-2
 * 7-17
 * Number of trials : 7
 * 
 */

public class Random {

	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Input any number in 0 ~ 20");
		int count = 0;
		while(true) {
			int mynum = scanner.nextInt();
			int comnum = (int) (Math.random()*20);
			System.out.println(comnum);
			count++;
			if (mynum == comnum) {
				System.out.println("Number of trial : "+ count);
				break;
			}
		}

	}//main

}//class
