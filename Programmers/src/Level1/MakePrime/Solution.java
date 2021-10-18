package MakePrime;

import java.util.ArrayList;
import java.util.List;


class Solution {
	
	public static int solution(int[] nums) {
		int answer= 0;		
		//List에 int배열을 옮겨 담았음.
		List<Integer> numsList = new ArrayList<Integer>();
		for(int num: nums) {
			numsList.add(num);
		}
		
		//조합을 만들어 줄 것임.
		for (int i = 0; i <numsList.size()-2; i++) {
			for (int j = i+1; j < numsList.size()-1; j++) {
				for (int k = j+1; k < numsList.size(); k++) {
					int sum = numsList.get(i)+numsList.get(j)+numsList.get(k);
					if (isPrime(sum)) {
						answer = answer + 1;
					}
				}
			}
		}
		
		
		return answer;
		
	}
	
	public static boolean isPrime(int num) {
		boolean isPrime = false;
		List<Integer> factors = new ArrayList<Integer>();
		for(int i = 1; i <= num; i++) {
			if (num % i == 0) {
				factors.add(i);
			}
		}
		
		if (factors.size() == 2) {
			isPrime = true;
		}
		
		return isPrime;
	}
	
	public static void main (String[] args) {
		
		int[] nums = {1,2,7,6,4};
		System.out.println(solution(nums));
	}

}


