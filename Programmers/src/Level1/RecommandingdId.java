package Level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecommandingdId {

	public static void main(String[] args) throws Exception {
		RecommandingMachine machine = new RecommandingMachine();
		String new_id = "";
		while (true) {
			try {
				new_id = machine.getId();
				new_id = machine.changeBigLetter(new_id);
				new_id = machine.removeSpecialChar(new_id);
				new_id = machine.removeDoubleSpot(new_id);
				new_id = machine.removeSpot(new_id);
				new_id = machine.spaceToA(new_id);
				new_id = machine.judgeIdLength(new_id);

				System.out.println("사용 가능 아이디 : " + new_id);

			} catch (Exception e) {
				System.out.println("처음부터 다시 시작합니다.");
				System.out.println(e);			
				new_id = "";
				main(args);
			}

		}
	}
}

class RecommandingMachine {

	String getId() {
		String new_id = "";
		try {
			System.out.println("아이디를 입력해 주세요.");
			Scanner scanner = new Scanner(System.in);
			new_id = scanner.next();
			if (new_id.length() < 2) {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("아이디의 길이는 3자 이상 15자 이하여야 합니다.");
			new_id = "";
			throw new Exception();

		} finally {
			return new_id;
		}
	}

	String changeBigLetter(String new_id) {
		return new_id.toLowerCase();

	}

	String removeSpecialChar(String new_id) throws Exception {
		/*
		 * 아스키코드 찾는 방법 - 자꾸 잊어버림 int a = (char)'_'; System.out.println(a);
		 */
		char[] new_id_array = new_id.toCharArray();
		for (char oneChar : new_id_array) {
			// 소문자일 경우
			if (oneChar >= 97 && oneChar <= 122) {
				continue;
			}
			// 숫자일 경우
			if (oneChar >= 48 && oneChar <= 57) {
				continue;
			}
			// 특수문자일 경우
			if (oneChar == 45 || oneChar == 46 || oneChar == 95) {
				continue;
			}

			else {
				String oneCharConverted = String.valueOf(oneChar);
				new_id = new_id.replace(oneCharConverted, "");
			}

		}
		return new_id;
	}

	String removeDoubleSpot(String new_id) {
		if (new_id.contains("...")) {
			new_id = new_id.replace("...", ".");
		}
		if (new_id.contains("..")) {
			new_id = new_id.replace("..", ".");
		}
		return new_id;
	}

	String removeSpot(String new_id) {
		char[] new_id_arr = new_id.toCharArray();
		List<Character> new_id_clean = new ArrayList<Character>();
		if (new_id.startsWith(".")) {
			for (int i = 0; i < new_id_arr.length; i++) {
				if (new_id_arr[i] == '.' && i == 0) {
					continue;
				} else {
					new_id_clean.add(new_id_arr[i]);
				}
			}
			StringBuilder new_id_sb = new StringBuilder();
			for (int i = 0; i < new_id_clean.size(); i++) {
				new_id_sb.append(String.valueOf(new_id_clean.get(i)));
			}
			new_id = new_id_sb.toString();
		}

		new_id_clean = new ArrayList<Character>();
		if (new_id.endsWith(".")) {
			for (int i = 0; i < new_id_arr.length; i++) {
				if (new_id_arr[i] == '.' && i == new_id.length() - 1) {
					continue;
				} else {
					new_id_clean.add(new_id_arr[i]);
				}
			}
			StringBuilder new_id_sb = new StringBuilder();
			for (int i = 0; i < new_id_clean.size(); i++) {
				new_id_sb.append(String.valueOf(new_id_clean.get(i)));
			}
			new_id = new_id_sb.toString();

		}
		return new_id;

	}

	String spaceToA(String new_id) {
		if (new_id.length() == 0) {
			StringBuilder new_id_sb = new StringBuilder();
			new_id = new_id_sb.append("a").toString();
		}
		return new_id;

	}

	String judgeIdLength(String new_id) {
		if (new_id.length() >= 16) {
			new_id = new_id.substring(0, 15);
		}

		char[] new_id_arr = new_id.toCharArray();
		List<Character> new_id_clean = new ArrayList<Character>();
		if (new_id.endsWith(".")) {
			for (int i = 0; i < new_id_arr.length; i++) {
				if (new_id_arr[i] == '.' && i == new_id.length() - 1) {
					continue;
				} else {
					new_id_clean.add(new_id_arr[i]);
				}
			}
			StringBuilder new_id_sb = new StringBuilder();
			for (int i = 0; i < new_id_clean.size(); i++) {
				new_id_sb.append(String.valueOf(new_id_clean.get(i)));
			}
			new_id = new_id_sb.toString();

		}
		
		if (new_id.length() < 3) {
			new_id_arr = new_id.toCharArray();
			while (true) {
				new_id = new_id.concat(String.valueOf(new_id_arr[new_id_arr.length-1]));

				if (new_id.length() == 3) {
					break;
				}
			}

		}
		return new_id;

	}
}
