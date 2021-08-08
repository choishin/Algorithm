package test05;

import java.util.Scanner;
/*
 * 5. Write a program to calculate the two double numbers with using the interface below.  
 * 1) User inputs a string formula such as "3.2*7". 
 * 2) The data type of the resultdepends on the input numbers. 3*3 = 9, 3*3.1 = 9.3, 4.1+2 = 6.1
 * 
 * interface) 
 * 
 * public interface CalculatorInterface {

	public double calAddition(double num1, double num2);
	public double calSubtraction(double num1, double num2);
	public double calMultiplication(double num1, double num2);
	public double calDivision(double num1, double num2);
	public char getOperator(String formula);
 *
 */

public class Main implements CalculatorInterface {
	public static Scanner scanner = new Scanner(System.in);
	public static Main main = new Main();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("Input a fomula such as 3.2*7.2");
			String fomula = scanner.next();

			if (fomula.contains("+")) {
				String[] arr = fomula.split("\\+");
				double num1 = Double.parseDouble(arr[0]);
				double num2 = Double.parseDouble(arr[1]);
				System.out.println(main.calAddition(num1,num2));
			}
			else if (fomula.contains("-")) {
				String[] arr = fomula.split("\\-");
				double num1 = Double.parseDouble(arr[0]);
				double num2 = Double.parseDouble(arr[1]);
				System.out.println(main.calSubtraction(num1,num2));
			}
			else if (fomula.contains("*")) {
				String[] arr = fomula.split("\\*");
				double num1 = Double.parseDouble(arr[0]);
				double num2 = Double.parseDouble(arr[1]);
				System.out.println(main.calMultiplication(num1,num2));
			}
			else if (fomula.contains("/")) {
				String[] arr = fomula.split("\\/");
				double num1 = Double.parseDouble(arr[0]);
				double num2 = Double.parseDouble(arr[1]);
				System.out.println(main.calDivision(num1,num2));
			}
		}//while
	}//main

	@Override
	public double calAddition(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public double calSubtraction(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 = num2;
	}

	@Override
	public double calMultiplication(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public double calDivision(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 / num2;
	}

	@Override
	public char getOperator(String formula) {
		// TODO Auto-generated method stub
		return 0;
	}

}

interface CalculatorInterface {

	public double calAddition(double num1, double num2);
	public double calSubtraction(double num1, double num2);
	public double calMultiplication(double num1, double num2);
	public double calDivision(double num1, double num2);
	public char getOperator(String formula);


}
