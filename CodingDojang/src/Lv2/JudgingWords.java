package Lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JudgingWords {

	public static void main(String[] args) {

		JudgingMachine machine = new JudgingMachine();
		machine.judgeSimil(machine.getWords());
	}
}

class JudgingMachine {

	List<String> getWords() {
		List<String> words = new ArrayList<String>();

		System.out.println("Input the sample word.");
		Scanner scanner = new Scanner(System.in);
		String standard = scanner.next();
		words.add(standard);
		System.out.println("How many words do you want to compare?");
		int size = scanner.nextInt();
		for (int i = 1; i <= size; i++) {
			System.out.println("Please Input " + i + " of words.");
			String str = scanner.next();
			words.add(str);

		}		
		scanner.close();

		return words;
	}

	void judgeSimil(List<String> words) {
		for (int i = 1; i < words.size(); i++) {
			if (OneEditApart(words, i)) {
				System.out.println(words.get(0)+" is containing "+words.get(i));
			}
			else {
				System.out.println(words.get(0)+" is not containing "+words.get(i));
			}
		}
	}

	boolean OneEditApart(List<String> words, int i) {
		if (words.get(i).contains(words.get(0))) {
			return true;
		}
		char[] standardArr = words.get(0).toCharArray();
		for (int j = 0; j < standardArr.length; j++) {
			if (words.get(i) == (words.get(0).substring(j))) {
				return true;
			}

		}
		
		return false;
	}
}