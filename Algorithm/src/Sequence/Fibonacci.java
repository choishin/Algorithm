package Sequence;

//2.피보나치 수열의 피보나치 수는 1과 1로 시작함. 다음 피보나치 수는 바로 앞의 두 피보나치 수의 합이 되는 수열임.
//f(n) = f(n-1)+f(n-2)
public class Fibonacci {

	public static void main(String[] args) {

		int a = 1;
		int b = 1;
		int c = 0;
		int s = 0;
		int n = 2;
		System.out.println(a);
		System.out.println(b);

		while (n < 100) {
			c = a + b;
			s = s + c;
			System.out.println(c);
			//자리옮기기
			a = b;
			b = c;
			n = n + 1;

		}

	}
}
