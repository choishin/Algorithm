/*
	일반적인 트럼프 카드는 클로버(c), 스페이드(s), 하트(h), 다이아몬드(d) 4개의 문양과 1~13까지의 숫자로 조성된 52개의 카드와 두 장의 조커가 있습니다. 이 문제에서는 조커를 뺀 52장만 다룹니다.
	트럼프 카드의 deck이 처음에 위에서부터 순서대로 클로버 1~13, 스페이드 1~13, 하트 1~13, 다이아몬드 1~13으로 쌓여있습니다. 카드을 한 번 섞는다는 것을 이렇게 정의하겠습니다.
	1) 처음에 카드 더미를 반절로 나눠서 아래 반을 위로 올립니다.
	2) 올린 카드의 반절을 다시 위로 올립니다.
	3) 만약 반절로 나눌 더미가 홀수 장이면 반절의 짝수장을 올립니다.(예 : 13장이면 6장을 위로 올림)
	4) 이 과정을 반복해서 위에 올린 카드가 1장이면 카드를 한 번 섞은 것입니다.
	
	입력
	첫번째 숫자는 카드를 섞은 횟수(10번 이하)이고, 두번째 문자는 클로버(c), 스페이드(s), 하트(h), 다이아몬드(d)이며, 세번째 숫자는 카드의 숫자입니다(1은 A, 11은 J, 12는 Q, 13은 K).
*/

package Lv3;

import java.util.ArrayList;
import java.util.List;

public class CardShuffle {

	public static void main(String[] args) {
		Shuffler shuffler = new Shuffler();
		List<String> cardStack = shuffler.makeCardStack();
		shuffler.divedeHalf(cardStack);
		shuffler.devideHalfAndHalf(cardStack);
	}

}

class Shuffler {
	static int half;

	List<String> makeCardStack() {
		String[] cardIndex = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		List<String> cardStack = new ArrayList<String>();
		String prefix = "";
		for (int i = 0; i < 4; i++) {
			switch (i) {
			case 0:
				prefix = "clover";
				break;
			case 1:
				prefix = "spade";
				break;
			case 2:
				prefix = "heart";
				break;
			case 3:
				prefix = "diamond";
				break;

			}
			for (int j = 0; j < cardIndex.length; j++) {
				cardStack.add(prefix + " " + cardIndex[j]);
			}
		}
		addJocker(cardStack);

		return cardStack;

	}

	void addJocker(List<String> cardStack) {
		cardStack.add("Jocker1");
		cardStack.add("Jocker2");
	}

	// 1) 처음에 카드 더미를 반절로 나눠서 아래 반을 위로 올립니다.
	List<String> divedeHalf(List<String> cardStack) {
		half = (int) (cardStack.size() / 2);
		for (int i = 0; i < half; i++) {
			cardStack.add(cardStack.get(0));
			cardStack.remove(0);
		}
		System.out.println(cardStack);
		return cardStack;
	}

	//2) 올린 카드의 반절을 다시 위로 올립니다.
	//4) 이 과정을 반복해서 위에 올린 카드가 1장이면 카드를 한 번 섞은 것입니다.
	List<String> devideHalfAndHalf(List<String> cardStack) {
		List<Integer> values = getEnd(cardStack);
		for (int j = 0; j < values.size()-1; j++) {
			for (int i = values.get(j + 1); i < values.get(j); i++) {
				cardStack.add(0, cardStack.get(i));
				cardStack.remove(i+1);
			}
			System.out.println(cardStack);
		}

		return cardStack;

	}

	List<Integer> getEnd(List<String> cardStack) {
		List<Integer> values = new ArrayList<Integer>();
		int end = cardStack.size();
		while (true) {
			end = (int) (end / 2);
			if ((int) (end / 2) != (end / 2)) {
				end = end - 1;
			}
			values.add(end);
			if (end <= 1) {
				break;
			}
		}

		return values;
	}

}