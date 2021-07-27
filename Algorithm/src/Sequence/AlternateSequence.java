package Sequence;

public class AlternateSequence {
	
	public static void main (String[] args) {
		
		alternate1();
		alternate2();
		
		
	}
	//교행수열 (+,- 반복)
	// 1 + 2 -3 + 4 .....
	public static void alternate1 () {
		
		int n = 0;
		int s = 0;
		
		while(n<100) {
			n = n + 1;
			s = s + n;
			n = n + 1;
			s = s - n;
		}
		
		System.out.println(s);
		
	}
	//교행 분수 수열 
	//예) 1/2*3 - 2/3*4 + 3/4*5...
	public static void alternate2 () {
		
		double k = 0;
		double s = 0;
		int sw = 0;
		
		while (k <50) {
			
			k = k + 1;
			double l = k /(k+1)*(k+2);
			if (sw == 0) {
				s = s + l;
				sw = 1;
			}
			else {
				s = s - l;
				sw = 0;
			}
		}
		
		System.out.println(s);
		
	}

}
