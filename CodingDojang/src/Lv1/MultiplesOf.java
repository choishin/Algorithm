/*
 * 10미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 이들의 총합은 23이다.
 * 1000미만의 자연수에서 3,5의 배수의 총합을 구하라.
 */

package Lv1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MultiplesOf {

	static Scanner scanner = new Scanner(System.in);
	static int num;
	static int[] mulNums;

	public static void main(String[] args) throws Exception {
		while (true) {
			try {
				getNum();
				mulNums = new int[] { 3, 5 };
				List<Integer> mulOf3 = findMulOf(3);
				List<Integer> mulOf5 = findMulOf(5);
				getResult(mulOf3, mulOf5);
			} catch (java.lang.Exception e) {
				System.out.println("Program is Over.");
				break;
			}
		}

	}

	private static void getNum() throws Exception {

		System.out.println("Please input a number. (max = 100)");
		try {
			num = scanner.nextInt();
			if (num <= 0 || num > 100) {
				throw new Exception();
			}

		} catch (InputMismatchException ime) {
			System.out.println("Please input a number");
			throw new Exception();

		} catch (Exception e) {
			System.out.println("Please retry.");
			getNum();
		}

	}

	private static List<Integer> findMulOf(int mulNum) {

		System.out.println(num + "까지의 수에서" + mulNum + "의 배수는");
		List<Integer> mulNumList = new ArrayList<Integer>();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (i % mulNum == 0) {
				mulNumList.add(i);
				sum = sum + i;
				System.out.print(i + ",");
			}

		}
		System.out.println();
		System.out.print(mulNum + "의 총합은 ");
		System.out.println(sum);

		return mulNumList;

	}

	private static void getResult(List<Integer> first, List<Integer> second) {

		System.out.println("중복된 수 ");
		// 중복되는 숫자는 지우기
		for (int i = 0; i < first.size(); i++) {
			for (int j = 0; j < second.size(); j++) {
				if (first.get(i) == second.get(j)) {
					System.out.print(second.get(j) + ",");
					second.remove(j);
				}
			}
		}
		System.out.println();

		int sum = 0;
		for (int i = 0; i < first.size(); i++) {
			sum = sum + first.get(i);
		}

		for (int i = 0; i < second.size(); i++) {
			sum = sum + second.get(i);
		}

		System.out.print(num + "까지의 ");
		for (int i = 0; i < mulNums.length; i++) {
			if (i != mulNums.length - 1) {
				System.out.print(mulNums[i] + ",");
			} else {
				System.out.print(mulNums[i]);
			}
		}
		System.out.print(" 총합");
		System.out.println();
		System.out.println(sum);

	}

}
