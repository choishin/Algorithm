package test07;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set1 = new HashSet<Integer>();
		int count = 0;
		while (true) {
			set1.add((int)(Math.random()*10+1));
			count++;
			Iterator iterator = set1.iterator();
			System.out.print("#" + count+ " -" );
			System.out.println(set1);
//HashSet에 저장되는 모든 과정들을 출력하고 싶다면
//			while (iterator.hasNext())
//				System.out.print(iterator.next()+"\n");
			if(set1.size() == 10) {
				System.out.println("Total number of trials : "+ count);
				break;
			}
		}//while
	}//main

}//class
