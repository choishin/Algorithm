package test01;
/*
 * 1. Fill the blank of each myNumber1 & myNumber2
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNumber1 = 6;
		System.out.println(myNumber1);//myNumber1 = 6
		
		System.out.println(++myNumber1);// <-- 7
		System.out.println(myNumber1++);// <-- 7
		
		myNumber1 = myNumber1 * 2;
		int myNumber2 = 7;
		System.out.println(myNumber1);//myNumber1 = 12
		
		myNumber1 = myNumber1 + 46;
		System.out.println(myNumber1);//myNumber1 = 58
		
		myNumber2 = myNumber2 - myNumber1;
		System.out.println(myNumber2); //myNumber2 = -51

	}//main

}//class
