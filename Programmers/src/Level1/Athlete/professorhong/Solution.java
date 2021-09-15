package Level1.Athlete.professorhong;

class Solution {
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		boolean[] completion_check = new boolean[completion.length];
		for (int k = 0; k < completion.length; k++) {
			completion_check[k] = false;
		}

		for (int i = 0; i < participant.length; i++) {
			boolean search_ok = false;
			for (int j = 0; j < completion.length; j++) {
				if (completion_check[j])
					continue;

				if (participant[j].equals(completion[j])) {
					completion_check[j] = true;
					search_ok = true;
					break;
				}
			}
			if (search_ok == false) {
				answer = participant[i];
				return answer;
			}
		}

		return answer;
	}
	
	public static void main(String[] args) {
		//Test1
		String[] participant1 = {"leo", "kiki", "eden"};
		String[] completion1 = {"eden", "kiki"};
		System.out.println("return 1 :" + solution(participant1, completion1));
		
		//Test2
		String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
		System.out.println("return 1 :" + solution(participant2, completion2));
		
		//Test3
		String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
		String[] completion3 = {"stanko", "ana", "mislav"};
		System.out.println("return 1 :" + solution(participant3, completion3));
				
	}

}
