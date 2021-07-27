package Sequence;

//N!은 자연수 N에 대한 누승으로써 1부터 N까지의 곱을 말하며 팩토리얼이라고 함.
//n! = (n-1)!*n 이라는 규칙을 가지고 있음.
public class Factorial {

	public static void main(String[] args) {

		int n = 1;
		int f = 1;
		int s = 1;

		while (n < 5) {
			n = n + 1;
		  //f = (n-1)*n 
			f = f * n;
			System.out.println(f);
			s = s + f;
		}
	}

}
