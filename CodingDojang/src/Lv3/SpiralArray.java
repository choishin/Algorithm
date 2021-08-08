/*
 * 문제는 다음과 같다:

	6 6
	
	  0   1   2   3   4   5
	 19  20  21  22  23   6
	 18  31  32  33  24   7
	 17  30  35  34  25   8
	 16  29  28  27  26   9
	 15  14  13  12  11  10
	 
	위처럼 6 6이라는 입력을 주면 6 X 6 매트릭스에 나선형 회전을 한 값을 출력해야 한다.
 */

package Lv3;

import java.util.Scanner;

public class SpiralArray {

	static Scanner scanner = new Scanner(System.in);
	static int x;
	static int y;

	public static void main(String[] args) {
		
		getArrSize();
		spiralArray(x,y);
		

	}

	private static void getArrSize() {

		System.out.println("Please Input a width.");
		y = scanner.nextInt();
		System.out.println("Please Input a height.");
		x = scanner.nextInt();

	}

	public static void spiralArray(int x, int y) {

		int[][] copy = new int[x][y]; //초기값은 모두 0이 들어있음.
		int count = 0; // 0 ~ x*y-1 값
		int flag = 0; // 진행방향
		int i = 0, j = 0;

		while (true) {
			switch (flag) { // 진행방향 ->
			case 0: // 방에 값을 넣고 1 증가 시킴
				copy[i][j++] = count++; // 다음 방향으로 한칸 이동
				if (j == y || copy[i][j] != 0) { // 이동한 방에 값이 있거나 방이 없으면
					j--; // 이전 방으로 돌아온다
					i++; // 다음 진행할 방향으로 한칸이동
					flag = 1; // 진행방향 설정
				}
				break;
			case 1: // 진행방향 ↓
				copy[i++][j] = count++;
				if (i == x || copy[i][j] != 0) {
					i--;
					j--;
					flag = 2;
				}
				break;
			case 2: // 진행방향 <-
				copy[i][j--] = count++;
				if (j == -1 || copy[i][j] != 0) {
					i--;
					j++;
					flag = 3;
				}
				break;
			case 3: // 진행방향 ↑
				copy[i--][j] = count++;
				if (i == 0 || copy[i][j] != 0) {
					i++;
					j++;
					flag = 0;
				}
				break;
			}

			if (count == x * y) // 모든방에 값이 들어가면 나가기
				break;
		}

		for (i = 0; i < x; i++) {
			for (j = 0; j < y; j++) {
				System.out.print(copy[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
