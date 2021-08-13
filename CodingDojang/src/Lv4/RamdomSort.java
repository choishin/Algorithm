/*
	1에서 9까지의 숫자들이 있다.
	이 1에서 9까지의 숫자를 무작위로 배열하여
	2 3 5 6 7 9 1 4 8 과 같이 1~9의 숫자가 빠짐없이 배열되는 프로그램을 만들고자 한다.
	이때 무작위로 배열하고자 하면 오랜 시간이 걸린다.
	오랜 시간이 걸리지 않는 코드를 뽑아내시오.
	문제 풀이 방법 : 작성한 코드를 제시하고, 이 코드에 따라 나온 다른 배열 5개를 입력한다.
 */

package Lv4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RamdomSort {

	public static void main(String[] args) {
		RandomMachine machine = new RandomMachine();
		while(true) {
			machine.getInput();
			machine.generateRandomArray();
		}
	}

}

class RandomMachine {

	void getInput() {
		try {
			System.out.println("If you want to run the Progam, Press Y or Yes.");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.next();
			scanner.close();
			if (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("yes")) {
				throw new Exception();
			}
		} catch (Exception e) {
			getInput();
		}
	}

	void generateRandomArray() {
		//Radom숫자를 무한대로 작성해서 array에 넣는데 이미 그 값이 존재하면 건너뛴다.
		List<Integer> randomNumbers = new ArrayList<Integer>();
		while(true) {
			int randomNum = (int)(Math.random()*9)+1;
			if (isSame(randomNumbers,randomNum)) {
				continue;
			}
			else {
				randomNumbers.add(randomNum);
			}
			
			if (randomNumbers.size() == 9) {
				break;
			}
		}
		
		System.out.println(randomNumbers);
	}

	boolean isSame(List<Integer>sortedNumbers, int randomNum) {
		for (int i = 0; i < sortedNumbers.size(); i++) {
			//이 조건이 아니면 모두 false를 넘기게
			if (sortedNumbers.get(i) == randomNum) {
				return true;
			}

		}
		return false;
	}

}
