/*
 * �ڱ� �ڽ��� ������ ��� ���� ������� ���� �ڱ� �ڽ��� �Ǵ� �ڿ����� ��������� �Ѵ�. ���� ���, 6�� 28�� �������̴�. 
 * 6=1+2+3 // 1,2,3�� ���� 6�� ���
 * 28=1+2+4+7+14 // 1,2,4,7,14�� ���� 28�� ���
 * �Է����� �ڿ��� N�� �ް�, ������� N ������ ��� �������� ����ϴ� �ڵ带 �ۼ��϶�.
 */

package Lv1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PerfectNum {
	static Scanner scanner = new Scanner(System.in);
	static int num;

	public static void main(String[] args) throws Exception {
		while(true) {
			try {
				getNum();
				judgePerfect();
			} catch (Exception e) {
				System.out.println("Program is Over.");
				break;
			}
		}
	}

	private static void getNum() throws Exception {
		try {
			System.out.println("Please Input a number from 1 to 100000");
			num = scanner.nextInt();

			if (num <= 0 || num > 100000) {
				throw new Exception();
			}
		} catch (InputMismatchException ime) {
			System.out.println("Please Input a number.");
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Please Input a number from 1 to 100000");
		}

	}

	private static void judgePerfect() {

		for (int i = 1; i <= num; i++) {
			int sum = 0;
			List<Integer> factors = new ArrayList<Integer>();
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					factors.add(j);
				} // if
			} // for
			for (int k = 0; k < factors.size(); k++) {
				sum = sum + factors.get(k);
			} // for
			if (i == sum) {
				System.out.println("������ " + i);
				System.out.print("���Ҵ� ");
				for (int m = 0; m < factors.size(); m++) {
					if (m != factors.size() - 1) {
						System.out.print(factors.get(m) + ",");
					} else {
						System.out.print(factors.get(m));
						System.out.println();
					} // else
				} // for
			} // if
		} // for

	}

}
