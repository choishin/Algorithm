package Level1.Athlete.hashmap;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		Map<String, Integer> hm = new HashMap<>();
		for (String player : participant)
			hm.put(player, hm.getOrDefault(player, 0) + 1);
		for (String player : completion)
			hm.put(player, hm.get(player) - 1);
		for (String key : hm.keySet()) {
			if (hm.get(key) != 0) {
				answer = key;
				break;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		// Test1
		String[] participant1 = { "leo", "kiki", "eden" };
		String[] completion1 = { "eden", "kiki" };
		System.out.println("return 1 :" + solution(participant1, completion1));

		// Test2
		String[] participant2 = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] completion2 = { "josipa", "filipa", "marina", "nikola" };
		System.out.println("return 1 :" + solution(participant2, completion2));

		// Test3
		String[] participant3 = { "mislav", "stanko", "mislav", "ana" };
		String[] completion3 = { "stanko", "ana", "mislav" };
		System.out.println("return 1 :" + solution(participant3, completion3));

	}

}
