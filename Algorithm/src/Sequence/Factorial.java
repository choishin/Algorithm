package Sequence;

//N!�� �ڿ��� N�� ���� �������ν� 1���� N������ ���� ���ϸ� ���丮���̶�� ��.
//n! = (n-1)!*n �̶�� ��Ģ�� ������ ����.
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
