package test05;

import java.util.Scanner;
/*
 * 5. Write a program for the vending machine as below. 
 * 1) The initial balance is 2000 
 * 2) The balance decreases according to the user's selection 
 * *Use more than one public variables for the balance and the number of beverages, external classes and methods to implement this program
 */
public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static Calculator calculator = new Calculator();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("#Vending machine");
		System.out.println("1. Coke - 500");
		System.out.println("2. Juice - 1000");
		System.out.println("3. Milk - 700");
		System.out.println("4. Cancel All");
		System.out.println("Please input money");
		int balance = scanner.nextInt();
		System.out.println("*Balance : "+ balance);
		System.out.println("Coke[0], Juice[0], Milk[0]");
		while(true) {
			System.out.println("Plese order");
			int type1 = scanner.nextInt();
			calculator.order(type1);
			balance = calculator.reduce(balance,type1);
			if(balance <=0) {
				System.out.println("Please input money again");
				break;
			}
		}//while
	}//main
}//class

class Calculator {

	public Main main = new Main();	
	int count1,count2,count3,balance;
	public void order (int type1) {

		if (type1 == 1) {
			count1++;
		}
		else if (type1 == 2) {
			count2++;
		}
		else if (type1 == 3) {
			count3++;
		}
		else {
			main.main(null);
		}
		System.out.printf("Coke[%d], Juice[%d], Milk[%d]\n",count1,count2,count3);

	}//order

	public int reduce (int balance, int type1) {
		if (type1 == 1) {
			balance = balance - 500;
		}
		else if (type1 == 2) {
			balance = balance - 1000;
		}
		else if (type1 == 3) {
			balance = balance - 700;
		}
		else {
			main.main(null);
		}
		System.out.println("*Balance : "+ balance);
		return balance;

	}//reduce
}//class
