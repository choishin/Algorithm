package test02;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 2-2.Write a program to encode the characters.
 * 		The numeric characters are encoded into alphabets
 * sample)
 * #Input a String 
 * 1234567890 -> abcdefghij
 * 123456->abcdef
 */
public class Encode {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(true) {
			System.out.println("Input a String");
			String str = scanner.next();
			char[] arr = new char[str.length()];
			arr = str.toCharArray();
			find(arr);
		}//while
	}//main

	public static void find (char[] arr) {
		//2.������ ���� �Է°��� �����ϰ�, �迭�� ����� alphabet�� ���ڸ� ã�� �ε��� �ֱ�
		//Ȯ��//System.out.println(arr[0]);
		char[] alphabet = {' ','a','b','c','d','e','f','g','h','i','j','k','l',
				'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};

		//3.index�� ���� ���ڷ� ���Ž��Ѽ�, alphabet���� ����ã�� ���
		int index;
		int[] arrindex = new int[arr.length];		
		for(int i = 0; i<arr.length; i++) {
			arrindex[i] = (int) arr[i] - 48;
		}
		//Ȯ��//System.out.println(Arrays.toString(arrindex));
		//Ȯ��//System.out.println(arrindex[0]);

		for (int i = 0; i<arr.length; i++) {
			System.out.print(alphabet[arrindex[i]]);
		}
			System.out.println();
	}//Find
}//class