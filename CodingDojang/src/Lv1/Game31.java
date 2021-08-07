/*
 * 게임의 참여자들은 차례를 정해 1부터 31까지의 수를 순차적으로 부른다. 한번에 1~3개까지 수를 연달아 부를 수 있으며, 마지막 31을 부른 사람이 진다.
 */

package Lv1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game31 {

	static Scanner scanner = new Scanner(System.in);
	static int current_num;

	public static void main(String[] args) {

		current_num = 0;
		showDesc();
		while (true) {
			try {
				current_num = getNum();
				if (current_num >= 31) {
					System.out.println("you lose!");
					break;
				}
				current_num = callNum();
				if (current_num >= 31) {
					System.out.println("you win!");
					break;
				}
			} catch (Exception e) {
				System.out.println("Please start over");
				break;
			}

		}

	}

	private static void showDesc() {

		System.out.println("you can call number 3 at the most. ex) 1 or 1,2 or 1,2,3");
		System.out.println("but when you call 31, then you lose");
		System.out.println("Game Start. you call the numbers first!");

	}

	private static int getNum() {

		System.out.println("How many numbers do you want to call?");
		try {
			int size = scanner.nextInt();
			Integer value = new Integer(size);
			if (size > 3 || size <= 0) {
				throw new Exception();
			} else {
				for (int i = 1; i <= size; i++) {
					System.out.println("call the " + i + " of number");
					current_num = current_num + 1;
					System.out.println(current_num);
				}
			}
		} catch (InputMismatchException ime) {
			System.out.println("Please input a number");
			current_num = 31;
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Please Input a number from 1 to 3");
			getNum();
		} finally {
			return current_num;
		}

	}

	private static int callNum() {

		System.out.println("My turn.");
		int size = (int) ((Math.random() * 3) + 1);
		for (int i = 1; i <= size; i++) {
				System.out.println("Call the " + i + " of number");
				current_num = current_num + 1;
				System.out.println(current_num);
			
		}

		return current_num;

	}

}
