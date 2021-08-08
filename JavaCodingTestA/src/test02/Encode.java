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
		//2.위에서 받은 입력값을 전달하고, 배열을 만들어 alphabet의 글자를 찾을 인덱스 넣기
		//확인//System.out.println(arr[0]);
		char[] alphabet = {' ','a','b','c','d','e','f','g','h','i','j','k','l',
				'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};

		//3.index의 값을 숫자로 변신시켜서, alphabet에서 순서찾아 출력
		int index;
		int[] arrindex = new int[arr.length];		
		for(int i = 0; i<arr.length; i++) {
			arrindex[i] = (int) arr[i] - 48;
		}
		//확인//System.out.println(Arrays.toString(arrindex));
		//확인//System.out.println(arrindex[0]);

		for (int i = 0; i<arr.length; i++) {
			System.out.print(alphabet[arrindex[i]]);
		}
			System.out.println();
	}//Find
}//class