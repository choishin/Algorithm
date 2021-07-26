package Algorithm;
//1. 등(차)비 수열은 각 항마다 일정한 값을 더하거나 곱하는 수열임. 
public class ArithmeticSequence {
	
	public static void main (String[] args) {
		
		System.out.printf("sum of sequence = %d\n", sequence(2,3));
		sequenceAll(2,3);
		
	}
	
	public static int sequence(int a, int r) {
		
		int s = 0;
		int n = 2;
		
		s = a;
	
		while (n <10) {
			a = a*r;
			s = s+a;
			n = n+1;
		}
		
		return s;
	}
	
	public static void sequenceAll (int a, int r) {
				
		for (int i=0; i<100; i++) {
		a = a * r;
		System.out.println(a);
		}
		
	}

}
