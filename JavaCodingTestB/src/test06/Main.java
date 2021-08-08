package test06;

import java.util.Scanner;
/*
 *6. Write a cashier program as below. 
 *1) In order to set and get the prices of items, use at least one array. 
 *2) The number of items is five. 
 *3) According to the prices and quantities of items, the program calculates the total charge. 
 *4) Minimize and shorten the length of "main" method(At most 20 lines). 
 *
 */
public class Main {
	static int[] prices = {0,0,0,0,0};
	static int[] quantities = {0,0,0,0,0};
	public static Scanner scanner = new Scanner(System.in);
	public static void main (String[] args) {
		//배열 입력
		String[] items = {"milk","apple","orange", "melon", "water"};
		//showMenu호출 (items값 전달)
		showMenu(items);
	}

	static void showMenu(String[] items) {


		while (true) {
			//메뉴판 보여주기
			System.out.println("#Menu");
			System.out.println("[PRICE] milk- "+prices[0]+" apple- "+prices[1]
					+" orange- "+prices[2]+" melon- "+prices[3]+" water- "+prices[4]);
			System.out.println("1.set the prices of items");
			System.out.println("2.caculate the charges");
			System.out.println("3.Reset the prices of items");
			System.out.print("-->");
			//입력받기
			int type = scanner.nextInt();
			
			if (type == 1) {
				System.out.println("Please input the prices of "
						+ "milk, apple, orange, melon and water in order");
				for(int i = 0; i <items.length; i++) {
					int price = scanner.nextInt();
					prices[i] = price;
				}
				showMenu(items);
			}
			
			else if (type == 2) {
				System.out.println("#Total charge");
				System.out.println("#please input the quantities of milk, apple, orange"
						+ "melon, and water in order");
				System.out.print("->");
				for (int i = 0; i <items.length; i++) {
					int quantity = scanner.nextInt();
					quantities[i] = quantity;
				}
				int sum = 0;
				for(int i = 0; i <items.length; i++) {
					sum += prices[i] * quantities[i];
				}
				System.out.println("Total charge : "+ sum);
			}
			
			else if (type == 3) {
				
				for (int i = 0; i <items.length; i++) {
					prices[i] = 0;
					quantities[i] = 0;
				}
				System.out.println("#Reset Complete!");
				   showMenu(items);
			}
			else {
				
				showMenu(null);
			}

		}
	}//main
}//class

