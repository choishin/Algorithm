/*
 * 1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
 * 8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.
 * ※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 함)
 * 
 */

package Lv2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumCounter {
	static Scanner scanner = new Scanner(System.in);
	static int num;
	static int numTofind;

	public static void main(String[] args) throws Exception {
		while (true) {
			try {
			getNum();
			countNum(8);
			} catch (Exception e) {
				System.out.println("Program is Over.");
				break;
			}
		}

	}

	private static void getNum() throws Exception {
		try {
		System.out.println("Please input a number from 1 to 10000");
		num = scanner.nextInt();
		
		if (num <=0 || num > 10000) {
			throw new Exception();
		}
		} catch (InputMismatchException ime) {
			System.out.println("Please Input a number.");
			throw new Exception();
					
		} catch (Exception e) {
			System.out.println("Please retry. Input a number from 1 to 10000.");
			getNum();
		}

	}

	private static void countNum(int numTofind) {

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			String numTofindStr = Integer.toString(numTofind);
			String numToStr = Integer.toString(i);
			char[] numToCharArr = numToStr.toCharArray();
			for (int j = 0; j < numToCharArr.length; j++) {
				if (String.valueOf(numToCharArr[j]).contains(numTofindStr)) {
					System.out.println(i);
					sum = sum + 1;

				} else {
					continue;
				}
			}

		}
		System.out.println(num+"까지 "+numTofind+"가 들어있는 개수는? "+sum);

	}

}
