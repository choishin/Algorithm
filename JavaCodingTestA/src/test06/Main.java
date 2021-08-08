package test06;
/*
 * 6. Write a program to get the minimum and maximum numbers of
 *  "double[] numbers = {1.2, 3.2, 5.2, 12.3, 45.0, -3.4, -6.7}; with using the interface class below.
 */
public class Main implements Statistics  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] numbers = {1.2,3.2,5.2,12.3,45.0,-3.4,-6.7};
		Main main = new Main();
		System.out.println(main.getMaxNumber(numbers));
		System.out.println(main.getMinNumber(numbers));

	}
	
	public double getMaxNumber(double[] numbers) {
		// TODO Auto-generated method stub
		double max = Double.MIN_VALUE;
		for(int i = 0; i < numbers.length; i++) {
			if(max < numbers[i]) {
				max = numbers[i];
			}
		}
		return max;
	}//getMax

	public double getMinNumber(double[] numbers) {
		// TODO Auto-generated method stub
		double min = Double.MAX_VALUE;
		for(int i = 0; i < numbers.length; i++) {
			if(min > numbers[i]) {
				min = numbers[i];
			}
		}
		return min;
	}//getMin

}//class

interface Statistics {

	public double getMaxNumber(double[] numbers);

	public double getMinNumber(double[] numbers);

}
