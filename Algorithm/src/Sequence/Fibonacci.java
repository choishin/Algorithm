package Sequence;

//2.�Ǻ���ġ ������ �Ǻ���ġ ���� 1�� 1�� ������. ���� �Ǻ���ġ ���� �ٷ� ���� �� �Ǻ���ġ ���� ���� �Ǵ� ������.
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
			//�ڸ��ű��
			a = b;
			b = c;
			n = n + 1;

		}

	}
}
