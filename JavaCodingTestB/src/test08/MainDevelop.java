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
 *  교훈1. Array에 모든걸 넣을 필요는 없다 (배열에 넣고 Min값 비교를 하면 0.0이 계속 뜸)
 *  교훈2. 계산부는 메소드로 빼면 복잡해 진다
 *  교훈3. 출력부나 자료 전달만 하면 되는 건 메소드로 빼볼만함
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
			//1.랜덤숫자를 만들어서 바로 계산
			double random = Math.random()*19;
			sum = sum + random;
			avr = sum/i;
			if (min > random) {
				min = random;
			}
			if (max < random) {
				max = random;
			}
			
			//2.String으로 형변환해서 output에 기록(BufferedWriter은 double출력X)
			String randomConvert = Double.toString(random);
			fileWrite(randomConvert);

			//3.print 메소드로 전달하고, thread 작동, i 숫자 올리기
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

