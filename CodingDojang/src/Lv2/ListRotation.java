/*
	아래 조건에 따라 리스트를 회전하는 프로그램을 작성하시오.
	
	조건
	입력값은 한 행의 문자열로 주어지며, 각 값은 공백으로 구분된다.
	첫 번째 값은 리스트를 회전하는 양과 방향(음수의 경우 좌측으로, 양수의 경우 우측으로 회전)이다.
	첫 번째 값을 제외한 나머지 값은 리스트의 각 항목의 값이다.
	회전된 리스트를 문자열로 출력한다.
	구현에 이용할 자료구조에 대한 조건이나 제약은 없다.
	입력되는 리스트의 항목의 개수는 유한한다.
	입출력예
	예 1)
	
	입력: 1 10 20 30 40 50
	출력: 50 10 20 30 40
	--> 1이면 뒤에서 첫번째것을 가지고 오기
	list.size()-1
	
	예 2)
	
	입력: 4 가 나 다 라 마 바 사
	출력: 라 마 바 사 가 나 다
	--> 4이면 뒤에서 4번째의 것을 가지고 오기
	list.size()-4
	
	예 3)
	
	입력: -2 A B C D E F G
	출력: C D E F G A B
	--> -2 두개를 뒤로 넘긴다는 것
	
	예 4)
	
	입력: 0 똘기 떵이 호치 새초미
	출력: 똘기 떵이 호치 새초미
*/
package Lv2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ListRotation {

	public static void main(String[] args) throws Exception {

		RotationMachine machine = new RotationMachine();
			try {
				List<String> list = machine.getList();
				int index = machine.getIndex();
				machine.findIndexIntheList(list, index);
			}  catch (Exception e) {
				System.out.println("Program is Over.");
			}
		}

}

class RotationMachine {

	static Scanner scanner = new Scanner(System.in);

	List<String> getList() throws Exception {
		List<String> list = new ArrayList<String>();
		try {
			System.out.println("Please Input the size of List. (mix = 1, max = 100)");
			int size = scanner.nextInt();
			if (size <= 0 || size > 100) {
				throw new Exception();
			}
			for (int i = 1; i <= size; i++) {
				System.out.println("Please input the " + i + " word of list.");
				String input = scanner.next();
				list.add(input);
			}
		} catch (InputMismatchException ime) {
			forInputMismatchException();
		} catch (Exception e) {
			forRetry();
		}

		return list;
	}

	int getIndex() throws Exception {
		int index = 0;
		try {
			System.out.println("Please input the index in the list.");
			index = scanner.nextInt();
		} catch (InputMismatchException ime) {
			forInputMismatchException();
		} catch (Exception e) {
			forRetry();
		}

		scanner.close();

		return index;
	}

	void findIndexIntheList(List<String> list, int index) throws Exception {

		if (index < 0) {
			/* ArrayList는 앞의 것이 사라지면 뒤의 것들이 앞으로 옮겨옴. 그래서 계속 0 */
			for (int i = 0; i < Math.abs(index); i++) {
				list.add(list.get(0));
				list.remove(0);
			}
		} else if (index >= 0) {
			for (int i = 0; i < list.size() - index; i++) {
				list.add(list.get(0));
				list.remove(0);
			}

		} else {
			throw new Exception();
		}

		System.out.println(list);

	}

	void forInputMismatchException() throws Exception {
		System.out.println("Please Input the number.");
		throw new Exception();
		
	}

	void forRetry() throws Exception {
		System.out.println("Please Input a number from 1 to 100.");
		getList();
	}

}
