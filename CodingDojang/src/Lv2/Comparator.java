/*
 * 1������ ������ �־����� ��, �� �� ���� �Ÿ��� ª�� ���� ���� ����ϴ� �Լ��� �ۼ��Ͻÿ�. (�� ������ �迭�� ��� ���ĵǾ��ִٰ� �����Ѵ�.)
 * ������� S={1, 3, 4, 8, 13, 17, 20} �� �־����ٸ�, ������� (3, 4)�� �� ���̴�.
 */
package Lv2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Comparator {
	static Scanner scanner = new Scanner(System.in);
	static int size;

	public static void main(String[] args) {
		try {
			List<Integer> nums = getNums();
			calDistance(nums);
		} catch (Exception e) {
			System.out.println("Program is Over.");
		}

	}

	private static List<Integer> getNums() {
		List<Integer> nums = new ArrayList<Integer>();
		try {
			System.out.println("Please Input a number for Size. (max = 100)");
			size = scanner.nextInt();
			if (size <= 0 || size > 100) {
				throw new Exception();
			}

			for (int i = 1; i <= size; i++) {
				System.out.println("Input " + i + " of numbers.");
				int num = scanner.nextInt();
				nums.add(num);
			}
		} catch (InputMismatchException ime) {
			System.out.println("Please Input a number.");
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Please Input a number from 1 to 100.");
			getNums();
		} finally {
			return nums;
		}
	}

	private static void calDistance(List<Integer> nums) {

		Collections.sort(nums);
		Double min = Double.MAX_VALUE;
		Double min_a = 0.0;
		Double min_b = 0.0;
		for (int i = 0; i < nums.size(); i++) {
			for (int j = 0; j < nums.size(); j++) {
				Double tmp1 = Double.parseDouble(Integer.toString(nums.get(i)));
				Double a = Math.pow(tmp1, 2);
				Double tmp2 = Double.parseDouble(Integer.toString(nums.get(j)));
				Double b = Math.pow(tmp2, 2);
				Double c = Math.sqrt(Math.abs(a - b));
				System.out.println("�Ÿ� : " + c);
				System.out.println("(" + tmp1 + "," + tmp2 + ")");

				if (c != 0 && c < min) {
					min = c;
					min_a = tmp1;
					min_b = tmp2;
				}
			}
		}
		System.out.println("���");
		System.out.println("�ִܰŸ� : " + min);
		System.out.println("(" + min_a + "," + min_b + ")");

	}

}
