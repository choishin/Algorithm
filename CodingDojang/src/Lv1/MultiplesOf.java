/*
 * 10�̸��� �ڿ������� 3�� 5�� ����� ���ϸ� 3,5,6,9�̴�. �̵��� ������ 23�̴�.
 * 1000�̸��� �ڿ������� 3,5�� ����� ������ ���϶�.
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

		System.out.println(num + "������ ������" + mulNum + "�� �����");
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
		System.out.print(mulNum + "�� ������ ");
		System.out.println(sum);

		return mulNumList;

	}

	private static void getResult(List<Integer> first, List<Integer> second) {

		System.out.println("�ߺ��� �� ");
		// �ߺ��Ǵ� ���ڴ� �����
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

		System.out.print(num + "������ ");
		for (int i = 0; i < mulNums.length; i++) {
			if (i != mulNums.length - 1) {
				System.out.print(mulNums[i] + ",");
			} else {
				System.out.print(mulNums[i]);
			}
		}
		System.out.print(" ����");
		System.out.println();
		System.out.println(sum);

	}

}
