package test04;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 4. Write a program to get the calculated result as below. 
 * 1) User inputs a formula including an arithmetic operator. 
 * 2) The arithmetic operations have to be done not n main method but in external methods that you compose. 
 * 3) The data types of the parameter and the return value for the methods depend on the user input 
 *    but the names of all the methods have to be the same(Hint, method overload).
 *    
 *    sample) 3*2 -> 6
 *    		  3.5*2.0 -> 7.0
 *    		  11*1.1 -> 12.1
 */
public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("Input any fomula");
			String fomula = scanner.next();	
			judge(fomula);
		}//while
	}//main

	public static void judge (String fomula) {
		if (fomula.contains("+")) {
			/*그냥 +를 넣으면 오류가 남. 그래서 구분 짓기 위해 '\\'이걸 넣어줌*/
			/*"+"를 기준으로 split을 하면 +는 인식을 안 함*/
			String[] arr = fomula.split("\\+");
			String num1 = arr[0];
			String num2 = arr[1];
			double num1Convert = Double.parseDouble(num1);
			double num2Convert = Double.parseDouble(num2);
			calSum(num1Convert,num2Convert);
			System.out.println(calSum(num1Convert,num2Convert));
		}
		else if (fomula.contains("-")) {
			String[] arr = fomula.split("\\-");
			String num1 = arr[0];
			String num2 = arr[1];
			double num1Convert = Double.parseDouble(num1);
			double num2Convert = Double.parseDouble(num2);
			calSub(num1Convert,num2Convert);
			System.out.println(calSub(num1Convert,num2Convert));
		}
		else if (fomula.contains("*")) {
			String[] arr = fomula.split("\\*");
			String num1 = arr[0];
			String num2 = arr[1];
			double num1Convert = Double.parseDouble(num1);
			double num2Convert = Double.parseDouble(num2);
			calMul(num1Convert,num2Convert);
			System.out.printf("%.1f\n",calMul(num1Convert,num2Convert));
		}
		else if (fomula.contains("/")) {
			String[] arr = fomula.split("\\/");
			String num1 = arr[0];
			String num2 = arr[1];
			double num1Convert = Double.parseDouble(num1);
			double num2Convert = Double.parseDouble(num2);
			calDiv(num1Convert,num2Convert);
			System.out.println(calDiv(num1Convert,num2Convert));
		}
		else {
			main(null);
		}

	}//judge

	public static double calSum (double num1Convert, 
									double num2Convert) {
		return num1Convert + num2Convert;
	}
	public static double calSub (double num1Convert, 
									double num2Convert) {
		return num1Convert - num2Convert;
	}
	public static double calMul (double num1Convert, 
									double num2Convert) {
		return num1Convert * num2Convert;
	}
	public static double calDiv (double num1Convert, 
									double num2Convert) {
		return num1Convert / num2Convert;
	}
}//class
