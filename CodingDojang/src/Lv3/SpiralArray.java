/*
 * ������ ������ ����:

	6 6
	
	  0   1   2   3   4   5
	 19  20  21  22  23   6
	 18  31  32  33  24   7
	 17  30  35  34  25   8
	 16  29  28  27  26   9
	 15  14  13  12  11  10
	 
	��ó�� 6 6�̶�� �Է��� �ָ� 6 X 6 ��Ʈ������ ������ ȸ���� �� ���� ����ؾ� �Ѵ�.
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

		int[][] copy = new int[x][y]; //�ʱⰪ�� ��� 0�� �������.
		int count = 0; // 0 ~ x*y-1 ��
		int flag = 0; // �������
		int i = 0, j = 0;

		while (true) {
			switch (flag) { // ������� ->
			case 0: // �濡 ���� �ְ� 1 ���� ��Ŵ
				copy[i][j++] = count++; // ���� �������� ��ĭ �̵�
				if (j == y || copy[i][j] != 0) { // �̵��� �濡 ���� �ְų� ���� ������
					j--; // ���� ������ ���ƿ´�
					i++; // ���� ������ �������� ��ĭ�̵�
					flag = 1; // ������� ����
				}
				break;
			case 1: // ������� ��
				copy[i++][j] = count++;
				if (i == x || copy[i][j] != 0) {
					i--;
					j--;
					flag = 2;
				}
				break;
			case 2: // ������� <-
				copy[i][j--] = count++;
				if (j == -1 || copy[i][j] != 0) {
					i--;
					j++;
					flag = 3;
				}
				break;
			case 3: // ������� ��
				copy[i--][j] = count++;
				if (i == 0 || copy[i][j] != 0) {
					i++;
					j++;
					flag = 0;
				}
				break;
			}

			if (count == x * y) // ���濡 ���� ���� ������
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
