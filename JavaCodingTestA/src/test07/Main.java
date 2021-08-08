package test07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/*
 * 7. Write a program with the conditions below. 
 * This program is to calculate the countrequired to reach the number 100 
 * 1) Create a thread 
 * 2) A positive random integerbetween 1 to 10 is generated every second 
 * 3) The generated numbers aresummed up 
 * 4) Create interfaces and methods
 * 
 */
public class Main extends Thread{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Thread thread = new Thread();
		int sum = 0;
		int i = 0;
		while (true) {
			int random = (int) (Math.random()*10);
			System.out.println();
			arr.add(random);
			sum = sum + arr.get(i);
			//System.out.println(arr);
			System.out.println("#"+ (i+1)+ " : "+ arr.get(i)+"("+ sum +")");
			thread.sleep(500);
			i++;
			
			
			if (sum > 100) {
				System.out.println("\nCount : "+ i);
				break;
			}//if
			
		}//while

	}//main

}//class
