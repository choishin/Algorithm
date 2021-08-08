/*
 * 1���� 10,000���� 8�̶�� ���ڰ� �� ��� �����°�?
 * 8�� ���ԵǾ� �ִ� ������ ������ ī���� �ϴ� ���� �ƴ϶� 8�̶�� ���ڸ� ��� ī���� �ؾ� �Ѵ�.
 * �� ������� 8808�� 3, 8888�� 4�� ī���� �ؾ� ��)
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
		System.out.println(num+"���� "+numTofind+"�� ����ִ� ������? "+sum);

	}

}
