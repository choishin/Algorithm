/*
 * �ڿ��� ����Ʈ(Ȧ���� ¦���� ������ ����)�� �־����ϴ�.(���� ó�� �ʿ�) �� ����Ʈ�� �����ؾ� �մϴ�. 
 * ������ Ȧ-¦-Ȧ-¦-...���� ���� �ؾ� �ϸ�, Ȧ���� �������� ���ķ�, ¦���� �������� ���ķ� ��ġ�ؾ� �մϴ�.
 */

package CodingDoJang;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class NumSort {
	static Scanner scanner = new Scanner(System.in);
	static int size;

	public static void main(String[] args) throws Exception {
		while (true) {
			try {
				getSize();
				List<Integer> oddNums = getOdd(size);
				List<Integer> evenNums = getEven(size);
				sortNum();

			}

			catch (Exception e) {
				System.out.println("Program is Over.");
				break;
			}
		}

	}

	private static void getSize() throws Exception {
		try {
			System.out.println("Please Input a size of Number list (max : 10)");
			size = scanner.nextInt();
			// instanceof�� ����ϱ� ���� ���� Integer instance
			Integer value = new Integer(size);
			if ((value instanceof Integer) && 1 <= size && size <= 10) {

			} else {
				if (!(value instanceof Integer)) {
					throw new InputMismatchException();
				} else {
					throw new Exception();
				}
			}

		} catch (InputMismatchException ime) {
			System.out.println("Please Input a number.");
			throw new Exception();

		} catch (Exception e) {
			System.out.println("Going back to the first step.");
			getSize();
		}
	}

	private static List<Integer> getOdd(int size) throws Exception {

		List<Integer> oddNums = new ArrayList<Integer>();
		try {
			for (int i = 1; i <= size; i++) {
				System.out.println("Please input " + i + " of odd Number");
				int odd = scanner.nextInt();
				if (odd % 2 == 0) {
					System.out.println("It's not odd Num. Please retry.");
					throw new Exception();
				} else {
					oddNums.add(odd);

				}
			}
			if (oddNums.size() != size) {
				throw new Exception();
			}
		} catch (Exception e) {
			getOdd(size);

		} finally {
			return oddNums;
		}
	}

	private static List<Integer> getEven(int size) throws Exception {
		List<Integer> evenNums = new ArrayList<Integer>();
		try {
			for (int i = 1; i <= size; i++) {
				System.out.println("Please input " + i + " of even Number");
				int even = scanner.nextInt();
				if (even % 2 == 0) {
					evenNums.add(even);

				} else {
					System.out.println("It's not even Num. Please retry.");
					throw new Exception();
				}
			}
			if (evenNums.size() != size) {
				throw new Exception();
			}
		} catch (Exception e) {
			getEven(size);

		} finally {
			return evenNums;
		}
	}

	private static void sortNum() {
		

	}

}
