package findNumbers;

import java.util.ArrayList;
import java.util.List;

class Solution {

	public int solution(int[] numbers) {

		int answer = 0;
		/* 비교군 리스트 만들기 */
		List<Integer> numList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			numList.add(i);
		}

		/* 매개변수로 받아온 numbers와 비교해서 없는 값 지우기 */
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numList.size(); j++) {
				if (numbers[i] == numList.get(j)) {
					numList.remove(j);
				}
			}
		}

		/* numList 다 더하기 */
		for (int num : numList) {
			answer = answer + num;
		}

		return answer;
	}

}
