package findNumbers;

import java.util.ArrayList;
import java.util.List;

class Solution {

	public int solution(int[] numbers) {

		int answer = 0;
		/* �񱳱� ����Ʈ ����� */
		List<Integer> numList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			numList.add(i);
		}

		/* �Ű������� �޾ƿ� numbers�� ���ؼ� ���� �� ����� */
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numList.size(); j++) {
				if (numbers[i] == numList.get(j)) {
					numList.remove(j);
				}
			}
		}

		/* numList �� ���ϱ� */
		for (int num : numList) {
			answer = answer + num;
		}

		return answer;
	}

}
