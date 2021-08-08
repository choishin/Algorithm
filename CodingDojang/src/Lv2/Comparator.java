/*
 * 1차원의 점들이 주어졌을 때, 그 중 가장 거리가 짧은 것의 쌍을 출력하는 함수를 작성하시오. (단 점들의 배열은 모두 정렬되어있다고 가정한다.)
 * 예를들어 S={1, 3, 4, 8, 13, 17, 20} 이 주어졌다면, 결과값은 (3, 4)가 될 것이다.
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
				System.out.println("거리 : " + c);
				System.out.println("(" + tmp1 + "," + tmp2 + ")");

				if (c != 0 && c < min) {
					min = c;
					min_a = tmp1;
					min_b = tmp2;
				}
			}
		}
		System.out.println("결과");
		System.out.println("최단거리 : " + min);
		System.out.println("(" + min_a + "," + min_b + ")");

	}

}
