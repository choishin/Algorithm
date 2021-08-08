package test08;
/*
 * 8. Write a program with the following conditions. 
 * 1) Generate a random double type of number which is from 1.0 to 20.0 every 500ms. 
 * 2) Write the number to the dedicated file. 
 * 3) The statistical result is also shown every time a random number is generated. 
 * 4)The program is finished after 10 of numbers are generated and written to the file. 
 * 5) Minimize and shorten the lines of "main" method(At most 15 lines). 
 * *Refer to the picture below.
 * 
 *  ����1. Array�� ���� ���� �ʿ�� ���� (�迭�� �ְ� Min�� �񱳸� �ϸ� 0.0�� ��� ��)
 *  ����2. ���δ� �޼ҵ�� ���� ������ ����
 *  ����3. ��ºγ� �ڷ� ���޸� �ϸ� �Ǵ� �� �޼ҵ�� ��������
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class MainDevelop extends Thread {
	static double min = Double.MAX_VALUE;
	static double max = Double.MIN_VALUE;

	public static Thread thread = new Thread();
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		int i = 1;
		double sum = 0, avr = 0;
		while(true) {	
			//1.�������ڸ� ���� �ٷ� ���
			double random = Math.random()*19;
			sum = sum + random;
			avr = sum/i;
			if (min > random) {
				min = random;
			}
			if (max < random) {
				max = random;
			}
			
			//2.String���� ����ȯ�ؼ� output�� ���(BufferedWriter�� double���X)
			String randomConvert = Double.toString(random);
			fileWrite(randomConvert);

			//3.print �޼ҵ�� �����ϰ�, thread �۵�, i ���� �ø���
			print(randomConvert,sum,avr,min,max);
			Thread.sleep(500);
			i++;

			if (i == 10) {
				break;
			}
		}//while
	}//main
		
	public static void fileWrite(String randomConvert) throws IOException {
		
		BufferedWriter output = new BufferedWriter 
				(new FileWriter("C:\\Users\\chois\\Downloads\\output.txt"));
		output.write("your random number :"+ randomConvert +"\n");
		output.close();
		
	}
	
	public static void print(String randomConvert, 
			double sum, double avr, double min, double max) {
			System.out.println(randomConvert);
			System.out.println("Sum : " + sum);
			System.out.println("Avr : " + avr);
			System.out.println("Min : " + min);
			System.out.println("Max : " + max);
	}

}//class

