package Level1.telephonenumber.hashmap;

import java.util.HashMap;
import java.util.Map;

class Solution {

	public static boolean solution(String[] phone_book) {
		boolean answer = true;
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		for (int i = 0; i < phone_book.length; i++) {
			hashMap.put(phone_book[i], i);
		}
		for (int i = 0; i < phone_book.length; i++) {
			for (int j = 1; j < phone_book[i].length(); j++) {
				if (hashMap.containsKey(phone_book[i].substring(0, j))) {
					answer = false;
					return answer;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {

		String[] phone_book = new String[] { "119", "97674223", "1195524421" };
		String[] phone_book2 = new String[] { "123", "456", "789" };
		String[] phone_book3 = new String[] { "12", "123", "1235", "567", "88" };

		System.out.println("return 1 :" + solution(phone_book));

	}

}
