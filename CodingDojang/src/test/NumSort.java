/*
 * 자연수 리스트(홀수와 짝수의 개수가 같음)가 주어집니다.(예외 처리 필요) 이 리스트를 정렬해야 합니다. 
 * 순서는 홀-짝-홀-짝-...으로 오게 해야 하며, 홀수는 오름차순 정렬로, 짝수는 내림차순 정렬로 배치해야 합니다.
 */

package test;

import java.util.ArrayList;
import java.util.Collections;
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
				sortNum(oddNums, evenNums);

			}
			catch (Exception e) {
				System.out.println(e);
				System.out.println("Program is Over.");
				break;
			}
		}

	}

	private static void getSize() throws Exception {
		try {
			System.out.println("Please Input a size of Number list (max : 10)");
			size = scanner.nextInt();
			// instanceof를 사용하기 위해 만든 Integer instance
			Integer value = new Integer(size);
			if ((value instanceof Integer) && 1 <= size && size <= 10) {

			} else {
				if (!(value instanceof Integer)) {
					throw new InputMismatchException();
				} else {
					throw new Exception();
				}
			}
			/* 
			 * 여기서 시간이 제일 많이 걸렸음. InputMissmatchException의 경우 
			 * getSize()로 나가게 만들면 -> stackoverflow 오류가 남.
			 * 바로 scanner.nextInt() -> 안 먹음
			 */
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

	private static void sortNum(List<Integer> oddNums, List<Integer> evenNums) {

		System.out.println("변경전");
		System.out.println("홀수배열");
		for (int i=0; i<size; i++) {
			if (i != size-1) {
				System.out.print(oddNums.get(i)+",");
			}
			else {
				System.out.print(oddNums.get(i));
			}
		}
		System.out.println();
		System.out.println("짝수배열");
		for (int i=0; i<size; i++) {
			if (i != size-1) {
				System.out.print(evenNums.get(i)+",");
			}
			else {
				System.out.print(evenNums.get(i));
			}
		}
		System.out.println();
		
		Collections.sort(oddNums);
		Collections.reverse(evenNums);
		
		System.out.println("변경후");
		for (int i = 0; i <size; i++) {
			System.out.print(oddNums.get(i)+"->");
			if (i != size-1) {
				System.out.print(evenNums.get(i)+"->");
			}
			else {
				System.out.print(evenNums.get(i));
			}
		}
		System.out.println();

	}

}
